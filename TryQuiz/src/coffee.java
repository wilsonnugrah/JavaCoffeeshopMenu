
public class coffee extends dessert{
	
	private String size;
	private String type;
	
	public coffee(String name, Integer rating, Integer quantity, String size, String type) {
		super(name, rating, quantity);
		this.size = size;
		this.type = type;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getsizeprice() {
		int sizenumber = 0;
		
		if(size.equals("Small")){
			sizenumber = 1;
		}else if(size.equals("Medium")) {
			sizenumber = 2;
		}else if(size.equals("Large")) {
			sizenumber = 3;
		}
		
		return sizenumber*5000;
	}
	@Override
	public Integer gettotalprice() {
		return (getbaseprice()+getsizeprice())*getQuantity();
	}

	

}
