import java.util.*;
import java.io.*;
public class prob04 {
	
	static String file = "prob04";
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
		double tax = in.nextDouble()/100;
		double total = in.nextDouble();
		double pretax = total / (tax +1);
		double ans = pretax * tax;
		
		out.print("On your $");
		out.printf("%.2f", total);
		out.print(" purchase, the tax amount is $" );
		out.printf("%.2f", ans);
		out.println("");
	}
	
	
}
