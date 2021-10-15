package Atividade2;

public class Quest2_Postagem {

    private String text, link;
    private int numeroCurtidas, numeroCompartilhamento;

    public Quest2_Postagem(String text, String link) {

        this.text = text;
        this.link = link;

    }

    public void curtiPost() {
        this.numeroCurtidas += 1;
    }

    public int getNumeroCurtidas() {
        return this.numeroCurtidas;
    }

    public void compartilharPost() {
        this.numeroCompartilhamento += 1;
    }

    public int getNumeroCompartilhamento() {
        return this.numeroCompartilhamento;
    }
}
