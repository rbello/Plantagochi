package fr.exia.plantagochi.model;

import java.util.ArrayList;
import java.util.List;

public class Serre {

	private List<Plante> plantes;
	
	public Serre() {
		this.plantes = new ArrayList<>();
	}

	public List<Plante> getPlantes() {
		return plantes;
	}

	public void addPlante(Plante plante) {
		this.plantes.add(plante);
	}
	
	public void removePlante(Plante plante) {
		this.plantes.remove(plante);
	}
	
	public List<Plante> getPlantesByEspece(Espece espece) {
		List<Plante> output = new ArrayList<>();
		// ça ...
		//for (int i = 0; i < plantes.size(); i++) {
		//	Plante p = plantes.get(i);
		//	if (p.getEspece() == espece) output.add(p);
		//}
		// Equivaut à ... (foreach)
		// Sucre syntaxique !
		for (Plante p : plantes) {
			if (p.getEspece() == espece) {
				output.add(p);
			}
		}
		return output;
	}
	
}
