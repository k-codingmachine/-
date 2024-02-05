class Data_1 {
	int value;
}

class Data_2 {
	int value;

	Data_2(){} // 기본 생성자(클래스 만들때 꼭 추가해줘야한다.)
	Data_2(int x) {   // 매개변수가 있는 생성자.
		value = x;
	}
}

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
//		Data_2 d2 = new Data_2(); // compile error발생 -> 기본생성자를 만들어주면 에러 사라짐.
	}
}