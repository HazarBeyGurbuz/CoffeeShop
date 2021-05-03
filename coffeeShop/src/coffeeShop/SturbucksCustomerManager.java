package coffeeShop;

public class SturbucksCustomerManager extends CustomerManager{
	
	CustomerCheckService customerCheckService;
	
	public SturbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
		System.out.println("kaydedildi " + customer.getFirstName());
	}
		else {
			System.out.println("not a valid person");
		}
}

	
		

}
