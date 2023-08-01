package Homework0418;

public class HW6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArr[][] = {	//i는 행, j는 열
				{3, 23, 85, 34, 17, 74, 25, 52, 65},
				{10, 7, 39, 42, 88, 52, 14, 72, 63},
				{87, 42, 18, 78, 53, 45, 18, 84, 53},
				{34, 28, 64, 85, 12, 16, 75, 36, 55},
				{21, 77, 45, 35, 28, 75, 90, 76, 1},
				{25, 87, 65, 15, 28, 11, 37, 28, 74},
				{65, 27, 75, 41, 7, 89, 78, 64, 39},
				{47, 47, 70, 45, 23, 65, 3, 41, 44},
				{87, 13, 82, 38, 31, 12, 29, 29, 80},
				};
		
		int max = 0;	//최대값
		int row = 0;	//행
		int col = 0;	//열
		
				
		for(int i=0; i<myArr.length; i++){	//myArr.length는 배열의 행의 개수를 반환. 따라서 i 변수는 행을 기준으로 반복.
			for(int j=0; j<myArr[i].length; j++) {	//myArr[i].length는 i 번째 행의 열의 개수를 반환. 
				if(myArr[i][j] > max) {	//이 부분은 이차원 배열의 모든 원소를 차례대로 탐색하면서, 지금까지 찾은 최대값보다 더 큰 원소를 발견하면 
										//해당 원소를 새로운 최대값으로 설정하고, 그 때의 행과 열의 인덱스를 기록하는 과정입니다.
										//초기에는 max 변수를 배열의 첫 번째 원소로 설정합니다. 그 다음부터 이중 반복문을 돌면서 각 원소를 검사하며, 
										//max보다 큰 원소가 나타나면 max 값을 해당 원소로 업데이트합니다. 동시에, 그 때의 행과 열의 인덱스를 기록하는 row와 col 변수도 업데이트합니다. 
										//그래서 최종적으로는 max 값과 그 때의 행과 열의 인덱스를 구할 수 있습니다.
					max = myArr[i][j];	
					row = i;
					col = j;
					
				}
			}
		}	
		System.out.println("입력된 값 중 최대값은: " + max);
		System.out.println("최대값의 좌표는: " + (row+1) + "행 " + (col+1) + "열");
	}
}

//if(myArr[i] > myArr[i+1])	
//if myArr[i][j] 값이 최대값이라면

/*  이거에서 난 처음에 row, col은 따로 선언 안하고 i j로 값이 나오니 그걸 출력하면 된다고 생각했는데 굳이 row, col을 선언해야 하는 이유가 있어?
row와 col을 따로 선언하여 그 값을 저장한 이유는, 최대값의 위치를 출력하기 위해서 입니다. 만약, row와 col을 선언하지 않고 i와 j를 사용하면 최대값이 저장된 인덱스가 i와 j에 저장됩니다. 
하지만, 이 인덱스는 0부터 시작하기 때문에 출력할 때는 (row+1), (col+1)로 변환해줘야 합니다. 따라서, 출력을 위해 row와 col을 선언하고, 최대값의 위치를 저장할 때 값을 이 변수에 저장한 것입니다.

잘 이해가 안되는데 그냥 출력할 때 i+1, j+1 하는거랑 row+1 col+1하는게 차이가 없지 않나?
i, j를 사용해서 출력하면 i, j가 반복문에서 사용되는 변수라서 최종적으로 가지고 있는 결과값이 아닐 수 있습니다. 예를 들어서, 최대값이 여러 개일 경우에는 가장 마지막으로 나온 최대값의 위치가 출력됩니다. 
하지만 row, col을 사용하면 최대값이 나온 첫번째 위치가 출력됩니다. 또한, i, j로 출력하면 출력 형식을 일관성 있게 유지하기 어렵습니다. 따라서, 결과를 담는 변수를 따로 선언해주고 출력할 때는 최종적으로 
얻은 결과를 사용하는 것이 좋습니다.*/