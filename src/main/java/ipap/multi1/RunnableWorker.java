package ipap.multi1;

import javafx.scene.control.TextArea;

import static java.lang.Thread.sleep;

public class RunnableWorker implements Runnable{
    int kolvo;
    int interval;
    TextArea logElem;

    public RunnableWorker(int kolvo, int interval, TextArea logElem) {
        this.kolvo = kolvo;
        this.interval = interval;
        this.logElem = logElem;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < kolvo; i++) {
                sleep(interval);
                logElem.appendText("\nработаем на шаге "+i);
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
