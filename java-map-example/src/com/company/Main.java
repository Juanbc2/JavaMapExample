package com.company;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
	Map<Integer,String> clase = new HashMap<>(); //Se crea instancia tipo HashMap
	//se añade información al mapa
	clase.put(1020405060,"Pedrito Sanchez");
	clase.put(1150213212,"Alberto Pedroza");
	clase.put(1025123511,"Laura Gallego");
	clase.put(43541251,"Martha Perez");
	clase.put(23123123,"Pancracio Chavez");
	clase.put(1231231231,"Pitufino Arias");

	//Se busca la información por medio de sus llaves (cedula)
        System.out.println("----------BIENVENIDO--------");
        System.out.println("La persona con cédula:"+1020405060+" es: "+ clase.get(1020405060)+".");
        System.out.println("La persona con cédula:"+1150213212+" es: "+ clase.get(1150213212)+".");
        System.out.println("La persona con cédula:"+1025123511+" es: "+ clase.get(1025123511)+".");
        System.out.println("La persona con cédula:"+43541251+" es: "+ clase.get(43541251)+".");
        System.out.println("La persona con cédula:"+23123123+" es: "+ clase.get(23123123)+".");
        System.out.println("La persona con cédula:"+1231231231+" es: "+ clase.get(1231231231)+".");
        //se pide al usuario ingresar una cédula para buscarla
        int i = 1;
        while(i!=0){
            System.out.println("Ingrese una cédula para buscar: ");
            Integer cedula = Integer.parseInt(myObj.nextLine());
            if(clase.containsKey(cedula)){
                System.out.println("La persona con cédula: "+cedula+" es: "+ clase.get(cedula)+".");
                i=0;
            }
            else{

                System.out.println("Cédula no encontrada, busque otra.\n");
            }

        }

        //Registro en el mapa
        System.out.println("--------------REGISTRO---------------");
        System.out.println("Ingrese su cédula:");
        Integer suCedula = Integer.parseInt(myObj.nextLine());
        System.out.println("Ingrese su nombre:");
        String suNombre = myObj.nextLine();

        clase.put(suCedula,suNombre);

        //Se busca la información por medio de sus llaves
        System.out.println("La persona con cédula: "+suCedula+" es: "+ clase.get(suCedula)+".");








    }
}
