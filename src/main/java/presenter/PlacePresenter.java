package presenter;

import javafx.fxml.FXML;

import javax.inject.Inject;

/**
 * Created by mrchebik on 9/14/17.
 */
public class PlacePresenter {
    @Inject private view.Place Place;

    @FXML private void clicked() {
        System.out.println(Place);
        System.out.println(Place.getStage());

        Place.close();
    }
}
