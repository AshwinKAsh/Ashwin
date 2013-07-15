package PassByValue;

public class Demo2 {
	public static void main(String[] args) {
		Demo2 demo = new Demo2();
		Car car = new Car("Maruti", 1111);
		System.out.println(car.getModel());
		System.out.println(car.getRegNo());
		demo.testing(car);
		System.out.println(car.getModel());
		System.out.println(car.getRegNo());
		System.out.println(car);
	}

	public void testing(Car car) {

		car = new Car("bmw", 2222);
		System.out.println(car);

	}
}
