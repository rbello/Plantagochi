package fr.exia.plantagochi.ctrl;

import javax.swing.SwingUtilities;

import fr.exia.plantagochi.model.Serre;
import fr.exia.plantagochi.view.Window;

public class WindowController implements Runnable {

	private Serre serre;
	private Window view;

	public WindowController(Serre serre) {
		this.serre = serre;
	}
	
	public Serre getModel() {
		return this.serre;
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
		this.view.setVisible(true);
	}

}
