package de.outlook_klon.logik.mailclient;

/**
 * Abstrakte Basisklasse f�r alle Mailserver, �ber die Mails empfangen werden k�nnen.
 * Stellt grundlegende Funtionen zum Empfangen von Mails bereit.
 * 
 * @author Hendrik Karwanni
 */
public abstract class EmpfangsServer extends MailServer {
	protected EmpfangsServer(ServerSettings settings) {
		super(settings);
	}
}
