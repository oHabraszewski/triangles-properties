package tk.chaber.triangles_properties;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import tk.chaber.triangles_properties.Geometry.Angle;
import tk.chaber.triangles_properties.Geometry.Point;
import tk.chaber.triangles_properties.Geometry.Section;
import tk.chaber.triangles_properties.Geometry.Triangle;
import tk.chaber.triangles_properties.util.Value;


public class Controller {
    @FXML
    private TextField   input1,
                        input2,
                        input3;

    @FXML
    private Text    side1,
                    side2,
                    side3;

    @FXML
    private Text    angle1,
                    angle2,
                    angle3;
    @FXML
    public void createTriangle(ActionEvent event){
        double  value1 = Double.parseDouble(input1.getText()),
                value2 = Double.parseDouble(input2.getText()),
                value3 = Double.parseDouble(input3.getText());

        Section sideC = new Section(new Point(0, 0), new Angle(0), value1);
        Angle   alpha = new Angle(value2),
                beta = new Angle(180 - value3);

        Triangle triangle = new Triangle(sideC, alpha, beta);

        side1.setText(Value.simplify(triangle.getA().getLength()));
        side2.setText(Value.simplify(triangle.getB().getLength()));
        side3.setText(Value.simplify(triangle.getC().getLength()));

        angle1.setText(Value.simplify(value2));
        angle2.setText(Value.simplify(value3));
        angle3.setText(Value.simplify(180 - (value2 + value3)));
    }
}
