public class TouchDownWhile {
	public static void main(String args[]){
		String team = new String("Thunder");
		String player = new String("Tomilson");
		int i = 50;
		while ( i>= 0) {
			if ( i == 0) {
				System.out.println("Touuchdown" + team + "!");
			} else {
				System.out.println(player + " is at the " + i + "!");
			}
			 i-= 5;
		}
	}
}