package 多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorservice {
public static void main(String[] args)
{
	runableump run=new runableump();
	ExecutorService es=Executors.newFixedThreadPool(3);
	
	es.submit(run);
	es.submit(run);
	es.submit(run);
	es.submit(run);
	es.submit(run);

}
}
