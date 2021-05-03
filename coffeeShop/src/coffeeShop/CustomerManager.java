package coffeeShop;

public class CustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("kaydedildi " + customer.getFirstName());
		
	}

		
	

}
