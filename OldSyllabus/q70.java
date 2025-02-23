package OldSyllabus;

import java.awt.*;
import java.awt.event.*;

public class q70 extends Frame implements ItemListener {
    Checkbox checkbox1, checkbox2;
    Button submitButton;

    public q70() {
        // Set the title of the frame
        setTitle("Checkbox Component Example");

        // Set the layout manager
        setLayout(new FlowLayout());

        // Initialize checkboxes
        checkbox1 = new Checkbox("Option 1");
        checkbox2 = new Checkbox("Option 2");

        // Initialize the button
        submitButton = new Button("Submit");

        // Add item listeners to checkboxes
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);

        // Add action listener to the button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedOptions = "Selected: ";
                if (checkbox1.getState()) {
                    selectedOptions += "Option 1 ";
                }
                if (checkbox2.getState()) {
                    selectedOptions += "Option 2 ";
                }
                System.out.println(selectedOptions);
            }
        });

        // Add components to the frame
        add(checkbox1);
        add(checkbox2);
        add(submitButton);

        // Set the size of the frame
        setSize(300, 200);
        setVisible(true);

        // Add a window listener to handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // Handle checkbox state changes if needed
    }

    public static void main(String[] args) {
        new q70();
    }
}