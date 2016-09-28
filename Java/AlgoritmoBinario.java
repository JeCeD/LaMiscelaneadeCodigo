/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmobinario;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author PC-
 */
public class AlgoritmoBinario {
private int []datos;
private static final Random Generador = new Random();
private static Scanner Scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        AlgoritmoBinario AlgoritmoBinario = new AlgoritmoBinario(20);
        /*
        System.out.print("Busca un Elemento: ");
        int pos = Scanner.nextInt();
        */
        int Busquedarandom = Generador.nextInt(90);
        JOptionPane.showMessageDialog(null, "Buscando elemento: "+Busquedarandom);
        AlgoritmoBinario.BusquedaBinario(Busquedarandom);
    }
    
    public AlgoritmoBinario(int tamanio) {
        datos = new int [tamanio];
        for (int i = 0; i < tamanio; i++) {
            datos[i] = 10 + Generador.nextInt(90);
        }
        Arrays.sort(datos);
    }
    
    public int BusquedaBinario(int ElementosBusqueda) {
        int inferior = 0;
        int superior = datos.length-1;
        int medio = (inferior+superior+1)/2;
        int ubicacion = -1;
        do {
            System.out.println(ElementosRestantes(inferior,superior));
            for (int i = 0; i < medio; i++) {
                System.out.print(" ");
            }
            System.out.println(" + ");
            if (ElementosBusqueda==datos[medio]) {
                ubicacion=medio;
            } else if (ElementosBusqueda<datos[medio]) {
                superior=medio-1;
            } else {
                inferior=medio+1;
            }
            medio=(inferior+superior+1)/2;
        } while ((inferior<=superior)&&(ubicacion==-1));
        
        if (ubicacion==-1) {
            System.out.println("Elemento no fue encontrado");
        } else {
            System.out.println("El elemento se encuentra en la psoicion: "+ubicacion);
        }
        
        return ubicacion;
    } 
    
    public String ElementosRestantes (int inferior,int superior) {
        StringBuilder Temporal = new StringBuilder();
        for (int i = 0; i < inferior; i++) {
            Temporal.append(" ");
        }
        for (int i = inferior; i <= superior; i++) {
            Temporal.append(datos[i]+" "); 
        }
        Temporal.append("\n");
        return Temporal.toString();
    }
    
    public String toString() {
        return ElementosRestantes(0,datos.length-1);
    }
}
