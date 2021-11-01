
public class cheesecake extends dessert{

	public cheesecake(String name, Integer rating, Integer quantity) {
		super(name, rating, quantity);
		
	}

	@Override
	public Integer gettotalprice() {
		
		return getbaseprice()*getQuantity();
	}

	

}
