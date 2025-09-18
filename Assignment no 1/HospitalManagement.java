import java.util.*;
import java.lang.*;
import java.time.LocalDate;
interface HospitalServices{
	 void admitPatient();
	void dischargePatient();
}

abstract class Person implements Comparable<Person>{
	private int id;
	private String name;
	private int age;
	
	Person(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	abstract void displayDetails();
	
	@Override
    public int compareTo(Person p) {
        int cmp = Integer.compare(this.age, p.getAge());
        if (cmp == 0) {
            return this.name.compareTo(p.getName());
        }
        return cmp;
    }
	
}

class Doctor extends Person{
	 String specialization;
	 double salary;
	
	Doctor(int id, String name, int age, String specialization, double salary){
		super(id,name, age);
		this.specialization=specialization;
		this.salary=salary;
	}
	
	void displayDetails(){
		System.out.println("Patient Id: "+getId()+", Name: "+getName()+",Age: "+getAge()+"Specialization: "+specialization+",Salary: "+salary );
	}
	
}


class Patient extends Person implements HospitalServices{
	String disease;
	LocalDate admitteDate;
	
	Patient(int id, String name, int age,String disease, String admitteDate){
		super(id,name, age);
		this.disease=disease;
		this.admitteDate=LocalDate.parse(admitteDate);
	}
	void displayDetails(){
		System.out.println("Patient Id: "+getId()+", Name: "+getName()+",Age: "+getAge()+"disease: "+disease+",admitteDate: "+admitteDate );
	}
	
	@Override
	public void admitPatient(){
		System.out.println("Patient Id: "+getId()+"Patient name: "+getName()+"Patient age: "+getAge()+
		"Patient disease: "+disease+"Patient admited Date: "+admitteDate);
	}
	
	@Override
	public void dischargePatient(){
		System.out.println("Patient Id: "+getId()+"Patient name: "+getName()+"Patient age: "+getAge()+
		"Patient disease: "+disease+"Patient admited Date: "+admitteDate);
	}
}

class SortByAddmitedDate  implements Comparator<Patient>{
	
	@Override
	public int compare(Patient p1, Patient p2){
		return p1.admitteDate.compareTo( p2.admitteDate);
	}
}
public class HospitalManagement{
	public static void main(String [] args){
		List<Patient> addPatient=new ArrayList<>();
		addPatient.add(new Patient(101, "Ramesh", 40, "Fever", "2025-01-15"));
		addPatient.add(new Patient(102,"Anita", 30, "Covid", "2025-02-01"));
		
		
        System.out.println("\nSorted by Age + Name:");
        Collections.sort(addPatient);
        for (Patient p : addPatient) {
            p.displayDetails();
        }
		
		Collections.sort(addPatient, new SortByAddmitedDate());
		
		System.out.println();
		for (Patient p : addPatient){
		 p.displayDetails();
		}
	}
	
	class product{
		
	}
	
	List<Producy> list=new ArrayList<>();
	list.add(new product())
	list.add(new product())
	list.add(new product())
	void addProcyst(product p){
		list.add(new product())
	}
	
	void siaplay(product p){
		for(product p: lis){
			
		}
	}
}