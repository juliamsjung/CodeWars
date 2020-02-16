
import java.util.*;
import java.io.*;
public class prob07 {
	
	static String file = "prob07";
	static Scanner in;
	static PrintWriter out;
	static int N, M;
	
	
	public static void main(String[] args) throws IOException{
		
		for(int i =1; i < 4; i++) {
		
			in = new Scanner(new File(file + "-"+ i + "-in.txt"));
			out = new PrintWriter (new File("out.txt"));
			
			N = -1;
			M = -1;
			
			boolean chk = true;
			while(chk) {
				N = in.nextInt();
				M = in.nextInt();
				//System.out.println(N + " " + M);
				if(N == 0 && M == 0) {
					chk = false;
					break;
				}
				out.println(solve());
			}
			
			in.close();
			out.close();
			System.out.println( i + " ");
			Check.check("out.txt", file + "-"+ i + "-out.txt" );
		}
	
	}
	
	private static void init() {
		
	}
	private static int solve(){
		
		if(M == 0) { //even
			
			if(N%2 ==0) {
				return N +2;
			}else {
				return N +1;
			}
			
		}else if (M == 1) { //prime
			boolean[] arr = new boolean[1001];
            arr[0] = false;
            arr[1] = false;
            for (int i = 2; i <= 1000; i += 1) {
                arr[i] = true;
            }
            for (int i = 2; i * i <= 1000; i += 1) {
                for (int j = i * i; j <= 1000; j += i) {
                    arr[j] = false;
                }
            }
            for (int i = N+1; i <= 1000; i++) {
                if (arr[i] ==true) {
                    return i;
                }
                
            }
			
		}else if (M == 2) { //square
			
			int ans = (int)Math.ceil(Math.sqrt(N));
			ans = ans * ans;
			return ans;
			
		}else {//cube
			
			int ans = (int)Math.ceil(Math.cbrt(N));
			ans = ans * ans * ans;
			return ans;
		
		}
		
		return 0;
		
	}
	
	
	
}
