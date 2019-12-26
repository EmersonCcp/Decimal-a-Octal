
package com.mycompany.decimal_a_octal;

import java.util.Scanner;


public class octalmain {

   
    public static void main(String[] args) {
        int num;
        int copia;
        int dim = 0;
        int c_dim;
        int i = 0;
        int aux;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el numero a convertir: ");
        num = in.nextInt();
        copia = num;
        
        while ((copia / 8) != 0) {
            copia = copia / 8;
            dim++;
        }
        
        System.out.println(dim);
        
        c_dim = dim;
        int Vec[] = new int[c_dim + 1];

        copia = num;
        i = dim ;
        
        while (i >= 0) {

            aux = copia / 8;
            aux = aux * 8;
            
            Vec[i]=(copia-aux);
            i--;
            copia = copia / 8;
        }
        System.out.println("El numero "+num+" en octal es: ");

        for (i = 0; i <= c_dim; i++) {
            System.out.print("" + Vec[i]);
        }
        System.out.println("");
               
    }
    
}
