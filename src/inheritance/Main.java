package inheritance;

public class Main {

	public static void main(String[] args) {
		Clothing[] items = new Clothing[2];
		
		items[0] = new Tailored();
		items[0].setPrice(10.0); 
		items[1] = new Standard();
		items[1].setPrice(12.0);
		
		for (Clothing item : items) {
			System.out.println(item.getPrice());
		}
		
	}

}
