package fr.exia.plantagochi.ctrl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import fr.exia.plantagochi.model.Plante;
import fr.exia.plantagochi.model.Serre;
import fr.exia.plantagochi.view.Window;

public class WindowController
	implements Runnable, Observer, ActionListener {

	private Serre model;
	private Window view;

	public WindowController(Serre serre) {
		this.model = serre;
		// Inscription aux events de toutes les plantes
		for (Plante plante : serre.getPlantes()) {
			plante.addObserver(this);
		}
	}
	
	public Serre getModel() {
		return this.model;
	}
	
	public Window getView() {
		return this.view;
	}

	@Override
	public void run() {
		if (!SwingUtilities.isEventDispatchThread()) {
			System.err.println("Erreur, le lancement du controller"
					+ " doit se faire dans le thread IHM !!!");
		}
		this.view = new Window();
		this.view.getButtonSwitchLumiere().addActionListener(this);
		this.view.setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		// Si l'objet observable est une plante
		if (o instanceof Plante) {
			
			// Je la caste en plante
			Plante plante = (Plante) o;
			
			// TODO Je retiens uniquement la première plante
			if (plante.getIdPlante() != 1) return;
			
			// Log
			System.out.println("La plante " + arg + " a été mise à jour !!!");
			
			// Mise à jour de la vue
			String humAir = String.format("%.2f %%", plante.getHumiditeAir());
			view.getLabelHumiditeAir().setText(humAir);
			
			String humSol = String.format("%.2f %%", plante.getHumiditeSol());
			view.getLabelHumiditeSol().setText(humSol);
			
			String tempAir = String.format("%.2f °C", plante.getTemperatureAir());
			view.getLabelTemperatureAir().setText(tempAir);

			if (plante.getTauxLuminosite() < 20)
				view.getButtonSwitchLumiere().setText("Allumer");
			else
				view.getButtonSwitchLumiere().setText("Eteindre");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Implémenter le multi-plante
		JButton button = (JButton) e.getSource();
		if (button.getText().equals("Eteindre")) {
			this.model.getPlante(1).setTauxLuminosite(0);
		} else {
			this.model.getPlante(1).setTauxLuminosite(80);
		}
		this.model.getPlante(1).hasBeenChanged();
		this.model.getPlante(1).notifyObservers(1);
	}
	

}
