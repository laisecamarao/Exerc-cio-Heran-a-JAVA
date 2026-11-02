public class Funcionario extends Pessoa {
    protected double salarioBase;

    public Funcionario(String nome, int idade, double salarioBase) {
        super(nome, idade);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalarioBaseAnual() {
        return salarioBase*12;
    }

    public double calcularAuxilioTransporte() {
        if (salarioBase<=2500) {
            return 200.00;
        }else{
            return 100.00;
        }
    }
}
