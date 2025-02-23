package OldSyllabus;

import java.awt.*;
import java.awt.event.*;

public class q67 extends Frame implements ActionListener {
    List itemList;
    Button selectButton;

    public q67() {
        // Set the title of the frame
        setTitle("List Component Example");

        // Set the layout manager
        setLayout(new FlowLayout());

        // Initialize the List component
        itemList = new List(5, false);
        itemList.add("Item 1");
        itemList.add("Item 2");
        itemList.add("Item 3");
        itemList.add("Item 4");
        itemList.add("Item 5");

        // Initialize the button
        selectButton = new Button("Select");

        // Add action listener to the button
        selectButton.addActionListener(this);

        // Add components to the frame
        add(itemList);
        add(selectButton);

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
    public void actionPerformed(ActionEvent e) {
        String selectedItem = itemList.getSelectedItem();
        System.out.println("Selected item: " + selectedItem);
    }

    public static void main(String[] args) {
        new q67();
    }
}