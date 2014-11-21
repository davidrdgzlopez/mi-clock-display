
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // 
    private int limit;
    // Valor almacenado
    private int value;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int theFuckingLimit)
    {
        // initialise instance variables
        limit = theFuckingLimit;
        value = 0;
    }
    
    /**
     * This allow you to change the value 
     */
    public void setValue(int newValue)
    {
        if((newValue>=0) && (newValue<limit))
        {
            value = newValue;
        }
    }
}
