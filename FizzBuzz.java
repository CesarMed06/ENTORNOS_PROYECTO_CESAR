package Entorno;

public class FizzBuzz {

//Clase main:
	
    public static void main(String[] args) {

//Uso un bucle for para recorrer desde 1 hasta 100:
    	
        for (int i=1; i<=100; i++) {

//Si es múltiplo de 3 y de 5 imprime "FizzBuzz":
        	
            if (i%3==0 && i%5==0) {
            	
                System.out.println("FizzBuzz");

//Si es múltiplo de 3  "Fizz":
            } else if (i%3==0) {
           	
                System.out.println("Fizz");
                
//Si es múltiplo de 5 imprime "Buzz":  
                
            } else if (i%5==0) {
            	
                System.out.println("Buzz");
                
//Si no es múltiplo de 3 ni de 5, imprime el número:              
            } else {
                System.out.println(i);
            }
        }
    }
}
