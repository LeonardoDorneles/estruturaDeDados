public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Aluno> listaAlunos = new ListaEncadeada<>();
        listaAlunos.inserir(new Aluno("Leonardo Dorneles", 19, 1));
        listaAlunos.inserir(new Aluno("Raquel Mainard", 29, 10));
        listaAlunos.inserir(new Aluno("Miguel Arrojo", 18, 8));
        listaAlunos.inserir(new Aluno("Neymar Jr", 32, 6));
        listaAlunos.inserir(new Aluno("Yunk Vino", 23, 7));

        System.out.println("Alunos na lista:");
        System.out.println("------------------------------------------------------");
        listaAlunos.imprimir();
        System.out.println("------------------------------------------------------");

        ListaEncadeada<Carro> listaCarros = new ListaEncadeada<>();
        listaCarros.inserir(new Carro("Toyota", "Corolla", 2020));
        listaCarros.inserir(new Carro("Volkswagen", "Gol", 2010));
        listaCarros.inserir(new Carro("Ford", "Mustang GT", 2024));

        System.out.println("Carros na lista:");
        System.out.println("------------------------------------------------------");
        listaCarros.imprimir();
        System.out.println("------------------------------------------------------");
    }
}
