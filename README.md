# Fila de Prioridade Brasileira

Este projeto tem como intuito desenvolver um modelo de gerenciamento de filas utilizando de códigos "externos".

## Estrutura de Pastas

### Package: run

> Arquivos necessários para inicialização do sistema.

- `Main.java` - Classe principal do sistema executa o projeto. Ela processa os comandos e 
realiza as operações correspondentes.


### Package: Codes
  
> Package onde são inseridos os códigos de inserção de dados no sistema.

- `import.txt` Arquivo de entrada do sistema.

### Package: app.Config

> Onde o sistema é propriamente desenvolvido, compreende todas as funcionalidades do sistema 
 e onde se tem os arquivos de configuração do sistema.

- `Parser.java` - Classe responsável por ler o arquivo de texto, verifica se uma pessoa
existe em algum grupo ou se duas pessoas se conhecem no mesmo grupo.


- `Guiche.java` - Esta classe representa uma fila(ou guichê). Ela mantém uma 
lista de pessoas na fila e fornece métodos para adicionar e remover pessoas da fila, bem
como obter o tamanho da fila e imprimir a fila.


- `ControleGuiche` - Classe responsável por controlar várias filas. Ela mantém 
uma lista de pessoas, garante que pessoas furem a fila caso se conheçam 
e fornece métodos para adicionar filas, atender fila, adicionar pessoas
às filas e imprimir todas as filas.
