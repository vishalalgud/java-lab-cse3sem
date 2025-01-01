import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class prog10 extends Applet implements ActionListener {
    TextField num1Field, num2Field, resultField;
    Button addButton, subtractButton;

    public void init() {
   
        setLayout(new GridLayout(4, 2, 5, 5));

       
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        resultField = new TextField(10);
        resultField.setEditable(false);

  
        addButton = new Button("Add");
        subtractButton = new Button("Subtract");

     
        add(new Label("Number 1:"));
        add(num1Field);
        add(new Label("Number 2:"));
        add(num2Field);
        add(new Label("Result:"));
        add(resultField);
        add(addButton);
        add(subtractButton);

      
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
        
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = 0;

            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subtractButton) {
                result = num1 - num2;
            }

            
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            
            resultField.setText("Invalid input");
        }
    }
}

/*
<Applet code="prog10.class" width="300" height="200"></Applet>
*/
