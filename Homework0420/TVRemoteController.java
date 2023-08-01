package Homework0420;

public class TVRemoteController {
	int limit_up_channel = 10;	//최대 10
	int limit_down_channel = 0;	//최소 0
	int channel = 0;			//초기채널 1
	int limit_up_vol = 5;		//최대 5
	int limit_down_vol = 0;		//최소 0
	int vol = 0;				//초기vol 1
	
	
	void channelUp() {	//최대channel 이전엔 채널증가
		if(channel == limit_up_channel) {			
		}else {
			channel++;
		}
	}
	void channelDn() {	//최소channel 이전엔 채널감소		
		if(channel == limit_down_channel) {			
		}else {
			channel--;
		}
	}
	
	void volUp() {		//최대vol 이전엔 음량증가	
		if(vol == limit_up_vol) {			
		}else {
			vol++;
			
		}
	}
	void volDn() {		//최소vol 이전엔 음량감소	
		if(vol == limit_down_vol) {			
		}else {
			vol--;
		}
	}
	
	
}
