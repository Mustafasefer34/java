package labDersi6;

public class Person {
	
	
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    
    
    public Person(int id, String firstName, String lastName, int age){
    	this.age=age;
    	this.firstName=firstName;
    	this.id=id;
    	this.lastName=lastName;
    	
    }
    
    public Person(String firstName, String lastName) {
    	this(25,firstName,lastName,110);
    	
    }
	public Person(int id) {
    	this(id,"Mustafa", "Erdogan" ,75);	
    }
    public Person() {
    	this(21,"Mustafa", "Erdogan" ,150);
    }

	public  int getId() {
		return id+1;
	}

	public  void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
}
