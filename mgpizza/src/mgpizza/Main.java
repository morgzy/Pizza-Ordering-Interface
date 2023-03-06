/*
 * MG PIZZA
 * Main window for MG Pizza ordering application
 * Morgan Hopkins
 * s200818327
 * 28/10/2022
 */

package mgpizza;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Main extends JFrame implements ActionListener {

	// Initialise all window elements	
	private JLabel lblTitle,lblName,lblPhone,lblStreet,lblCity,lblPost,lblInstructions,lblTopMessage;
	private JTextField txtName,txtPhone,txtStreet,txtCity,txtPost,txtInstructions;
	private JCheckBox chbDelivery;
	private JRadioButton rdoSml,rdoMed,rdoLrg;
	private JList<String> lstPizzas;
	private JButton btnAddOrder,btnClearOrder,btnSubmit;
	private JPanel pnlTitle,pnlMain,pnlLeft,pnlRight,pnlDetails,pnlName,pnlPhone,pnlDelivery,pnlChb,pnlAddress,pnlStreet,pnlCity,pnlPost,
	pnlPizza,pnlList,pnlInstructions,pnlSize,pnlSpecial,pnlAdd,pnlOrder,pnlButtons;
	private TitledBorder bdrDetails, bdrDelivery, bdrPizza, bdrOrder;
	private JTextArea tarOrder;

	// Available pizzas
	private String[] pizzas = {"Aussie","Hawaiian","Vegetarian","Marinara","Meatlovers","Mexicana"};

	// Colour scheme
	private Color cDark = new Color(0,90,90);
	private Color cLight = new Color(200,200,200);
	private Color cHeading = new Color(255,0,0);
	private Color cHeadPnl = new Color(155,0,0);


	// Create main Container pane
	Container pane = getContentPane();

	// Initialise Pizza array list
	private ArrayList<Pizza> pizzaOrder = new ArrayList<Pizza>();

	public Main()
	{

		//// ELEMENTS

		// Text labels
		lblTitle = new JLabel("MG PIZZA");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
		lblTopMessage = new JLabel("TOP MESSAGE");
		lblName = new JLabel("Name: ");
		lblPhone = new JLabel("Phone:");
		lblStreet = new JLabel("Street address:");
		lblCity = new JLabel("City:                    ");
		lblPost = new JLabel("Post code:         ");
		lblInstructions = new JLabel("Special instructions:");

		lblTitle.setForeground(cHeading);
		lblTopMessage.setForeground(cLight);
		lblName.setForeground(cLight);
		lblPhone.setForeground(cLight);
		lblStreet.setForeground(cLight);
		lblCity.setForeground(cLight);
		lblPost.setForeground(cLight);
		lblInstructions.setForeground(cLight);

		// Text fields
		txtName = new JTextField();
		txtName.setText("");
		txtPhone = new JTextField();
		txtPhone.setText("");
		txtStreet = new JTextField();
		txtCity = new JTextField();
		txtPost = new JTextField();
		txtInstructions = new JTextField();

		// Checkboxes
		chbDelivery = new JCheckBox("Delivery?");

		chbDelivery.setBackground(cDark);
		chbDelivery.setForeground(cLight);		

		// Radio buttons
		rdoSml = new JRadioButton("Small");
		rdoMed = new JRadioButton("Medium +$4");
		rdoLrg = new JRadioButton("Large +$8");
		ButtonGroup btgSize = new ButtonGroup();
		btgSize.add(rdoSml);
		btgSize.add(rdoMed);
		btgSize.add(rdoLrg);
		rdoSml.setSelected(true);

		rdoSml.setBackground(cDark);
		rdoMed.setBackground(cDark);
		rdoLrg.setBackground(cDark);
		rdoSml.setForeground(cLight);
		rdoMed.setForeground(cLight);
		rdoLrg.setForeground(cLight);

		// Lists
		lstPizzas = new JList<>(pizzas);

		// Buttons
		btnAddOrder = new JButton("Add to Order");
		btnClearOrder = new JButton("Clear Order");
		btnSubmit = new JButton("Submit Order");

		// Titled Borders
		bdrDetails = BorderFactory.createTitledBorder("Customer Details");
		bdrDetails.setTitleColor(cLight);
		bdrDelivery = BorderFactory.createTitledBorder("Delivery Options");
		bdrDelivery.setTitleColor(cLight);
		bdrPizza = BorderFactory.createTitledBorder("Pizza Options");
		bdrPizza.setTitleColor(cLight);
		bdrOrder = BorderFactory.createTitledBorder("Current Order");
		bdrOrder.setTitleColor(cLight);

		// Text areas
		tarOrder = new JTextArea();

		tarOrder.setBackground(cLight);
		tarOrder.setFont(new Font("Arial", Font.BOLD, 12));

		// Panels
		pnlTitle = new JPanel();
		pnlMain = new JPanel();
		pnlDetails = new JPanel();
		pnlDelivery = new JPanel();
		pnlChb = new JPanel();
		pnlName = new JPanel();
		pnlPhone = new JPanel();
		pnlAddress = new JPanel();
		pnlStreet = new JPanel();
		pnlCity = new JPanel();
		pnlPost = new JPanel();
		pnlList = new JPanel();
		pnlPizza = new JPanel();
		pnlInstructions = new JPanel();
		pnlSize = new JPanel();
		pnlSpecial = new JPanel();
		pnlAdd = new JPanel();
		pnlOrder = new JPanel();
		pnlButtons = new JPanel();
		pnlLeft = new JPanel();
		pnlRight = new JPanel();

		pane.setBackground(cDark);
		pnlTitle.setBackground(cHeadPnl);
		pnlMain.setBackground(cDark);
		pnlDetails.setBackground(cDark);
		pnlDelivery.setBackground(cDark);
		pnlChb.setBackground(cDark);
		pnlName.setBackground(cDark);
		pnlPhone.setBackground(cDark);
		pnlAddress.setBackground(cDark);
		pnlStreet.setBackground(cDark);
		pnlCity.setBackground(cDark);
		pnlPost.setBackground(cDark);
		pnlPizza.setBackground(cDark);
		pnlInstructions.setBackground(cDark);
		pnlList.setBackground(cDark);
		pnlSize.setBackground(cDark);
		pnlSpecial.setBackground(cDark);
		pnlAdd.setBackground(cDark);
		pnlOrder.setBackground(cLight);
		pnlButtons.setBackground(cDark);
		pnlLeft.setBackground(cDark);
		pnlRight.setBackground(cDark);

		pnlDetails.setForeground(cLight);

		//// LAYOUT

		// Pane
		pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
		pane.add(pnlTitle);
		pane.add(Box.createRigidArea(new Dimension(0, 20)));
		pane.add(pnlMain);
		pane.add(Box.createRigidArea(new Dimension(0, 20)));

		// Title panel
		pnlTitle.setLayout(new BoxLayout(pnlTitle, BoxLayout.X_AXIS));
		pnlTitle.add(Box.createRigidArea(new Dimension(30, 0)));
		pnlTitle.add(lblTitle);
		pnlTitle.add(Box.createRigidArea(new Dimension(400,0)));
		pnlTitle.add(lblTopMessage);
		lblTopMessage.setAlignmentY(TOP_ALIGNMENT);
		pnlTitle.add(Box.createHorizontalGlue());

		// Main panel
		pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.X_AXIS));
		pnlMain.add(Box.createRigidArea(new Dimension(25, 0)));
		pnlMain.add(pnlLeft);
		pnlMain.add(Box.createRigidArea(new Dimension(50, 0)));
		pnlMain.add(pnlRight);
		pnlMain.add(Box.createRigidArea(new Dimension(25, 0)));


		// Left main panel
		pnlLeft.setLayout(new BoxLayout(pnlLeft, BoxLayout.Y_AXIS));
		pnlLeft.add(pnlDetails);
		pnlLeft.add(Box.createRigidArea(new Dimension(0, 20)));
		pnlLeft.add(pnlDelivery);
		pnlLeft.add(Box.createRigidArea(new Dimension(0, 20)));
		pnlLeft.add(pnlPizza);


		// Customer details panel
		pnlDetails.setLayout(new BoxLayout(pnlDetails, BoxLayout.Y_AXIS));
		pnlDetails.setBorder(bdrDetails);
		pnlDetails.add(pnlName);
		pnlDetails.add(pnlPhone);
		pnlDetails.add(Box.createRigidArea(new Dimension(0,15)));
		pnlName.setLayout(new GridLayout(2,1));
		pnlPhone.setLayout(new GridLayout(2,1));
		pnlName.add(lblName);
		pnlName.add(txtName);
		pnlPhone.add(lblPhone);
		pnlPhone.add(txtPhone);

		// Delivery details panel
		pnlDelivery.setLayout(new BoxLayout(pnlDelivery, BoxLayout.X_AXIS));
		pnlDelivery.setBorder(bdrDelivery);
		pnlDelivery.add(pnlChb);
		pnlDelivery.add(pnlAddress);
		pnlChb.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlAddress.setLayout(new BoxLayout(pnlAddress, BoxLayout.Y_AXIS));
		pnlAddress.setVisible(false);
		pnlChb.add(chbDelivery);
		chbDelivery.setAlignmentY(TOP_ALIGNMENT);
		pnlChb.add(Box.createRigidArea(new Dimension(0,150)));
		pnlAddress.add(pnlStreet);
		pnlAddress.add(pnlCity);
		pnlAddress.add(pnlPost);
		pnlAddress.add(Box.createRigidArea(new Dimension(0, 20)));
		pnlStreet.setLayout(new GridLayout(2,1));
		pnlCity.setLayout(new GridLayout(2,1));
		pnlPost.setLayout(new GridLayout(2,1));
		pnlStreet.add(lblStreet);
		pnlStreet.add(txtStreet);
		pnlCity.add(lblCity);
		pnlCity.add(txtCity);
		pnlPost.add(lblPost);
		pnlPost.add(txtPost);

		// Pizza details panel
		pnlPizza.setLayout(new BoxLayout(pnlPizza, BoxLayout.X_AXIS));
		pnlPizza.setBorder(bdrPizza);
		pnlPizza.add(pnlList);
		pnlPizza.add(pnlInstructions);
		pnlInstructions.setLayout(new BoxLayout(pnlInstructions, BoxLayout.Y_AXIS));
		pnlList.add(lstPizzas);
		lstPizzas.setBorder(BorderFactory.createLineBorder(cLight, 3));
		pnlInstructions.add(pnlSize);
		pnlInstructions.add(pnlSpecial);
		pnlInstructions.add(pnlAdd);
		pnlSize.add(rdoSml);
		pnlSize.add(rdoMed);
		pnlSize.add(rdoLrg);
		pnlSpecial.setLayout(new GridLayout(2,1));
		pnlSpecial.add(lblInstructions);
		pnlSpecial.add(txtInstructions);
		pnlAdd.add(btnAddOrder);


		// Right main panel
		pnlRight.setLayout(new BoxLayout(pnlRight, BoxLayout.Y_AXIS));
		pnlRight.add(Box.createRigidArea(new Dimension(0,25)));
		pnlRight.setBorder(bdrOrder);
		pnlRight.add(pnlOrder);
		pnlRight.add(pnlButtons);
		pnlButtons.setLayout(new BoxLayout(pnlButtons, BoxLayout.Y_AXIS));
		pnlOrder.add(tarOrder);
		tarOrder.setSize(new Dimension(250,450));
		tarOrder.setMinimumSize(new Dimension(250, 450));
		tarOrder.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pnlButtons.add(Box.createRigidArea(new Dimension(0,15)));
		pnlButtons.add(btnSubmit);
		pnlButtons.add(Box.createRigidArea(new Dimension(0,15)));
		pnlButtons.add(btnClearOrder);
		pnlButtons.add(Box.createRigidArea(new Dimension(0,15)));
		btnSubmit.setAlignmentX(CENTER_ALIGNMENT);
		btnClearOrder.setAlignmentX(CENTER_ALIGNMENT);

		//// LISTENERS

