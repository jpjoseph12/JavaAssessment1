import java.util.ArrayList;
import java.util.Scanner;

public class Direction {
	ArrayList<Direction>directions = new ArrayList<Direction>();
	public int position = 0;
	public int north = 5;
	public int south = -5;
	public int west = -2;
	public int east = 2;
	public int shafeeq = 12;
	public int greyWolf = 24;
	public int jackal = 15;
//	Scanner s = new Scanner(System.in);
	private String direction;
	private int meters;
	
	public String encounters(String Directions) {
	for(int h = 0;h < 100; h++)
		if(position != shafeeq) {
			System.out.println(position - shafeeq +"meters away from your first mystery");
		}else { 
			System.out.println("Shafeeq: Hello, I am da shafeeq, your adventure continues past me where you will meet a talking wolf.");
			System.out.println("He will lead you further on to your journey and closer to your reward!");
			if(position != greyWolf){
				System.out.println(position-greyWolf+"meters away from your second mystery");
			}else {
				System.out.println("");
			}
		}
	return "done";
		
		
//		for(int i = 0; i < 100; i++) {
//			if (s.equals(north)) {
//				position + north = position;
//			} else if ( s.equals(south)) {
//				
//			}
//		}
//			if (position == 77) {
//				System.out.println(" you have the bountiful treasure and the fog has lifted to show the exit. Well done!");
//				break;
//			}else if (position  )
//				
//		}
	}

	/*public int Compass(int position,) {
		for(int i = 0; i < 100; i++) {
			if (s.equals("north") ) {
				return position+north=position;
			} else if ( s.equals("south")) {
				return position+south=position;
			}else if (s.equals("east")) {
				return position + east = position;
			}else if(s.equals("west")) {
				return position + west = position;
			}
		}*/
	
	public Direction(String direction, int meters) {
		this.direction = direction;
		this.meters = meters;	
	
 }
	
	

	
}
