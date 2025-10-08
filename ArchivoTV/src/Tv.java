/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alian
 */
import java.util.Scanner;

public class Tv {
    // Atributos
    String marca;
    int pulgadas;
    int volumen;
    boolean encendida;

    // Métodos
    public void encender() {
        encendida = true;
        System.out.println("La TV " + marca + " esta encendida.");
    }

    public void apagar() {
        encendida = false;
        System.out.println("La TV " + marca + " esta apagada.");
    }

    public void subirVolumen() {
        if (!encendida) {
            System.out.println("No se puede subir el volumen. La TV " + marca + " esta apagada.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("A que nivel quieres subir el volumen de la TV " + marca + "? ");
        int nuevoVolumen = sc.nextInt();
        volumen = nuevoVolumen;
        System.out.println("Volumen de la TV " + marca + " ahora es: " + volumen);
    }

    public void cambiarCanal(int canal) {
        if (encendida) {
            System.out.println("Cambiando al canal " + canal + " en la TV " + marca);
        } else {
            System.out.println("No se puede cambiar de canal. La TV " + marca + " esta apagada.");
        }
    }

    public void mostrarEstado() {
        System.out.println("--- Estado de la TV " + marca + " ---");
        System.out.println("Pulgadas: " + pulgadas);
        System.out.println("Volumen: " + volumen);
        System.out.println("Encendida: " + encendida);
        System.out.println("-------------------------------");
    }
}
