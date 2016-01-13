import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Main controller of the application
 * @author Lazaro Sanchez Campos
 *
 */
public class HotelRegistry implements ActionListener{
	static MainView mView;
	static RoomsDatabase dataBase = new RoomsDatabase();
	
	public HotelRegistry(MainView mView){
		HotelRegistry.mView = mView;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mView = new MainView();
					updateRegistryDisplay();
					updateVacancyDisplay();
					mView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * This method updates the guests of each room on the registry display
	 */
	public static void updateRegistryDisplay(){
		mView.guestRoom_100.setText(RoomsDatabase.roomsDataBase[0].getGuest());
		mView.guestRoom_101.setText(RoomsDatabase.roomsDataBase[1].getGuest());
		mView.guestRoom_102.setText(RoomsDatabase.roomsDataBase[2].getGuest());
		mView.guestRoom_103.setText(RoomsDatabase.roomsDataBase[3].getGuest());
		mView.guestRoom_104.setText(RoomsDatabase.roomsDataBase[4].getGuest());
		mView.guestRoom_105.setText(RoomsDatabase.roomsDataBase[5].getGuest());
		mView.guestRoom_106.setText(RoomsDatabase.roomsDataBase[6].getGuest());
		mView.guestRoom_107.setText(RoomsDatabase.roomsDataBase[7].getGuest());
		mView.guestRoom_108.setText(RoomsDatabase.roomsDataBase[8].getGuest());
		mView.guestRoom_109.setText(RoomsDatabase.roomsDataBase[9].getGuest());
		mView.guestRoom_110.setText(RoomsDatabase.roomsDataBase[10].getGuest());
		mView.guestRoom_111.setText(RoomsDatabase.roomsDataBase[11].getGuest());
		mView.guestRoom_112.setText(RoomsDatabase.roomsDataBase[12].getGuest());
		mView.guestRoom_113.setText(RoomsDatabase.roomsDataBase[13].getGuest());
		mView.guestRoom_114.setText(RoomsDatabase.roomsDataBase[14].getGuest());
	}
	
	/**
	 * This method updates the number of vacant rooms on the vacancy display
	 */
	public static void updateVacancyDisplay(){
		ArrayList<Room> availableRooms = RoomsDatabase.getVacancies();
		int totalKing = 0;
		int totalQueen = 0;
		int totalDouble = 0;
		int totalDoubleCot = 0;
		for (int i = 0; i < availableRooms.size(); i++){
			if(availableRooms.get(i) instanceof OneKingBedRoom) totalKing++;
			if(availableRooms.get(i) instanceof OneQueenBedRoom) totalQueen++;
			if(availableRooms.get(i) instanceof TwoDoubleBedsRoom) totalDouble++;
			if(availableRooms.get(i) instanceof TwoDoubleBedsAndOneCotRoom) totalDoubleCot++;
		}
		mView.oneKingVacancies.setText(""+totalKing);
		mView.oneQueenVacancies.setText(""+totalQueen);
		mView.twoDoubleBedsVacancies.setText(""+totalDouble);;
		mView.twoDoubleBedswCotVacancies.setText(""+totalDoubleCot);
	}
	
	/**
	 * This method displays pop-ups depending the menu item selected on the main view
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().matches("About")){
				JOptionPane.showMessageDialog(mView, "Lazaro Sanchez Campos \n Student ID: A20362245",
                "About", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(e.getActionCommand().matches("Check In")){
			CheckInView checkIn = new CheckInView();
			CheckInController.updatePosibleRooms();
			checkIn.setVisible(true);
		}
		else if(e.getActionCommand().matches("Check Out")){
			CheckOutView checkOut = new CheckOutView();
			CheckOutController.displayRoomsOccupied();
			checkOut.setVisible(true);
		}
		else if(e.getActionCommand().matches("Exit")){
			System.exit(0);
		}
	}
}
