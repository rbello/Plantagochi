package fr.exia.plantagochi;

import javax.swing.SwingUtilities;

import fr.exia.plantagochi.cad.CAD;
import fr.exia.plantagochi.cad.FakeGenerator;
import fr.exia.plantagochi.ctrl.WindowController;
import fr.exia.plantagochi.model.Espece;
import fr.exia.plantagochi.model.Plante;
import fr.exia.plantagochi.model.Serre;

public class Main {

	public static void main(String[] args) {
		
		// Création du modèle
		Serre serre = new Serre();
		
		// Alimentation du modèle
		Espece espece1 = new Espece("Tomate", "Solanum lycopersicum L.");
		Espece espece2 = new Espece("Persil", "Petroselinum crispum");
		Plante plante1 = new Plante(1, espece1);
		Plante plante2 = new Plante(2, espece2);
		serre.addPlante(plante1);
		serre.addPlante(plante2);
		
		// Création du controller
		WindowController ctrl = new WindowController(serre);
		
		// On lance le controlleur
		// ctrl.run(); // Pas directement !!
		SwingUtilities.invokeLater(ctrl); // Mais via l'IHM
		
		// On lance la CAD
		CAD cad = new FakeGenerator();
		cad.setModel(serre);
		Thread t = new Thread(cad);
		t.start();
		
	}

}
