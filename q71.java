import java.awt.*;
import java.awt.event.*;

public class q71 extends Frame {
    Scrollbar scrollbar;
    Label label;

    public q71() {
        // Set the title of the frame
        setTitle("Scrollbar Example");

        // Set the layout manager
        setLayout(new FlowLayout());

        // Initialize the scrollbar
        scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 50, 1, 0, 100);
        label = new Label("Value: " + scrollbar.getValue());

        // Add adjustment listener to the scrollbar
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Value: " + scrollbar.getValue());
            }
        });

        // Add components to the frame
        add(scrollbar);
        add(label);

        // Set the size of the frame
        setSize(300, 100);
        setVisible(true);

        // Add a window listener to handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new q71();
    }
}