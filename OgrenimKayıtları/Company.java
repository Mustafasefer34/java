
public class Company {

	private Employee[] employees;
	private CompanyName[] companyName;
	

	public Company(CompanyName[] company, Employee[] employees) {
		this.companyName=company;
		this.employees=employees;
	}
	
	public CompanyName getCompanyName() {
		return getCompanyName();
	}
	
	public void printAllEmployeesName() {
		for (Employee employee : employees) 
			System.out.println(employee.getName());
			
		}
		public void printAllEmployeesID(){
			for (Employee employee : employees) 
				System.out.println(employee.getId());
				
			}
		
	}
