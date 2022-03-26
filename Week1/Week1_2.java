import java.util.Scanner;

//Eclipse IDE 환경에서 코딩 후 VSCODE로 옮겨서 빌드 안 됩니다.
public class Week1_2 
{
 
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
 
		in.close();
 
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );
		
	}
 
}