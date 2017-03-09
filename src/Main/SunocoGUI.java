package Main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;

/**
 * Sunoco GUI Application
 * @author Pranav Kural
 */
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

        //------------------- South Panel ---------------------
        JPanel pnlSouth = new JPanel(new BorderLayout());
        pnlSouth.setBorder(BorderFactory.createRaisedBevelBorder());

            //------------- South Panel North section -------------
            JPanel pnlSouthNorth = new JPanel(new GridLayout(2,3));
            pnlSouthNorth.setBorder(BorderFactory.createRaisedBevelBorder());

            // Text Fields to store the gas rate
            JTextField txtRegularPrice = new JTextField(10);
            JTextField txtPlusPrice = new JTextField(10);
            JTextField txtSupremePrice = new JTextField(10);

            // set the font of the text fields
            txtRegularPrice.setFont(LABEL_FONT_NORMAL);
            txtPlusPrice.setFont(LABEL_FONT_NORMAL);
            txtSupremePrice.setFont(LABEL_FONT_NORMAL);

            // add padding to the text fields
            txtRegularPrice.setMargin(new Insets(5, 0, 5, 0));
            txtPlusPrice.setMargin(new Insets(5, 0, 5, 0));
            txtSupremePrice.setMargin(new Insets(5, 0, 5, 0));

            // Set the text of text fields
            txtRegularPrice.setText("99.05");
            txtPlusPrice.setText("109.05");
            txtSupremePrice.setText("119.05");

            // Buttons to select the gas type
            JButton btnRegular = new JButton("Regular");
            JButton btnPlus = new JButton("Plus");
            JButton btnSupreme = new JButton("Supreme");

            // Add the controls to the pnlSouthNorth
            pnlSouthNorth.add(txtRegularPrice);
            pnlSouthNorth.add(txtPlusPrice);
            pnlSouthNorth.add(txtSupremePrice);
            pnlSouthNorth.add(btnRegular);
            pnlSouthNorth.add(btnPlus);
            pnlSouthNorth.add(btnSupreme);

        // Add the top part of south panel to the South panel
        pnlSouth.add(pnlSouthNorth, BorderLayout.NORTH);

            //------------- South Panel Center section -------------
            JPanel pnlSouthCenter = new JPanel(new BorderLayout());

                // Center section top part
                JPanel pnlSouthCenterTop = new JPanel();
                JLabel lblPresetAmount = new JLabel("Preset Purchase Amount");
                lblPresetAmount.setFont(LABEL_FONT_NORMAL);
                pnlSouthCenterTop.add(lblPresetAmount);

            pnlSouthCenter.add(pnlSouthCenterTop, BorderLayout.NORTH);

                // Center section lower part
                JPanel pnlSouthCenterLower = new JPanel(new GridLayout(1,1));

                // Slider for presetting purchase amount
                JSlider sliderPresetAmount = new JSlider(JSlider.HORIZONTAL, 0, 200, 0);

                // Turn on labels at major tick marks
                sliderPresetAmount.setMajorTickSpacing(25);
                sliderPresetAmount.setMinorTickSpacing(5);
                sliderPresetAmount.setPaintTicks(true);
                sliderPresetAmount.setPaintLabels(true);
                sliderPresetAmount.setFont(new Font("Open Sans", Font.BOLD, 13));
                // add margins/padding to the slider control
                sliderPresetAmount.setBorder(new EmptyBorder(0, 10, 5, 10));

                // Add the slider to the center section
                pnlSouthCenterLower.add(sliderPresetAmount);
                pnlSouthCenterLower.setBorder(BorderFactory.createRaisedBevelBorder());


            pnlSouthCenter.add(pnlSouthCenterLower, BorderLayout.CENTER);

        // Add the center section to south panel
        pnlSouth.add(pnlSouthCenter, BorderLayout.CENTER);

            //------------- South Panel South section -------------
            JPanel pnlSouthSouth = new JPanel();

            // Start and exit buttons
            JButton btnStart = new JButton("Start");
            JButton btnExit = new JButton("Exit");

            // add the button to south section
            pnlSouthSouth.add(btnStart);
            pnlSouthSouth.add(btnExit);

        // Add the bottom part of south panel
        pnlSouth.add(pnlSouthSouth, BorderLayout.SOUTH);

        // Add the South panel to the main frame
        add(pnlSouth, BorderLayout.SOUTH);

    } // generateGUI

    // Main method
    public static void main(String[] args) {
        // create an instance of the Sunoco GUI
        SunocoGUI sunoco = new SunocoGUI();
        sunoco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sunoco.setSize(550, 650);
        sunoco.setVisible(true);
    } // main
} // SunocoGUI
