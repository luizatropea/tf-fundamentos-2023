public class Filme {
    
    private String titulo;
    private String genero;
    private int duracao;
    private String diretor;
    private String atoresPrincipais;
    private int pontuacao;

    public Filme(String titulo, String genero, int duracao, String diretor, String atoresPrincipais, int pontuacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.diretor = diretor;
        this.atoresPrincipais = atoresPrincipais;
        this.pontuacao = pontuacao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getAtoresPrincipais() {
        return atoresPrincipais;
    }
    public void setAtoresPrincipais(String atoresPrincipais) {
        this.atoresPrincipais = atoresPrincipais;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "[Titulo: " + titulo + ", Gênero: " + genero + ", Duracão: " + duracao + ", Diretor: " + diretor
                + ", Atores principais: " + atoresPrincipais + ", Pontuacao: " + pontuacao + "]";
    }
}
