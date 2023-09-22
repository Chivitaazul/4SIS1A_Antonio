//debe de tener una clase
//public class 

//variable int num por defecto es publico public int num
//libreria
import java.io.*;


class Entradatexto{

    //debe de ecistir un metodo principal
    public static void main(String[] args) throws IOException {
        //debemos crear estructura basica
        //declaracion
        char nombre;
        //mensaje para el usuario
        System.out.println("Por favor ingresa tu nombre: ");
        //ln es para salto de línea

        //asignar que operacion o comportamiento le voy a otorgar a la variable
        //nombre = System.console().readLine();
        nombre = (char)System.in.read();

        //System, es la clase del sistema
        //console() es el metodo que puede obtener los datos de la consola
        //readLine() es el metodo que puede dar lectura a los datos introducidos en la

        System.out.println("Hola " + nombre + " Bienvenido a tronar wii ");
    }
}