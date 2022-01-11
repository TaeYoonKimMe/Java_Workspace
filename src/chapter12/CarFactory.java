package chapter12;

import java.util.HashMap;

public class CarFactory {
	HashMap<String, Car> hashMap = new HashMap<String, Car>();

	private CarFactory() {
	}

	private static CarFactory instance = new CarFactory();

	public static CarFactory getInstance() {
		if (instance == null)
			instance = new CarFactory();
		return instance;
	}

	Car createCar(String name) {
		if (hashMap.containsKey(name)) {
			return hashMap.get(name);
		} else {
			Car c = new Car(name);
			hashMap.put(name, c);
			return c;
		}
	}
}
