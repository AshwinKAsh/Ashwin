package PassByValue;

public class Demo1 {
public static void main(String[] args) {
	Demo1 demo=new Demo1();
	Car car=new Car("Maruti", 1111);
	System.out.println(car.getModel());
	System.out.println(car.getRegNo());
	demo.testing(car);
	System.out.println(car.getModel());
	System.out.println(car.getRegNo());
	System.out.println(car);
}
public void testing(Car car)
{

	car.setModel("Bmw");
	car.setRegNo(2222);
	System.out.println(car);


}
}
