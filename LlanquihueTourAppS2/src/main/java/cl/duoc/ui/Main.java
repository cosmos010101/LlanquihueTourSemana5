package cl.duoc.ui;
/**
 * Autor Lorena Padilla
 * LlanquihueTourApp Semana 5
 */

import cl.duoc.data.DataManager;
import cl.duoc.model.Persona;
import cl.duoc.model.Tour;


public class Main {
    public static void main(String[] args) {

        DataManager datos = new DataManager(); //Llamamos al gestor de datos

        for (Tour tr: datos.getTours()){ //for each para leer el archivo tours linea por linea
            System.out.println(tr);
        }
        for(Tour tr: datos.getTours()){ //for each para buscar un dato de información linea por linea en tours.txt
            if(tr.getExperiencia().contains("Volcanes")){
                System.out.println("\nFiltrado: "+tr);
            }
        }
        for (Persona per: datos.getPersonas()){ //for each para leer el archivo personas linea por linea
            System.out.println(per);
        }
        for(Persona per: datos.getPersonas()){ //for each para buscar un dato de información por linea en personas.txt
            if(per.getNombre().contains("Sherlock")){
                System.out.println("\nFiltrado: "+per);
            }
        }
    }
}