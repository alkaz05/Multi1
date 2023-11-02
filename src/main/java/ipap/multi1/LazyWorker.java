package ipap.multi1;

public class LazyWorker extends Thread{
    void work(int t) throws InterruptedException {
        System.out.println("начинаю работать");
        sleep(t);
        System.out.println("закончил работать");
    }

    @Override
    public void run() {
        try {
            work(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
