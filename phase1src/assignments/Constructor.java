package assignments;

//Default constructor
class Employee{
	int id;
	String name;
	void display() {
		
		System.out.println(id +" "+name);
	}
}
//Parameterized Construtor
class Employee1{
	int empid;
	String empname;
	public Employee1(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	void empresult() {
		
		System.out.println(empid +" " + empname);
	}
}
public class Constructor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Default construtor");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.id = 1;
		e1.name = "akila";
		e2.id = 2;
		e2.name = "dhivya";
		e1.display();
		e2.display();
		System.out.println("Parameterized Constructor");
		Employee1 emp1 = new Employee1(3,"prabha");
		Employee1 emp2 = new Employee1(4,"ashwin");
		emp1.empresult();
		emp2.empresult();

	}

}


	





