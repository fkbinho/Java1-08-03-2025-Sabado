package operadores;

public class Unarios {

	public static void main(String[] args) {
		
		/* x++ -> x = x + 1;
		 * y-- -> y = y - 1;
		 * 
		 * */
		
//		int x = 1;
//		
//		System.out.println(x++);  // 1
//		System.out.println(x);	  // 2 
//		System.out.println(++x);  // 3
//
//		int y = 2;
//		System.out.println();
//		System.out.println(--y); // 1     ( y = y - 1)
//		System.out.println(y);   // 1 
//		System.out.println(y--); // 1
//		System.out.println(y);  // 0
		
		int a = 10;
		int b = 20;
		
						// 10  + 19  +  12 - 19
		System.out.println(a++ + --b + ++a - b--); // 0 - 21 - 40
					// a = 11  b=19    a=12
		
	}

}
