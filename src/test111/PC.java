package test111;

public  class PC{
	CPU cpu;
	HardDisk HD;
	public PC(){}
	public PC(CPU cpu,HardDisk HD){
		this.cpu=cpu;
		this.HD=HD;
		
	}
	void setCpu(CPU c) {
		this.cpu = c;
	}
	void setHardDisk(HardDisk h) {
		HD = h;
	}
	public void show(){
		System.out.println("CPU���ٶ��ǣ�"+cpu.getSpeed()+"CPU���ͺ��ǣ�"+cpu.getpingpai());
		System.out.println("Ӳ�̵������ǣ�"+HD.getAmount()+"Ӳ�̵�������:"+HD.getlx());
	}
}
 


