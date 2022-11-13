
public class PostOffice {

	String name;
	
	public PostOffice (String name) {
		this.name=name;
	}
	
	void send(Post post) {
		System.out.println("Ankaraya geliyor"+this.name);
	}
	
	void receive(Post post) {
		System.out.println("Ankaradan geliyor"+this.name);
	}
}
