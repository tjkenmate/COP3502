package study.thorjohansson;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import study.thorjohansson.module2.CostOfDriving;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage){
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOk = new Button("Okay");
        Button btExit = new Button("Cancel");
        OkayHandler okayHandler = new OkayHandler();
        btOk.setOnAction(okayHandler);
        ExitHandler exitHandler = new ExitHandler();
        btExit.setOnAction(exitHandler);
        pane.getChildren().addAll(btOk, btExit);

        //Render Box
        Scene main = new Scene(pane);
        primaryStage.setTitle("Thor Test Box");
        primaryStage.setScene(main);
        primaryStage.show();
    }

    class OkayHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e){
            System.out.println("Okay");
        }
    }

    class ExitHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e){
            System.out.println("Exit");
        }
    }

    public static void main(String[] args) {
        CostOfDriving.main(args);
    }

}