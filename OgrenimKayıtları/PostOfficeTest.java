
public class PostOfficeTest {

	public static void main(String[] args) {
		
		Post p1 = new Post("Mustafa","ANKARA","Istanbul");
		PostOffice p2 = new PostOffice("anadolu");
		p2.receive(p1);
		p2.send(p1);
		

		
	}

}
