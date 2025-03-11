import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PizzaGUIFrame extends JFrame {

    //Universals
    Color pizza = new Color(214, 198, 150);
    Color crust = new Color(152, 134, 80);
    Color cheese = new Color(218, 210, 8);
    Color pepperoni = new Color(124, 8, 8);


    //Crust Buttons
    /*
    JRadio Button for crust types Thin, Reg, Deep-Dish
     */
    JPanel crustPanel;
    JRadioButton crustButton1;
    JRadioButton crustButton2;
    JRadioButton crustButton3;

    /*
    Size Panel
    JCombo Box for size Small, Medium, Large, Super
    $8.00, $12.00, $16.00, $20.00 Respectivly
     */
    JPanel sizePanel;
    JComboBox sizeCBox;

    /*
    Toppings Panel
    6 Toppings JCheck Box
    random toppings
    +$1.00 per topping
     */
    JPanel toppingsPanel;
    JCheckBox toppingBox1;
    JCheckBox toppingBox2;
    JCheckBox toppingBox3;
    JCheckBox toppingBox4;
    JCheckBox toppingBox5;
    JCheckBox toppingBox6;

    /*
    Order Display
    JTextArea inside a scroll pane
     Displays order like a receipt
     */
    JPanel receiptPanel;
    JTextArea displayReceipt;

    /*
    Buttons Panel
    3 Buttons
    Order, Clear, Quit
     */
    JPanel buttonsPanel;


    public PizzaGUIFrame(){
        setTitle("Pizza Order!");

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        // center frame in screen
        setSize((screenWidth)/ 2, screenHeight / 2);
        setLocation(screenWidth / 4, screenHeight / 4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createCrustPanel();
        createSizePanel();
        createToppingsPanel();
        createReceiptPanel();
        createButtonsPanel();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel(new GridLayout(2,1));
        leftPanel.add(crustPanel);
        leftPanel.add(sizePanel);

        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(toppingsPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new GridLayout(2,1));
        bottomPanel.add(receiptPanel);
        bottomPanel.add(buttonsPanel);

        mainPanel.setBackground(pizza);

        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    //Crust Buttons
    /*
    JRadio Button for crust types Thin, Reg, Deep-Dish
     */
    public void createCrustPanel(){
        crustPanel = new JPanel();
        crustPanel.setBackground(pizza);

        ButtonGroup crustGroup = new ButtonGroup();

        JLabel crustsLabel = new JLabel("Crust: ");
        crustButton1 = new JRadioButton("Thin");
        crustButton2 = new JRadioButton("Regular");
        crustButton3 = new JRadioButton("Deep-dish");

        //Setting the font
        crustsLabel.setFont(new Font("Arial",Font.BOLD,48));
        Font crustFont = new Font("Times New Roman", Font.PLAIN,24);
        crustButton1.setFont(crustFont);
        crustButton2.setFont(crustFont);
        crustButton3.setFont(crustFont);
        crustButton1.setBackground(crust);
        crustButton2.setBackground(crust);
        crustButton3.setBackground(crust);
        crustButton1.setFocusPainted(false);
        crustButton2.setFocusPainted(false);
        crustButton3.setFocusPainted(false);

        crustPanel.add(crustsLabel);
        crustPanel.add(crustButton1);
        crustPanel.add(crustButton2);
        crustPanel.add(crustButton3);

        crustGroup.add(crustButton1);
        crustGroup.add(crustButton2);
        crustGroup.add(crustButton3);

    }

    /*
    Size Panel
    JCombo Box for size Small, Medium, Large, Super
    $8.00, $12.00, $16.00, $20.00 Respectivly
     */
    public void createSizePanel(){
        sizePanel = new JPanel();
        sizePanel.setBackground(pizza);

        String sizes[] = {"Small","Medium","Large","Super"};

        JLabel sizeLabel = new JLabel("Size: ");

        sizeCBox = new JComboBox(sizes);

        //Setting fonts
        sizeLabel.setFont(new Font("Arial",Font.BOLD,48));
        sizeCBox.setPreferredSize(new Dimension(150,50));
        sizeCBox.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        sizeCBox.setBackground(crust);
        sizeCBox.setFocusable(false);

        sizePanel.add(sizeLabel);
        sizePanel.add(sizeCBox);
    }

    /*
    Toppings Panel
    6 Toppings JCheck Box
    random toppings
    +$1.00 per topping
     */
    public void createToppingsPanel(){
        toppingsPanel = new JPanel();
        toppingsPanel.setBackground(pizza);

        JLabel toppingsLabel = new JLabel("Toppings(+$1 each): ");
        toppingsLabel.setFont(new Font("Arial",Font.BOLD,48));

        JPanel toppingsPanel2 = new JPanel();
        toppingsPanel2.setLayout(new GridLayout(3,3));

        toppingBox1 = new JCheckBox("Pineapple");
        toppingBox2 = new JCheckBox("Beluga Whale");
        toppingBox3 = new JCheckBox("Milk Steak");
        toppingBox4 = new JCheckBox("Sprinkles");
        toppingBox5 = new JCheckBox("Finger Nails");
        toppingBox6 = new JCheckBox("Pepperoni");

        //Setting the Fonts
        Font toppingFont = new Font("Times New Roman",Font.PLAIN,24);
        toppingBox1.setFont(toppingFont);
        toppingBox2.setFont(toppingFont);
        toppingBox3.setFont(toppingFont);
        toppingBox4.setFont(toppingFont);
        toppingBox5.setFont(toppingFont);
        toppingBox6.setFont(toppingFont);
        toppingBox1.setBackground(crust);
        toppingBox2.setBackground(crust);
        toppingBox3.setBackground(crust);
        toppingBox4.setBackground(crust);
        toppingBox5.setBackground(crust);
        toppingBox6.setBackground(crust);
        toppingBox1.setFocusPainted(false);
        toppingBox2.setFocusPainted(false);
        toppingBox3.setFocusPainted(false);
        toppingBox4.setFocusPainted(false);
        toppingBox5.setFocusPainted(false);
        toppingBox6.setFocusPainted(false);

        toppingsPanel.add(toppingsLabel);
        toppingsPanel2.add(toppingBox1);
        toppingsPanel2.add(toppingBox2);
        toppingsPanel2.add(toppingBox3);
        toppingsPanel2.add(toppingBox4);
        toppingsPanel2.add(toppingBox5);
        toppingsPanel2.add(toppingBox6);

        toppingsPanel.add(toppingsPanel2);

    }

    /*
    Order Display
    JTextArea inside a scroll pane
     Displays order like a receipt
     */
    public void createReceiptPanel(){
        receiptPanel = new JPanel();
        receiptPanel.setBackground(pizza);

        JLabel receiptLabel = new JLabel("Total:");
        displayReceipt = new JTextArea(10,35);
        displayReceipt.setEditable(false);

        JScrollPane displayReceiptScrollPane = new JScrollPane(displayReceipt);

        receiptLabel.setFont(new Font("Arial",Font.BOLD,48));
        displayReceipt.setFont(new Font("Times New Roman",Font.PLAIN,18));

        receiptPanel.add(receiptLabel);
        receiptPanel.add(displayReceiptScrollPane);
    }

    /*
    Buttons Panel
    3 Buttons
    Order, Clear, Quit
     */
    public void createButtonsPanel(){
        buttonsPanel = new JPanel();
        buttonsPanel.setBackground(pizza);

        JButton orderButton = new JButton("Order");
        JButton clearButton = new JButton("Clear");
        JButton quitButton = new JButton("Quit");

        orderButton.addActionListener((ActionEvent ae) -> generateOrder());
        clearButton.addActionListener((ActionEvent ae) -> clearForm());
        quitButton.addActionListener((ActionEvent ae) -> quit());

        //Set Fonts
        orderButton.setFont(new Font("Arial", Font.BOLD,32));
        orderButton.setBackground(crust);
        clearButton.setFont(new Font("Arial", Font.BOLD,32));
        clearButton.setBackground(cheese);
        quitButton.setFont(new Font("Arial", Font.BOLD,32));
        quitButton.setBackground(pepperoni);


        buttonsPanel.add(orderButton);
        buttonsPanel.add(clearButton);
        buttonsPanel.add(quitButton);
    }

    public void generateOrder(){
        StringBuilder orderDetails = new StringBuilder();
        double subTotal = 0.0;


        String crustType = "";
        double crustPrice = 0.0;
        if (crustButton1.isSelected()) {
            crustType = "Thin";
            crustPrice = 2.0;
        } else if (crustButton2.isSelected()) {
            crustType = "Regular";
            crustPrice = 3.0;
        } else if (crustButton3.isSelected()) {
            crustType = "Deep-dish";
            crustPrice = 4.0;
        }

        String size = (String) sizeCBox.getSelectedItem();
        double sizePrice = 0.0;
        switch (size) {
            case "Small":
                sizePrice = 8.0;
                break;
            case "Medium":
                sizePrice = 12.0;
                break;
            case "Large":
                sizePrice = 16.0;
                break;
            case "Super":
                sizePrice = 20.0;
                break;
        }


        orderDetails.append("=========================================\n");
        orderDetails.append(String.format("%s & %s\t\t$%.2f\n", crustType, size, crustPrice + sizePrice));
        subTotal += crustPrice + sizePrice;


        JCheckBox[] toppings = {toppingBox1, toppingBox2, toppingBox3, toppingBox4, toppingBox5, toppingBox6};
        for (JCheckBox topping : toppings) {
            if (topping.isSelected()) {
                orderDetails.append(String.format("%s\t\t$1.00\n", topping.getText()));
                subTotal += 1.0;
            }
        }


        double tax = subTotal * 0.07;
        double total = subTotal + tax;


        orderDetails.append("\nSub-total:\t\t$").append(String.format("%.2f", subTotal)).append("\n");
        orderDetails.append("Tax:\t\t$").append(String.format("%.2f", tax)).append("\n");
        orderDetails.append("---------------------------------------------------------------------\n");
        orderDetails.append("Total:\t\t$").append(String.format("%.2f", total)).append("\n");
        orderDetails.append("=========================================\n");


        displayReceipt.setText(orderDetails.toString());
    }

    public void clearForm(){
        crustButton1.setSelected(false);
        crustButton2.setSelected(false);
        crustButton3.setSelected(false);

        sizeCBox.setSelectedIndex(0);

        toppingBox1.setSelected(false);
        toppingBox2.setSelected(false);
        toppingBox3.setSelected(false);
        toppingBox4.setSelected(false);
        toppingBox5.setSelected(false);
        toppingBox6.setSelected(false);

        displayReceipt.setText("");
    }

    public void quit(){
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Quit?",  JOptionPane.YES_NO_OPTION);
        if(response == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
}
