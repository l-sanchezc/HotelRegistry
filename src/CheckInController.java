import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Controller of the check in view
 * @author Lazaro Sanchez Campos
 *
 */
public class CheckInController implements ActionListener{

	public static CheckInView mView;
	public CheckInController(CheckInView pView){
		mView = pView;
	}
	
	/**
	 * This method updates the combo box based on the selected parameters
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void updatePosibleRooms(){
		ArrayList<Room> availableRooms = RoomsDatabase.getVacancies();
		ArrayList<String> posibleRooms = new ArrayList<String>();
		String roomType = mView.buttonGroup.getSelection().getActionCommand().toString();
		int total = Integer.parseInt(mView.adults.getSelectedItem().toString()) + Integer.parseInt(mView.children.getSelectedItem().toString());
			for(int i = 0; i < availableRooms.size(); i++){
				if(availableRooms.get(i).getRoomType() == roomType &&  total <= availableRooms.get(i).getMaximumOcupancy()){
					posibleRooms.add(availableRooms.get(i).getRoomNumber());
				}
			}
		mView.room.setModel(new DefaultComboBoxModel(posibleRooms.toArray()));	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(mView.buttonGroup.getSelection() != null){
			if(e.getActionCommand().matches("adults") || e.getActionCommand().matches("children") ||
				e.getActionCommand().matches("One King Bed") || e.getActionCommand().matches("One Queen Bed") ||
				e.getActionCommand().matches("Two Double Beds") || e.getActionCommand().matches("Two Double Beds and One Cot") ){
				updatePosibleRooms();
		}	}
		if(e.getActionCommand().matches("Register")){
			if(mView.address.getText().trim().equals("") || mView.city.getText().trim().equals("") || mView.state.getText().trim().equals("") ||
				mView.zipCode.getText().trim().equals("") || mView.zipCode.getText().matches(".*[a-zA-Z].*")|| mView.firstName.getText().trim().equals("") ||
				mView.lastName.getText().trim().equals("") || mView.room.getSelectedItem() == null || mView.buttonGroup.getSelection().getActionCommand() == null){
				JOptionPane.showMessageDialog(mView, "Validation Failure!", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else{
			int room = Integer.parseInt(mView.room.getSelectedItem().toString().substring(1,3));
			RoomsDatabase.roomsDataBase[room].setGuest(mView.firstName.getText() +" "+ mView.lastName.getText());
			RoomsDatabase.roomsDataBase[room].setVacant(false);
			HotelRegistry.updateRegistryDisplay();
			HotelRegistry.updateVacancyDisplay();
			mView.dispose();
			}
		}
		if(e.getActionCommand().matches("Cancel")){
			mView.dispose();
		}	
	}

}
