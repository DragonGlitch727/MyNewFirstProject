

public class App {

	public static void main(String[] args) {
		
		String itemName = "Laptop";
		double itemPrice = 100.00;
		double moneyInWallet = 200.00;
		int numberOfFriends = 200;
		int age = 28;
		String firstName = "David";
		String lastName = "Beck";
		char middleInitial = 'M';
		
		double moneyAfterPurchase = moneyInWallet - itemPrice;
		int numberOfFriendsEachYear = numberOfFriends / age;
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
		System.out.println(itemName);
		System.out.println(moneyAfterPurchase);
		System.out.println(numberOfFriendsEachYear);
		System.out.println(fullName);
		System.out.println("Hi my name is" + " " + fullName + " " + "I am" + " " + age + " " + "and I want to purchase a" + " " + itemName + " " + "that cost" + " " + itemPrice );
		
		
		
	}

}
