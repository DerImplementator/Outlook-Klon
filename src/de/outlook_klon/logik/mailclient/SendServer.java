package de.outlook_klon.logik.mailclient;

import javax.mail.Message;

/**
 * Abstrakte Basisklasse f�r alle Mailserver, �ber die Mails gesendet werden k�nnen.
 * Stellt grundlegende Funtionen zum Versenden von Mails bereit.
 * 
 * @author Hendrik Karwanni
 */
public abstract class SendServer extends MailServer {
	protected SendServer(ServerSettings settings) {
		super(settings);
	}

	/**
	 * Sendet eine E-Mail �ber den aktuellen Server.
	 * Die Implementierung des Vorgangs ist vom Serverprotokoll abh�ngig 
	 * @param mail Die zu sendende Nachricht
	 */
	public abstract void sendeMail(Message mail);
}
