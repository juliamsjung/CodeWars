import java.io.*;
import java.util.*;

public class prob18 {
	
	static Scanner in;
	static ArrayList<String>[] ary = new ArrayList[4];
	static String[] cat;
	static int n;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		init();
		solve();
		
		in.close();

	}
	private static void init() {
		cat = new String[4];
		n = in.nextInt();
		in.nextLine();
		
		for(int i =0; i < 4; i++) {
			ary[i] = new ArrayList<String>();
			String temp = in.nextLine();
			cat[i] = temp.substring(0,temp.length()-9);
			
			for(int j =0; j < n; j++) {
				ary[i].add(in.nextLine());
			}
		}
	}
	
	private static void solve() {
		in.nextLine();
		int magic = in.nextInt();
		for(int i =0; i < 4; i++) {
			int count =1;
			int j = 0;
			while(ary[i].size() > 1) {
				//System.out.println(ary[i]);
				
				if(count == magic) {
					ary[i].remove(j);
					count =1;
				}else {
					count+=1;
					j+=1;
				}
				
				if(j >= ary[i].size())
					j=0;
			}
		}
	//	System.out.println(magic);
		System.out.println("Your MASH Story:");
		System.out.println(cat[0] + "- "  + ary[0].get(0));
		System.out.println(cat[1] + "- "  + ary[1].get(0));
		System.out.println(cat[2] + "- "  + ary[2].get(0));
		System.out.println(cat[3] + "- "  + ary[3].get(0));
	
	}
}

