public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa("Helton", 18);

        Funcionario f1 = new Funcionario("Laura", 30, 4000);
        Funcionario f2 = new Funcionario("Marcelo", 17, 2500);

        Gerente g = new Gerente("Gestor Arnaldo", 60, 10000);

        g.adicionarFuncionario(f1);
        g.adicionarFuncionario(f2);

        System.out.println("=== EQUIPE DO GERENTE ===");
        g.listarFuncionarios();

        System.out.println("\n=== PESSOA ===");
        System.out.println(p.getNome());
        System.out.println(p.getIdade());
        p.verificarMaioridade();

        System.out.println("\n=== FUNCIONÁRIO 1 ===");
        System.out.println(f1.getNome());
        System.out.println(f1.getSalarioBase());
        f1.verificarMaioridade();
        System.out.println("salário anual: " + f1.calcularSalarioBaseAnual());
        System.out.println("auxílio transporte: " + f1.calcularAuxilioTransporte());

        System.out.println("\n=== FUNCIONÁRIO 2 ===");
        System.out.println(f2.getNome());
        System.out.println(f2.getSalarioBase());
        f2.verificarMaioridade();
        System.out.println("salário anual: " + f2.calcularSalarioBaseAnual());
        System.out.println("auxílio transporte: " + f2.calcularAuxilioTransporte());

        System.out.println("\n=== GERENTE ===");
        System.out.println(g.getNome());
        System.out.println(g.getIdade());
        g.verificarMaioridade();
        System.out.println("salário anual: " + g.calcularSalarioBaseAnual());
        System.out.println("auxílio transporte: " + g.calcularAuxilioTransporte());
    }
}
