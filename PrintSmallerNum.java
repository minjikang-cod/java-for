import java.util.Scanner;

public class PrintSmallerNum{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int target = scan.nextInt();
        
        int [] list = new int [num];
        
        for(int i=0;i<list.length;i++) {
        	list[i] = scan.nextInt();
        }
        
        for(int i=0;i<list.length;i++) {
        	if(list[i]<target) {
        		System.out.print(list[i]+" ");
        	}
        } 
        scan.close();
    }
}
