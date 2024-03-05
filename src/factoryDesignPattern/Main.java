package factoryDesignPattern;

public class Main {

	public static void main(String[] args) {

		Phone iphoneX = PhoneFactory.createPhone("apple", "10", 20000);
		Phone iphone11 = PhoneFactory.createPhone("apple", "11", 25000);
		Phone samsungGalaxyX = PhoneFactory.createPhone("samsung", "X", 20000);

		System.out.println("Iphone X------------");
		iphoneX.showPhoneInfo();
		System.out.println("Iphone 11-----------");
		iphone11.showPhoneInfo();
		System.out.println("Samsung Galaxy------");
		samsungGalaxyX.showPhoneInfo();

	}

}
