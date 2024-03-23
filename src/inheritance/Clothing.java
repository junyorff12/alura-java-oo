package inheritance;

public class Clothing {
	private double price;

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

}

class Tailored extends Clothing {
	private double fee;

	@Override
	public double getPrice() {
		return super.getPrice() + fee;
	}
	
	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		super.setPrice(price);
	}
	
}

class Standard extends Clothing {
	
}
