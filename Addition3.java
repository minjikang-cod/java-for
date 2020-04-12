import java.util.Scanner;

public class Addition3{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();	//테스트 횟수
        
        for (int i=0;i<num;i++) {
        	int A = scan.nextInt();
        	int B = scan.nextInt();
        	
        	System.out.println(A+B);
        }
        scan.close();
    }
}
