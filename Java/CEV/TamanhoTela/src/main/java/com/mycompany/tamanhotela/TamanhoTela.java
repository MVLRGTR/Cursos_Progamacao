/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tamanhotela;
import java.awt.*;

/**
 *
 * @author Marcos Ribeiro
 */
public class TamanhoTela {

    public static void main(String[] args) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("A Resolução da tela é = " +  dim.height + "x" + dim.width);
  
    }
}
