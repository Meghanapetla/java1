package test;
class Address {
String city, state, country; 
int pinCode;

public Address(String city, String state, String country, int pinCode) {  
  this.city = city;  
  this.state = state;  
  this.country = country;  
  this.pinCode = pinCode;	    
  }  
}
class Student {  
 String name; 
 int rollNo;
 Address address;
 int pinCode;
	  
public Student(String name, int rollNo, Address address) {  
 this.rollNo = rollNo;  
 this.name = name;  
 this.address=address; 
}  
void display(){  
 System.out.println("Name: " +name + ", "+"Roll no: " +rollNo);
 System.out.println("Address:");
 System.out.println(address.city+" "+address.state+" "+address.country+ " " +address.pinCode); 
 System.out.println("\n");
}  
public static void main(String[] args) 
{  
 Address addr1 = new Address("Dhanbad,","Jharkhand,","India,", 826001);  
 Address addr2 = new Address("Ranchi,","Jharkhand,","India,", 825001);  
	  
 Student st1 = new Student("Deep", 05, addr1);  
 Student st2 = new Student("John", 02, addr2);  
	     
   st1.display();  
   st2.display();  
 }  
}