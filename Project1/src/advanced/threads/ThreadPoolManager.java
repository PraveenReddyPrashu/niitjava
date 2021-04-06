package advanced.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadPoolManager {  
	public static void main(String[] args) { 

		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int jobNo = 0; jobNo < 10; jobNo++) {  
			Runnable worker = new WorkerThread("" + jobNo);  
			executor.execute(worker); 
		}  
		executor.shutdown();  
		while (!executor.isTerminated()) {   }  

		System.out.println("Finished all threads");  
	}  
}  