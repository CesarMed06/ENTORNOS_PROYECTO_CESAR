package Entorno;

public class Tamagotchi {

//Atributos (los declaro estáticos para usarlos en todo el programa, ya que me harán falta):
	
	private static int hanger;
	private static int energy;
	private static int mood;

//Constructor (por defecto sus atributos serán 4):
	
public Tamagotchi() {
	
	this.hanger=4;
	this.energy=4;
	this.mood=4;
	
}
	
//Método Play:
	
public String Play() {
	
	hanger+=1;
	mood+=1;
	energy-=1;
	
//Comprueba su estado:
	
	if(mood>8) {
		
		return ":-)";
		
	}
	
	else if(energy<3) {
		
		return"(-_-)";
		
	}
	
	else if(energy==0) {
		
		return"(-_-) zZZ";
		
	}
	
	else if(mood<2) {
		
		return"ఠ_ఠ";
		
	}

//Si no se cumple lo anterior, su estado será "Normal":
	
	else {
		
		return":-|";
		
	}
}

//Método Eat:
	
public String Eat() {
				
	hanger-=2;
	energy-=1;	
	
//Comprueba su estado:
	
	if(mood>8) {
		
		return":-)";
		
	}
	
	else if(energy<3) {
		
		return"(-_-)";
		
	}
	
	else if(energy==0) {
		
		return"(-_-) zZZ";
		
	}
	
	else if(mood<2) {
		
		return"ఠ_ఠ";
		
	}

//Si no se cumple lo anterior, su estado será "Normal":
	
	else {
		
		return":-|";
		
	}
}

//Método Sleep:

public String Sleep() {
	
	energy+=2;
	//Al dormir, pasa a estado "dormido", no hace falta ver su estado:
	
	return"(-_-) zZZ";
					
	}

//Creo una instancia de la clase para probarla:

public static void main(String[] args) {
	
	Tamagotchi tamagotchi1=new Tamagotchi();
	
	System.out.println("El tamagotchi está jugando.");
	System.out.println("Estado del tamagotchi tras jugar: "+tamagotchi1.Play());
	System.out.println("");
	
	
	System.out.println("El tamagotchi está comiendo.");
	System.out.println("Estado del tamagotchi tras comer: "+tamagotchi1.Eat());
	System.out.println("");
	
	System.out.println("El tamagotchi está durmiendo.");
	System.out.println("Estado del tamagotchi tras dormir: "+tamagotchi1.Sleep());
	System.out.println("");

}
}
	

