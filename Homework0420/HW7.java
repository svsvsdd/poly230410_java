package Homework0420;

public class HW7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int person = 10;	//이 값을 주는 만큼 저장소 생성
		
		InputData inData = new InputData(person);	//생성자의 숫자를 준 만큼 배열 생성
		
		//입력 데이터 생성
		for(int i = 0; i < person; i++) {	
			String name = "홍길" + i;					//이름
			int kor = (int)(Math.random() * 100);	//국어점수
			int eng = (int)(Math.random() * 100);	//영어점수
			int mat = (int)(Math.random() * 100);	//수학점수
			inData.setData(i, name, kor, eng, mat);	//클래스 내 값을 입력
		}
		
		//입력 값 잘 들어갔는지 확인
		for(int i = 0; i < person; i++) {
			System.out.println("번호: " + i + " 이름: " + inData.name[i] + " 국어: " + inData.kor[i] + 
					" 영어: " + inData.eng[i] + " 수학: " + inData.mat[i] + " 총점: "  + inData.sum[i] + 
					" 평균: "  + inData.avg[i]);
		}
	}

}
