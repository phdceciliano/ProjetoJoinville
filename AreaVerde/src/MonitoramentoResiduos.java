public class MonitoramentoResiduos {
    private String tipoResiduo;
    private double quantidade;
    private String dataColeta;
    private String statusColeta; // Novo atributo
    private String responsavelColeta; // Novo atributo

    public MonitoramentoResiduos(String tipoResiduo, double quantidade, String dataColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;
    }


    // Métodos para tipoResiduo
    public String getTipoResiduo() {
        return tipoResiduo;
    }
    public void setTipoResiduo(String tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    // Métodos para quantidade
    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    // Métodos dataColeta
    public String getDataColeta() {
        return dataColeta;
    }
    public void setDataColeta(String dataColeta) {
        this.dataColeta = dataColeta;
    }

    // Criando metodos StatusColeta
    public String getStatusColeta() {
        return statusColeta;
    }
    public void setStatusColeta(String statusColeta) {
        this.statusColeta = statusColeta;
    }

    // Criando metodos ResponsavelColeta
    public String getResponsavelColeta() {
        return responsavelColeta;
    }
    public void setResponsavelColeta(String responsavelColeta) {
        this.responsavelColeta = responsavelColeta;
    }
    // Metodo que calcula residuosPorMes
    public double calcularResiduosPorMes() {
        return quantidade * 30; // Quantidade diária * 30 dias
    }

    // Metodo para exibir informacoes
    public void exibirInformacoes() {
        System.out.println("Informações do Monitoramento de Resíduos:");
        System.out.println("Tipo de Resíduo: " + tipoResiduo);
        System.out.println("Quantidade Coletada: " + quantidade + " kg");
        System.out.println("Quantidade Estimada por Mês: " + calcularResiduosPorMes() + " kg");
        System.out.println("Data de Coleta: " + dataColeta);
        System.out.println("Status da Coleta: " + statusColeta);
        System.out.println("Responsável pela Coleta: " + responsavelColeta);
    }
}