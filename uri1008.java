import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int employee, workedhours;
		double workhour, salary;
		
		employee = sc.nextInt();
		workedhours = sc.nextInt();
		workhour = sc.nextDouble();
		
		salary = workedhours * workhour;
		
		System.out.println("NUMBER = " + employee);
		System.out.printf("SALARY = U$ %.2f%n", + salary);
		
		sc.close();
	}
}
