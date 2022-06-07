import java.util.Scanner;

public class powerTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		do {
		System.out.println("Give me an integer");
		int l = scan.nextInt();
		
		final int NMAX =4;
		final double XMAX=l;
		
		System.out.println("\t Number\tSquared\t  Cube");
		for(double x = 1; x <= XMAX; x++)
		{
			for(int n = 1; n <= NMAX; n++)
			{
				System.out.printf("%10.0f", Math.pow(x, n));
			}
			System.out.println();
		}
		System.out.println("Do you want to continue? y/n");
		scan.nextLine();
		String answ = scan.nextLine();
		if(answ.equalsIgnoreCase("n")){
			run = false;
		}
		}while(run);
		scan.close();
		
		
	}
	
}

