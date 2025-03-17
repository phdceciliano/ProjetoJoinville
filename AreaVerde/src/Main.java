public class Main {
    public static void main(String[] args) {
        // Instanciando um objeto da classe AreaVerde
        AreaVerde area1 = new AreaVerde("Parque Zoobotânico", "Rua Pastor Guilherme Rau, 462", 40000.0);

        // Definindo valores para os atributos de AreaVerde
        area1.setStatusConservacao("Bem conservada");
        area1.setResponsavel("Secretaria do Meio Ambiente");

        // Instanciando um objeto da classe MonitoramentoResiduos
        MonitoramentoResiduos coleta1 = new MonitoramentoResiduos("Papel", 150.5, "2023-10-15");

        // Definindo valores para os atributos de MonitoramentoResiduos
        coleta1.setStatusColeta("Concluída");
        coleta1.setResponsavelColeta("João Silva");

        // Exibindo informações e resultados dos cálculos
        area1.exibirInformacoes();
        System.out.println(); // Linha em branco para separar as saídas
        coleta1.exibirInformacoes();
    }
}