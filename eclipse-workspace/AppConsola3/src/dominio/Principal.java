package dominio;

public class Principal {

	public static void main(String[] args) {
		//Animal animal = new Animal("Animal");
		
		Gato gato = new Gato("Largo"); //AL SER UNA CLASE ABSTRACTA YO PUEDO DECLARAR OBJETOS DE TIPO ANIMAL, PERO NO PUEDO INSTANCIAR
		
		Perro perro = new Perro("Cachilo", "Galgo");

		//System.out.println(animal.toString());
		System.out.println(gato.toString());
		System.out.println(gato.habilidades());
		System.out.println(perro.toString() + " " +perro.habilidades());
		
		/*//UN OBJETO DE LA CLASE HIJA PUEDE SER GUARDADO DENTRO DE LA CLASE PADRE
		Animal xxx = new Gato();
		
		//ARRAY
		Animal[] animales = new Animal[3];
		animales[0] = animal;
		animales[1] = gato;
		animales[2] = perro;
		
		for (Animal animal2 : animales) {
			System.out.println(animal2.toString());	//POLIMORFISMO
		}*/
				
	}

}
