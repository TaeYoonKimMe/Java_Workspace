package chapter6;

public class CarFactory {
	private CarFactory() {
	}

	private static CarFactory instance = new CarFactory();

	public static CarFactory getInstance() {
		if (instance == null)
			instance = new CarFactory();
		return instance;
	}

	Car createCar() {
		Car c = new Car();
		return c;
	}
}
