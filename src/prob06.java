import java.util.*;
import java.io.*;
public class prob06 {
	
	static String file = "prob06";
	static Scanner in;
	static PrintWriter out;
	public static void main(String[] args) throws IOException{
		
		for(int i =1; i < 4; i++) {
		
			in = new Scanner(new File(file + "-"+ i + "-in.txt"));
			out = new PrintWriter (new File("out.txt"));
			
			int n = 1;
			
			
			
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
		int a = in.nextInt();
		
		int ans =0;
		
		ans = (a-1) * a * 2;
		out.println(ans);
	}
	
	
}
