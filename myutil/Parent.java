package myutil;

public class Parent {

	protected int p_money;
	public Parent() {
		
		p_money = 100000;
	}
	public Parent(int p_money) {
		super();
		this.p_money = p_money;
	}
	
	public void display() {
		System.out.printf("Parent's money=%d\n",p_money);
	}
}
