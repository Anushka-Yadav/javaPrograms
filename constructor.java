
public class constructor{
	public void emp1(int salary){
		System.out.println(salary) ;
		}
	public void emp1(int salary, String name){
		System.out.println(salary);
		System.out.println(name);

		} 

	public static void main(String args[]){
		
	constructor obj1 = new constructor();
	obj1.emp1(50000);
    constructor obj2 = new constructor();
	obj2.emp1(50000, "Anushka");

	}
}