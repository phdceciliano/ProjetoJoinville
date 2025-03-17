public class Main {
    public static void main(String[] args) {
        // Instanciando um objeto da classe AreaVerde
        AreaVerde area1 = new AreaVerde("Parque Zoobotânico", "Rua Pastor Guilherme Rau, 462", 40000.0);

        // Definindo valores para os atributos de AreaVerde
        area1.setStatusConservacao("Bem conservada");
        area1.setResponsavel("Secretaria do Meio Ambiente");

        // Instanciando um objeto da classe MonitoramentoResiduos
        MonitoramentoResiduos coleta1 = new MonitoramentoResiduos("Papel", 150.5, "2025-02-15");

        // Definindo valores para os atributos de MonitoramentoResiduos
        coleta1.setStatusColeta("Concluída");
        coleta1.setResponsavelColeta("João Silva");

        // Imprimindo os valores no console
        System.out.println("Informações da Área Verde:");
        System.out.println("Nome: " + area1.getNome());
        System.out.println("Localização: " + area1.getLocalizacao());
        System.out.println("Tamanho: " + area1.getTamanho() + " m²");
        System.out.println("Status de Conservação: " + area1.getStatusConservacao());
        System.out.println("Responsável: " + area1.getResponsavel());

        System.out.println("\nInformações do Monitoramento de Resíduos:");
        System.out.println("Tipo de Resíduo: " + coleta1.getTipoResiduo());
        System.out.println("Quantidade: " + coleta1.getQuantidade() + " kg");
        System.out.println("Data de Coleta: " + coleta1.getDataColeta());
        System.out.println("Status da Coleta: " + coleta1.getStatusColeta());
        System.out.println("Responsável pela Coleta: " + coleta1.getResponsavelColeta());
    }
}