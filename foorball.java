class TouchDownFor {
	String player = new String('Tomilson');
	String team = new String('Thunder');
	public static void main(String args[]){
		for (int i = 50; i>= 0; i-= 5){
			if ( i === 0) {
				System.out.println('Touuchdown' + team + "!");
			} else {
				System.out.println(player + " is at the " + i + "!");
			}
		}
	}
}