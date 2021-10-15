package Atividade2;

public class Quest5_ConversaComContato {

    public static void main(String[] args) {

        Quest5_contato Prof = new Quest5_contato(992323123, "Prof. Breno");

        Prof.enviar_mensagem("Professor, quando é o atendimento?");

        Prof.getNotLidas();

        Prof.recebidas("Não sei!");

        Prof.recebidas("Estou esperando a mensagem da diretoria");

        Prof.recebidas("Não se preocupe");

        Prof.recebidas("Quando tiver a data eu lhe mando");

        Prof.recebidas("Até mais!");

        Prof.getNotLidas();

        Prof.mensagensNaoLidas();

        Prof.getNotLidas();
    }
}
