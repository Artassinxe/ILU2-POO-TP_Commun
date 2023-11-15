package model;

public class ReservationHotel extends Reservation {
	private int nombreLitSimple;
	private int nombreLitDouble;
	private int numeroChambre;

	public ReservationHotel(int jour, int mois, int nombreLsimple, int nombreLdouble, int numeroChambre) {
		super(jour, mois);
		this.nombreLitDouble = nombreLdouble;
		this.nombreLitSimple = nombreLsimple;
		this.numeroChambre = numeroChambre;
	}

	@Override
	public String toString() {

		return null;
	}
}