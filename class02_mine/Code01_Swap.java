package class02_mine;

public class Code01_Swap {
	
	
	
	public static void swap (int[] arr, int i, int j) {
		// arr[0] = arr[0] ^ arr[0];
		arr[i]  = arr[i] ^ arr[j];
		arr[j]  = arr[i] ^ arr[j];
		arr[i]  = arr[i] ^ arr[j];
	}
	
	public static void main(String[] args) {
		int a = 0b1001;
		int b = 0b1101;
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println(a == 0b1101);
		System.out.println(b == 0b1001);
		
	}

}
