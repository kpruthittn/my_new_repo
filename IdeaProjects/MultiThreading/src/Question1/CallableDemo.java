package Question1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Callable<Integer> callableTask= () ->{
            int sum=0;
            for(int i =0 ; i<=10 ; i++)
            {
                sum = sum+i;
            }
            return sum;
        };

        FutureTask<Integer> futureTask = new FutureTask<>(callableTask);

        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println("Sum of Integers is:" + futureTask.get());

    }
}
