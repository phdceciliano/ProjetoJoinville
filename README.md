Sistema de Mapeamento de Áreas Verdes e Monitoramento de Resíduos
Este sistema foi desenvolvido para simular um aplicativo de sustentabilidade, onde é possível:

Cadastrar áreas verdes: Registrar informações como nome, localização, tamanho, status de conservação e responsável.

Monitorar resíduos: Registrar dados sobre o tipo de resíduo, quantidade coletada, data de coleta, status da coleta e responsável pela coleta.

Exibir informações: Mostrar detalhes das áreas verdes e do monitoramento de resíduos, incluindo cálculos como tamanho em hectares e quantidade estimada de resíduos por mês.

O sistema foi projetado para ser interativo, permitindo que o usuário insira dados e visualize os resultados no console.

Tecnologias e Conceitos Utilizados
Java:

A linguagem de programação utilizada para desenvolver o sistema.

Java é uma linguagem orientada a objetos, robusta e amplamente utilizada para desenvolvimento de aplicativos.

Programação Orientada a Objetos (POO):

O sistema foi desenvolvido seguindo os princípios da POO, que incluem:

Classes e Objetos: As classes AreaVerde e MonitoramentoResiduos representam entidades do sistema, e os objetos são instâncias dessas classes.

Encapsulamento: Os atributos das classes são privados (private), e o acesso a eles é controlado por métodos get e set.

Reutilização de Código: As classes foram projetadas para serem reutilizáveis em diferentes partes do sistema.

Abstração: Detalhes internos das classes são ocultados, expondo apenas o necessário por meio de métodos públicos.

Modificadores de Acesso:

Foram utilizados modificadores como private, public e protected para controlar o acesso aos atributos e métodos das classes.

Construtores:

Construtores foram implementados para inicializar os objetos com valores específicos no momento da criação.

Métodos:

Métodos como calcularTamanhoEmHectares() e calcularResiduosPorMes() foram criados para adicionar funcionalidades específicas ao sistema.

Métodos exibirInformacoes() foram usados para mostrar os dados de forma organizada.

Interação com o Usuário:

A classe AppSustentabilidade utiliza a classe Scanner para receber entradas do usuário e interagir com ele.

Console:

O sistema é executado no console, onde o usuário insere dados e visualiza os resultados.

Funcionalidades do Sistema
Cadastro de Áreas Verdes:

Permite ao usuário cadastrar áreas verdes com informações como nome, localização, tamanho, status de conservação e responsável.

Monitoramento de Resíduos:

Permite ao usuário registrar dados sobre a coleta de resíduos, incluindo tipo, quantidade, data, status e responsável.

Cálculos Automáticos:

Converte o tamanho da área verde de metros quadrados para hectares.

Calcula a quantidade estimada de resíduos coletados por mês.

Exibição de Informações:

Mostra os detalhes das áreas verdes e do monitoramento de resíduos de forma clara e organizada.

Exemplo de Uso
O usuário executa o programa.

O sistema solicita informações sobre uma área verde (nome, localização, tamanho, etc.).

Em seguida, solicita dados sobre o monitoramento de resíduos (tipo, quantidade, data, etc.).

O sistema processa os dados, realiza cálculos e exibe os resultados no console.

Benefícios do Sistema
Organização: O uso de classes e métodos torna o código organizado e fácil de manter.

Segurança: O encapsulamento protege os dados contra acesso ou modificação inadequada.

Reutilização: As classes podem ser reutilizadas em outros projetos ou partes do sistema.

Interatividade: O sistema interage com o usuário, tornando-o mais dinâmico e útil.

Conclusão
Este sistema é um exemplo prático de como a Programação Orientada a Objetos (POO) e a linguagem Java podem ser utilizadas para criar aplicativos funcionais e organizados. Ele demonstra conceitos importantes como encapsulamento, reutilização de código, interação com o usuário e cálculos automáticos, sendo uma base sólida para projetos mais complexos no futuro.
