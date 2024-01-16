package pkg1;

public class Myparent{
	private int prv; // 같은 클래스
			int dft; // 같은 패키지
	protected int prt; // 같은 패키지 + 자손(다른 패키지)
	public int pub; // 접근제한 없음.


	public void printMembers() {
		System.out.println(prv); // ok
		System.out.println(dft); // ok
		System.out.println(prt); // ok
		System.out.println(pub); // ok
	}
}

class MyparentTest {

	public static void main(String[] args) {
		Myparent p = new Myparent();
//		System.out.println(p.prv); // 에러.
		System.out.println(p.dft); // ok
		System.out.println(p.prt); // ok
		System.out.println(p.pub); // ok
		
	}

}
