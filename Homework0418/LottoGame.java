package Homework0418;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoGame {
	public static int LOTTO_NUMS = 6; // 로또 번호 개수
	public static int MAX_NUM = 45; // 로또 번호 범위
	public static int[] lottoNums = new int[LOTTO_NUMS]; // 생성된 로또 번호 저장 배열
	public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] userNums = new int[LOTTO_NUMS];

        // 중복 없이 1~45 사이의 6개의 수 입력 받기
        System.out.println("1부터 45사이의 숫자 6개를 입력하세요.");
        for (int i = 0; i < LOTTO_NUMS; i++) {
            System.out.print((i + 1) + "번째 숫자: ");
            int num;
            while (true) {
                num = sc.nextInt();
                if (num < 1 || num > 45) {
                    System.out.println("1부터 45 사이의 숫자를 입력해주세요.");
                    continue;
                }
                if (Arrays.binarySearch(userNums, num) >= 0) {
                //if (Arrays.binarySearch(userNums, num) != -1) {	
                    System.out.println("중복되는 숫자입니다. 다시 입력해주세요.");
                    continue;
                }
                break;
            }
            userNums[i] = num;
        }
        Arrays.sort(userNums);
        System.out.println("입력한 숫자: " + Arrays.toString(userNums));

        // 로또 번호 생성 및 출력
        generateLottoNums();
        System.out.println("생성된 로또 번호: " + Arrays.toString(lottoNums));

        // 등수 출력
        int rank = checkRank(userNums, lottoNums);
        switch (rank) {
            case 1:
                System.out.println("축하합니다! 1등입니다!");
                break;
            case 2:
                System.out.println("축하합니다! 2등입니다!");
                break;
            case 3:
                System.out.println("축하합니다! 3등입니다!");
                break;
            case 4:
                System.out.println("축하합니다! 4등입니다!");
                break;
            case 5:
                System.out.println("축하합니다! 5등입니다!");
                break;
            default:
                System.out.println("아쉽게도 당첨되지 못했습니다.");
        }
        sc.close();
    }

    // 1~45 사이의 중복 없는 6개의 수 랜덤 생성
    public static void generateLottoNums() {
        Random rand = new Random();
        for (int i = 0; i < LOTTO_NUMS; i++) {
            int num;
            while (true) {
                num = rand.nextInt(MAX_NUM) + 1;
                if (Arrays.binarySearch(lottoNums, num) >= 0) {
                    continue;
                }
                break;
            }
            lottoNums[i] = num;
        }
        Arrays.sort(lottoNums);
    }

    // 입력한 숫자와 로또 번호를 비교해 등수 반환
    public static int checkRank(int[] input, int[] lotto) {
        int count = 0;
        boolean bonus = false;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (input[i] == lotto[j]) {
                    count++;
                    break;
                }
            }
        }

        if (count == 6) {
            return 1;
        } else if (count == 5) {
            for (int i = 0; i < 6; i++) {
                if (input[i] == lotto[6] && !bonus) {
                    bonus = true;
                    break;
                }
            }
            if (bonus) {
                return 2;
            } else {
                return 3;
            }
        } else if (count == 4) {
            return 4;
        } else if (count == 3) {
            return 5;
        } else {
            return 0;
        }
    }
} 
