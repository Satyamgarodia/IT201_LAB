package OldSyllabus;

import java.awt.*;
import java.awt.event.*;

public class q66 extends Frame implements ActionListener {
    // Declare components
    Label nameLabel, emailLabel, passwordLabel;
    TextField nameField, emailField, passwordField;
    Button submitButton, cancelButton;

    public q66() {
        // Set the title of the frame
        setTitle("Registration Form");

        // Set the layout manager
        setLayout(new GridLayout(4, 2));

        // Initialize components
        nameLabel = new Label("Name:");
        emailLabel = new Label("Email:");
        passwordLabel = new Label("Password:");
        nameField = new TextField();
        emailField = new TextField();
        passwordField = new TextField();
        passwordField.setEchoChar('*'); // Mask password input
        submitButton = new Button("Submit");
        cancelButton = new Button("Cancel");

        // Add action listeners
        submitButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(submitButton);
        add(cancelButton);

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
        if (e.getSource() == submitButton) {
            System.out.println("Submitted: " + nameField.getText() + ", " + emailField.getText());
        } else if (e.getSource() == cancelButton) {
            System.out.println("Registration canceled.");
        }
    }

    public static void main(String[] args) {
        new q66();
    }
}