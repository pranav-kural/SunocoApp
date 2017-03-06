package Main;

import javax.swing.*;
import java.awt.*;

// Sunoco App GUI class
public class SunocoGUI extends JFrame {

    private final Font LABEL_FONT_NORMAL = new Font("Open Sans", Font.BOLD, 20);
    private final Font QUANTITY_FONT_LARGE = new Font("Open Sans", Font.BOLD, 45);
    private final Font QUANTITY_FONT_SMALL = new Font("Open Sans", Font.BOLD, 30);

    public SunocoGUI() {

        // set up the frame
        setFrameGUI();

        // fill in the GUI
        generateGUI();
    }

    // Set the GUI layout
    private void setFrameGUI() {
        // set the GUI Layout
        BorderLayout borderLayout = new BorderLayout();
        setLayout(borderLayout);
    } // setFrameGUI

    private void generateGUI() {

        //------------------- North Panel ---------------------
        JPanel pnlNorth = new JPanel();
        JLabel lblTitle = new JLabel("SUNOCO", SwingConstants.CENTER);
        lblTitle.setFont(new Font("Open Sans", Font.BOLD, 35));
        pnlNorth.add(lblTitle);
        pnlNorth.setBorder(BorderFactory.createRaisedBevelBorder());
        add(pnlNorth, BorderLayout.NORTH);


    } // generateGUI

    // Main method
    public static void main(String[] args) {
        // create an instance of the Sunoco GUI
        SunocoGUI sunoco = new SunocoGUI();
        sunoco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sunoco.setSize(550, 500);
        sunoco.setVisible(true);
    } // main
} // SunocoGUI
