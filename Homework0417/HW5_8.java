package Homework0417;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HW5_8 {
	public static void titlePrint() {	//영수증 맨 위 타이틀
		System.out.println("  	\"국민가게 다이소\"");
		System.out.println("(주)아성다이소_분당서현점");
		System.out.println("전화:031-702-6016");
		System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표:박정부, 신호섭 213-81-52063");
		System.out.println("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)");

		System.out.println("===========================================");
		System.out.println("	소비자중심경영(CCM) 인증기업");
		System.out.println("	ISO 9001 품질경영시스템 인증기업");
		System.out.println("===========================================");
	}	
		
		
	public static void timeStamp() {	//출력시간 인쇄 
		LocalDateTime now = LocalDateTime.now();	//현재시간 읽어옴
		LocalDateTime returnDeadline = now.plusDays(14);  // 현재시간으로부터 14일 후 반품 기한 계산
        String formattedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));	//현재시간 출력형식 변경
        String formattedDeadline = returnDeadline.format(DateTimeFormatter.ofPattern("MM월dd일"));  // 반품기한 출력형식 변경
        
		System.out.println("	교환/환불 14일(" + formattedDeadline + ")이내,");
		System.out.println("	(전자)영수증, 결제카드 지팜 후 구입매장에서 가능");
		System.out.println("	포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("	체크카드 취소 시 최대 7일 소요");
		
		System.out.println("===========================================");
		System.out.println("[POS 1058231]		" + formattedNow);
		System.out.println("===========================================");
	}
	
	
	public static void HeaderPrint() {	//헤더(상품명, 단가, 수량, 금액->배열로 표현 가능? - x java에서는 배열 내부의 변수의 종류가 동일해야 함) 
		DecimalFormat df = new DecimalFormat("#,###");	//이걸 통해 금액 숫자 세자리에서 , 넣어 출력함. System.out.println(df.format(number));
		
		//int itemCount = 0;
		//int itemPrint = 0;
		
		
        String item_name1 = "퓨어에어 비말차단용마스크(최고급형)";
        String item_code1 = "1031615";
        int item_price1 = 3000;
        int item_amount1 = 1;
        
        String item_name2 = "슬라이드식명찰(가로형)(100호)";
        String item_code2 = "11008152";
        int item_price2 = 1000;
        int item_amount2 = 1;
        
        String item_name3 = "매직흡착 인테리어후크(알루미늄타입)";
        String item_code3 = "1020800";
        int item_price3 = 1000;
        int item_amount3 = 1;
        
        
		int price = 3000;	//가격
		int tax = price/11;
		int priceminustax = price - tax;
		int sum = 0;	//합계
		sum += price;	//금액 합계 price*amount
		
		System.out.println("");
		System.out.println("");
		
		
		
		
		

		
	}
	
	public static void itemPrint() {
		
	}
	
	public static void totalPrint() {
		LocalDateTime now = LocalDateTime.now();	//현재시간 읽어옴
        String formattedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));	//현재시간 출력형식 변경
		int price = 3000;	//가격
		int tax = price/11;
		int priceminustax = price - tax;
		int sum = 0;	//합계
		sum += price;	//금액 합계 price*amount
		DecimalFormat df = new DecimalFormat("#,###");	//이걸 통해 금액 숫자 세자리에서 , 넣어 출력함. System.out.println(df.format(number));
		
		
		System.out.println("		과세합계 		      " + df.format(priceminustax));
		System.out.println("		 부가세 		        " + df.format(tax));
		System.out.println("-------------------------------------------");
		System.out.println("판매합계 				      " + df.format(price));
		
		System.out.println("===========================================");
		System.out.println("신용카드 				      " + df.format(price));
		System.out.println("-------------------------------------------");
		System.out.println("우리카드			   538720**********");
		System.out.println("승인번호 77982843(0)		승인금액 " + df.format(price));
		System.out.println("===========================================");
		System.out.println("	" + formattedNow + " 분당서현점");
		System.out.println("상품 및 기타 문의 : 1522-4400");
		System.out.println("멤버십 및 샵다이소 관련 문의 : 1599-2211");
		System.out.println("");
		System.out.println("		2112820610158231");
		System.out.println("-------------------------------------------");
		System.out.println("◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서");
		System.out.println("  회원가입 후 다양한 혜택을 누려보세요! ◈");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemCount = 3;	//항목이 몇개인지? 무슨 의미인지 모르겠음. 아이템 3개?
		titlePrint();	//영수증 맨 위 타이틀 인쇄
		timeStamp();	//출력시간 인쇄
		HeaderPrint();	//헤더(상품명, 단가, 수량, 금액)인쇄
		
		for(int i = 0; i <= itemCount; i++) {	//항목 갯수만큼 항목 인쇄
			itemPrint(i);
		}
		
		totalPrint();	//합계 세액 등을 인쇄
		
	}	
}		
		
	



