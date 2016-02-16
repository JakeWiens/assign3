package cse360assign3;
/** Calculator to perform simple arithmetic
 * 
 * @author Jake W
 *
 */
public class Calculator {
	/** total is the value we are operating upon
	 * str will be used for return history */
	
	private int total;
	private String str = "";
	
	/**constructor for calculator
	 * 
	 * Sets global total to 0
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		str = str + "0";
	}
	
	/** Returns the global total value
	 * 
	 * @return total	global total value
	 */
	
	public int getTotal () {
		return total;
	}
	
	/** Adds parameter to the total
	 * 
	 * @param value		value to be added to total
	 */
	
	public void add (int value) {
		total = total + value;
		str = str + " + " + Integer.toString(value);
	}
	
	/** Subtracts parameter from the total
	 * 
	 * @param value		value to be subtracted from total
	 */
	
	public void subtract (int value) {
		total = total - value;
		str = str + " - " + Integer.toString(value);
	}
	
	/** Multiplies by the value
	 * 
	 * @param value		value to multiply by
	 */
	
	public void multiply (int value) {
		total = total * value;
		str = str + " * " + Integer.toString(value);
	}
	
	/** Divides by param value
	 * 
	 * @param value		value to divide by
	 */
	
	public void divide (int value) {
		if (value == 0)
			{
				total = 0;
			}
		else
		{
			total = (Integer) (total / value);
		}
		str = str + " / " + Integer.toString(value);
	}
	
	/** returns what values have been operated upon the total
	 * 
	 * @return 		a string that shows the operations done
	 */
	
	public String getHistory () {
		return str;
	}
}
