package Atividade2;

public class Quest5_contato {

    private int numero, recebidas, NotLidas, Foramenviadas;
    private String nomeContato;

    String[] mensagensNlidas = new String[1000];
    String[] mensagem_enviada = new String[1000];

    public Quest5_contato(int numero, String nome) {

        this.nomeContato = nome;
        this.numero = numero;

    }

    public void enviar_mensagem(String mensagem) {

        this.mensagem_enviada[Foramenviadas] = mensagem;
        this.Foramenviadas++;

    }

    public void recebidas(String mensagem) {

        this.mensagensNlidas[this.recebidas] = mensagem;
        this.recebidas++;

    }

    public void getNotLidas() {
        System.out.println("Quantidade de mensagens não lidas: " + this.recebidas);
    }

    public void mensagensNaoLidas() {

        System.out.println("Mensagens que não foram lidas: ");

        while (this.recebidas > 0) {

            System.out.println(this.mensagensNlidas[this.NotLidas]);
            this.NotLidas++;
            this.recebidas--;

        }
    }
}
