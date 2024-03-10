class MyPoint{ //컴파일시 extends Object
	int x;
	int y;
}

//class Circle extends MyPoint{ // 상속
//	int r;
//}

class Circle{ // 포함     {컴파일시 extends Object}
	MyPoint p = new MyPoint();
	int r;
}


public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println(c.p.x);
		System.out.println(c.p.y);
		System.out.println(c.r);
	}

}
