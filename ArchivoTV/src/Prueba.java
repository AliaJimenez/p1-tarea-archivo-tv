/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alian
 */
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        //3 objetos de la clase Tv
        try (Scanner sc = new Scanner(System.in)) {
            // Crear 3 objetos de la clase Tv
            Tv tvSala = new Tv();
            Tv tvCuarto = new Tv();
            Tv tvCocina = new Tv();
            
            // Asignar valores
            tvSala.marca = "Samsung"; tvSala.pulgadas = 55; tvSala.volumen = 10; tvSala.encendida = false;
            tvCuarto.marca = "LG"; tvCuarto.pulgadas = 43; tvCuarto.volumen = 5; tvCuarto.encendida = false;
            tvCocina.marca = "Sony"; tvCocina.pulgadas = 32; tvCocina.volumen = 8; tvCocina.encendida = false;
            
            boolean salir = false;
            
            while (!salir) {
                System.out.println("\n ------- Menu de Televisores -------");
                System.out.println("1. Usar TV de la Sala");
                System.out.println("2. Usar TV del Cuarto");
                System.out.println("3. Usar TV de la Cocina");
                System.out.println("4. Ver estado de todas las TVs");
                System.out.println("5. Ver estado de una TV individual");
                System.out.println("6. Salir");
                System.out.println("-----------------------------------");
                System.out.print("Elige una opcion: ");
                int opcion = sc.nextInt();
                
                Tv seleccionada = null;
                
                switch (opcion) {
                    case 1: seleccionada = tvSala; break;
                    case 2: seleccionada = tvCuarto; break;
                    case 3: seleccionada = tvCocina; break;
                    case 4:
                        tvSala.mostrarEstado();
                        tvCuarto.mostrarEstado();
                        tvCocina.mostrarEstado();
                        break;
                    case 5:
                        System.out.println("1. TV Sala");
                        System.out.println("2. TV Cuarto");
                        System.out.println("3. TV Cocina");
                        System.out.print("Elige la TV para ver su estado: ");
                        int t = sc.nextInt();
                    switch (t) {
                        case 1:
                            tvSala.mostrarEstado();
                            break;
                        case 2:
                            tvCuarto.mostrarEstado();
                            break;
                        case 3:
                            tvCocina.mostrarEstado();
                            break;
                        default:
                            System.out.println("Opcion inválida");
                            break;
                    }
                        break;

                    case 6: salir = true; System.out.println("Saliendo..."); break;
                    default: System.out.println("Opcion inválida"); break;
                }
                
                if (seleccionada != null) {
                    System.out.println("\n--- Opciones de la TV " + seleccionada.marca + " ---");
                    System.out.println("1. Encender");
                    System.out.println("2. Apagar");
                    System.out.println("3. Subir volumen");
                    System.out.println("4. Cambiar canal");
                    System.out.print("Elige una opcion: ");
                    int accion = sc.nextInt();
                    
                    switch (accion) {
                        case 1: seleccionada.encender(); break;
                        case 2: seleccionada.apagar(); break;
                        case 3: seleccionada.subirVolumen(); break;
                        case 4:
                            System.out.print("Ingresa el canal al que quieres cambiar: ");
                            int canal = sc.nextInt();
                            seleccionada.cambiarCanal(canal);
                            break;
                        default: System.out.println("Opcion inválida"); break;
                    }
                }
            }
        }
    }
}

