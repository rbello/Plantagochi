package fr.exia.plantagochi.cad;

import fr.exia.plantagochi.model.Plante;
import fr.exia.plantagochi.model.Serre;

public class FakeGenerator implements CAD {

	private Serre model = null;

	@Override
	public void setModel(Serre serre) {
		this.model  = serre;
	}
	
	@Override
	public float getHumiditeSol(int idPlante) {
		return (float) (Math.random() * 100);
	}

	@Override
	public float getHumiditeAir(int idPlante) {
		return (float) (Math.random() * 100);
	}

	@Override
	public float getTemperatureAir(int idPlante) {
		return (float) (Math.random() * 40);
	}

	@Override
	public float getLuminosite(int idPlante) {
		return (float) (Math.random() * 100);
	}

	@Override
	public void run() {
		// Jusqu'� la fin des temps... 
		while (true) {
			// D�lais de 1 seconde
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
				return;
			}
			// Mise � jour du mod�le
			int i = 1;
			for (Plante plante : model.getPlantes()) {
				// Lecture des donn�es de la CAD
				plante.setHumiditeAir(getHumiditeAir(i));
				plante.setHumiditeSol(getHumiditeSol(i));
				plante.setTemperatureAir(getTemperatureAir(i));
//				plante.setTauxLuminosite(getLuminosite(i));
				// Informer les observateurs
				plante.hasBeenChanged();
				plante.notifyObservers(i);
				i++;
			}
			
		}	
	}

}
