import java.util.*;
import java.io.*;
public class prob02 {
	
	static String file = "prob02";
	static Scanner in;
	static PrintWriter out;
	public static void main(String[] args) throws IOException{
		
		for(int i =1; i < 4; i++) {
		
			in = new Scanner(new File(file + "-"+ i + "-in.txt"));
			out = new PrintWriter (new File("out.txt"));
			
			int n =1;
			
			for(int j =0; j < n ; j++) {
				init();
				solve();
			}
			
			in.close();
			out.close();
			System.out.println( i + " ");
			Check.check("out.txt", file + "-"+ i + "-out.txt" );
		}
	
	}
	
	private static void init() {
		
	}
	private static void solve(){
		int H = in.nextInt();
		int M = in.nextInt();
		int S = in.nextInt();
		
		if(M/(double)H>S) {
			out.println(H + " " + M + " " + S + ". I will be late!");
		}else {
			out.println(H + " " + M + " " + S + ". I will make it!");
		}
		
	}
	
	
}
