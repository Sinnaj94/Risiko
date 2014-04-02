
public class Spielverwaltung {
	public final Planet[] PLANETENLISTE = new Planet[29];
	public final int ANZSONNENSYSTEME = 5;
	public Spieler[] spielerListe;
	
	public void PlanetenErzeugung{
		for(int i = 0; i < PLANETENLISTE.length; i++){
			PLANETENLISTE[i] = new Planet(i,0,0);
		}
	}
}
