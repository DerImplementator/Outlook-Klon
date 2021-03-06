package de.outlook_klon.logik.kalendar;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

/**
 * Diese Klasse stellt die Verwaltung f�r die Termine des Bentzers dar
 * 
 * @author Hendrik Karwanni
 */
public class Terminkalendar implements Iterable<Termin> {
	private ArrayList<Termin> mTermine;

	/**
	 * Erstellt eine neue Instanz der Terminverwaltung
	 */
	public Terminkalendar() {
		mTermine = new ArrayList<Termin>();
	}

	@Override
	public Iterator<Termin> iterator() {
		return mTermine.iterator();
	}

	/**
	 * F�gt den �bergebenen Termin der Verwaltung hinzu
	 * @param termin Der hinzuzuf�gende Termin
	 */
	public void addTermin(Termin termin) {
		mTermine.add(termin);
	}
	
	/**
	 * L�scht den �bergebenen Termin aus der Verwaltung
	 * @param termin Zu l�schender Termin
	 */
	public void l�scheTermin(Termin termin) {
		mTermine.remove(termin);
	}
	
	/**
	 * Entfernt alle Termine aus der Verwaltung, die am �bergebenen Tag stattfinden
	 * @param tag Date-Objekt, welches den Tag enth�llt, an dem alle Termine entfernt werden
	 */
	public void absagen(Date tag) {
		Date time1 = null;
		Date time2 = null;
		GregorianCalendar c = new GregorianCalendar();
		
		c.setTime(tag);
		c.set(GregorianCalendar.HOUR, 0);		//Setzt den Eintrag der Stunden auf 0
		c.set(GregorianCalendar.MINUTE, 0);		//Setzt den Eintrag der Minuten auf 0
		c.set(GregorianCalendar.SECOND, 0);		//Setzt den Eintrag der Sekunden auf 0
		
		time1 = c.getTime();					//�bergebener Tag mit der Uhrzeit 00:00:00
		c.add(GregorianCalendar.DAY_OF_YEAR, 1);
		time2 = c.getTime();					//Tag um 1 h�her als time1
		
		for(int i = 0; i < mTermine.size(); i++) {
			Termin termin = mTermine.get(i);
			Date start = termin.getStart();
			
			if(start.equals(time1) || (start.after(time1) && start.before(time2))) {
				l�scheTermin(termin);
				i--;
			}
		}
	}
}
