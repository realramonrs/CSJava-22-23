package conjuntos;
import java.util.*;

public class _01HashSetStrings {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> nombres = new HashSet<String>();
		nombres.add("Pedro");
		nombres.add("Luis");
		nombres.add("Juan");
		System.out.println(nombres);
		
		HashSet<Integer> numeros = new HashSet<Integer>();
		
		Random r = new Random();
		
		for(int i = 0;i<10;i++) {
			numeros.add(r.nextInt(100));

	}
		System.out.println(numeros);

}
}
