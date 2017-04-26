        package sample;

        import javafx.application.Application;
        import javafx.event.EventHandler;
        import javafx.scene.Scene;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.input.KeyCode;
        import javafx.scene.input.KeyEvent;
        import javafx.scene.layout.VBox;
        import javafx.stage.Stage;

        public class Main extends Application {
            TextField field = new TextField();
            final Label message = new Label("");

            @Override
    public void start(Stage stage) {

                VBox pane = new VBox();

        field.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {
                if(e.getCode()==KeyCode.ENTER) {
                    ZipCode zip = new ZipCode(field.getText());  Ja 
                   message.setText(zip.c);
                   message.setText(zip.d);
                }}
        }); //smth like "Scanner" but from GUI
                 pane.getChildren().addAll(field,message);
                stage.setResizable(false);
                stage.setScene(new Scene(pane, 640, 480));
                stage.setTitle("Zipcode");
                stage.show();
    }

    public static void main(String[] args) {
                launch(args);
            }

}

