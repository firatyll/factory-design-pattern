package factoryDesignPattern;

class Iphone implements Phone {

	private String brand;
	private String model;
	private int price;

	public Iphone(String model, int price) {
		this.brand = "apple";
		this.model = model;
		this.price = price;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void showPhoneInfo() {
		System.out.println("Phone Brand: " + brand);
		System.out.println("Phone Model: " + model);
		System.out.println("Phone Price: " + price);
	}

}