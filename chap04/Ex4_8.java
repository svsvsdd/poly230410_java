package chap04;
import java.time.LocalDateTime;	//현재시간 읽어오기 위해 필요
import java.time.format.DateTimeFormatter;	//현재시간 출력형식 지정하기 위해 필요
import java.text.DecimalFormat;	//숫자 출력 형식 변경하기 위함

public class Ex4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
}
