package day1.encapsulation;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student ob = new Student();
		
		ob.setId(101);
		ob.setName("Kalai");
		
		/*
		 * System.out.println(ob.getId()); System.out.println(ob.getName());
		 * 
		 * System.out.println();
		 */
		System.out.println(ob);
	}

}
