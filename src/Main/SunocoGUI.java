package Main;

import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
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

        //------------------- Center Panel ---------------------
        JPanel pnlCenter = new JPanel(new GridLayout(0,1));
        pnlCenter.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));

            // panel to store the sales amount
            JPanel pnlCenterSale = new JPanel(new FlowLayout(FlowLayout.CENTER, 70, 0));

            // Price labels
            JLabel lblHundreds = new JLabel("1");
            JLabel lblTens = new JLabel("3");
            JLabel lblOnes = new JLabel("5");
            JLabel lblCentOne = new JLabel("9");
            JLabel lblCentTwo = new JLabel("9");

            // Set the font for labels
            lblHundreds.setFont(QUANTITY_FONT_LARGE);
            lblTens.setFont(QUANTITY_FONT_LARGE);
            lblOnes.setFont(QUANTITY_FONT_LARGE);
            lblCentOne.setFont(QUANTITY_FONT_SMALL);
            lblCentTwo.setFont(QUANTITY_FONT_SMALL);

            // Add the sales amount to the pnlCenterSale panel
            pnlCenterSale.add(lblHundreds);
            pnlCenterSale.add(lblTens);
            pnlCenterSale.add(lblOnes);
            pnlCenterSale.add(lblCentOne);
            pnlCenterSale.add(lblCentTwo);

            // Add border to the sales
            pnlCenterSale.setBorder(BorderFactory.createRaisedBevelBorder());

        // Add the Sales Amount to Center Panel
        pnlCenter.add(pnlCenterSale);

            // store the sales label
            JPanel pnlCenterSalesLabel = new JPanel();
            JLabel lblSalesLabel = new JLabel("This Sale $", SwingConstants.CENTER);
            lblSalesLabel.setFont(LABEL_FONT_NORMAL);
            pnlCenterSalesLabel.add(lblSalesLabel);

        // Add the Sales Label to Center Panel
        pnlCenter.add(pnlCenterSalesLabel);

            // panel to store the quantity of gas being pumped
            JPanel pnlCenterQuantity = new JPanel(new FlowLayout(FlowLayout.CENTER, 70, 0));

            // Quantity labels
            JLabel lblLitreHundreds = new JLabel("0");
            JLabel lblLitreTens = new JLabel("9");
            JLabel lblLitreOnes = new JLabel("5");
            JLabel lblLitreCentOne = new JLabel("9");
            JLabel lblLitreCentTwo = new JLabel("9");

            // set the font for labels
            lblLitreHundreds.setFont(QUANTITY_FONT_LARGE);
            lblLitreTens.setFont(QUANTITY_FONT_LARGE);
            lblLitreOnes.setFont(QUANTITY_FONT_LARGE);
            lblLitreCentOne.setFont(QUANTITY_FONT_SMALL);
            lblLitreCentTwo.setFont(QUANTITY_FONT_SMALL);

            // Add the quantity to the pnlCenterQuantity panel
            pnlCenterQuantity.add(lblLitreHundreds);
            pnlCenterQuantity.add(lblLitreTens);
            pnlCenterQuantity.add(lblLitreOnes);
            pnlCenterQuantity.add(lblLitreCentOne);
            pnlCenterQuantity.add(lblLitreCentTwo);

            // Add the quantity panel to the frame
            pnlCenterQuantity.setBorder(BorderFactory.createRaisedBevelBorder());

        // Add the Quantity info to the Center Panel
        pnlCenter.add(pnlCenterQuantity);

            // store the quantity label
            JPanel pnlCenterQuantityLabel = new JPanel();
            JLabel lblQuantityLabel = new JLabel("Litres", SwingConstants.CENTER);
            lblQuantityLabel.setFont(LABEL_FONT_NORMAL);
            pnlCenterQuantityLabel.add(lblQuantityLabel);

        // Add the quantity label to Center Panel
        pnlCenter.add(pnlCenterQuantityLabel);

            // store the price per litre label
            JPanel pnlCenterPricePerLitre = new JPanel();
            JLabel lblPricePerLitre = new JLabel("0.00", SwingConstants.CENTER);
            lblPricePerLitre.setFont(QUANTITY_FONT_SMALL);
            pnlCenterPricePerLitre.add(lblPricePerLitre);

        // Add the Price per litre info to the center panel
        pnlCenter.add(pnlCenterPricePerLitre);

            // store the quantity label
            JPanel pnlCenterPricePerLitreLabel = new JPanel();
            JLabel lblPricePerLitreLabel = new JLabel("Price Per Litre \u00A2", SwingConstants.CENTER);
            lblPricePerLitreLabel.setFont(LABEL_FONT_NORMAL);
            pnlCenterPricePerLitreLabel.add(lblPricePerLitreLabel);

        // Add the Price per litre label to the center panel
        pnlCenter.add(pnlCenterPricePerLitreLabel);

        // Add the Central panel to the main frame
        add(pnlCenter, BorderLayout.CENTER);

        //------------------- West Panel ---------------------
        JPanel pnlWest = new JPanel();
        JLabel lblWest = new JLabel("");
        lblWest.setFont(QUANTITY_FONT_SMALL);
        pnlWest.add(lblWest);
        pnlWest.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        add(pnlWest, BorderLayout.WEST);

        //------------------- East Panel ---------------------
        JPanel pnlEast = new JPanel();
        JLabel lblEast = new JLabel("");
        lblEast.setFont(QUANTITY_FONT_SMALL);
        pnlEast.add(lblEast);
        pnlEast.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        add(pnlEast, BorderLayout.EAST);

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
