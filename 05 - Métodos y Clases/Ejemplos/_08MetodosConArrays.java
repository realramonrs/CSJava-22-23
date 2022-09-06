package ejemplos;

public class _08MetodosConArrays {

	static void r(int x[]) {
		x[0] = 25;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {1,2,3};
		
		r(x);
		
		for(int i:x) {
			System.out.print(i + " ");
		}

	}

}
