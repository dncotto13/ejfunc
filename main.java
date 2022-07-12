//Primera parte:
//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.

public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma(a:7, b:4, c:2);
        System.out.println(resultado);
    }
    
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

//Segunda parte:
//Crear una clase coche.
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//Una función que incremente el número de puertas que tiene el coche.
//Crear un objeto miCoche en el main y añadirle una puerta.
//Mostrar el número de puertas que tiene el objeto.

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AñadirPuerta();
        System.out.println(miCoche.puertas);
    }
}

class Coche {
    public int puertas = 0;

    public void AñadirPUerta() {
        this.puertas++;
    }
}