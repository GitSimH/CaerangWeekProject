import java.util.Scanner;

//Eclipse IDE 환경에서 코딩 후 VSCODE로 옮겨서 빌드 안 됩니다.
public class Week1_1
{
 
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
 
		int A = in.nextInt();
		String B = in.next();
        
		in.close();
 
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
	}
}
