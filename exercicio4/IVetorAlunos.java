import java.util.ArrayList;
import java.util.List;

interface IVetorAluno {
    void adiciona(Aluno aluno);
    int tamanho();
    List<Aluno> contemAlunoNotaMenorQue(double notaLimite);
    List<Aluno> contemAlunoNotaMaiorOuIgualA(double notaLimite);
}

public class IVetorAlunos implements IVetorAluno {
    private Aluno[] elementos;
    private int tamanho;

    public IVetorAlunos(int capacidade) {
        this.elementos = new Aluno[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Aluno aluno) {
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = aluno;
        this.tamanho++;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public List<Aluno> contemAlunoNotaMenorQue(double notaLimite) {
        List<Aluno> alunosNotaMenorQueLimite = new ArrayList<>();
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].getNota() < notaLimite) {
                alunosNotaMenorQueLimite.add(this.elementos[i]);
            }
        }
        return alunosNotaMenorQueLimite;
    }

    public List<Aluno> contemAlunoNotaMaiorOuIgualA(double notaLimite) {
        List<Aluno> alunosNotaMaiorOuIgualALimite = new ArrayList<>();
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].getNota() >= notaLimite) {
                alunosNotaMaiorOuIgualALimite.add(this.elementos[i]);
            }
        }
        return alunosNotaMaiorOuIgualALimite;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Aluno[] elementosNovos = new Aluno[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    public Aluno[] getAlunos() {
        return this.elementos;
    }

    public Aluno getElemento(int indice) {
        if (indice < 0 || indice >= this.tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites do vetor");
        }
        return this.elementos[indice];
    }
}