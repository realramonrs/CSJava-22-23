/**
 * 
 */
package ejercicios;

import java.util.ArrayList;
/**
 * @author Ramon RS
 *
 */
public class Agenda {
	private ArrayList<Contacto> cs;
	
	public Agenda(){
		cs = new ArrayList<Contacto>();
	}
	
	
	
	public ArrayList<Contacto> getCs() {
		return cs;
	}


	public void addContacto(Contacto c) {
		cs.add(c);
	}
	
	public Contacto getContacto(String telefono) {
		Contacto cLocal = null;
		for(Contacto c : cs) {
			if(c.getTelefono().equals(telefono)) {
				cLocal = c;
				break;
			}
		}
		return cLocal;
	}
	
	public int getPosicionContacto(String telefono) {
		int pos = -1;
		for(int i = 0;i<cs.size();i++) {
			if(cs.get(i).getTelefono().equals(telefono)) {
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	public void eliminarContacto(String telefono) {
		int pos = getPosicionContacto(telefono);
		
		if(pos>-1) {
			cs.remove(pos);
		}
	}
	
	public ArrayList<Contacto> buscarContactos(String nombre){
		ArrayList<Contacto> csLocal = new ArrayList<Contacto>();

		for(Contacto c : cs) {
			if(c.getNombre().contains(nombre)) {
				csLocal.add(c);
			}
		}
		return csLocal;

	}



	public void modificarContacto(String telefono , String nombre , String correo) {
		Contacto cLocal = getContacto(telefono);
		if(cLocal!=null) {
			cLocal.setNombre(nombre);
			cLocal.setCorreo(correo);
		}

	}
	
	public void imprimeContactos() {
		for(Contacto c : cs) {
			if(c!=null) {
				System.out.println(c);
			}
		}
	}

}
