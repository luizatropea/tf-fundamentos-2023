import java.util.Scanner;

/**
 * Trabalho Final - Fundamentos de Programação
 * 
 * @author Luiza Tropea Scaglia
 *
 */ 

public class Preferencias {

    private String generoPreferido;
    private String duracaoPreferida;
    private String diretorPreferido;
    private String atorPreferido;

    public Preferencias(String generoPreferido, String duracaoPreferida, String diretorPreferido,
            String atorPreferido) {
        this.generoPreferido = generoPreferido;
        this.duracaoPreferida = duracaoPreferida;
        this.diretorPreferido = diretorPreferido;
        this.atorPreferido = atorPreferido;
    }

    public Preferencias ()
    {

    }

    public String getGeneroPreferido() {
        return generoPreferido;
    }

    public void setGeneroPreferido(String generoPreferido) {
        this.generoPreferido = generoPreferido;
    }


    public String getDuracaoPreferida() {
        return duracaoPreferida;
    }


    public void setDuracaoPreferida(String duracaoPreferida) {
        this.duracaoPreferida = duracaoPreferida;
    }


    public String getDiretorPreferido() {
        return diretorPreferido;
    }

    public void setDiretorPreferido(String diretorPreferido) {
        this.diretorPreferido = diretorPreferido;
    }

    public String getAtorPreferido() {
        return atorPreferido;
    }

    public void setAtorPreferido(String atorPreferido) {
        this.atorPreferido = atorPreferido;
    }

    public void cadastrarPreferencias () 
    {
        System.out.println();
        System.out.println("Opção 'Cadastrar preferências' selecionada.");
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Certo! Primeiro, qual seu gênero preferido?");
        generoPreferido =  in.nextLine();
        System.out.println("Qual sua duração preferida? Escolha entre curto, intermediário, longa-metragem ou épico.");
        duracaoPreferida = in.nextLine();
        System.out.println("Qual seu diretor preferido?");
        diretorPreferido = in.nextLine();
        System.out.println("Qual seu ator preferido?");
        atorPreferido = in.nextLine();
        System.out.println("Preferências cadastradas com sucesso!");
        System.out.println();
    }
}
