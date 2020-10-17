计G202 陈庆 2020322100
# Ĵava实验二PC机模拟程序  
 
### 基本要求：
完成教材p110 第四题关于PC、内存等模拟的程序。 
### 附加要求：
类中定义不少于两个构造方法；
每个类定义不少于2个属性，且属性的类型应该多样化；
根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
## 二、代码
（1）： CPU cpu = new CPU(); cpu.setSpeed(2200); 
（2）： HardDisk HD=new HardDisk(); HD.setAmount(200);
（3）：CPU cpu = new CPU();
（4）： pc.setCPU(cpu);
（5）： pc.setHardDisk(HD);
（6）：pc.show(); 
#### 类中定义不少于两个构造方法；   
 public void setJiage(int jiage){
			this.jiage = jiage;} public void setA(double a){ this.a =a; }

 #### 每个类定义不少于2个属性，且属性的类型应该多样化
  int getJiage() {
		      return jiage;}
 System.out.println("CPU价格:"+cpu.getJiage());  cpu.setJiage(5000);

double getA(){ return a; } public void setA(double a){ this.a =a; } System.out.println("硬盘大小:"+HD.getA()); HD.setA(188);

 #### 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
  private void setA(){
			this.setA();
		}
  ## 三 实验感想
  
