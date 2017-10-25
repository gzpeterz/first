import java.util.*;

/**
 * @author Administrator
 *
 */
public class Demo4 {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(1, "peter", 1000));
		list.add(new Emp(3, "吴勇", 8000));
		list.add(new Emp(8, "Bullet", 3000));
		list.add(new Emp(10, "John", 1500));
		list.add(new Emp(8, "tiger", 3000));
		list.add(new Emp(8, "Cullet", 3000));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

class Emp implements Comparable<Emp> {
	int no;
	String name;
	int salary;
	
	public Emp(int no, String name, int salary) {
		this.no = no;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return " " + no + " " + name + " " + salary;
	}
	
	public int compareTo(Emp emp) {
		if (salary > emp.salary) {
			return -1;
		} else if (salary < emp.salary) {
			return 1;
		} else {
			return this.name.compareTo(emp.name);
		}
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
