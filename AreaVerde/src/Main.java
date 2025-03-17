public class Main {
    public static void main(String[] args) {
        // Instanciando um objeto da classe AreaVerde usando o construtor
        AreaVerde area1 = new AreaVerde("Parque Zoobotânico", "Rua Pastor Guilherme Rau, 462", 40000.0);

        // Usando métodos set para definir valores adicionais
        area1.setStatusConservacao("Bem conservada");
        area1.setResponsavel("Secretaria do Meio Ambiente");

        // Alterando valores usando métodos set
        area1.setNome("Parque da Cidade");
        area1.setTamanho(50000.0);

        // Instanciando um objeto da classe MonitoramentoResiduos usando o construtor
        MonitoramentoResiduos coleta1 = new MonitoramentoResiduos("Papel", 150.5, "2023-10-15");

        // Usando métodos set para definir valores adicionais
        coleta1.setStatusColeta("Concluída");
        coleta1.setResponsavelColeta("João Silva");

        // Alterando valores usando métodos set
        coleta1.setTipoResiduo("Plástico");
        coleta1.setQuantidade(200.0);

        // Exibindo informações atualizadas
        area1.exibirInformacoes();
        System.out.println(); // Linha em branco para separar as saídas
        coleta1.exibirInformacoes();
    }
}