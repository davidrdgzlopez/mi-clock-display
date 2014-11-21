
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
    
    /**
     * This show you the value
     */
    public int getValue()
    {
        return value;
    }
    
    //Método que devuelve el valor actual del display en forma de 2 caracteres
    public String getDisplayValue()
    {
        if (value < 10)
        {
            return "0" + value;
        }
        else
        {
            return "" + value;
        }
    }
}
