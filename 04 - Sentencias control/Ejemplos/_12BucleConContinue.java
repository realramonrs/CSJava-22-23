package Ejemplos;

public class _12BucleConContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n = 25;
			
			for(int i = 0;i<=n;i++) {
				if(i%2==0)
					continue;
				System.out.print(i + " ");
			}
	}

}
