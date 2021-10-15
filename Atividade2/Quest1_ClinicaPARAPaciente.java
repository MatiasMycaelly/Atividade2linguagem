package Atividade2;

public class Quest1_ClinicaPARAPaciente {

    public static void main(String[] args) {

        Quest1_Paciente Mycaelly = new Quest1_Paciente("Mycaelly Jaqueline", 23, "02/08/2004", "Feminina", "Abacaxi",
                "Nenhum", "O+");

        System.out.println("\nTipo Sanguíneo: " + Mycaelly.getTipoSanguineo());
        System.out.println("Codigo: " + Mycaelly.getCodigo());
        System.out.println("Nome: " + Mycaelly.getNome());
        System.out.println("Data de Nascimento: " + Mycaelly.getDataNascimento());
        System.out.println("Sexo: " + Mycaelly.getSexo());
        System.out.println("Plano de saude: " + Mycaelly.getPlanoSaude());
        System.out.println("Alergia: " + Mycaelly.getAlergia());

        Mycaelly.setNome("Maria Januaria");
        Mycaelly.setDataNascimento("23/03/1972");
        Mycaelly.setSexo("Feminino");
        Mycaelly.setTipoSanguineo("O+");
        Mycaelly.setAlergia("Nenhuma");
        Mycaelly.setPlanoSaude("Nenhum");
        Mycaelly.setCodigo(24);

        System.out.println("\nTipo Sanguíneo: " + Mycaelly.getTipoSanguineo());
        System.out.println("Codigo: " + Mycaelly.getCodigo());
        System.out.println("Nome: " + Mycaelly.getNome());
        System.out.println("Data de Nascimento: " + Mycaelly.getDataNascimento());
        System.out.println("Sexo: " + Mycaelly.getSexo());
        System.out.println("Plano de saude: " + Mycaelly.getPlanoSaude());
        System.out.println("Alergia: " + Mycaelly.getAlergia());

    }
}
