package pkg2;

import pkg1.Myparent;

class MyChild extends Myparent{
	
	public void printMembers() {
//		System.out.println(prv); // error
//		System.out.println(dft); // error
		System.out.println(prt); // ok
		System.out.println(pub); // ok
	}
}

public class MyparentTest2 {

	public static void main(String[] args) {
		Myparent p = new Myparent();
//		System.out.println(p.prv); // 에러.
//		System.out.println(p.dft); // error
//		System.out.println(p.prt); // error
		System.out.println(p.pub); // ok
	}

}
