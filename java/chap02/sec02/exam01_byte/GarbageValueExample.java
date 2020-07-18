package sec02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 =125;
		
		int n = 5;
		for(int i =0; i<n; i++) {
			var1++;
			var2++;
			System.out.println("var1:"+var1+'\t'+ "var2:" + var2);
			
		}

	}

}
