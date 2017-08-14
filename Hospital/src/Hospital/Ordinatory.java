package Hospital;

import java.util.ArrayList;

public abstract class Ordinatory {

	
	protected Room[] rooms = new Room[10];
	protected String type;

	public Ordinatory(){
		for (int i = 0; i < rooms.length; i++) {
			rooms[i] = new Room();
		}
	}

	public Room[] getRooms() {
		return rooms;
	}

	public String getType() {
		return type;
	}
	
	
	
	
}
