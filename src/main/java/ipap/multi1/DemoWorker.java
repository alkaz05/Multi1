package ipap.multi1;

import javafx.scene.control.TextArea;

public class DemoWorker extends Thread{
    int kolvo;
    int interval;
    TextArea logElem;

    public DemoWorker(int kolvo, int interval, TextArea logElem) {
        this.kolvo = kolvo;
        this.interval = interval;
        this.logElem = logElem;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < kolvo; i++) {
                sleep(interval);
                logElem.appendText("\n"+i+" шаг");
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
