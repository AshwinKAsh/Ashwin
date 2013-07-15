package Programs;

public class OverTimePay {

	public final int noOfEmployee = 10;
	public final int salaryPaidForExtraHour = 12;
	public final int salary = 50000;

	public int noOfHoursWorked = 45;
	public int totalSalary;

	public void pay() {
		if (noOfHoursWorked > 0 && noOfHoursWorked <= 40) {
			totalSalary = salary;
			System.out.println(totalSalary);
		} else if (noOfHoursWorked > 40) {
			int extraHoursWorked = noOfHoursWorked - 40;
			totalSalary = salary  + (salaryPaidForExtraHour * extraHoursWorked * noOfEmployee);
			System.out.println(totalSalary);
		} else
			System.out.println("noOfHoursWorked cannot be Zero or less than Zero");
	}

	public static void main(String[] args) {
		new OverTimePay().pay();
	}
}
