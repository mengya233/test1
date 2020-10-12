package test111;

public class HardDisk{
	int amount;     //ÈÝÁ¿
	String lx;
	public HardDisk(){}
	public HardDisk(int a1,String lx){
		amount=a1;
		this.lx=lx;
		
	}
	public String getlx() {
		return lx;
	}
	void setlx(String n) {
		this.lx=n;
	}
	public int getAmount() {
		return amount;
	}
	void setAmount(int m) {
		this.amount = m;
	}	
}
 