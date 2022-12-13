/**
 * 
 */
package tarea;

/**
 * @author Ramon RS
 *
 */
public class Festival {

	private String nombre;
	private int duracion;
	private float coste;
	Grupo programa[];
	
	public Festival(String nombre,int numeroGrupos) {
		this.nombre = nombre;
		programa = new Grupo[numeroGrupos];
	}
	
	public void addGrupo(Grupo g) {
		for(int i = 0;i< programa.length;i++) {
			if(programa[i]==null) {
				programa[i] = g;
				this.duracion+=g.getTiempoActuacion();
				this.coste+=g.calcularCosteTotal();
				break;
			}
		}
	}
	
	public Grupo dameGrupo(int pos) {
		Grupo gLocal = null;
		if(pos < programa.length) {
			gLocal = programa[pos];
		}
		
		return gLocal;
	}
	
	@Override
	public String toString() {
		String mensaje="";
		mensaje+="***************\n";
		mensaje+=this.nombre + "\n";
		mensaje+="***************\n";
		
		for(Grupo g : programa) {
			if(g!=null) {
				mensaje+= "Nombre: " + g.getNombre()+"\n";
				mensaje+= "Tiempo actuación : " + g.getTiempoActuacion() + "\n";
				mensaje+= "Popularidad " + g.getPopularidad() + "\n";
				mensaje+= "Coste : " + g.getCoste()+ "\n";
				mensaje+= "Coste total : " + g.calcularCosteTotal()+ "\n";
				mensaje+="***************\n";
			}
			else {
				break;
			}
		}
		
		
		return mensaje;
	}
}
