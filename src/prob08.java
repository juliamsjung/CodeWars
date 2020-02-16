
import java.util.*;
import java.io.*;
public class prob08 {
	
	static String file = "prob08";
	static Scanner in;
	static PrintWriter out;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static String ans;
	static int[] abc;
	static String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static void main(String[] args) throws IOException{
		
		for(int i =1; i < 4; i++) {
		
			in = new Scanner(new File(file + "-"+ i + "-in.txt"));
			out = new PrintWriter (new File("out.txt"));
			
			abc = new int[26];
			for(int j =0; j < 1 ; j++) {
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
		
		boolean chk = true;
		while(chk) {
			int n = in.nextInt();
			ans += "" + n + " ";
			if(n == 999) {
				chk = false;
				break;
			}else {
				list.add(n);
			}
			
		}
		ans = ans.substring(0, ans.length()-2) + ". ";
		
	}
	private static void solve(){
		
		for(int i =0; i < list.size(); i++) {
			if(list.get(i) == 0) {
				if(abc[25] < 1) abc[25] = 1;
				if(abc[4] < 1) abc[4] =1;
				if(abc[17] < 1) abc[17] = 1;
			}else if(list.get(i) == 1) {
				if(abc[14] < 1) abc[14] = 1;
				if(abc[13] < 1) abc[13] = 1;
				if(abc[4] < 1) abc[4] = 1;
			}else if(list.get(i) == 2) {
				if(abc[19] < 1) abc[19] = 1;
				if(abc[22] < 1) abc[22] =1;
				if(abc[14] < 1) abc[14] = 1;
			}else if(list.get(i) == 3) {
				if(abc[19] < 1) abc[19] = 1;
				if(abc[7] < 1)  abc[7] = 1;
				if(abc[17] < 1) abc[17] =1;
				if(abc[4] < 2) abc[4] = 2;
			}else if(list.get(i) == 4) {
				if(abc[5] < 1) abc[5] =1;
				if(abc[14]< 1) abc[14] =1;
				if(abc[20] < 1) abc[20] = 1;
				if(abc[17] < 1) abc[17] = 1;
			}else if(list.get(i) == 5) {
				if(abc[5] < 1) abc[5] = 1;
				if(abc[8] < 1) abc[8] = 1;
				if(abc[21] < 1) abc[21] = 1;
				if(abc[4] < 1) abc[4] = 1;
			}else if(list.get(i) == 6) {
				if(abc[18] < 1) abc[18] = 1;
				if(abc[8] < 1) abc[8] = 1;
				if(abc[23] < 1) abc[23] = 1;
			}else if(list.get(i) == 7) {
				if(abc[18] < 1) abc[18] = 1;
				if(abc[4] < 2) abc[4] = 2;
				if(abc[21] < 1) abc[21] = 1;
				if(abc[13] < 1) abc[13] = 1;
			}else if(list.get(i) == 8) {
				if(abc[4] < 1) abc[4] = 1;
				if(abc[8] < 1) abc[8] = 1;
				if(abc[6] < 1) abc[6] = 1;
				if(abc[7] < 1) abc[7] = 1;
				if(abc[19] < 1) abc[19] = 1;
			}else if(list.get(i) == 9) {
				if(abc[13] < 1) abc[13] = 1;
				if(abc[8] < 1) abc[8] = 1;
				if(abc[4] < 1) abc[4] = 1;
			}else if(list.get(i) == 10) {
				if(abc[19] < 1) abc[19] = 1;
				if(abc[4] < 1) abc[4] = 1;
				if(abc[13] < 1) abc[13] = 1;
			}else if(list.get(i) == 11) {
				if(abc[4] < 3) abc[4] = 3;
				if(abc[11] < 1) abc[11] = 1;
				if(abc[21] < 1) abc[21] = 1;
				if(abc[14] < 1) abc[14] = 1;
			}else { //tweleve
				if(abc[19] < 1) abc[19] = 1;
				if(abc[22] < 1) abc[22] = 1;
				if(abc[11] < 1) abc[11] = 1;
				if(abc[4] < 3) abc[4] = 3;
				if(abc[21] < 1) abc[5] = 1;
			}
		}
		
		for(int i =0; i < 26; i++) {
			for(int j = 0; j < abc[i]; j++) {
				ans += "" + a.charAt(i) + " ";
			}
		}
		out.println(ans.substring(0, ans.length()-2));
	}
	
	
}
