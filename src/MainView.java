import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Main view
 * @author Lazaro Sanchez Campos
 *
 */
public class MainView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField guestRoom_100;
	public JTextField guestRoom_101;
	public JTextField guestRoom_102;
	public JTextField guestRoom_103;
	public JTextField guestRoom_104;
	public JTextField guestRoom_105;
	public JTextField guestRoom_106;
	public JTextField guestRoom_107;
	public JTextField guestRoom_108;
	public JTextField guestRoom_109;
	public JTextField guestRoom_110;
	public JTextField guestRoom_111;
	public JTextField guestRoom_112;
	public JTextField guestRoom_113;
	public JTextField guestRoom_114;
	public JTextField oneKingVacancies;
	public JTextField oneQueenVacancies;
	public JTextField twoDoubleBedsVacancies;
	public JTextField twoDoubleBedswCotVacancies;

	/**
	 * Create the frame.
	 */
	public MainView() {
		super("Hotel Registry");
		setResizable(false);
		HotelRegistry hotelRegistry = new  HotelRegistry(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 532);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu registryMenu = new JMenu("Registry");
		menuBar.add(registryMenu);
		
		JMenuItem checkInMenuItem = new JMenuItem("Check In");
		registryMenu.add(checkInMenuItem);
		checkInMenuItem.addActionListener(hotelRegistry);
		
		JMenuItem checkOutMenuItem = new JMenuItem("Check Out");
		registryMenu.add(checkOutMenuItem);
		checkOutMenuItem.addActionListener(hotelRegistry);
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		registryMenu.add(exitMenuItem);
		exitMenuItem.addActionListener(hotelRegistry);
		
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		
		JMenuItem aboutMenuItem = new JMenuItem("About");
		helpMenu.add(aboutMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		aboutMenuItem.addActionListener(hotelRegistry);
		
		JPanel vacanciesPanel = new JPanel();
		vacanciesPanel.setBorder(BorderFactory.createTitledBorder("Vacancies"));
		vacanciesPanel.setBounds(346, 6, 321, 464);
		contentPane.add(vacanciesPanel);
		vacanciesPanel.setLayout(null);
		
		oneKingVacancies = new JTextField();
		oneKingVacancies.setEditable(false);
		oneKingVacancies.setBounds(169, 50, 134, 28);
		vacanciesPanel.add(oneKingVacancies);
		oneKingVacancies.setColumns(10);
		
		oneQueenVacancies = new JTextField();
		oneQueenVacancies.setEditable(false);
		oneQueenVacancies.setBounds(169, 161, 134, 28);
		vacanciesPanel.add(oneQueenVacancies);
		oneQueenVacancies.setColumns(10);
		
		twoDoubleBedsVacancies = new JTextField();
		twoDoubleBedsVacancies.setEditable(false);
		twoDoubleBedsVacancies.setBounds(169, 288, 134, 28);
		vacanciesPanel.add(twoDoubleBedsVacancies);
		twoDoubleBedsVacancies.setColumns(10);
		
		twoDoubleBedswCotVacancies = new JTextField();
		twoDoubleBedswCotVacancies.setEditable(false);
		twoDoubleBedswCotVacancies.setBounds(169, 410, 134, 28);
		vacanciesPanel.add(twoDoubleBedswCotVacancies);
		twoDoubleBedswCotVacancies.setColumns(10);
		
		JLabel oneKingLabel = new JLabel("One King");
		oneKingLabel.setBounds(16, 56, 61, 16);
		vacanciesPanel.add(oneKingLabel);
		
		JLabel oneQueenLabel = new JLabel("One Queen");
		oneQueenLabel.setBounds(16, 167, 86, 16);
		vacanciesPanel.add(oneQueenLabel);
		
		JLabel twoDoubleBedsLabel = new JLabel("Two Double Beds");
		twoDoubleBedsLabel.setBounds(16, 294, 108, 16);
		vacanciesPanel.add(twoDoubleBedsLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Two Double Beds w/Cot");
		lblNewLabel_3.setBounds(16, 416, 151, 16);
		vacanciesPanel.add(lblNewLabel_3);
		
		JLabel roomLabel = new JLabel("Room");
		roomLabel.setBounds(6, 6, 61, 16);
		contentPane.add(roomLabel);
		
		JLabel guestLabel = new JLabel("Guest");
		guestLabel.setBounds(168, 6, 61, 16);
		contentPane.add(guestLabel);
		
		JLabel label_100 = new JLabel("100:");
		label_100.setBounds(6, 34, 61, 16);
		contentPane.add(label_100);
		
		JLabel label_101 = new JLabel("101:");
		label_101.setBounds(6, 64, 61, 16);
		contentPane.add(label_101);
		
		JLabel label_102 = new JLabel("102:");
		label_102.setBounds(6, 94, 61, 16);
		contentPane.add(label_102);
		
		JLabel label_103 = new JLabel("103:");
		label_103.setBounds(6, 124, 61, 16);
		contentPane.add(label_103);
		
		JLabel label_104 = new JLabel("104:");
		label_104.setBounds(6, 154, 61, 16);
		contentPane.add(label_104);
		
		JLabel label_105 = new JLabel("105:");
		label_105.setBounds(6, 184, 61, 16);
		contentPane.add(label_105);
		
		JLabel label_106 = new JLabel("106:");
		label_106.setBounds(6, 214, 61, 16);
		contentPane.add(label_106);
		
		JLabel label_107 = new JLabel("107:");
		label_107.setBounds(6, 244, 61, 16);
		contentPane.add(label_107);
		
		JLabel label_108 = new JLabel("108:");
		label_108.setBounds(6, 274, 61, 16);
		contentPane.add(label_108);
		
		JLabel label_109 = new JLabel("109:");
		label_109.setBounds(6, 304, 61, 16);
		contentPane.add(label_109);
		
		JLabel label_110 = new JLabel("110:");
		label_110.setBounds(6, 334, 61, 16);
		contentPane.add(label_110);
		
		JLabel label_111 = new JLabel("111:");
		label_111.setBounds(6, 364, 61, 16);
		contentPane.add(label_111);
		
		JLabel label_112 = new JLabel("112:");
		label_112.setBounds(6, 394, 61, 16);
		contentPane.add(label_112);
		
		JLabel label_113 = new JLabel("113:");
		label_113.setBounds(6, 424, 61, 16);
		contentPane.add(label_113);
		
		JLabel label_114 = new JLabel("114:");
		label_114.setBounds(6, 454, 61, 16);
		contentPane.add(label_114);
		
		guestRoom_100 = new JTextField();
		guestRoom_100.setEditable(false);
		guestRoom_100.setBounds(48, 31, 286, 22);
		contentPane.add(guestRoom_100);
		guestRoom_100.setColumns(10);
		
		guestRoom_101 = new JTextField();
		guestRoom_101.setEditable(false);
		guestRoom_101.setColumns(10);
		guestRoom_101.setBounds(48, 62, 286, 22);
		contentPane.add(guestRoom_101);
		
		guestRoom_102 = new JTextField();
		guestRoom_102.setEditable(false);
		guestRoom_102.setColumns(10);
		guestRoom_102.setBounds(48, 92, 286, 22);
		contentPane.add(guestRoom_102);
		
		guestRoom_103 = new JTextField();
		guestRoom_103.setEditable(false);
		guestRoom_103.setColumns(10);
		guestRoom_103.setBounds(48, 122, 286, 22);
		contentPane.add(guestRoom_103);
		
		guestRoom_104 = new JTextField();
		guestRoom_104.setEditable(false);
		guestRoom_104.setColumns(10);
		guestRoom_104.setBounds(48, 152, 286, 22);
		contentPane.add(guestRoom_104);
		
		guestRoom_105 = new JTextField();
		guestRoom_105.setEditable(false);
		guestRoom_105.setColumns(10);
		guestRoom_105.setBounds(48, 182, 286, 22);
		contentPane.add(guestRoom_105);
		
		guestRoom_106 = new JTextField();
		guestRoom_106.setEditable(false);
		guestRoom_106.setColumns(10);
		guestRoom_106.setText(" ");
		guestRoom_106.setBounds(48, 212, 286, 22);
		contentPane.add(guestRoom_106);
		
		guestRoom_107 = new JTextField();
		guestRoom_107.setEditable(false);
		guestRoom_107.setColumns(10);
		guestRoom_107.setBounds(48, 242, 286, 22);
		contentPane.add(guestRoom_107);
		
		guestRoom_108 = new JTextField();
		guestRoom_108.setEditable(false);
		guestRoom_108.setColumns(10);
		guestRoom_108.setBounds(48, 272, 286, 22);
		contentPane.add(guestRoom_108);
		
		guestRoom_109 = new JTextField();
		guestRoom_109.setEditable(false);
		guestRoom_109.setColumns(10);
		guestRoom_109.setBounds(48, 302, 286, 22);
		contentPane.add(guestRoom_109);
		
		guestRoom_110 = new JTextField();
		guestRoom_110.setEditable(false);
		guestRoom_110.setColumns(10);
		guestRoom_110.setBounds(48, 330, 286, 22);
		contentPane.add(guestRoom_110);
		
		guestRoom_111 = new JTextField();
		guestRoom_111.setEditable(false);
		guestRoom_111.setColumns(10);
		guestRoom_111.setBounds(48, 358, 286, 22);
		contentPane.add(guestRoom_111);
		
		guestRoom_112 = new JTextField();
		guestRoom_112.setEditable(false);
		guestRoom_112.setColumns(10);
		guestRoom_112.setBounds(48, 388, 286, 22);
		contentPane.add(guestRoom_112);
		
		guestRoom_113 = new JTextField();
		guestRoom_113.setEditable(false);
		guestRoom_113.setColumns(10);
		guestRoom_113.setBounds(48, 418, 286, 22);
		contentPane.add(guestRoom_113);
		
		guestRoom_114 = new JTextField();
		guestRoom_114.setEditable(false);
		guestRoom_114.setColumns(10);
		guestRoom_114.setBounds(48, 448, 286, 22);
		contentPane.add(guestRoom_114);
	}
}
