class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(3L, 5L);
		mm.gugudan(3);

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("max(3L, 5L) = " + result5);

	}
 }

 class MyMath {
	 void gugudan (int dan) {
		 if(!(2 <= dan && dan <=9)) 
			 return;
			 for(int i=1; i<=9; i++) {
				 System.out.printf("%d * %d = %d%n", dan, i, dan * i);
			
			 }
		 
		 
	 }
	 
	 
	long add(long a, long b) {
		long result = a + b;
		return result;
	//	return a + b;	
	}
	// 두 값을 받아서 둘중에 큰 값을 반환하는 메소드를 작성하시오.
	long max (long a, long b) {
		return a>b ? a : b;
	}
	
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 }
