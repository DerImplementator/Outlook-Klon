package de.outlook_klon.logik.kontakte;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Diese Klasse stellt die Verwaltung f�r die Kontakte des Bentzers dar
 * 
 * @author Hendrik Karwanni
 */
public class Kontaktverwaltung implements Iterable<Kontakt> {
	private ArrayList<Kontakt> mKontakte;
	
	/**
	 * Erstellt eine neue Instanz der Kontaktverwaltung
	 */
	public Kontaktverwaltung() {
		mKontakte = new ArrayList<Kontakt>();
	}

	@Override
	public Iterator<Kontakt> iterator() {
		return mKontakte.iterator();
	}
	
	/**
	 * F�gt den �bergebenen Kontakt der Verwaltung hinzu
	 * @param kontakt Der hinzuzuf�gende Kontakt
	 */
	public void addKontakt(Kontakt kontakt) {
		mKontakte.add(kontakt);
	}
	
	/**
	 * L�scht den �bergebenen Kontakt aus der Verwaltung
	 * @param kontakt Zu l�schender Kontakt
	 */
	public void l�scheKontakt(Kontakt kontakt) {
		mKontakte.remove(kontakt);
	}
}
