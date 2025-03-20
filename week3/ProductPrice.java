package week3;

public class ProductPrice {
	public static void main(String[] args) {
		int m = 1;
		int c = 3;
		int cu = 2;
		int mi = 4500;
		int ca = 1000;
		int cuk = 1500;
		
		int total =m*mi;
		total += c*ca;
		total += cu * cuk;
		
		System.out.println("할인 전 상품 가격: "+ (total));
		
		double ii = total * 0.1;
		System.out.println("할인 금액: "+ ii);
		System.out.println("최종 결제 금액: "+ ((double)total-ii));
		
		
		
	}

}
