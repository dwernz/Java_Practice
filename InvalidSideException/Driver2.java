package InvalidSideException;

// My Programming Lab exercise 72037
import java.util.Scanner;

class InvalidSideException extends Exception {
	private static final long serialVersionUID = 1L;
	InvalidSideException(String s) {
		super(s);
	}
}

class Square {
	int sideLength;
	
	public Square(int sideLength) throws InvalidSideException {
		if (sideLength <= 0) {
			throw new InvalidSideException("Side length must be greater than 0.");
		}
		else {
			this.sideLength = sideLength;
		}
	}
	
	public int getArea() {
		return this.sideLength * this.sideLength;
	}
}

public class Driver2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter side length of square:");
		int length = input.nextInt();
		
		try {
			Square obj = new Square(length);
			System.out.println(obj.getArea());
		}
		catch (InvalidSideException ex) {
			System.out.print("Side length must be greater than 0.");
        }
        
        input.close();
	}
}