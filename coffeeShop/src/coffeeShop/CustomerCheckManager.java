package coffeeShop;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		if(customer.getIdentityNumber() == "12345" && customer.getFirstName() == "hazar" && customer.getLastName() == "g�rb�z" && customer.getBirthDay() == "1999") {
			
			return true;
			
		}
		else {
			return false;
		}
		
		
		
	}
	

}
