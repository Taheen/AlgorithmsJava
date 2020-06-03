package algorithmsp1;
import java.util.*;

public class QuickFind {
	
	public static boolean connected(int [] arr1, int p, int q) {
		return arr1[p] == arr1[q];
	}
	
	public static void union(int [] arr1, int p, int q) {
		int pid = arr1[p];
		int qid = arr1[q];
		for (int i = 0; i < arr1.length; i++)
			if (arr1[i] == pid) arr1[i] = qid;
	}

	/* public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] test = new int [] {0,1,1,8,8,0,0,1,8,8};
    
    System.out.println(connected(test, 5,6)); 
    union(test, 4,6);
    System.out.println(Arrays.toString(test));
	}
	*/
}
