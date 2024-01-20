class Product2 {
	int price;			// ��ǰ�� ����
	int bonusPoint;	// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

	Product2() {} // �⺻ ������
}

class Tv2 extends Product2 {
	Tv2() {  super(100);	 }

	public String toString() { return "Tv"; }
}

class Computer2 extends Product2 {
	Computer2() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio2 extends Product2 {
	Audio2() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer2 {			  // ��, ������ ��� ���
	int money = 1000;	  // �����ݾ�
	int bonusPoint = 0; // ���ʽ�����
	Product2[] cart = new Product2[10];   // ������ ��ǰ�� �����ϱ� ���� �迭
	int i =0;			  // Product�迭�� ���� ī����

	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}

		money -= p.price;             // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;   // ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		cart[i++] = p;                // ��ǰ�� Product[] cart�� �����Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
// 뒷 페이지에 계속됩니다.
	void summary() {	              // 구매한 물품에 대한 정보를 요약해서 보여 준다.
		int sum = 0;                 // 구입한 물품의 가격합계
		String itemList ="";         // 구입한 물품목록

		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

class Ex7_9 {
	public static void main(String args[]) {
		Buyer2 b = new Buyer2();

		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}
}