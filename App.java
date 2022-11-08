/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa.teste;

import empresa.Funcionario;
import java.util.Scanner;

/**
 *
 * @author Vitória Maria
 */
public class App{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantFunc;
        Funcionario funcionario = new Funcionario();
        funcionario.dataSO();
        System.out.println("\nDigite a quantidade de funcionarios na empresa: ");
        quantFunc = scan.nextInt();
        Funcionario[] funcVet;
        funcVet = new Funcionario[quantFunc];
        for(int i=0;i<quantFunc;i++){
            System.out.println("\nNome do funcionario: ");
            funcVet[i].getNome() = scan.nextLine();
            System.out.println("\nData de nascimento do funcionario: ");
            funcVet[i].getDataNa() = scan
        }
    }
    
}
