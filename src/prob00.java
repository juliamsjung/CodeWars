
import java.util.*;
import java.io.*;
public class prob00 {
	
	static String file = "prob00";
	static Scanner in;
	static PrintWriter out;
	public static void main(String[] args) throws IOException{
		
		for(int i =1; i < 4; i++) {
		
			in = new Scanner(new File(file + "-"+ i + "-in.txt"));
			out = new PrintWriter (new File("out.txt"));
			
			int n = Integer.parseInt(in.nextLine());
			
			
			
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
		
	}
	
	
}
