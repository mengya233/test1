package test110;

import test111.CPU;
import test111.HardDisk;
import test111.PC;

public class Test {
	public static void main(String[] args) {
		CPU cpu = new CPU(2200,"ÏþÁú");
//		cpu.setSpeed(2200);
//		cpu.setpingpai("ÏþÁú");
		
		
		HardDisk disk = new HardDisk(200,"¹ÌÌ¬");
//		disk.amount = 200;
		PC pc = new PC();
//		pc.setpingpai(pingpai);
		pc.setCpu(cpu);
		pc.setHardDisk(disk);
    	pc.show();
// 
	}
}
