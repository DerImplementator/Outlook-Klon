package de.outlook_klon.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import de.outlook_klon.logik.kontakte.Kontakt;

public class KontaktFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1466530984514818388L;
	private static final String formatString = "Kontakt von %s bearbeiten";

	private Kontakt mKontakt;
	
	private JTextField tVorname;
	private JTextField tName;
	private JTextField tAnzeigename;
	private JTextField tSpitzname;
	private JTextField tEmailadresse_1;
	private JTextField tEmailadresse_2;
	private JTextField tDienstlich;
	private JTextField tPrivat;
	private JTextField tMobil;

	private JButton btnOK;
	private JButton btnAbbrechen;

	public KontaktFrame(Kontakt k) {
		mKontakt = k;

		this.setTitle(String.format(formatString, mKontakt));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setSize(685, 285);
		
		JLabel lblVorname = new JLabel("Vorname: ");
		JLabel lblName = new JLabel("Name: ");
		JLabel lblAnzeigename = new JLabel("Anzeigename: ");
		JLabel lblSpitzname = new JLabel("Spitzname: ");
		JLabel lblEmailadresse_1 = new JLabel("E-Mail-Adresse: ");
		JLabel lblEmailadresse_2 = new JLabel("2. E-Mail-Adresse: ");
		JLabel lblDienstlich = new JLabel("Dienstlich: ");
		JLabel lblPrivat = new JLabel("Privat: ");
		JLabel lblMobil = new JLabel("Mobil: ");
		
		tVorname = new JTextField(mKontakt.getVorname());
		tVorname.setColumns(10);
		
		tName = new JTextField(mKontakt.getNachname());
		tName.setColumns(10);
		
		tAnzeigename = new JTextField(mKontakt.getAnzeigename());
		tAnzeigename.setColumns(10);
		
		tSpitzname = new JTextField(mKontakt.getSpitzname());
		tSpitzname.setColumns(10);
		
		tEmailadresse_1 = new JTextField(mKontakt.getMail1().toString());
		tEmailadresse_1.setColumns(10);
		
		tEmailadresse_2 = new JTextField(mKontakt.getMail2().toString());
		tEmailadresse_2.setColumns(10);
		
		tDienstlich = new JTextField(mKontakt.getTelDienst());
		tDienstlich.setColumns(10);
		
		tPrivat = new JTextField(mKontakt.getTelPrivat());
		tPrivat.setColumns(10);
		
		tMobil = new JTextField(mKontakt.getTelMobil());
		tMobil.setColumns(10);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(this);
		
		btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.addActionListener(this);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnOK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblSpitzname, Alignment.TRAILING)
						.addComponent(lblEmailadresse_1, Alignment.TRAILING)
						.addComponent(lblEmailadresse_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblName)
								.addComponent(lblAnzeigename)))
						.addComponent(lblVorname, Alignment.TRAILING))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(tVorname, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
								.addComponent(tName)
								.addComponent(tAnzeigename)
								.addComponent(tSpitzname)
								.addComponent(tEmailadresse_1)
								.addComponent(tEmailadresse_2))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblDienstlich)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblMobil)
									.addComponent(lblPrivat)))
							.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(tPrivat, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
								.addComponent(tDienstlich, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
								.addComponent(tMobil, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
						.addComponent(btnAbbrechen, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVorname)
						.addComponent(tVorname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDienstlich)
						.addComponent(tDienstlich, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(tName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrivat)
						.addComponent(tPrivat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAnzeigename)
						.addComponent(tAnzeigename, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMobil)
						.addComponent(tMobil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSpitzname)
						.addComponent(tSpitzname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmailadresse_1)
						.addComponent(tEmailadresse_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmailadresse_2)
						.addComponent(tEmailadresse_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnOK)
						.addComponent(btnAbbrechen))
					.addGap(23))
		);
		getContentPane().setLayout(groupLayout);
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		Object e = arg.getSource();
		
		if(e == btnOK) {
			mKontakt.setVorname(tVorname.getText());
			mKontakt.setNachname(tName.getText());
			mKontakt.setAnzeigename(tAnzeigename.getText());
			mKontakt.setSpitzname(tSpitzname.getText());
			mKontakt.setMail1(tEmailadresse_1.getText());
			mKontakt.setMail2(tEmailadresse_2.getText());
			mKontakt.setTelDienst(tDienstlich.getText());
			mKontakt.setTelPrivat(tPrivat.getText());
			mKontakt.setTelMobil(tMobil.getText());
			
			this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
		}
		else if(e == btnAbbrechen) {
			this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
		}
		else  {
			throw new RuntimeException("Ein Element hat ein Event abgefeuert");
		}
	}

}
