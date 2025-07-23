package day3.constructor;

public class CustomerDemo {

	public static void main(String[] args) {
		
		//Customer c1 = new Customer();
		
		Customer c1 = new Customer();//invoke default constructor
		
		System.out.println(c1);
		System.out.println();
		
		c1 = new Customer(101,"Praveen","Chennai");
		
		
		System.out.println(c1);
		
		//Customer c3 = new Customer(102,"Sivaram");
		
		

	}

}
