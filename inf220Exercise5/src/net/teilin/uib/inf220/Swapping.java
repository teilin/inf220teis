package net.teilin.uib.inf220;

public class Swapping {
	
	private int a;
	private int b;
	
	public Swapping(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void doSwap() {
		System.out.println("Before. a="+this.a+", b="+this.b);
		swap1(this.a,this.b);
		System.out.println("After. a="+this.a+", b="+this.b);
	}
	
	/*@ ensures x != y;
	  @ ensures y != x;
	 */
	private void swap1(Object x, Object y) {
		Object tmp = x;
		x = y;
		y = tmp;
	}
	
	public static <A extends Assignable<A>> void swap2(T x, T y) {
		T e = x.clone();
		x.assign(y);
		y.assign(t);
	}
}
