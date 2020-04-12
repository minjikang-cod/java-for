import java.io.*;

public class PrintNumberBackward{
    
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bfr.readLine());	//the number of test
        
        for (int i=0;i<num;i++) {
        	bfw.write(Integer.toString(num-i)+"\n");
        }
        bfw.flush();
        bfw.close();
    }
}
