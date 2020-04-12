import java.util.Scanner;

public class SequencialAddition{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();	//count for test
        int sum = 0;				
        
        for (int i=0;i<num;i++) {
        	sum += i+1;
        }
        System.out.println(sum);
        
        scan.close();
    }
}
