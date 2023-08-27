//Main application for the program.
public class Application {

	public static void main(String[] args) {
		// Create an Item instance with a String value of my name.
		Item<String> Item1= new Item<String>();
		Item1.setE("Joshua");
		// Create an Item instance with an Integer value 2
		Item<Integer> Item2= new Item<Integer>();
		Item2.setE(2);
		// Create a SmallBag instance to hold Item objects
		SmallBag<Item> Smallbag1 = new SmallBag<Item>();
		// Add Item1 to Smallbag1 and print its value
		Smallbag1.setItem(Item1);
		System.out.println(Smallbag1.getItem().getE());
		// Add Item2 to Smallbag1 and print its value
		Smallbag1.setItem(Item2);
		System.out.println(Smallbag1.getItem().getE());
	}//end main

}//end Application
