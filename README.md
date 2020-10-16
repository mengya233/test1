#  实验一练习2、计G202王飞2020322115 
## 一。实验内容
按照P110,P111的第4题编程题完成编程任务创建三个类，一个主类后，给每个类两个属性。
### CPU类要求
* getSpeed()要求返回speed的值
* 要求setSpeed(int m)方法将参数m的值赋值给speed；
* spped:int
* setSpeed(int):void
* getSpeed():int
### HardDisk类要求
* getAmount()返回amount的值
* 要求setAmount(int m)方法将参数m的值赋值给amount；
* amount:int
* setAmount(int):void
* getAmount():int
### PC类要求
* setCPU(CPU c)将参数c的值赋值给cpu
* 要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD
* 要求show()方法能显示cpu的速度和硬盘的容量。
* cpu:CPU
* HD:HardDisk
* setCPU(CPU):void
* setHardDisk(HardDisk):void
* show():void

### 主类Test的要求
1. main方法中创建一个CPU对象cpu，pu将自 speed己的设置为2200
2. main方法中创建一个 HardDisk对象disk，disk将自己的 amount设置为200
3. main方法中创建一个PC对象pc
4. pc调用setCPU(CPU c)方法，调用时实参是cpu
5. pc调用setHardDisk(HardDisk h)方法，调用时实参是disk
6. pc调用show()方法。
###### 以上为教科书练习2题目要求
___
## 二.试验方法
作业要求利用两个构造方法，所以我使用了一个空的构造方法和一个赋值的构造方法。
```Java
public  class PC{
	CPU cpu;
	HardDisk HD;
	public PC(){}
	public PC(CPU cpu,HardDisk HD){
		this.cpu=cpu;
		this.HD=HD;
		
	}
	HardDisk disk = new HardDisk(200,"固态");
PC pc = new PC(cpu,disk);

```Java
	public CPU(){}
	
	public CPU(int speed,String pingpai){
		this.speed=speed;
		this.pingpai=pingpai;
	}
```
## 三.实验结果

<img src="https://github.com/mengya233/test2/blob/main/shangchuan4.png?raw=true">

CPU的速度是：2200CPU的型号是：晓龙
硬盘的容量是：200硬盘的类型是:固态

## 四.实验感想
对构造方法概念模糊，关键词不熟悉，需要补充基础知识，写JAVA基本架构无法脱离教科书。
