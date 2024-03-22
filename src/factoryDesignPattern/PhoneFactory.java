package factoryDesignPattern;

class PhoneFactory {
	public static Phone createPhone(String brand, String model, int price) {

		Phone phone = null;

		if (brand.equals("apple")) {
			phone = new Iphone(model, price);
		}

		if (brand.equals("samsung")) {
			phone = new Samsung(model, price);
		}

		return phone;

	}
}
