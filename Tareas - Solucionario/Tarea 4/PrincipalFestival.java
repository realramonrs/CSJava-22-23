/**
 * 
 */
package tarea;

/**
 * @author Ramon RS
 *
 */
public class PrincipalFestival {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Festival f = new Festival("Festimad" , 5);
		Grupo g1 = new Grupo("Osasis",100,7,2000);
		Grupo g2 = new Grupo("Keane" ,120 ,8,3000);
		
		f.addGrupo(g1);
		f.addGrupo(g2);
		f.addGrupo(new Grupo("U2",200,9,1500));
		
		System.out.println(f);
		
	}

}
