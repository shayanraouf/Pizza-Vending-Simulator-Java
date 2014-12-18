/**Description:This set of classes will be used to decorate Pizza Objects.  
 * They�ll manage their cost and calorie count per serving, as well as define
 * some custom characteristics (read member variables) like Colors for the 
 * Vegetable subclass.  Before starting on the code, be sure to check out the
 * inheritance hierarchy at the beginning of this assignment(@Rob Nash)
 * @author shayanraouf*/
public class Meat extends Ingredient{
	/**Constructor that calls the parent class
	 * sets description, cost and calories*/
	public Meat(String description, Money cost, int cal){
		super(description, cost, cal);
	}

	/**@returns description, cost and calories*/
	public String toString(){
		return "Meat:" + super.toString();
	}	
}
