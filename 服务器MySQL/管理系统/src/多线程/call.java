package 多线程;

import java.util.concurrent.FutureTask;

public class call {
	public static void main(String[] args) {
callshixian calls=new callshixian();
FutureTask future=new FutureTask(calls);
new Thread(future).start();
	}

}
