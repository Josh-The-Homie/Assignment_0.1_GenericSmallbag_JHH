
public class Application {

	public static void main(String[] args) {
		Item<String> Item1= new Item<String>();
		Item1.setE("Joshua");
		Item<Integer> Item2= new Item<Integer>();
		Item2.setE(2);
		SmallBag<Item> Smallbag1 = new SmallBag<Item>();
		Smallbag1.setItem(Item1);
		System.out.println(Smallbag1.getItem().getE());
		Smallbag1.setItem(Item2);
		System.out.println(Smallbag1.getItem().getE());
	}

}
