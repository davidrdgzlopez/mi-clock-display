
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
        // Objeto NumberDisplay que nos guarda la hora
    private NumberDisplay hours;
    // Objeto NUmberDisplay que nos guarda los minutos
    private NumberDisplay minutes;
    // String de 5 caracteres: hora, dos puntos y minutos
    private String displayString;
    
    private NumberDisplay day;
    private NumberDisplay month;
    private NumberDisplay year;
    
    //Constructor for objects of class ClockDisplay which set up the time to 00:00
    public ClockDisplay()
    {
        hours = new NumberDisplay (24);
        minutes = new NumberDisplay (60);
        day = new NumberDisplay (31);
        month = new NumberDisplay (13);
        year = new NumberDisplay (100);
        updateDisplay();
    }
    
    //Constructor which set up the time to x:y
    public ClockDisplay(int newHour, int newMinute, int newDay, int newMonth, int newYear)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay (60);
        hours.setValue(newHour);
        minutes.setValue(newMinute);
        day = new NumberDisplay (31);
        month = new NumberDisplay (13);
        year = new NumberDisplay (99);
        day.setValue(newDay);
        month.setValue(newMonth);
        year.setValue(newYear);
        updateDisplay();
    }
    
    // Set a new hour
    public void setTime(int actualHour, int actualMinutes)
    {
        hours.setValue(actualHour);
        minutes.setValue(actualMinutes);
        updateDisplay() ;
    }
    
    /**
     * Devuelve una cadena de 5 caracteres con la hora y 
     * los minutos separados por dos puntos
     */
    public String getTime()
    {
        //displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
        return displayString;
    }
    
        // Método que aumenta en un minuto la hora
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0)
        {
            hours.increment();
        }
        updateDisplay() ;
    }
    
        //Actualiza el atributo displayString
    private void updateDisplay()
    {
        if (hours.getValue() > 12 && hours.getValue() < 24 && day.getValue() < 31 && month.getValue() < 13 && year.getValue() < 99)
        {
            int newHourTwelve;
            newHourTwelve = hours.getValue() -12;
            displayString = newHourTwelve + ":" + minutes.getDisplayValue()+ " pm " + day.getDisplayValue() + "/" + month.getDisplayValue() + "/" + year.getDisplayValue();;
        }
        else if(hours.getValue() == 12 && day.getValue() < 31 && month.getValue() < 13 && year.getValue() < 99)
        {
            displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue()+ " pm " + day.getDisplayValue() + "/" + month.getDisplayValue() + "/" + year.getDisplayValue(); 
        }
        else if (hours.getValue() ==0 && day.getValue() < 31 && month.getValue() < 13 && year.getValue() < 99)
        {
            displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue()+ " am " + day.getDisplayValue() + "/" + month.getDisplayValue() + "/" + year.getDisplayValue();
        }
        else 
        {
            displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue()+ " am " + day.getDisplayValue() + "/" + month.getDisplayValue() + "/" + year.getDisplayValue();
        }
    }
}
