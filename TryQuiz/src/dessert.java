
public abstract class dessert {
	
	private String name;
	private Integer rating;
	private Integer quantity;
	
	public Integer getbaseprice() {
		return 10000*this.rating;
	}
	
	public abstract Integer gettotalprice();
	
	public dessert(String name, Integer rating, Integer quantity) {
		super();
		this.name = name;
		this.rating = rating;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	

}
