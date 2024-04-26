/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimitivos;
import java.util.Scanner;


/**
 *
 * @author Marcos Ribeiro
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        /*
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a idade do aluno :");
        //String valor = teclado.nextLine();
        //float idade = Float.parseFloat(valor);
        //float idade = Float.parseFloat(teclado.nextLine());
        
        float idade = Float.parseFloat(teclado.nextLine());
        
        System.out.print("Digite o nome do aluno :");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno :");
        float nota = teclado.nextFloat();
        
        System.out.println("A nota do Aluno é : " + nota);
        System.out.printf("A nota do Aluno %s com idade %.2f anos é %.2f \n",nome,idade,nota);
    }
}
