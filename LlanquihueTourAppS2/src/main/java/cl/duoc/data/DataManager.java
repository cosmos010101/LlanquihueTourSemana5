package cl.duoc.data;

import cl.duoc.model.Persona;
import cl.duoc.model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;

public class DataManager {

//constantes es final para que el archivo no se modifique
    private static final String TOURS_PATH = "tours.txt";
    private static final String PEOPLE_PATH = "personas.txt";
//ArrayList de cada objeto
    private ArrayList<Persona> personas= new ArrayList<>();
    private ArrayList<Tour> tours = new ArrayList<>();
//Creamos un método con otros dos métodos
    public DataManager(){
        cargarTours();
        cargarPersonas();
    }
//Creamos el "cargarTours" para leer el archivo por consola y después poder filtrarlo
    private void cargarTours(){
        try(BufferedReader br = new BufferedReader(new FileReader(TOURS_PATH))){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                Tour recorrido = new Tour(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]));
                tours.add(recorrido);
            }
        }catch(IOException e){
            throw new RuntimeException(e + "Error al cargar tours.");
        }
    }
//Creamos el "cargarPersonas" para leer el archivo por consola y después poder filtrarlo
    private void cargarPersonas() {
        try (BufferedReader br = new BufferedReader(new FileReader(PEOPLE_PATH))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parte = linea.split(";");
                Persona perso = new Persona(parte[0], parte[1], parte[2]);
                personas.add(perso);
            }
            }catch(IOException e){
                throw new RuntimeException(e + "Error al cargar personas.");
            }
        }

//Getter de la lista Tours
    public ArrayList<Tour> getTours () {
        return tours;
    }
    public String toStringT () {
        return tours.toString();
    }
//Getter de la lista Personas
    public ArrayList<Persona> getPersonas(){
        return personas;
    }
    public String toStringP(){
        return personas.toString();
    }

}

