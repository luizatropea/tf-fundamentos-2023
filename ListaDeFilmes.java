/**
 * Trabalho Final - Fundamentos de Programação
 * 
 * @author Luiza Tropea Scaglia
 *
 */

 import java.util.Scanner;

public class ListaDeFilmes {
    
    private Filme[] vetorFilme;
    private int indice;

    // Construtor com as informações dos filmes já na base de dados.

    public ListaDeFilmes () {
        indice = 20;
        this.vetorFilme = new Filme[50];
        vetorFilme[0] =  new Filme("O Castelo Animado", "Animacao", 119, "Hayao Miyazaki", "Animacao", 5);
        vetorFilme[1] =  new Filme("Batman", "Acao",187, "Matt Reeves", "Robert Pattinson", 5);
        vetorFilme[2] =  new Filme("10 coisas que eu odeio em voce", "Romance", 97, "Gil Junger", "Heat Ledger", 4);
        vetorFilme[3] =  new Filme("Edward Maos de Tesoura", "Drama", 105, "Tim Burton", "Johnny Depp", 5);
        vetorFilme[4] =  new Filme("Panico", "Terror", 111, "Wes Craven", "Neve Campbell", 3);
        vetorFilme[5] =  new Filme("Clube da Luta", "Drama", 139, "David Fincher", "Brad Pitt", 3);
        vetorFilme[6] =  new Filme("Interestelar", "Drama", 169, "Christopher Nolan", "Matthew McConaughey", 4);
        vetorFilme[7] =  new Filme("O Iluminado", "Terror", 144, "Stanley Kubrick", "Jack Nicholson", 5);
        vetorFilme[8] =  new Filme("As Patricinhas de Beverly Hills", "Comedia", 97, "Amy Heckerling", "Alicia Silverstone", 3);
        vetorFilme[9] =  new Filme("Toy Story", "Animacao", 81, "John Lasseter", "Animacao", 5);
        vetorFilme[10] =  new Filme("Mad Max", "Acao", 120, "George Miller", "Tom Hardy", 2);
        vetorFilme[11] =  new Filme("O Exorcista", "Terror", 132, "William Friedkin", "Linda Blair", 2);
        vetorFilme[12] =  new Filme("Psicose", "Terror", 109, "Alfred Hitchcock", "Anthony Perkins", 4);
        vetorFilme[13] =  new Filme("Matrix", "Acao", 136, "Lana Wachowski", "Keanu Reeves", 3);
        vetorFilme[14] =  new Filme("O Poderoso Chefao", "Drama", 175, "Francis Ford Coppola", "Al Pacino", 2);
        vetorFilme[15] =  new Filme("La La Land", "Romance", 128, "Damien Chazelle", "Emma Stone", 2);
        vetorFilme[16] =  new Filme("Guardioes da Galaxia", "Acao", 122, "James Gunn", "Chris Pratt", 3);
        vetorFilme[17] =  new Filme("O Espetacular Homem-Aranha", "Acao", 136, "Marc Webb", "Emma Stone", 4);
        vetorFilme[18] =  new Filme("A Forma da Água", "Drama", 123, "Guillermo del Toro", "Drama", 5);
        vetorFilme[19] =  new Filme("O Lobo de Wallstreet", "Drama", 180, "Martin Scorsese", "Drama", 2);
    }

    // Método para utilizar o indice.

    public int getIndice ()
    {
        return this.indice;
    }

    // Método para quando o usuário selecionar a opção "Adicionar novo filme". Adiciona um novo filme ao vetor de filmes.
    public void insereFilme ()
    {
        System.out.println();
        System.out.println("Opção 'Adicionar novo filme' selecionada.");
        System.out.println();
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        String nome = in.nextLine();

        System.out.println("Digite o gênero do filme: ");
        String genero = in.nextLine();

        System.out.println("Digite a duração do filme: ");
        int duracao = in.nextInt();

        System.out.println("Digite o diretor do filme: ");
        String diretor = in.nextLine();
        in.nextLine();

        System.out.println("Digite o ator principal do filme: ");
        String ator = in.nextLine();

        System.out.println("Digite a pontuação do filme: ");
        int pontuacao = in.nextInt();

        Filme F = new Filme(nome, genero, duracao, diretor, ator, pontuacao);
        vetorFilme[indice] = F;
        indice++;
    }

    // Método para exibir a lista de filmes.

