package U2;

public class Fib 
{
	public Fib(int stopper){
	this.stopper = stopper;
	lastNum = 1;
	secNum = 1;
	}
	
	public long getNum(){
		for(int i = 0; i < (stopper-2); i++){
			nextNum = lastNum + secNum;
			lastNum = secNum;
			secNum = nextNum;
		}
		if (stopper == 1 || stopper == 2){
			return (1);
		}
		else
			return(nextNum);
	}
	
	private int stopper;
	private long lastNum;
	private long secNum;
	private long nextNum;
}
