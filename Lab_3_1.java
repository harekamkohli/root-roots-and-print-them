import java.util.*;

public class Lab_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				System.out.print("Enter a: ");
				double a = input.nextDouble();
				System.out.print("Enter b: ");
				double b = input.nextDouble();
				System.out.print("Enter c: ");
				double c = input.nextDouble();
				double disc = (b*b)-(4*a*c);
				
				double x = Math.pow(disc, 0.5);
				double r1 = ((-b+ x)/(2*a));
				double r2 = ((-b- x)/(2*a));
				if (disc>0) {
					System.out.println(r1);
					System.out.println(r2);
				}
					
				else if (disc == 0) {
					System.out.println(r1);
				}
				else if (disc < 0) {
					System.out.println("It cannot have a root");
				}
	}

	}
		
		
	



