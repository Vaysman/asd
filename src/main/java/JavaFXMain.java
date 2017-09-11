import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

/**
 * Created by mrchebik on 9/12/17.
 */
public class JavaFXMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Injector injector = Guice.createInjector(new GuiceModule());
        FXMLLoader fxmlLoader = injector.getInstance(FXMLLoader.class);
    }
}
