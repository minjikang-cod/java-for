import java.io.*;

public class PrintStar{
    
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bfr.readLine());	//the number of test
        
        for (int i=1;i<=num;i++) {
         	for (int j=0;j<i;j++) {
         		bfw.write("*");
         	}
         	bfw.write("\n");
        }
        bfw.flush();
        bfw.close();
    }
}
