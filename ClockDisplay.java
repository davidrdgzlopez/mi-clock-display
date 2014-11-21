
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
    }
}
