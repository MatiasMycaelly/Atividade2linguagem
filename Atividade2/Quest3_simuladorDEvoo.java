package Atividade2;

public class Quest3_simuladorDEvoo {

    public static void main(String[] args) {

        Quest3_aviao_simulador av1 = new Quest3_aviao_simulador(900, 10);

        System.out.println("Velocidade: " + av1.getVelocidade() + " Km/h");
        System.out.println("Altitude: " + av1.getAltitude() + " Km\n");

        av1.menosAltitude(1);
        av1.menosVelocidade(100);

        System.out.println("Velocidade: " + av1.getVelocidade() + " Km/h");
        System.out.println("Altitude: " + av1.getAltitude() + " Km");
    }
}
