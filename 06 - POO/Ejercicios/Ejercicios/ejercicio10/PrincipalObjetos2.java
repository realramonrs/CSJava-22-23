package ejercicio10;


public class PrincipalObjetos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear una Receta con 4 ingredientes
		Receta r1 = new Receta(4,"Carne o caldeiro");
		
		//Añadir 4 ingredientes
		
		r1.addIngrediente(new Ingrediente("Carne asada",2000,9.7f,1800));
		r1.addIngrediente(new Ingrediente("Patatas",500,17f,3500));
		r1.addIngrediente(new Ingrediente("Pimiento",150,2.35f,120));
		r1.addIngrediente(new Ingrediente("Ajo",220,0.45f,35));
		
		System.out.println(r1);
		
	}

}
