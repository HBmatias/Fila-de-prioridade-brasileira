# Fila de Prioridade Brasileira

Este projeto tem como intuito desenvolver um modelo de gerenciamento de filas utilizando de códigos "externos".

**Boas Práticas**

Tendo em vista a manutenção e desenvolvimento deste código por outros desenvolvedores, é importante que sejam seguidas algumas boas práticas de programação.

## Estrutura de Pastas

### Package: run

> Arquivos necessários para inicialização do sistema

- `Main.java` - Arquivo principal do sistema, onde inicia-se o processo de ação do sistema;
- `MainTest.java` - Arquivo de testes do sistema, onde são testadas as funcionalidades do sistema;

#### Package: Codes
  
  - Package onde são inseridos os códigos de inserção de dados no sistema;

### Package: app

> Onde o sistema é propriamente desenvolvido, compreende todas as funcionalidades do sistema

#### Package: Config

- Arquivos de configuração do sistema 

#### Package: View
  
- Os arquivos html para visualização de funcionalidades devem ser gerados nesse Package;
- Deve ter como regra a separação e organização dos arquivos html em subpastas do package em questão:
  - **Exemplo:** Arquivos html padrão são criados dentro de `View.layout`;
