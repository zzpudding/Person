//import java.util.Scanner;

/**
 * 
 * 
 * @author zhangyujia
 *
 */

public class Person {
	String firstname;
	String lastname;
	Integer age;
	
	public Person(){
		firstname = "unknown firstname";
		lastname = "unknown lastname";
		age = null;
	}
	
	public Person(String firstname, String lastname, int age){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	/**
	 * 
	 * @return value of the firstname 
	 */
	public String getFirstname(){
		//System.out.println("enter your Firstname");
		//Scanner in = new Scanner(System.in);
		//firstname = in.nextLine();
		return firstname;
	}
	
	/**
	 * 
	 * @return value of the lastname
	 */
	public String getLastname(){
		//System.out.println("enter your Lastname");
		//Scanner in = new Scanner(System.in);
		//lastname = in.nextLine();
		return lastname;
	}
	
	/**
	 * 
	 * @return value of the age 
	 */
	public int getAge(){
		//System.out.println("enter your Age");
		//Scanner in = new Scanner(System.in);
		//String stringAge = in.nextLine();
		//age = Integer.parseInt(stringAge);
		return age;
	}
	
	public void setFirstname(String firstname){
		this.firstname=firstname;
	}
	
	public void setLastname(String lastname){
		this.lastname=lastname;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
	public void deleteInf(){
		firstname = null;
		lastname = null;
		age = null;
	}
}

