# Desafio

  Sistema de controle de fluxo de caixa simples. Nele, foir criado uma API Rest em Java que permite fazer o CRUD de lançamentos de caixa    utilizando Spring Boot. Além disso, temos também uma tela de consulta de lançamentos onde podemos exportar os dados em Excel, PDF, CSV
  e XML. Há também, uma tela para a realização dos lançamentos. Para este desafio, é utilizado o banco de dados H2, armazenando as informações apenas em memória. Cada vez que a aplicação é reiniciada, o banco de dados é zerado.
  
## Funcionamento

  Essa aplicação foi desenvolvida utilizando a IDE Spring Tool Suite, baseada no eclipse. 
  
  Para a interface web, foi utilizado o framework JSF Primefaces.
  
  Para gerenciamento de dependências, foi utilizado o Maven.
  
  A versão do java utilizada é a 11.
  
  Antes de executar a aplicação, basta importá-la em uma IDE, rodar os comandos maven clean e maven install.
  
  Em seguida, executar a classe "DesafioFluxocaixaApplication.java".
  
  Para visualizar a página inicial, acessar o link http://localhost:8080/index.jr localmente onde a aplicação foi importada.
  
  Na raiz do projeto, há uma pasta chamada "postman" a qual contém a collection referente à api criada.
