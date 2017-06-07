package fr.exia.plantagochi.cad;

import fr.exia.plantagochi.model.Serre;

public interface CAD extends Runnable {

	public float getHumiditeSol(int idPlante);
	public float getHumiditeAir(int idPlante);
	public float getTemperatureAir(int idPlante);
	public float getLuminosite(int idPlante);

	public void setModel(Serre serre);
	
}
