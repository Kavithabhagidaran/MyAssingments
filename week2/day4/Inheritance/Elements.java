package week2.day4;

//SubClass 3 Execution class inherits from Button

public class Elements extends Button {

	public static void main(String[] args) {

		//Object creation for TextField
		
		TextField textfield = new TextField();
		System.out.println("TextField methods...");
		textfield.click();
		textfield.setText("Inheritance");
		textfield.getText();
		
		//Object creation for CheckBoxButton
		
		CheckBoxButton checkbox= new CheckBoxButton();
		System.out.println("\n CheckBoxButton methods...");
		checkbox.click();
		checkbox.setText("CheckBox");
		checkbox.clickCheckButton();
		checkbox.submit();
		
		//Object creation for RadioButton
		
		RadioButton radio= new RadioButton();
		System.out.println("\n RadioButton methods...");
		radio.click();
		radio.setText("RadioButton");
		radio.selectRadioButton();
		radio.submit();
		
		//Object creation for Element
		
		Elements element = new Elements();
		System.out.println("\n Elements methods");
		element.click();
		element.setText("Elements");
		element.submit();
		
				
	}

}
