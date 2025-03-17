public class AreaVerde {
    private String nome;
    private String localizacao;
    private double tamanho;
    private String statusConservacao; // Novo atributo
    private String responsavel; // Novo atributo

    public AreaVerde(String nome, String localizacao, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    // Métodos para nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos para localizacao
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    // Métodos para tamanho
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    // Métodos para statusConservacao
    public String getStatusConservacao() {
        return statusConservacao;
    }
    public void setStatusConservacao(String statusConservacao) {
        this.statusConservacao = statusConservacao;
    }

    // Métodos para responsavel
    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    //Metodo para calcular tamanho em hectares
    public double calcularTamanhoEmHectares() {
        return tamanho / 10000; // cada hectar é = 10.000
    }
    // Metodo para exibir informacoes
    public void exibirInformacoes() {
        System.out.println("Informações da Área Verde:");
        System.out.println("Nome: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("Tamanho: " + tamanho + " m²");
        System.out.println("Tamanho em Hectares: " + calcularTamanhoEmHectares() + " ha");
        System.out.println("Status de Conservação: " + statusConservacao);
        System.out.println("Responsável: " + responsavel);
    }
}
