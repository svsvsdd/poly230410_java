package Homework0420;

public class Elevator {
	int limit_up_floor = 10;	//최상위 층
	int limit_down_floor = 0;	//최하위 층
	int floor = 1;				//현재 층
	String help;
	
	void up() {
		if(floor == limit_up_floor) {	//10층일때 출력
			help = "마지막층입니다.";
		} else {						//10층 아닐때
			floor++;					//증가
			help = floor + "층입니다.";
		}
	}
	
	void down() {
		if(floor == limit_down_floor) {	//0층일때 출력
			help = "처음층입니다.";
		}else {							//0층 아닐때
			floor--;					//감소
			help = floor +"층입니다.";
		}
	}
}
