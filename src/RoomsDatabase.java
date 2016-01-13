import java.util.ArrayList;

/**
 * Rooms Database
 * @author Lazaro Sanchez Campos
 *
 */
public class RoomsDatabase {
	public static Room[] roomsDataBase = new Room[15];
	
	/**
	 * Constructor
	 */
	public RoomsDatabase (){
		roomsDataBase[0] = new OneKingBedRoom("100");
		roomsDataBase[1] = new TwoDoubleBedsRoom("101");
		roomsDataBase[2] = new OneKingBedRoom("102");
		roomsDataBase[3] = new TwoDoubleBedsAndOneCotRoom("103");
		roomsDataBase[4] = new  OneQueenBedRoom("104");
		roomsDataBase[5] = new OneKingBedRoom("105");
		roomsDataBase[6] = new  OneQueenBedRoom("106");
		roomsDataBase[7] = new TwoDoubleBedsRoom("107");
		roomsDataBase[8] = new  OneQueenBedRoom("108");
		roomsDataBase[9] = new TwoDoubleBedsAndOneCotRoom("109");
		roomsDataBase[10] = new TwoDoubleBedsRoom("110");
		roomsDataBase[11] = new TwoDoubleBedsRoom("111");
		roomsDataBase[12] = new TwoDoubleBedsRoom("112");
		roomsDataBase[13] = new TwoDoubleBedsRoom("113");
		roomsDataBase[14] = new OneKingBedRoom("114");
	}
	
	/**
	 * This method gets all the vacant rooms of the hotel
	 * @return ArrayList with all vacant rooms
	 */
	public static ArrayList<Room> getVacancies(){
		ArrayList<Room> vacancies = new ArrayList<Room>();
		for (int i= 0; i< roomsDataBase.length; i++){
			if(roomsDataBase[i].isVacant()){
				vacancies.add(roomsDataBase[i]);
			}
		}
		return vacancies;
	}
	
	/**
	 * This method gets all the occupied rooms of the hotel
	 * @return ArraList with all occupied rooms
	 */
	public static ArrayList<String> getOccupiedRooms(){
		ArrayList<String> occupied = new ArrayList<String>();
		for (int i= 0; i< roomsDataBase.length; i++){
			if(roomsDataBase[i].isVacant() == false){
				occupied.add(roomsDataBase[i].getRoomNumber());
			}
		}
		return occupied;
	}
}
