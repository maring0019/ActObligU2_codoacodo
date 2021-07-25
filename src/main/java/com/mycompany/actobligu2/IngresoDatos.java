package com.mycompany.actobligu2;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */

/**
 *
 * @author mariela benicio
 */
public class IngresoDatos{

    public static void main(String[] args) {

              
	Scanner teclado=new Scanner(System.in);
        Scanner teclado2=new Scanner(System.in);
	String nombre, apellido, hobbie, editorCodigo, sistOperativo;
        int edad;
        
	System.out.println("Ingrese nombre: ");
	nombre=teclado.nextLine();
        System.out.println("Ingrese apellido: ");
	apellido=teclado.nextLine();
        System.out.println("Ingrese edad: ");
	edad=teclado2.nextInt();
        System.out.println("Ingrese hobbie: ");
	hobbie=teclado.nextLine();
        System.out.println("Ingrese editor de código: ");
	editorCodigo=teclado.nextLine();
        System.out.println("Ingrese sistema operativo: ");
	sistOperativo=teclado.nextLine();
        
        System.out.println("Bienvenido al Sistema ");
	System.out.println("Los datos ingresados son: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Hobbie: " + hobbie);
        System.out.println("Editor de Código: " + editorCodigo);
        System.out.println("Sistema Operativo: " + sistOperativo);
       


    }
}
    

