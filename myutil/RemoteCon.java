package myutil;

//interface 다중상속

public interface RemoteCon extends Volume, Channel{

	//전원 on/off
	void onOff();
}
