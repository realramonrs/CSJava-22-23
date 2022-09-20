package operadores;

public class IncrementoYDecremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//++  ->PostIncremento o Preincremento
		//-- -> PostDecremento o Predecremento
		
		int x = 10;
		x++;
		++x;
		x--;
		--x;
		
		System.out.println("x = " + x);
		
		//DIferencia entre x++ y ++x;
		int y = 10;
		
		//int z = y++;
		int z = y;
		y+=1;
		
		int zz = ++y;
		
		System.out.println("z: " + z + " , zz: " + zz);
		
		
		
	}

}
