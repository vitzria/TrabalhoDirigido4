package empresa;
/**
 *
 * @author Vitória Maria
 */
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Funcionario {
        private char sexo;
        private String cpf;
        private String nome;
        private double salarioBruto;
        private double salarioLiquido;
        private LocalDate dataAd;
        private LocalDate dataNa;

    public Funcionario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
        public boolean validDataNa(LocalDate dataNa){  //valida a data de nascimento
            return dataNa.isAfter(LocalDate.of(1921, 01, 01));
        }
        
        public boolean validDataAd(LocalDate dataAd){ //valida a data de admissao
            return dataAd.isAfter(LocalDate.of(1995, 01, 01));
        }
        
        public int converteIdade(LocalDate dataNa){
            LocalDate hoje  = LocalDate.now();
            Period idade = Period.between(dataNa, hoje);
            return idade.getYears();
        }
        
        public void dataSO(){ //data e hora atual
            Calendar data = Calendar.getInstance();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a z");
            System.out.println("Data e horario atual: "+formato.format(data.getTime()));
        }

        public double calculaSalario(double salarioBruto){
            if(salarioBruto<=3000){
                salarioLiquido = salarioBruto - (0.17 * salarioBruto);
            }else{
                salarioLiquido = salarioBruto - (0.27 * salarioBruto);
            }
        return salarioLiquido;
        }
        
        public Funcionario(String cpf, String nome, LocalDate dataAd){
            this.dataAd = dataAd;
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
        
        public LocalDate getDataAd(){
            return dataAd;
        }
        
        public LocalDate getDataNa(){
            return dataNa;
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
        
        public void setDataAd (LocalDate DataAd){
            this.dataAd = dataAd;
        }
        public void setDataNa (LocalDate dataNa){
            this.dataNa = dataNa;
        }
        @Override
        public String toString(){
            return "Nome: " + nome + 
                    "\nCPF: " + cpf + 
                    "\nSexo: " + sexo + 
                    "\nSalario Bruto: " + salarioBruto + 
                    "\nSalario Liquido: " + salarioLiquido + 
                    "\nData de nascimento: " + dataNa + 
                    "\nData de admissao: " + dataAd;         
        }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }        
}
