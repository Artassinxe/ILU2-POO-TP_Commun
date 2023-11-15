/**
 * 
 */
package model;

/**
 * @author antho
 *
 */
public class CalendrierAnnuel {
	
	private Mois mois[] = new Mois[12];

	for (Mois moisCourrant : mois) {
		
	}
	
	private static class Mois{
		private String nom;
		private boolean jours[];
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
		}
		private boolean estlibre(int jour) {
			return true;
		}
		private void reserver(int jour) {
			
		}
	}
	
	public boolean estLibre(int jour, int mois) {
		return true;
	}
	
	public boolean reserver(int jour,int mois) {
		return true;
	}
		
	
}
