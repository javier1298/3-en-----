package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class Controller {

    private static final Button JUGADOR ="X"
    @FXML
    Button bt1;
    @FXML
    Button bt2;
    @FXML
    Button bt3;
    @FXML
    Button bt4;
    @FXML
    Button bt5;
    @FXML
    Button bt6;
    @FXML
    Button bt7;
    @FXML
    Button bt8;
    @FXML
    Button bt9;

    public void select_1(Event event) {
        bt1.setText("X");
        if (bt1 == JUGADOR || bt2 == null || bt3 == null || bt4== null || bt5 == null || bt6 == null
                || bt4== null || bt5 == null || bt6 == null ) {

        }
    }


    public void select_4(Event event) {
        bt4.setText("X");
        bt6.setText("O");
    }

    public void select_7(Event event) {

        bt7.setText("X");
        if (bt4 == (null)) ;
        {
            bt4.setText("O");
        }

    }

    public void select_2(Event event) {
        bt2.setText("X");
        if (bt3 == (null)) ;
        {
            bt3.setText("O");
        }

    }

    public void select_5(Event event) {
        bt5.setText("X");
        bt8.setText("O");

    }

    public void select_8(Event event) {
        bt8.setText("X");
        if (bt9 == (null)) ;
        {
            bt9.setText("O");
        }
    }


    public void select_3(Event event) {
        bt3.setText("X");
    }

    public void select_6(Event event) {
        bt6.setText("X");
        if (bt8 == (null));{
            bt8.setText("O");
          }

                bt4.setText("O");
            if (bt2== (null));{
                bt2.setText("O");


        }
    }

    public void select_9(Event event) {
        bt9.setText("X");

    }


    public void comenzar(ActionEvent actionEvent) {
       bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");

    }
}
