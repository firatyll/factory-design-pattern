# Factory Design Pattern
This application is an example Java application of the Factory Design Pattern topic that we studied in the Software Design Patterns course.
## How It Works?
Factory Design Pattern requires designing an interface for object creation and allows subclasses to produce objects.In our example we create a PhoneInterface
```
interface Phone {
	String getBrand();

	String getModel();

	int getPrice();

	void showPhoneInfo();
}
```
Then we create phone's like Iphone ,Samsung etc.
```
class Iphone implements Phone {

	private String brand;
	private String model;
	private int price;

	public Iphone(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	.
	.
	.
	//Overrides
	.
	.
	.
	@Override
	public void showPhoneInfo() {
		System.out.println("Phone Brand: " + brand);
		System.out.println("Phone Model: " + model);
		System.out.println("Phone Price: " + price);
	}

}
```
The phone classes we create receive functions via the interface.Then we create the PhoneFactory class
```
class PhoneFactory {
	public static Phone createPhone(String brand, String model, int price) {

		Phone phone = null;

		if (brand.equals("apple")) {
			phone = new Iphone(brand, model, price);
		}

		if (brand.equals("samsung")) {
			phone = new Samsung(brand, model, price);
		}

		return phone;

	}
}
```
The PhoneFactory class contains a function called createPhone. This function creates a phone through classes according to the phone brand and returns it.
## Benefits of Using Factory Design Pattern
1. **Encapsulation of Object Creation**: The Factory Design Pattern encapsulates the object creation logic within a separate class. This helps in keeping the client code focused on its own concerns and abstracts away the complexities of object creation.

2. **Flexibility and Scalability**: By centralizing the object creation process within a factory class, it becomes easier to introduce new types of objects or modify existing ones without altering the client code. This promotes flexibility and scalability in the application.

3. **Code Reusability**: Factories promote code reusability by providing a common interface for creating objects. Clients can simply rely on the factory method to obtain instances of objects without needing to know the intricate details of their creation process.

4. **Decoupling Dependencies**: Using factories decouples the client code from the concrete implementations of objects. Clients depend only on the factory interface, rather than directly instantiating concrete classes. This reduces dependencies and makes the codebase more maintainable and testable.

5. **Centralized Configuration**: Factories serve as a centralized point for configuring and managing object creation. This allows for easy configuration changes or adjustments in the object creation process, without affecting the rest of the application.

Overall, the Factory Design Pattern promotes separation of concerns, enhances code maintainability, and facilitates easier adaptation to changing requirements in object creation.

  
