import java.util.Scanner;

//Eclipse IDE 환경에서 코딩 후 VSCODE로 옮겨서 빌드 안 됩니다.
public class Week1_4 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       
        int d = sc.nextInt();
        
        c += d;
        b += c/60;
        c %= 60;
        a += b/60;
        b %= 60;
        a %= 24;
        
        System.out.println(a + " " + b + " " + c);
    }
}