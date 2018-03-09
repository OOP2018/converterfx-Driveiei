package converter;

import com.sun.prism.paint.Color;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * UI Controller for events and initializing compomnents.
 */
public class ConverterController {
	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	@FXML
	ComboBox<Length> combobox1;
	@FXML
	ComboBox<Length> combobox2;
	

	/**
	 * JavaFX calls the initialize() method of your controller when it creates the
	 * UI form, after the components have been created and @FXML annotated
	 * attributes have been set.
	 *
	 * This is a hook to initialize anything your controller or UI needs.
	 */
	@FXML
	public void initialize() {
		if (combobox1 != null) {
			combobox1.getItems().addAll(Length.values());
			combobox1.getSelectionModel().select(0); // select an item to show
		}
		if (combobox2 != null) {
			combobox2.getItems().addAll(Length.values());
			combobox2.getSelectionModel().select(1); // select an item to show
		}
	}

	/**
	 * Convert a distance from one unit to another.
	 */
	public void handleConvert(ActionEvent event) {
		Length unit1 = combobox1.getValue();
		Length unit2 = combobox2.getValue();
		double input = 0;
		try {
			if (textfield2.getText().isEmpty()) {
				input = Double.parseDouble(textfield1.getText().trim());
				input = (input/unit2.getUnit())*unit1.getUnit();
				textfield2.setText(String.format("%.4f", input));
			}
		} catch (NumberFormatException ex) {
			textfield2.setText("Invalid Number");
		}
		try {
			if (textfield1.getText().isEmpty()) {
				input = Double.parseDouble(textfield2.getText().trim());
				input = (input/unit1.getUnit())*unit2.getUnit();
				textfield1.setText(String.format("%.4f", input));
			}
		} catch (NumberFormatException ex) {
			textfield1.setText("Invalid Number");
		}
	}

	public void handleClear() {
		textfield1.clear();
		textfield2.clear();
	}
}
