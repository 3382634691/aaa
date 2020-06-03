package mysqlce;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

public static void main(String[] args) throws InterruptedException {

		Server server=new Server();
		
		for (int i=0; i<100; i++){
			Task task=new Task("Task "+i);
			Thread.sleep(10);
			server.submitTask(task);
		
		}		
		server.endServer();
	}
}

class Server {
	
	private ThreadPoolExecutor executor;
	public Server(){
		executor=(ThreadPoolExecutor)Executors.newCachedThreadPool();
		//executor=(ThreadPoolExecutor)Executors.newFixedThreadPool(5);
	}
	

	public void submitTask(Task task){
		System.out.printf("Server: A new task has arrived\n");
		executor.execute(task);
		System.out.printf("Server: Pool Size: %d\n",executor.getPoolSize());
		System.out.printf("Server: Active Count: %d\n",executor.getActiveCount());
		System.out.printf("Server: Completed Tasks: %d\n",executor.getCompletedTaskCount());
	}

	public void endServer() {
		executor.shutdown();
	}
}



class Task implements Runnable {
static int i=0;
	private String name;
	
	public Task(String name){
		this.name=name;
	}
	
	public void run() {
		try {
			i++;
			System.out.println("线程执行了"+i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.printf("%s: Task %s: Finished on: %s\n",Thread.currentThread().getName(),name,new Date());
	}

}
