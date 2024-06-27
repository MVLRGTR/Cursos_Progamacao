/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testes;
import java.time.LocalDate;

/**
 *
 * @author Marcos Ribeiro
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Date dt=new Date();
        int year=dt.getYear();
        System.out.println("Year for date object is : "+year);
        int current_Year=year+1900;
        System.out.println("Current year is : "+current_Year);
        */
        
        LocalDate data_atual = LocalDate.now();
        System.out.println("data atual e "+data_atual);
        
        int ano_atual = data_atual.getYear();
        System.out.println("o ano atual :;;" +ano_atual);
       
        
        
    }
    
}
