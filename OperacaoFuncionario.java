/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.time.LocalDate;

/**
 *
 * @author Vitória Maria
 */
public class OperacaoFuncionario {
    public static void validFuncionario(Funcionario[] funcionario){ //validar dados dos funcionarios
        for(int i=0; i<funcionario.length; i++){
            funcionario[i].validDataNa(funcionario[i].getDataNa());
            funcionario[i].validCpf(funcionario[i].getCpf());
            funcionario[i].validDataAd(funcionario[i].getDataAd());
        }
    }

    public static String validSexo(Funcionario[] funcionario){ //quant de homens e mulheres
        int homens=0;
        int mulheres=0;
        for(int i=0; i<funcionario.length; i++){
            if(funcionario[i].getSexo() == 'M'){
                homens++;
            }
            if(funcionario[i].getSexo() == 'F'){
                mulheres++;
            }
        }
    return "Homens: " + (homens + 1) +
           "\nMulheres: " + (mulheres + 1);
    }
  
    public static String validSalario(Funcionario[] funcionario){ //maior e menor salario
        double maior=0.0;
        double menor = 0.0;
        for(int i=0; i<funcionario.length; i++){
            if(funcionario[i].calculaSalario(funcionario[i].getSalarioBruto()) >= maior){
                maior = funcionario[i].calculaSalario(funcionario[i].getSalarioBruto());
            }
            if(funcionario[i].calculaSalario(funcionario[i].getSalarioBruto()) < maior){
                menor = funcionario[i].calculaSalario(funcionario[i].getSalarioBruto());
            }
        }
    return "Maior salario: " + maior +
           "\nMenor salario: " + menor;
    }
    
    public static String validIdade(Funcionario[] funcionario){ //mais velho e mais novo
        int idadeMaisNovo = 0;
        int idadeMaisVelho = 0;
        String nomeMaisNovo = null;
        String nomeMaisVelho = null;
        for(int i=0; i<funcionario.length; i++){
            if(funcionario[i].getDataNa().isAfter(funcionario[i-1].getDataNa())){
                LocalDate maisNovo = funcionario[i].getDataNa();
                idadeMaisNovo = funcionario[i].converteIdade(maisNovo);
                nomeMaisNovo = funcionario[i].getNome();
            }
            if(funcionario[i].getDataNa().isBefore(funcionario[i-1].getDataNa())){
                LocalDate maisVelho = funcionario[i].getDataNa();
                idadeMaisVelho = funcionario[i].converteIdade(maisVelho);
                nomeMaisVelho = funcionario[i].getNome();
            }
        }
    return "Funcionario mais velho: " + nomeMaisVelho +
           "\nIdade do funcionario mais velho: " + idadeMaisVelho +
           "\nFuncionario mais novo: " + nomeMaisNovo +
           "\nIdade do funcionario mais novo: " + idadeMaisNovo;
    }    
}
