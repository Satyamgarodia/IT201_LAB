import java.awt.*;
import java.awt.event.*;

public class q73 extends Frame {
    Panel panel;
    Button button1, button2;

    public q73() {
        // Set the title of the frame
        setTitle("Panel Example");

        // Set the layout manager
        setLayout(new FlowLayout());

        // Initialize the panel
        panel = new Panel();
        panel.setLayout(new FlowLayout());

        // Initialize buttons
        button1 = new Button("Button 1");
        button2 = new Button("Button 2");

        // Add buttons to the panel
        panel.add(button1);
        panel.add(button2);

        // Add action listeners to buttons
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 clicked.");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 clicked.");
            }
        });

        // Add components to the frame
        add(panel);

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
        new q73();
    }
}