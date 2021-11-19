package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Pedir lados
	* Leer lados
	* SI (A*A==B*B+C*C || A*A<>B*B+C*C)
	*   SI (A*A==B*B+C*C)
	*       Triangulo rectángulo
	*   SINO
	*       SI(A*A<B*B+C*C)
	*           Triángulo acutángulo
	*       SINO
	*           Triángulo obtusángulo
	* SINO
	*   No es un triángulo*/
        double A, B, C;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduzca los lados");
        A= scan.nextDouble();
        B= scan.nextDouble();
        C= scan.nextDouble();
        if(A>=B+C){
            System.out.println("No es um triángulo");
        }else{
            if (A*A==B*B+C*C) {
                System.out.println("Triangulo rectángulo");
            }else {
                if (A*A<B*B+C*C) {
                    System.out.println("Triangulo acutángulo");
                }
                if(A*A>B*B+C*C) {
                    System.out.println("Triangulo obtusángulo");
                }
            }
        }
    }
}
