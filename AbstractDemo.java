abstract class Person{
	protected String name;
	protected String lastName;
	protected String address;
	public Person( String name , String lastName , String address ) {
		this.name=name;
		this.lastName=lastName;
		this.address=address;
	}
	abstract void displayInformation();
}
class Student extends Person{
	private String college;
	public Student(String name , String lastName , String address , String college ) {
		super(name ,lastName , address );
		this.college=college;
	}
	
	@Override
	void displayInformation() {
		// TODO Auto-generated method stub
		System.out.println("Hi I am "+super.name+" "+super.lastName+" from "+this.college);
		System.out.println("My current address is "+super.address);
		
		
		
	}
	
}
class Professor extends Person{
	private String college;
	private String designation;
	public Professor(String name , String lastName , String address , String college , String designation) {
		super(name,lastName,address);
		this.college=college;
		this.designation=designation;
		
	}

	@Override
	void displayInformation() {
		// TODO Auto-generated method stub
		System.out.println("Hi I am Professor "+super.name+" "+super.lastName+" of "+this.college);
		System.out.println("My role in "+this.college+" is "+this.designation);
		
	}
	
}
public class AbstractDemo  {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person harry=new Student("Harry " , "Potter ", "Privet Drive, Little Whinging, Surrey, England, Great Britain" , "Hogwarts School");
		harry.displayInformation();
		
		Person dumbledore=new Professor("Albus","Dumbledore","12 Grimmauld Place ","Hogwarts School","Headmaster");
		dumbledore.displayInformation();
	
	}

}




