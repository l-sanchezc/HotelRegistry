import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

/**
 * Checkout view
 * @author Lazaro Sanchez Campos
 *
 */
public class CheckOutView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JComboBox<?> occupiedRoomList;
	
	/**
	 * Create the frame.
	 */
	public CheckOutView() {
		super("Checkout");
		setResizable(false);
		CheckOutController checkOut = new  CheckOutController(this);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 362, 109);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRoomToCheck = new JLabel("Room to check Out:");
		lblRoomToCheck.setBounds(6, 6, 155, 21);
		contentPane.add(lblRoomToCheck);
		
		occupiedRoomList = new JComboBox<Object>();
		occupiedRoomList.setBounds(141, 6, 174, 23);
		contentPane.add(occupiedRoomList);
		
		JButton okButton = new JButton("OK");
		okButton.setBounds(44, 41, 117, 29);
		contentPane.add(okButton);
		okButton.addActionListener(checkOut);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(198, 39, 117, 29);
		contentPane.add(cancelButton);
		cancelButton.addActionListener(checkOut);
	}
}
