
public class Main {
	public static void main(String[] args) {
		Person student0 = new Person("Yujia","ZHANG",21);
		Person student1 = new Person();
		Person student2 = new Person();
		//pass the value firstname from student0 to student1
		student1.setLastname(student0.getFirstname());
		//pass the value lasttname from student0 to student2
		student2.setFirstname(student0.getFirstname());
		
		//test the output
		System.out.println(student0); 
		System.out.println(student1);
		System.out.println(student2);
		
		//use the method to delete student0's value
		student0.deleteInf();
		System.out.println("**delete student0's information**");
		System.out.println(student0);
	}
}
