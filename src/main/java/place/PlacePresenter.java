package place;

import javafx.fxml.FXML;

import javax.inject.Inject;

/**
 * Created by mrchebik on 9/14/17.
 */
public class PlacePresenter {
    @Inject
    private Place place;

    @FXML
    private void clicked() {
        System.out.println(place);
        System.out.println(place.getStage());

        place.close();
    }
}
