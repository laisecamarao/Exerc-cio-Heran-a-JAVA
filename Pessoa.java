public class Pessoa {
    protected String nome;
    protected int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public void verificarMaioridade() {
        if (idade >= 18) {
            System.out.println("é maior de idade");
        }

        else{
            System.out.println("é menor de idade");
        }
    }
}
