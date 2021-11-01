import java.util.Scanner;

public class Main {
	
	private Scanner scan;
	
	public Main() {
		scan = new Scanner(System.in);
		System.out.println("Fnbucks Coffee Shop");
		System.out.println("===================");
		System.out.println();
		String dessert;
		do {			
			System.out.println("Choose menu you want to order [Coffee | Cheese Cake]: ");
			dessert = scan.nextLine();
		} while (!dessert.equals("Coffee") && !dessert.equals("Cheese Cake"));
		
		if(dessert.equals("Coffee")) {
			System.out.println("Order Coffee: ");
			String name;
			do {
				System.out.print("Input order name [5-20 Characters]: ");
				name = scan.nextLine();
			} while (name.length()<5 && name.length()>20);
			
			String size;
			do {
				System.out.print("Input order size [Small | Medium | Large]: ");
				size = scan.nextLine();
			} while (!size.equals("Small")&&!size.equals("Medium")&&!size.equals("Large"));
			
			String type;
			do {
				System.out.print("Input order type [Cold|Hot]: ");
				type = scan.nextLine();
			} while (!type.equals("Cold") && !type.equals("Hot"));
			
			Integer rating;
			do {
				System.out.print("Input order rating [1-4]: ");
				rating = scan.nextInt();
				scan.nextLine();
			} while (rating < 1 || rating > 4);
			
			Integer quantity;
			do {
				System.out.print("Input order quantity: ");
				quantity = scan.nextInt();
				scan.nextLine();
			} while (quantity < 1);
			
			coffee coffee = new coffee(name, rating, quantity, size, type);
			
			System.out.println("FNBucks Coffee Shop");
			System.out.println("===================");
			System.out.println("Coffee Order: ");
			System.out.println("Name: "+coffee.getName());
			System.out.println("Size: "+coffee.getSize());
			System.out.println("Type: "+coffee.getType());
			System.out.println("Quantity: "+coffee.getQuantity());
			System.out.println("Rating: "+coffee.getRating());
			System.out.println("Total Price: "+coffee.gettotalprice());
			System.out.println();
			System.out.println("Thankyou for buying!");
			
		}else {
			System.out.println("Order CheeseCake: ");
			String name;
			do {
				System.out.print("Input order name [5-20 Characters]: ");
				name = scan.nextLine();
			} while (name.length()<5 && name.length()>20);
			
			Integer rating;
			do {
				System.out.print("Input order rating [1-4]: ");
				rating = scan.nextInt();
				scan.nextLine();
			} while (rating < 1 || rating > 4);
			
			Integer quantity;
			do {
				System.out.print("Input order quantity: ");
				quantity = scan.nextInt();
				scan.nextLine();
			} while (quantity < 1);
			
			cheesecake cheesecake = new cheesecake(name, rating, quantity);
			
			System.out.println("FNBucks Coffee Shop");
			System.out.println("===================");
			System.out.println("Cheesecake Order: ");
			System.out.println("Name: "+cheesecake.getName());
			System.out.println("Quantity: "+cheesecake.getQuantity());
			System.out.println("Rating: "+cheesecake.getRating());
			System.out.println("Total Price: "+cheesecake.gettotalprice());
			System.out.println();
			System.out.println("Thankyou for buying!");
			
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
