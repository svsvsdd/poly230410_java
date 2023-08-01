package Homework0420;

public class InputData {
    String[] name; // 학생 이름을 저장하는 배열
    int[] kor; // 국어 점수를 저장하는 배열
    int[] eng; // 영어 점수를 저장하는 배열
    int[] mat; // 수학 점수를 저장하는 배열
    int[] sum; // 국어, 영어, 수학 점수의 합계를 저장하는 배열
    double[] avg; // 국어, 영어, 수학 점수의 평균을 저장하는 배열

    public InputData(int person) { // 생성자 메소드
        name = new String[person]; // person만큼의 크기를 가지는 String 배열 생성
        kor = new int[person]; // person만큼의 크기를 가지는 int 배열 생성
        eng = new int[person]; // person만큼의 크기를 가지는 int 배열 생성
        mat = new int[person]; // person만큼의 크기를 가지는 int 배열 생성
        sum = new int[person]; // person만큼의 크기를 가지는 int 배열 생성
        avg = new double[person]; // person만큼의 크기를 가지는 double 배열 생성
    }

    public void setData(int i, String name, int kor, int eng, int mat) { // 메소드 오버로딩을 사용한 setData 메소드 정의
        this.name[i] = name; // i번째 학생 이름 저장
        this.kor[i] = kor; // i번째 학생 국어 점수 저장
        this.eng[i] = eng; // i번째 학생 영어 점수 저장
        this.mat[i] = mat; // i번째 학생 수학 점수 저장
        this.sum[i] = kor + eng + mat; // i번째 학생 국어, 영어, 수학 점수의 합계 계산 후 저장
        this.avg[i] = (double)sum[i] / 3.0; // i번째 학생 국어, 영어, 수학 점수의 평균 계산 후 저장
    }
}
