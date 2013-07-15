package PassByValue;

public class Car {
	private String model;
	private int regNo;

	public Car(String model, int regNo) {
		this.model = model;
		this.regNo = regNo;

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
}