    public void verTodosFilmes ()
    {
        for(int i = 0; i < vetorFilme.length; i++) System.out.println(i + 1 + ". " + vetorFilme[i]);
    }


    // Método para calcular o percentual de filmes com durações curtas, intermediárias, longas ou épicas.

    public int calculaPercentual (int duracao)
    {
        System.out.println(duracao);
        int soma = 0;

        for(int i = 0; i < indice; i++)
        {
            if(duracao == 1 && vetorFilme[i].getDuracao() <= 40)
            {
                soma++;
            }
            else if(duracao == 2 && vetorFilme[i].getDuracao() > 40 && vetorFilme[i].getDuracao() < 60)
            {
                soma++;
            }
            else if (duracao == 3 && vetorFilme[i].getDuracao() >= 60 && vetorFilme[i].getDuracao() < 130)
            {
                soma++;
            }
            else if (duracao == 4 && vetorFilme[i].getDuracao() >= 130)
            {
                soma++;
            }
                
        }
        return (soma * 100) / indice;
    }

    // Quando o usuário selecionar a opção "Mostrar estatísticas", mostra os filmes armazenados, a média de pontuações e o percentual de filmes curtos, intermediários, longa-metragem e épicos.
    
    public void mostrarEstatisticas ()
    {
        System.out.println();
        System.out.println("Opção 'Mostrar estatísticas' selecionada.");
        System.out.println();
        System.out.printf("Temos %d filmes armazenados", indice);
        System.out.println();
        int soma = 0;
        for(int i = 0; i < indice; i++)
        {
            soma = soma + vetorFilme[i].getPontuacao();
        }  
        System.out.println();
        System.out.println("A média de pontuações é " + (soma / indice));
        System.out.println();
        System.out.println("O percentual de filmes curtos é " + calculaPercentual(1));
        System.out.println();
        System.out.println("O percentual de filmes intermediários é " + calculaPercentual(2));
        System.out.println(); 
        System.out.println("O percentual de filmes longa-metragem é " + calculaPercentual(3)); 
        System.out.println();
        System.out.println("O percentual de filmes épicos é " + calculaPercentual(4)); 
        System.out.println();

    }

    // Método para recomendação de filmes baseado nas preferências do usuário.

    public void recomendacaoFilmes (Preferencias pref)
    {
        Filme[] vetorRecomendacao = new Filme[50];
        int tamanho = 0;
        System.out.println();
        System.out.println("Opção 'Recomendação filmes' selecionada.");
        for(int i = 0; i < indice; i++)
        {
            String duracao = pref.getDuracaoPreferida();
            int comparador;

            if(duracao.equals("Curto"))
            {
                comparador = 1;
            }
            if(duracao.equals("Intermediário"))
            {
                comparador = 2;
            }
            if(duracao.equals("Longa-metragem"))
            {
                comparador = 3;
            }
            else
            {
                comparador = 4;
            }

            if(pref.getGeneroPreferido().equals(vetorFilme[i].getGenero()))
            {
                vetorRecomendacao[tamanho] = vetorFilme[i];
                tamanho++;
            }
            else if(comparador == 1 && vetorFilme[i].getDuracao() <= 40)
            {
                vetorRecomendacao[tamanho] = vetorFilme[i];
                tamanho++;
            }
            else if(comparador == 2 && vetorFilme[i].getDuracao() > 40 && vetorFilme[i].getDuracao() < 60)
            {
                vetorRecomendacao[tamanho] = vetorFilme[i];
                tamanho++;
            }
            else if(comparador == 3 && vetorFilme[i].getDuracao() >= 60 && vetorFilme[i].getDuracao() < 130)
            {
                vetorRecomendacao[tamanho] = vetorFilme[i];
                tamanho++;
            }
            else if(comparador == 4 && vetorFilme[i].getDuracao() > 130)
            {
                vetorRecomendacao[tamanho] = vetorFilme[i];
                tamanho++;
            }
            else if(pref.getDiretorPreferido().equals(vetorFilme[i].getDiretor()))
            {
                vetorRecomendacao[tamanho] = vetorFilme[i];
                tamanho++;
            }
            else if(pref.getAtorPreferido().equals(vetorFilme[i].getAtoresPrincipais()))
            {
                vetorRecomendacao[tamanho] = vetorFilme[i];
                tamanho++;
            }
        }
        System.out.println("Sua lista de recomendações: ");
        System.out.println();
        for(int i = 0; i < indice; i++)
        {
            System.out.println(vetorRecomendacao[i]);
        }
    }

}