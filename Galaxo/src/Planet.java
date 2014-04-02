
public class Planet {
	private int nr;
	private double xPos; //x und y position
	private double yPos;
	private int colorNr;
	private int einheiten;
	private Spieler besitzer;
	private Planet nachbar;
	
	public Planet(int n,double x, double y,){
		this.nr = n;
		this.xPos = x;
		this.yPos = y;
		
	}
}
