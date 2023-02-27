
import java.util.*;
import java.io.*;

class Main{
		
	public static void main(String args[]) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 int sum = 0;
		 String str = br.readLine();
		    
		 sum = str.charAt(0) - 48;
		 for(int i =1;i<str.length();i++) {
		 int n=str.charAt(i)-48;
		 if(n ==0||n==1||n==2) {
		    sum+=n;
		 	}
		 else {
		    sum*=n;
		 	}
		}
		    
		    bw.write(sum+"");
		    bw.flush();
}
	}
