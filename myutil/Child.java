package myutil;

public class Child extends Parent{
	
	int c_money;
	
	public Child() {
		c_money = 500000;
	}

	public Child(int c_money) {
		super();
		this.c_money = c_money;
	}
	public Child(int p_money,int c_money) {
		//super
		super.p_money = p_money;
		this.c_money = c_money;
	}
	
	public void display() {
		System.out.printf("Child's money=%d\n",c_money);
	}
	
}
