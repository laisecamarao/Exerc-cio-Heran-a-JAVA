import java.util.ArrayList;

public class Gerente extends Funcionario {
    private ArrayList<Funcionario> equipe;

    public Gerente(String nome, int idade, double salarioBase) {
        super(nome, idade, salarioBase);
        this.equipe = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        equipe.add(f);
    }

    public void listarFuncionarios() {
        for (Funcionario f : equipe) {
            System.out.println("nome do funcionario: "+ f.getNome());
            System.out.println("salario Base: "+ f.getSalarioBase());
        }
    }
}
