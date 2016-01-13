Name and student ID number:
	Lazaro Sanchez Campos (A20362245)
	
i. How do you run your program (i.e. what is the command line)?
	cd HotelRegistry
	set classpath=C:\Program Files\Java\jdk1.7.0_79\bin;
	set path=C:\Program Files\Java\jdk1.7.0_79\bin;
	cd src
	javac ./HotelRegistry.java
	java -classpath . HotelRegistry

ii. Describe your object-oriented design for the program:
	A. How are you implementing the hotel registry?
	HotelRegistry.java is the main controller of the app. This class sets visible the other views and it also updates the information of the main frame.
	
	B. How are you implementing the different types of rooms?
	I have created a "database" which is an array of 15 Rooms. Room is a superclass, which its constructor assign the room number, room type, maximum occupancy, the name of the guest and one flag to know if it is vacant.
	Then, I have 4 subclasses (OneKingBedRoom, OneQueenBedRoom, TwoDoubleBedsRoom, TwoDoubleBedsAndOneCotRoom) which extends the Room class and override its constructor adding the room type, guest name and maximum occupancy of each one.
	Therefore, I have used the substitution principle in the database with the object variables due to the rooms have their own subclass, adding the room number.
	
	C. How are you dynamically updating the forms and main frame based on the clerk’s actions?
	I have used the actionEvent of each button and combo box to call the update methods of each controller in order to actualize the forms (CheckInView.java and CheckOutView.java) and main frame (MainView.java).

iii. What specific problems or challenges did you have implementing your solution? For example, was there a particular requirement that you had 
difficulty implementing? Or perhaps there was a particularly nasty bug in your implementation you had problems tracking down.
I had problems updating the information because there were some nullPointers. But finally I could fix these problems handling all the possible nullPointers that could appear in the application.

iv. Were there any requirements that were not implemented or not implemented properly in your solution? If so, please elaborate.
No.

v. Were there any requirements that were vague or open to interpretation that you had to make a decision on how to implement? How did you elect to interpret them?
I had a doubt about the radio button group. Because if we set a button selected at the beginning of the CheckIn form, we do not need to validate that a room type was selected. 
Finally, I implemented both, so my application has a room type selected at the beginning and it also validates that a room type was selected before registering a new guest.
Moreover, my program also validates that the Zip Code field only contains numbers, it also appears a pop-up dialog on the Checkout form if no room was selected and I also have added that 
editable text fields in the CheckIn form cannot have a whitespace for not being blank. 

vi. How would you rate the complexity of this MP on a scale of 1 to 10 where 1 is very easy and 10 is very difficult. Why did you give this rating?
I think that this MP was easier than the other ones, but it is also very instructive. Then, I would rate the complexity of this MP with 5.