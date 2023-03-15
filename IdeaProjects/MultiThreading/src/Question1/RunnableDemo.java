package Question1;

public class RunnableDemo {



    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            int sum =0;
            @Override
            public void run() {
                for(int i =0 ; i<=10 ; i++)
                {
                    sum += i;
                }
                System.out.println("The sum of Integers is:" + sum);

            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();
    }

}
