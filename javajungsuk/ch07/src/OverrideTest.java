//class MyPoint3{
//	int x;
//	int y;
//	String getLocation() {
//		return "x :" + x  + ", y :" + y; 
//	}
//}

//class MyPoint3D extends MyPoint3{
//	int z;
//	// 조상의 getLocation()을 오버라이딩
//	String getLocation() {
//		return "x :" + x  + ", y :" + y + ", z :" + z; 
//	}
//}
// 상속!
class MyPoint3 extends Object{
	int x;
	int y;
	
	//Object class의 toString()을 오버라이딩
	public String toString() {
		return "x :" +x+", y :" +y;
	}
}


public class OverrideTest {

	public static void main(String[] args) {
		MyPoint3 p = new MyPoint3();
		p.x = 3;
		p.y = 5;
		System.out.println(p);
		
		
//		MyPoint3D p = new MyPoint3D();
//		p.x = 3;
//		p.y = 5;
//		p.z = 7;
//		System.out.println(p.x);
//		System.out.println(p.y);
//		System.out.println(p.z);
	}
}
