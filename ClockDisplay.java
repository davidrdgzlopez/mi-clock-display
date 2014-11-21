
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
    
    //Constructor for objects of class ClockDisplay which set up the time to 00:00
    public ClockDisplay()
    {
        hours = new NumberDisplay (24);
        minutes = new NumberDisplay (60);
        updateDisplay() ;
    }
    
    //Constructor which set up the time to x:y
    public ClockDisplay(int newHour, int newMinute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay (60);
        hours.setValue(newHour);
        minutes.setValue(newMinute);
        updateDisplay() ;
    }
    
    // Set a new hour
    public void setTime(int actualHour, int actualMinutes)
    {
        hours.setValue(actualHour);
        minutes.setValue(actualMinutes);
        updateDisplay() ;
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
        if (hours.getValue() > 12 && hours.getValue() < 24)
        {
            int newHourTwelve;
            newHourTwelve = hours.getValue() -12;
            displayString = newHourTwelve + ":" + minutes.getDisplayValue()+ " pm";
        }
        else if(hours.getValue() == 12)
        {
            displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue()+ " pm";
        }
        else if (hours.getValue() ==0)
        {
            displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue()+ " am";
        }
        else 
        {
            displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue()+ " am";
        }
    }
}
