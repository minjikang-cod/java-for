import java.io.*;
import java.util.StringTokenizer;

public class Addition8{
    
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bfr.readLine());	//the number of test
        
        for (int i=0;i<num;i++) {
        	String str = bfr.readLine();
        	StringTokenizer st = new StringTokenizer(str);
        	
        	int A = Integer.parseInt(st.nextToken());
        	int B = Integer.parseInt(st.nextToken());
        	int sum = A + B;
        	
        	bfw.write("Case #"+Integer.toString(i+1)+": "+Integer.toString(A)+" + "+Integer.toString(B)+" = "+Integer.toString(sum)+"\n");
        }
        bfw.flush();
        bfw.close();
    }
}
