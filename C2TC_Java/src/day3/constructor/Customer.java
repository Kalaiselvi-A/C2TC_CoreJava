package day3.constructor;

public class Customer {
	
	private int id;
	private String name;
	private String city;
	
	//default constructor
	public Customer() {
		System.out.println("Default Constructor called");
	}
	
	//parameterized constructor
	public Customer(int id, String name, String city) {
		
		//this(); //invoke the default construct		
		this(104,"Sivaram S");
		System.out.println("3 parameter constructor");
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public Customer(int id, String name) {
		
		System.out.println("two parameter contructor");
		this.id = id;
		this.name = name;
		System.out.println(id +" : "+name);
		
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	
}
