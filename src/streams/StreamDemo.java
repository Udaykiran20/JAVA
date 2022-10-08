package streams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Employee{
	int eid;
	String ename;
	double salary;
public Employee(int eid, String ename, double salary) {
		
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
}

public class StreamDemo {

	public static void main(String[] args) {
		
		Employee obj1 = new Employee(101,"uday",80000.00);
		Employee obj2= new Employee(102,"sathya",60000.00);
		Employee obj3= new Employee(103,"vijay",50000.00);
		Employee obj4= new Employee(104,"pavan",65000.00);
		Employee obj5= new Employee(105,"kiran",50000.00);
		
		List<Employee> list = new ArrayList<Employee>();
		

		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		
		list.stream().filter(x->x.salary==50000.00).forEach(x->System.out.println(x.ename));
		

	}

}
