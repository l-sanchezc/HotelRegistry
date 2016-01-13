import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

/**
 * Check in view
 * @author Lazaro Sanchez Campos
 *
 */
public class CheckInView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField address;
	public JTextField city;
	public JTextField state;
	public JTextField zipCode;
	public JTextField firstName;
	public JTextField lastName;
	public JComboBox<?> room;
	public JComboBox<?> adults;
	public JComboBox<?> children;
	public ButtonGroup buttonGroup;

	/**
	 * Create the frame.
	 */
	public CheckInView() {
		super("Check In");
		setResizable(false);
		CheckInController checkIn = new  CheckInController(this);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 689, 345);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel firstNameLabel = new JLabel("First Name:");
		firstNameLabel.setBounds(6, 26, 79, 16);
		getContentPane().add(firstNameLabel);
		
		JLabel lastNameLabel = new JLabel("Last Name:");
		lastNameLabel.setBounds(247, 26, 79, 16);
		getContentPane().add(lastNameLabel);
		
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setBounds(6, 66, 61, 16);
		getContentPane().add(addressLabel);
		
		address = new JTextField();
		address.setBounds(79, 60, 594, 28);
		getContentPane().add(address);
		address.setColumns(10);
		
		JLabel cityLabel = new JLabel("City:");
		cityLabel.setBounds(6, 106, 35, 16);
		getContentPane().add(cityLabel);
		
		city = new JTextField();
		city.setBounds(42, 100, 167, 28);
		getContentPane().add(city);
		city.setColumns(10);
		
		JLabel stateLabel = new JLabel("State:");
		stateLabel.setBounds(239, 106, 35, 16);
		getContentPane().add(stateLabel);
		
		state = new JTextField();
		state.setBounds(286, 100, 153, 28);
		getContentPane().add(state);
		state.setColumns(10);
		
		JLabel zipCodeLabel = new JLabel("Zip Code:");
		zipCodeLabel.setBounds(470, 106, 61, 16);
		getContentPane().add(zipCodeLabel);
		
		zipCode = new JTextField();
		zipCode.setBounds(539, 100, 134, 28);
		getContentPane().add(zipCode);
		zipCode.setColumns(10);
		
		JLabel adultsLabel = new JLabel("Number of Adults:");
		adultsLabel.setBounds(6, 144, 121, 16);
		getContentPane().add(adultsLabel);
		
		
		JLabel childrenLabel = new JLabel("Number of Children:");
		childrenLabel.setBounds(355, 144, 145, 16);
		getContentPane().add(childrenLabel);
		
		firstName = new JTextField();
		firstName.setBounds(82, 20, 153, 28);
		getContentPane().add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.setBounds(324, 20, 349, 28);
		getContentPane().add(lastName);
		lastName.setColumns(10);
		
		String[] adultsString= {"1","2","3","4","5"};
		adults = new JComboBox<Object>(adultsString);
		adults.setBounds(139, 140, 119, 27);
		adults.setActionCommand("adults");
		adults.addActionListener(checkIn);
		getContentPane().add(adults);
		
		String[] childrenString= {"0","1","2","3","4"};
		children = new JComboBox<Object>(childrenString);
		children.setBounds(501, 140, 172, 27);
		children.setActionCommand("children");
		children.addActionListener(checkIn);
		getContentPane().add(children);
		
		JPanel roomPanel = new JPanel();
		roomPanel.setBorder(BorderFactory.createTitledBorder("Room Type"));
		roomPanel.setBounds(6, 187, 667, 59);
		getContentPane().add(roomPanel);
		
		JRadioButton kingButton = new JRadioButton("King");
		kingButton.setSelected(true);
		kingButton.setHorizontalAlignment(SwingConstants.TRAILING);
		kingButton.setActionCommand("One King Bed");
		kingButton.addActionListener(checkIn);
		roomPanel.add(kingButton);
		
		JRadioButton oneQueenButton = new JRadioButton("One Queen");
		roomPanel.add(oneQueenButton);
		oneQueenButton.addActionListener(checkIn);
		oneQueenButton.setActionCommand("One Queen Bed");
		
		JRadioButton twoDoubleBedsButton = new JRadioButton("Two Double Beds");
		roomPanel.add(twoDoubleBedsButton);
		twoDoubleBedsButton.addActionListener(checkIn);
		twoDoubleBedsButton.setActionCommand("Two Double Beds");
		
		JRadioButton twoDoubleBedsPlusCotButton = new JRadioButton("Two Double Beds Plus Cot");
		roomPanel.add(twoDoubleBedsPlusCotButton);
		twoDoubleBedsPlusCotButton.addActionListener(checkIn);
		twoDoubleBedsPlusCotButton.setActionCommand("Two Double Beds and One Cot");
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(kingButton);
		buttonGroup.add(oneQueenButton);
		buttonGroup.add(twoDoubleBedsButton);
		buttonGroup.add(twoDoubleBedsPlusCotButton);
		
		room = new JComboBox<Object>();
		room.setActionCommand("Room");
		room.setBounds(61, 276, 124, 27);
		getContentPane().add(room);
		room.addActionListener(checkIn);
		
		JLabel roomLabel = new JLabel("Room:");
		roomLabel.setBounds(6, 280, 61, 16);
		getContentPane().add(roomLabel);
		
		JButton registerButton = new JButton("Register");
		registerButton.setBounds(239, 275, 188, 29);
		getContentPane().add(registerButton);
		registerButton.addActionListener(checkIn);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(454, 275, 188, 29);
		cancelButton.addActionListener(checkIn);
		getContentPane().add(cancelButton);
		
	}
}
