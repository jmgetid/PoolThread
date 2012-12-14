import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExample {

    ExecutorService executor;

    public ThreadPoolExample()
    {
        executor = Executors.newFixedThreadPool(5);
    }
    public void execute( Runnable task) throws InterruptedException, ExecutionException
    {
        System.out.println("Executing task...");
        Future<?> future = executor.submit(task);
        future.get();
        System.out.println("Notification received");
    }

    public static void main(String argv[]) throws Exception {

        ThreadPoolExample tpe = new ThreadPoolExample();

        for(int i=0; i<1000; i++)
        {
            tpe.execute(new Task(i, tpe));
        }


    }
}

