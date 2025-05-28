package Hash;

import java.util.Hashtable;
import java.util.Scanner;

public class AppHashTableClass {
    private static Scanner input = new Scanner(System.in);
    private static Hashtable<String, Aluno> alunos = new Hashtable<>();
    
    public static int menu(){
        System.out.println("1- Cadastrar");
        System.out.println("2- Listar todos");
        System.out.println("3- Buscar pela matricula");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
        int op = input.nextInt();
        input.nextLine(); // limpar buffer
        return op;
    }

    public static void cadastrar(){
        System.out.println("----Cadastro----");
        Aluno aluno = new Aluno();
        System.out.print("Matrícula: ");
        String matricula = input.nextLine();
        if (alunos.containsKey(matricula)){
            System.out.println("Matricula ja cadastrada");
            return; // paro a execucao do metodo
         }
        System.out.print("Nome: ");
        aluno.setNome(input.nextLine());
        System.out.print("Matrícula: ");
        aluno.setMatricula(input.nextLine());
        System.out.print("Curso: ");
        aluno.setCurso(input.nextLine());
        System.out.print("Email: ");
        aluno.setEmail(input.nextLine());

        alunos.put(matricula, aluno);
    }

    public static String buscar(){
        System.out.println("---Buscar---");
        System.out.println("Matricula: ");
        String matricula = input.nextLine();
        if (alunos.containsKey(matricula)){
            Aluno aluno = alunos.get(matricula);
            System.out.println("Aluno encontrado! \nMatricula: " + aluno.getMatricula() + "\nNome: " + aluno.getNome() + "\nCurso: " + aluno.getCurso() + "\nEmail: "+ aluno.getEmail());
            return aluno.getMatricula();
        }
        else {
            System.out.println("Matricula " + matricula + " Inexistente.");
            return null;
        }
    }
    public static void main(String[] args) {        
        int opcao = 0;
        do{
            opcao = menu();
            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    System.out.println(alunos);
                    break;
                case 3:
                    buscar();
                    break;
                case 0:
                    System.out.println("saindo...");
                    break;            
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }while (opcao != 0);
    }
}
