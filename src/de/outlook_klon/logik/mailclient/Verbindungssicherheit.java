package de.outlook_klon.logik.mailclient;

/**
 * Diese Aufz�hlung gibt die verschiedenen Arten der verschl�sselten Kommunikation an
 * 
 * @author Hendrik Karwanni
 */
public enum Verbindungssicherheit {
	/**
	 * Verwende keine Verschl�sselung
	 */
	NONE,
	
	/**
	 * Verwende SSL als Verschl�sselung
	 */
	SSL,
	
	SSL_OPTIONAL,
	
	/**
	 * Verwende TLS als Verschl�sselung
	 */
	TLS,
	
	TLS_OPTIONAL
}
