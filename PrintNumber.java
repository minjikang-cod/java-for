import java.io.*;

public class PrintNumber{
    
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bfr.readLine());	//the number of test
        
        for (int i=0;i<num;i++) {
        	bfw.write(Integer.toString(i+1)+"\n");
        }
        bfw.flush();
        bfw.close();
    }
}
