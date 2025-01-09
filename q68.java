import java.awt.*;
import java.awt.event.*;

public class q68 extends Frame implements ItemListener {
    Choice choice;
    Label selectedLabel;

    public q68() {
        // Set the title of the frame
        setTitle("Choice Component Example");

        // Set the layout manager
        setLayout(new FlowLayout());

        // Initialize the Choice component
        choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        choice.add("Option 4");

        // Initialize the label
        selectedLabel = new Label("Selected: None");

        // Add item listener to the choice
        choice.addItemListener(this);

        // Add components to the frame
        add(choice);
        add(selectedLabel);

        // Set the size of the frame
        setSize(300, 200);
        setVisible(true);

        // Add a window listener to handle window closing
        addWindowListener(new WindowAdapter() {
            public windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String selectedItem = choice.getSelectedItem();
        selectedLabel.setText("Selected: " + selectedItem);
    }

    public static void main(String[] args) {
        new q68();
    }
}