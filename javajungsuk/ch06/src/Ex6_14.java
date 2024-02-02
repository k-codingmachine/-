class Ex6_14 {
	static {
		System.out.println("static { }");
	}

	{
		System.out.println("{ }");
	}

	public Ex6_14() {
		System.out.println("������");
	}

	public static void main(String args[]) {
		System.out.println("Ex6_14 bt = new Ex6_14(); ");
		Ex6_14 bt = new Ex6_14();

		System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
		Ex6_14 bt2 = new Ex6_14();
	}
}

// static 메서드는 인스턴스 메서드를 사용할 수 없다.(인스턴스 메소드는 객체를 생성해야 사용가능해서)