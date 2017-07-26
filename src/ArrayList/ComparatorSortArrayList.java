package ArrayListCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSortArrayList {
	/*
	 * Sort an ArrayList using Comparator. The ArrayList contains user defined
	 * objects. By using Collections.sort() method you can sort the ArrayList.
	 * You have to pass Comparator object which contains your sort logic.
	 */
	public static void main(String[] args) {
		List<Empl> al = new ArrayList<Empl>();
		al.add(new Empl("Rama", 3200));
		al.add(new Empl("syam", 4990));
		al.add(new Empl("krish", 32819));
		al.add(new Empl("tia", 3802));
		al.add(new Empl("veer", 87431));
		Collections.sort(al, new SalaryComparator());
		System.out.println("Sorted List Enteries ");
		for (Empl empl : al) {
			System.out.println(empl);
		}
		
	}

}
class SalaryComparator implements Comparator<Empl>{

	@Override
	public int compare(Empl o1, Empl o2) {
		if(o1.getSalary() < o2.getSalary()){
			return -1;
		}else{
			return +1;
		}
		
	}
	
}


class Empl {

	private String name;
	private int salary;

	public Empl(String n, int s) {
		this.name = n;
		this.salary = s;
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

	public String toString() {
		return "Name: " + this.name + "-- Salary: " + this.salary;
	}
}



