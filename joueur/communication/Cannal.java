package joueur.communication;

/**
 * Cannal de communication pour les humains
 * @author adrien
 *
 */
public class Cannal {

	private String cannal;
	
	
	private Cannal() {
		this.cannal = new String();
	}


	/**
	 * @return le cannal
	 */
	public String getCannal() {
		return cannal;
	}


	/**
	 * Ajoute une communication au cannal
	 * @param com : ligne ajouter au cannal de discution
	 */
	public void add(String com) {
		this.cannal += com + "/n";
	}
	
	
	
}