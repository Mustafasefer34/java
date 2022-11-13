
public class Worker {
  
String name;
int socialSecurityNumber;
float wage;
int workingHours;
 

    void displayInfo() {
    	System.out.println(name);
    	System.out.println(socialSecurityNumber);
    }
     
    	
 
   void displaySalary() {
	   float salaryy;
	   salaryy=wage*workingHours;
    	System.out.println(salaryy);
    }
	
}


