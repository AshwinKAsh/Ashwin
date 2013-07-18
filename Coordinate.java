package Programs;

public class Coordinate {

	public static void main(String[] args) {
		int radius = 3;

		for (int x = 0; x < radius; x++) {
			for (int y = 0; y < radius; y++) {
				if ((x * x) + (y * y) < (radius * radius)) {
					System.out.println("co-ordinate (" + x + "," + y 
							+ ") lies inside circle");
				}
			}
		}

	}
}