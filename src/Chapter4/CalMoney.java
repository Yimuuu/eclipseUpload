package Chapter4;

public class CalMoney {
	public static void main(String[] args) {
		//1.年份：求年year
		//2.交易额：循环800，*1.25,<2000
		int year = 2015;
		double money = 800;
		while(money <= 2000) {
			money *= 1.25;
			year += 1;
		}
		//System.out.println("年份是"+ year+ "交易额是"+ money);
		String str = String.format("%d年达到%.2f的交易额",year,money);//
		System.out.println(str);
		}
	
}