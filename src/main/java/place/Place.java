package place;

import com.airhacks.afterburner.injection.Injector;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrchebik on 9/14/17.
 */
public class Place extends Application {
    @Getter
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        Map<Object, Object> customProperties = new HashMap<>();
        customProperties.put("place", this);
        Injector.setConfigurationSource(customProperties::get);

        PlaceView placeView = new PlaceView();
        Scene scene = new Scene(placeView.getView());
        stage.setScene(scene);
        stage.show();

    }

    public void close() {
        stage.close();
    }
}