//		txtName.addActionListener(this);
//		txtPhone.addActionListener(this);
		chbDelivery.addActionListener(this);
//		txtStreet.addActionListener(this);
//		txtCity.addActionListener(this);
//		txtPost.addActionListener(this);
		btnAddOrder.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

		// Get user input
		String name = txtName.getText();
		String phone = txtPhone.getText();
		String street = txtStreet.getText();
		String city = txtCity.getText();
		String post = txtPost.getText();
		String address = street + " " + city + " " + post + "\n";

		// Create Customer
		Customer customer = new Customer(name, phone, address);

		// Delivery checkbox
		if (chbDelivery.isSelected())
		{
			pnlAddress.setVisible(true);
		}
		else
		{
			pnlAddress.setVisible(false);
		}

		// Add pizza to order
		if(e.getSource()==btnAddOrder)
		{

			// Check that necessary fields have been filled in
			if (checkFields())
			{
				String size = "";
				// Get pizza size
				if (rdoSml.isSelected())
				{
					size = "Small";
				}
				if (rdoMed.isSelected())
				{
					size = "Medium";
				}
				if (rdoLrg.isSelected())
				{
					size = "Large";
				}

				// Get pizza type
				String type = lstPizzas.getSelectedValue().toString();

				String instructions = txtInstructions.getText();

				Pizza pizza = new Pizza(size,type,instructions);
				pizzaOrder.add(pizza);
				tarOrder.setText(returnOrder(pizzaOrder, customer));
			}
		}

	}

	public String returnOrder(ArrayList<Pizza> pizzas, Customer cust)
	{
		String order = cust.toString();
		for (Pizza pizza : pizzas)
		{
			order += pizza.toString() + "\n";
		}
		return order;
	}
	
	public boolean checkFields()
	{
		if (txtName.getText().equals("") || txtPhone.getText().equals(""))
		{
			JOptionPane.showMessageDialog(pane,  "Please enter customer details.");
			return false;
		}
		else if (chbDelivery.isSelected() && (txtStreet.getText().equals("") || txtCity.getText().equals("") || txtPost.getText().equals(""))) 
		{
			JOptionPane.showMessageDialog(pane, "Please enter address.");
			return false;
		}
		else if (lstPizzas.getSelectedValue()==null)
		{
			JOptionPane.showMessageDialog(pane, "Please select a pizza.");
			return false;
		}
		return true;
	}

}
