import java.awt.*;
import java.awt.event.*;

public class q69 extends Frame {
    TextField textField;
    TextArea textArea;
    Button showButton;

    public q69() {
        // Set the title of the frame
        setTitle("TextField vs TextArea");

        // Set the layout manager
        setLayout(new FlowLayout());

        // Initialize components
        textField = new TextField(20);
        textArea = new TextArea(5, 20);
        showButton = new Button("Show Input");

        // Add action listener to the button
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("TextField: " + textField.getText());
                System.out.println("TextArea: " + textArea.getText());
            }
        });

        // Add components to the frame
        add(new Label("TextField:"));
        add(textField);
        add(new Label("TextArea:"));
        add(textArea);
        add(showButton);

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

    public static void main(String[] args) {
        new q69();
    }
}