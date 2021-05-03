package coffeeShop;

public class Main {

	public static void main(String[] args) {
		Customer hazar = new Customer(1, "hazar", "g�rb�z", "1999", "12345");
		Customer engin = new Customer(2, "engin", "demiro�", "1985", "6789");
		
		CustomerManager customerManager = new SturbucksCustomerManager(new CustomerCheckManager());
		customerManager.Save(hazar);
		
		CustomerManager customerManager1 = new NeroCustomerManager(new CustomerCheckManager());
		customerManager.Save(engin);

	}

}
