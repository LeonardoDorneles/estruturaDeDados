public class Aluno {
    private String nome;
    private int idade;
    private double nota;
    
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Nota: " + nota;
    }

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }
    
    // Equals e hashCode omitidos para brevidade
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return idade == aluno.idade &&
                Double.compare(aluno.nota, nota) == 0 &&
                nome.equals(aluno.nome);
    }
}