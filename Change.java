package Programs;


public class Change {
public static void main(String[] args) {
	int change=38;
	int quarters;
	int dimes;
	int nickles;
	int pennies;
	
	quarters=change/25;
	System.out.println(quarters +" quarters ");
	change=change%25;
	
	dimes=change/10;
	System.out.println(dimes +" dimes ");
	change=change%10;
	
	nickles=change/5;
	System.out.println(nickles +" nickles ");
	
	pennies=change%5;
	System.out.println(pennies +" pennies ");
}
}
