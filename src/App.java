

public class App {

	public static void main(String[] args) {
		
		//First Variable
		String firstName = "David";
		String lastName = "Beck";
		char middleInitial = 'M';
		int age = 28;
		String itemName = "Laptop";
		double itemPrice = 100.00;
		double moneyInWallet = 200.00;
		int numberOfFriends = 200;
		
		//Second Variable
		String bFirstName = "Natalya";
		String bLastName = "Beck";
		char bMiddleInitial = 'R';
		int bAge = 30;
		String bItemName = "TV";
		double bItemPrice = 300.00;
		double bMoneyInWallet = 450.00;		
		int bNumberOfFriends = 1500;
			
		//First and Second Operation
		double moneyAfterPurchase = moneyInWallet - itemPrice;
		double bMoneyAfterPurchase = bMoneyInWallet - bItemPrice;
		int numberOfFriendsEachYear = numberOfFriends / age;
		int bNumberOfFriendsEachYear = bNumberOfFriends / bAge;
		String personA = firstName + " " + middleInitial + " " + lastName;
		String personB = bFirstName + " " + bMiddleInitial + " "  + bLastName;
		
		//First Print
		System.out.println(itemName);
		System.out.println(moneyAfterPurchase);
		System.out.println(numberOfFriendsEachYear);
		System.out.println(personA);
		System.out.println("Hi my name is" + " " + personA + " " + "I am" + " " + age + " " + "and I want to purchase a" + " " + itemName + " " + "that cost" + " " + itemPrice );
		
		//Second Print
		System.out.println(bItemName);
		System.out.println(bMoneyAfterPurchase);
		System.out.println(bNumberOfFriendsEachYear);
		System.out.println(personB);
		System.out.println("Hi my name is " + personB  + " " + "and I love Disney!");
		
		
	}

}
