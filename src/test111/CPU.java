package test111;

public class CPU{
	String pingpai;
	int speed;   //ËÙ¶È
	
	public CPU(){}
	
	public CPU(int speed,String pingpai){
		this.speed=speed;
		this.pingpai=pingpai;
	}
	
	public int getSpeed() {
		return speed;
	}
	public String getpingpai(){
		return pingpai;
	}
	public void setpingpai(String n){
		this.pingpai =n;
	}
	public void setSpeed(int m) {
		this.speed = m;
	}
}
 