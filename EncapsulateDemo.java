class MyEncapsulatingClass{
	private String name;
	private String lastName;
	private String address;
	
	public MyEncapsulatingClass( String name , String lastName , String address ) {
		this.name=name;
		this.lastName=lastName;
		this.address=address;
	}
	public MyEncapsulatingClass() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void displayInformation() {
		System.out.println("Name :"+this.name+" "+this.lastName);
		System.out.println("From :"+this.address);
		
	}

	
	
}
public class EncapsulateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEncapsulatingClass m=new MyEncapsulatingClass("Jon","Snow","Winterfell");
		System.out.println("Updating information of "+m.getName()+" "+m.getLastName());
		m.setName("Aegon");
		m.setLastName("Targaryen");
		m.setAddress("the Wall");
		m.displayInformation();
		
		

	}

}
