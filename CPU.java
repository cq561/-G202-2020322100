package chenqing;

public class CPU {
	   int speed; 
       int jiage;
       double a;
	   int getSpeed() {
	      return speed;

	   }
	   int getA(){
			  return (int) a;
		  }

	   int getJiage() {
		      return jiage;

		   }
	   public void setSpeed(int speed) {
	      this.speed = speed;

	   }
	   public void setJiage(int jiage){
			this.jiage = jiage;
		}
	   private void setA(){
			this.setA();
		}
	}