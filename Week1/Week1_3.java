import java.util.Scanner;
 
//Eclipse IDE 환경에서 코딩 후 VSCODE로 옮겨서 빌드 안 됩니다.
public class Week1_3 
{
	public static void main(String[] args)
	 {
    
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt();
		int M = in.nextInt();
		in.close();
		
		if(M < 45) {
			H--;		
			M= 60 - (45 - M); 
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}
}