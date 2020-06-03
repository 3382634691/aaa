package mysqlce;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;


public class SumTest {

	public static void main(String[] args) {
		
	
		ThreadPoolExecutor executor=(ThreadPoolExecutor)Executors.newFixedThreadPool(4);
		
		List<Future<Integer>> resultList=new ArrayList<>();


		for (int i=0; i<10; i++){
			SumTask calculator=new SumTask(i*100+1, (i+1)*100);
			Future<Integer> result=executor.submit(calculator);
			resultList.add(result);
		}
		
		

		do {
			System.out.printf("Main: : %d\n",executor.getCompletedTaskCount());
			for (int i=0; i<resultList.size(); i++) {
				Future<Integer> result=resultList.get(i);
				System.out.printf("Main: Task %d: %s\n",i,result.isDone());
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (executor.getCompletedTaskCount()<resultList.size());
		

		int total = 0;
		for (int i=0; i<resultList.size(); i++) {
			Future<Integer> result=resultList.get(i);
			Integer sum=null;
			try {
				sum=result.get();
				total = total + sum;
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("1-1000" + total);
		

		executor.shutdown();
	}
}



class SumTask implements Callable<Integer> {

	private int startNumber;
	private int endNumber;
	
	public SumTask(int startNumber, int endNumber){
		this.startNumber=startNumber;
		this.endNumber=endNumber;
	}
	
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i=startNumber; i<=endNumber; i++)
		{
			sum = sum + i;
		}
		
		Thread.sleep(new Random().nextInt(1000));
		
		System.out.printf("%s: %d\n",Thread.currentThread().getName(),sum);
		return sum;
	}
}

