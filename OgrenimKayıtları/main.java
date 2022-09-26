package oop1;

public class main {

	public static void main(String[] args) {

		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		Product product3 = new Product();
		product3.setName("Kitchen aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		Product[] products = {product1,product2,product3 };
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName() + "</li>");
				
			}
		System.out.println("</ul>");
         
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setFirstName("Mustafa");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setLastName("Erdogan");
		individualCustomer.setPhone("5462758877");
		
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama io");
		corporateCustomer.setPhone("05462758877");
		corporateCustomer.setTaxNumber("11111");
		corporateCustomer.setCustomerNumber("12345");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
	}

}
