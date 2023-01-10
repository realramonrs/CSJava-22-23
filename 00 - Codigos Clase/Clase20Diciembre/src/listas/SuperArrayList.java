package listas;

import java.util.ArrayList;

public class SuperArrayList {

	private ArrayList<String> lista;

	public SuperArrayList(ArrayList<String> lista) {
		super();
		this.lista = lista;
	}
	
	public SuperArrayList() {
		lista = new ArrayList<String>();
	}
	
	public void addArray(String matriz[]) {
		for(String s : matriz) {
			lista.add(s);
		}
	}
	
}
