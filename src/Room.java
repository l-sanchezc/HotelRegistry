/**
 * Room of the hotel
 * @author Lazaro Sanchez Campos
 *
 */
public class Room {
	private String roomNumber;
	private String roomType;
	private int maximumOcupancy;
	private String guest;
	private boolean vacant;
	
	/**
	 * Constructor
	 * @param roomNumber
	 * @param roomType
	 * @param maximumOcupancy
	 * @param guest
	 * @param vacant
	 */
	public Room(String roomNumber, String roomType, int maximumOcupancy, String guest, boolean vacant){
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.maximumOcupancy = maximumOcupancy;
		this.guest = guest;
		this.vacant = vacant;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getMaximumOcupancy() {
		return maximumOcupancy;
	}

	public void setMaximumOcupancy(int maximumOcupancy) {
		this.maximumOcupancy = maximumOcupancy;
	}

	public String getGuest() {
		return guest;
	}

	public void setGuest(String guest) {
		this.guest = guest;
	}
	
	public boolean isVacant() {
		return vacant;
	}
	
	public void setVacant(boolean vacant) {
		this.vacant = vacant;
	}
	
}
