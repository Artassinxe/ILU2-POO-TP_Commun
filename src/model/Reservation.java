package model;

public abstract class Reservation {
	public int jour;
	public int mois;

	public Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	@Override
	public abstract String toString();
}
