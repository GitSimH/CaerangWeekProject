import java.util.Scanner;

public class Week1_5 
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Write down number: ");
		int a = input.nextInt();
		String bin = Integer.toBinaryString(a);
		
		System.out.println(bin);
	}
}
