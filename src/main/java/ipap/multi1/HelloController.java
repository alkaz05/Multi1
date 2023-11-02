package ipap.multi1;

import javafx.concurrent.Worker;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import static java.lang.Thread.sleep;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    TextArea log;

    @FXML
    protected void onHelloButtonClick() throws InterruptedException {
        log.appendText("\nнажата кнопка");
        sleep(5000);
        log.appendText("\nмы тут типа работаем");
    }

    @FXML
    void onStartThreadClick() throws InterruptedException {
        log.appendText("\nнажата кнопка StartThread");
        LazyWorker w = new LazyWorker();
        w.start();
    }

    @FXML
    void onStartDemoWorker()
    {
        log.appendText("\nнажата кнопка StartDemoWorker");
        DemoWorker dw = new DemoWorker(6, 1000, log);
        dw.start();
    }

    @FXML
    void onStartRunnableWorker(){
        log.appendText("\nнажата кнопка StartRunnableWorker");
        RunnableWorker rw = new RunnableWorker(5, 1100, log);
        Thread tr= new Thread(rw);
        tr.start();
    }
}