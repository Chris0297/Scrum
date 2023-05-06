package frontend;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button primaryButton;

    @FXML
    private Button searchButton;

    @FXML
    private Button buttonFilter;
    
    @FXML
    void switchToDetail(ActionEvent event) throws IOException {
        App.setRoot("detail");
    }
    

    @FXML
    void switchToSecondary(ActionEvent event) throws IOException {
        App.setRoot("detail");
    }


    @FXML
    void switchtoRoomEquipment(ActionEvent event) throws IOException {
        App.setRoot("RoomEquipment");
    }

    

}