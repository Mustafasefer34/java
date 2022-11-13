
public class Car {
     private Person owner;
     private String color;
     private String model;
     
     
     public Car(Person owner, String color, String model){
    	 
    	 this.color=color;
    	 this.model=model;
    	 this.owner=owner;
     }
     
     public void changeOwner(Person person) {
    	 
     }
     
     public Person getOwner() {
    	 return owner;
     }
     public String getModel() {
    	 return model;
     }
     public String getColor() {
    	 return model;
     }
}
