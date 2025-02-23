package OldSyllabus;

import java.awt.*;
import java.awt.event.*;

public class q72 extends Frame implements ItemListener {
    CheckboxGroup checkboxGroup;
    Checkbox option1, option2, option3;
    Button submitButton;

    public q72() {
        // Set the title of the frame
        setTitle("CheckboxGroup Example");

        // Set the layout manager
        setLayout(new FlowLayout());

        // Initialize the CheckboxGroup
        checkboxGroup = new CheckboxGroup();
        option1 = new Checkbox("Option 1", checkboxGroup, false);
        option2 = new Checkbox("Option 2", checkboxGroup, false);
        option3 = new Checkbox("Option 3", checkboxGroup, false);

        // Initialize the button
        submitButton = new Button("Submit");

        // Add item listeners to checkboxes
        option1.addItemListener(this);
        option2.addItemListener(this);
        option3.addItemListener(this);

        // Add action listener to the button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedOption = checkboxGroup.getSelectedCheckbox().getLabel();
                System.out.println("Selected: " + selectedOption);
            }
        });

        // Add components to the frame
        add(option1);
        add(option2);
        add(option3);
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
        new q72();
    }
}