/*

String str = "Hello, world!";
String result = str.substring(0, 10);
System.out.println(result);

for(i=0; i<3; i++) System.out.println(itemNames[i].substring(0,10)); 



    String[] itemNames = {"퓨어에어 비말차단용마스크(최고급형)", "슬라이드식명찰(가로형)(100호)", "매직흡착 인테리어후크(알루미늄타입)"};
    String[] itemCodes = {"1031615", "11008152", "1020800"};
    int[] itemPrices = {3000, 1000, 1000};
    int[] itemAmounts = {1, 1, 1};

    String itemName = itemNames[index];
    String itemCode = itemCodes[index];
    int itemPrice = itemPrices[index];
    int itemAmount = itemAmounts[index];
    int itemTotal = itemPrice * itemAmount;











public static int itemCount() {
    return 3; // 항목 개수
}

public static void itemPrint(int index) {
    DecimalFormat df = new DecimalFormat("#,###"); // 금액 세자리에서 , 넣어 출력

    String[] itemNames = {"퓨어에어 비말차단용마스크(최고급형)", "슬라이드식명찰(가로형)(100호)", "매직흡착 인테리어후크(알루미늄타입)"};
    String[] itemCodes = {"1031615", "11008152", "1020800"};
    int[] itemPrices = {3000, 1000, 1000};
    int[] itemAmounts = {1, 1, 1};

    String itemName = itemNames[index];
    String itemCode = itemCodes[index];
    int itemPrice = itemPrices[index];
    int itemAmount = itemAmounts[index];
    int itemTotal = itemPrice * itemAmount;

    System.out.println(itemName + "\t" + df.format(itemPrice) + "\t" + itemAmount + "\t" + df.format(itemTotal));
}

public static void totalPrint() {
    DecimalFormat df = new DecimalFormat("#,###"); // 금액 세자리에서 , 넣어 출력

    int[] itemPrices = {3000, 1000, 1000};
    int[] itemAmounts = {1, 1, 1};

    int totalAmount = 0;
    for (int i = 0; i < itemCount(); i++) {
        totalAmount += itemPrices[i] * itemAmounts[i];
    }
    int tax = (int) (totalAmount * 0.1);
    int total = totalAmount + tax;

    System.out.println("\t\t\t\t" + df.format(totalAmount));
    System.out.println("\t\t\t\t" + df.format(tax));
    System.out.println("\t\t\t\t" + df.format(total));
}
		
		
*/		
		
		
		
		
		/*
		int price = 180000;
		int tax = price/11;
		int priceminustax = price - tax;
		DecimalFormat df = new DecimalFormat("#,###");	//이걸 통해 숫자 세자리에서 , 넣어 출력함. System.out.println(df.format(number));

		LocalDateTime now = LocalDateTime.now();	//현재시간 읽어옴
        String formattedNow = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));	//현재시간 출력형식 변경
  		
		
		System.out.println("  매출전표(카드회사용)");
		System.out.println("맛꼬방치킨				하순희");
		System.out.println("124-25-54620		063-632-6614");
		System.out.println("전북 남원시 농고길 11	       (도롱동)");
		System.out.println("");
		System.out.println("하나기업카드		    신용승인(I)");

		System.out.println("거래일시:" + formattedNow);

		System.out.println("4336-9200-****-982*		일시불");
		System.out.println("TID:***13440	230964317368(0001)");
		System.out.println("가맹점No	00921293692");
		System.out.println("매 입 사	하나카드(디우데이타)");
		System.out.println("승인번호	40860059");
		System.out.println("-------------------------------------");
		System.out.println("판매금액:			"+ df.format(priceminustax) + "원");
		System.out.println("부 가 세:			 "+ df.format(tax) + "원");
		System.out.println("합   계:			"+ df.format(price) + "원");
		System.out.println("-------------------------------------");
		
		}
}*/