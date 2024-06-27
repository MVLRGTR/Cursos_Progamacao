/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritimeticos;

/**
 *
 * @author Marcos Ribeiro
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 15 ;
        int n2 = 3 ;
        float media = n1/n2;
        System.out.printf("a media entre %d e %d e %.2f :\n",n1,n2,media);

        
        double na = Math.random();
        int ale = (int)( 5 + na * (10-5));
        System.out.printf("O numero randomico da vez : %d\n",ale);
        
        /*int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);
        */
        
        // a += b => a = a + b
        // a -= b => a = a - b
        // a *= b => a = a * b
        // a /= b => a = a / b
        
        /*PI Math.PI
          pow Math.pow(5,2) = 25
          Math.sqrt(25) = 5 Raiz quadrada
          Math.cbrt(27) = 3 Raiz cubica
          Math.abs(-10) = 10 valor absoluto
          Math.floor(3.9) = 3 arredondamento para baixo
          Math.ceil(4.2) = 5 arredondamento para cima
          Math.round(5.6) = 6 arredondamento aritimetico
          5 + Math.random() * (10-5) numero random no intervalo entre 5 e 10
        
        */
        
    }
    
}
