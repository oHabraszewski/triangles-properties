package tk.chaber.triangles_properties;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import tk.chaber.triangles_properties.Geometry.Angle;
import tk.chaber.triangles_properties.Geometry.Point;
import tk.chaber.triangles_properties.Geometry.Section;
import tk.chaber.triangles_properties.Geometry.Triangle;


public class Controller {
    @FXML
    private TextField   input1,
                        input2,
                        input3;

    @FXML
    private Text side1,
                    side2,
                    side3;
    @FXML
    public void createTriangle(ActionEvent event){
        double  value1 = Double.parseDouble(input1.getText()),
                value2 = Double.parseDouble(input2.getText()),
                value3 = Double.parseDouble(input3.getText());

        Section sideC = new Section(new Point(0, 0), new Angle(0), value1);
        Angle   alpha = new Angle(value2),
                beta = new Angle(180 - value3);
        Triangle triangle = new Triangle(sideC, alpha, beta);
        System.out.println(triangle.toString());

    }
}
