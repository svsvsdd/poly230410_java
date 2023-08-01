package Homework0418;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[6];
        for (int i = 0; i < userNumbers.length; i++) {	//userNumbers.length 6
            System.out.print((i + 1) + "번째 숫자를 입력하세요: ");
            int number = scanner.nextInt();
            if (number < 1 || number > 45) {
                System.out.println("잘못된 입력입니다. 1과 45 사이의 숫자를 입력하세요.");
                i--;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (userNumbers[j] == number) {
                    System.out.println("중복된 숫자입니다.");
                    i--;
                    break;
                }
            }
            userNumbers[i] = number;
        }
        scanner.close();
        int[] lottoNumbers = generateLottoNumbers();
        int matches = compareNumbers(userNumbers, lottoNumbers);
        switch (matches) {
            case 6:
                System.out.println("1등");
                break;
            case 5:
                System.out.println("2등");
                break;
            case 4:
                System.out.println("3등");
                break;
            case 3:
                System.out.println("4등");
                break;
            case 2:
                System.out.println("5등");
                break;
            default:
                System.out.println("꽝");
        }
    }
    
    
	public static int[] generateLottoNumbers() {	//중복방지 첨가해야됨
        int[] lottoNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            lottoNumbers[i] = (int) (Math.random() * 45 + 1);
            System.out.print(lottoNumbers[i] + " ");
        }
        return lottoNumbers;
    }   
	
	
	/*
    public static int[] generateLottoNumbers() {
        int[] lottoNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            lottoNumbers[i] = (int) (Math.random() * 45 + 1);
            	for (int j = 0; j < i; j++) {
                //if (userNumbers[j] == number) {
                if (lottoNumbers[j] == Math.random()) {
                    System.out.println("중복된 숫자입니다.");
                    i--;
                    break;
                }
            }*/
          	
            	
    	
            	
            	
            		
            
            
        /*    for (int j = 0; j < i; j++) {
                //if (userNumbers[j] == number) {
                if (lottoNumbers[j] == Math.random()) {
                    System.out.println("중복된 숫자입니다.");
                    i--;
                    break;
                }
            }
            userNumbers[i] = number;
        }
        */
        
        
          

    public static int compareNumbers(int[] userNumbers, int[] lottoNumbers) {
        int matches = 0;
        for (int i = 0; i < userNumbers.length; i++) {
            for (int j = 0; j < lottoNumbers.length; j++) {
                if (userNumbers[i] == lottoNumbers[j]) {
                    matches++;
                    break;
                }
            }
        }
        return matches;
    }
}