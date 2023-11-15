/**
 * 
 */
package model;

/**
 * @author antho
 *
 */
public class CalendrierAnnuel {

	private Mois mois[];

	private static class Mois {
		private String nom;
		private boolean jours[];

		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
			for (int i = 0; i < nbJours; i++) {
				jours[i] = false;
			}
		}

		private boolean estLibre(int jour) {
			return (this.jours[jour - 1] == false);
		}

		private void reserver(int jour) throws IllegalArgumentException {
			if (this.estLibre(jour) == false) {
				throw new IllegalArgumentException("La date passée en paramètre devrait être libre");
			}
			this.jours[jour - 1] = true;
		}
	}

	public CalendrierAnnuel() {
		String[] moisNom = { "Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre",
				"Octobre", "Novembre", "Décembre" };
		this.mois = new Mois[12];
		int nbJours = 31;
		for (int i = 0; i < 12; i++) {
			if (nbJours == 30) {
				nbJours = 31;
			} else {
				nbJours = 30;
			}
			mois[i] = new Mois(moisNom[i], nbJours);
		}
	}

	public boolean estLibre(int jour, int mois) {
		return this.mois[mois - 1].estLibre(jour);
	}

	public boolean reserver(int jour, int mois) {
		if (this.estLibre(jour, mois) == false) {
			return false;
		}
		this.mois[mois - 1].reserver(jour);
		return true;
	}

}
