import java.awt.*;
import java.awt.event.*;

public class q65 extends Frame implements ActionListener {
    // Declare buttons
    private Button submitButton;
    private Button cancelButton;

    public q65() {
        // Set the title of the frame
        setTitle("AWT Example");

        // Set the layout manager
        setLayout(new FlowLayout());

        // Initialize buttons
        submitButton = new Button("Submit");
        cancelButton = new Button("Cancel");

        // Add action listeners to buttons
        submitButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // Add buttons to the frame
        add(submitButton);
        add(cancelButton);

        // Set the size of the frame
        setSize(300, 200);
        // Set the frame to be visible
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
        // Check which button was clicked
        if (e.getSource() == submitButton) {
            System.out.println("Submit button clicked.");
        } else if (e.getSource() == cancelButton) {
            System.out.println("Cancel button clicked.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the frame
        new q65();
    }
}