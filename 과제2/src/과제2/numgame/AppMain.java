package 과제2.numgame;

public class AppMain {

	public static void main(String[] args) {
		NumberGameApp ng = new NumberGameApp();
		while(true) {
			ng.start();
			if(ng.regame());
				break;
		}
		
	}
	
}
