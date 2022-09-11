import java.util.Scanner;
import java.lang.Math;

class nEmployee{
	static int empNo;
	private double salary;
	static double totalSalary;
	
	Employee(double salary){
		this.empNo++;
		this.salary=salary;
		totalSalary+=salary;
	}
	
	void show(){
		System.out.println(empNo+" "+totalSalary);
	}
}

class emp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee(5000);
		e1.show();
		Employee e2 = new Employee(10000);
		e2.show();
		Employee e3 = new Employee(15000);
		e3.show();
		Employee e4 = new Employee(25000);
		e4.show();

	}
}