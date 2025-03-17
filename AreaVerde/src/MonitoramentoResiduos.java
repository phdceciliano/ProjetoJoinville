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
}