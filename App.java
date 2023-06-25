
/**
 * Trabalho Final - Fundamentos de Programação
 * 
 * @author Luiza Tropea Scaglia
 * 
 */

 import java.util.Scanner;

 public class App {
 
     public static void main(String[] args) {
 
         Scanner in = new Scanner(System.in);

        ListaDeFilmes lista = new ListaDeFilmes();
        Preferencias pref = new Preferencias();


         int opcao = 0;
 
         System.out.println("Olá! Bem-vindo ao seu sistema de recomendação de filmes!");
 
         while (opcao != 6)
         {
             App.exibirMenu();     
             opcao = in.nextInt();
 
             switch (opcao) {
                case 1:
                    pref.cadastrarPreferencias();
                    break;
                case 2:
                    lista.verTodosFilmes();
                    break;
                case 3:
                    lista.recomendacaoFilmes(pref);
                    break;
                case 4:
                    lista.insereFilme();
                    break;
                case 5:
                    lista.mostrarEstatisticas();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                     System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                     break;
             }
         }
     }
 
     public static void exibirMenu() {
         System.out.println("========== MENU ==========");
         System.out.println("1. Cadastrar preferências");
         System.out.println("2. Ver todos os filmes");
         System.out.println("3. Recomendação filmes");
         System.out.println("4. Adicionar novo filme");
         System.out.println("5. Mostrar estatísticas");
         System.out.println("6. Sair");
         System.out.println();
         System.out.print("Escolha uma opção: ");
         System.out.println();
 
    }


}
 
    