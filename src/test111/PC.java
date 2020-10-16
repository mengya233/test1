package test111;

public  class PC{
	CPU cpu;
	HardDisk HD;
	public PC(){}
	public PC(CPU cpu,HardDisk HD){
		this.cpu=cpu;
		this.HD=HD;
		
	}
	public void setCpu(CPU c) {
		this.cpu = c;
	}
	public void setHardDisk(HardDisk h) {
		HD = h;
	}
	public void show(){
		System.out.println("CPU的速度是："+cpu.getSpeed()+"CPU的型号是："+cpu.getpingpai());
		System.out.println("硬盘的容量是："+HD.getAmount()+"硬盘的类型是:"+HD.getlx());
	}
}
 


