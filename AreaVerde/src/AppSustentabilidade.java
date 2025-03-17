import java.util.Scanner;

public class AppSustentabilidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Interação com o usuário para cadastrar uma área verde
        System.out.println(" Cadastro de Área Verde ");
        System.out.print("Nome da área verde: ");
        String nomeArea = scanner.nextLine();
        System.out.print("Localização: ");
        String localizacao = scanner.nextLine();
        System.out.print("Tamanho (em m²): ");
        double tamanho = scanner.nextDouble();
        scanner.nextLine(); // quebra de linha
        System.out.print("Status de conservação: ");
        String statusConservacao = scanner.nextLine();
        System.out.print("Responsável: ");
        String responsavel = scanner.nextLine();

        // Criando o objeto AreaVerde
        AreaVerde areaVerde = new AreaVerde(nomeArea, localizacao, tamanho);
        areaVerde.setStatusConservacao(statusConservacao);
        areaVerde.setResponsavel(responsavel);

        // Interação com o usuário para cadastrar um monitoramento de resíduos
        System.out.println("\n=== Cadastro de Monitoramento de Resíduos ===");
        System.out.print("Tipo de resíduo: ");
        String tipoResiduo = scanner.nextLine();
        System.out.print("Quantidade coletada (em kg): ");
        double quantidade = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Data de coleta (AAAA-MM-DD): ");
        String dataColeta = scanner.nextLine();
        System.out.print("Status da coleta: ");
        String statusColeta = scanner.nextLine();
        System.out.print("Responsável pela coleta: ");
        String responsavelColeta = scanner.nextLine();

        // Criando o objeto MonitoramentoResiduos
        MonitoramentoResiduos monitoramento = new MonitoramentoResiduos(tipoResiduo, quantidade, dataColeta);
        monitoramento.setStatusColeta(statusColeta);
        monitoramento.setResponsavelColeta(responsavelColeta);

        // Exibindo os resultados
        System.out.println("\n=== Informações da Área Verde ===");
        areaVerde.exibirInformacoes();

        System.out.println("\n=== Informações do Monitoramento de Resíduos ===");
        monitoramento.exibirInformacoes();

        scanner.close();
    }
}