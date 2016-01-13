import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Controller of checkout view
 * @author Lazaro Sanchez Campos
 *
 */
public class CheckOutController implements ActionListener{

	public static CheckOutView mView;
	public CheckOutController(CheckOutView pView){
		mView = pView;
	}
	
	/**
	 * This method updates the combo box of occupied rooms
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void displayRoomsOccupied(){
		ArrayList<String> occupiedRooms = RoomsDatabase.getOccupiedRooms();
		CheckOutView.occupiedRoomList.setModel(new DefaultComboBoxModel(occupiedRooms.toArray()));	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().matches("OK")){
			if(CheckOutView.occupiedRoomList.getSelectedItem() == null){
					JOptionPane.showMessageDialog(mView, "No room has been selected", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else {
			int room = Integer.parseInt(CheckOutView.occupiedRoomList.getSelectedItem().toString().substring(1,3));
			RoomsDatabase.roomsDataBase[room].setVacant(true);
			RoomsDatabase.roomsDataBase[room].setGuest("Vacant");
			HotelRegistry.updateRegistryDisplay();
			HotelRegistry.updateVacancyDisplay();
			mView.dispose();
			}
		}	
		else if(e.getActionCommand().matches("Cancel")){
			mView.dispose();
		}	
	}
	
}