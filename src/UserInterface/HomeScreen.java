package UserInterface;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class HomeScreen extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        URL url = new File("src/UserInterface/view/home-screen-view").toURI().toURL();
    }
}
