package empresa;

/**
 *
 * @author Vitória Maria
 */
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Funcionario {
        private char sexo;
        private String cpf;
        private String nome;
        private double salarioBruto;
        private LocalDate dataAd;
        private LocalDate dataNa;
        
        public boolean validDataNa(GregorianCalendar dataNa, int anoNa){  //valida a data de nascimento
            return anoNa>=1920;
        }
        
        public boolean validDataAd(GregorianCalendar dataAd, int anoAd){ //valida a data de admissao
            return anoAd>=1995;
        }
        
        public static void converteIdade(LocalDate dataNa){
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a z");
            Calendar dataAtual = Calendar.getInstance();
            LocalDate data1 = LocalDate.of(formato.format(dataNa.getTime()));
            LocalDate data2 = LocalDate.of
        }
        
        public void dataSO(){ //data e hora atual
            Calendar data = Calendar.getInstance();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a z");
            System.out.println("Data e horario atual: "+formato.format(data.getTime()));
        }
        
        public Funcionario(String cpf, String nome, GregorianCalendar dataAd){
            this.dataAd = new GregorianCalendar();
            this.cpf = cpf;
            this.nome = nome;           
        }
        
        public boolean validCpf(String cpf){
            return cpf.length() == 14;
        }
        
        public String getCpf(){
            return cpf;
        }
        
        public String getNome(){
            return nome;
        }
        
        public char getSexo(){
            return sexo;
        }
        
        public double getSalarioBruto(){
            return salarioBruto;
        }
        
        public GregorianCalendar getDataAd(){
            return dataAd;
        }
        
        public void setCpf (String cpf){
            this.cpf = cpf;
        }
        
        public void setNome (String nome){
            this.nome = nome;
        }
        
        public void setSexo (char sexo){
            this.sexo = sexo;
        }
        
        public void setSalarioBruto(double salarioBruto){
            this.salarioBruto = salarioBruto;
        }
        
        public void setDataAd (GregorianCalendar DataAd){
            this.dataAd = dataAd;
        }   
}
