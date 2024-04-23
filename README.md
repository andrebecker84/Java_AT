<p align="center">
  <img src="https://github.com/andrebecker84/AppWebASPNETcoreTP2/assets/39974878/2c3a2ab1-5789-47d3-ade6-e300e2b8af69">
</p>
<br>

<p align="center">DESENVOLVIMENTO DE SERVIÇOS WEB E TESTES COM JAVA</p>

<p align="center">Assessment - AT</p>
<br><br>

<p align="center">ALUNO: ANDRÉ LUIS BECKER</p>
<p align="center">PROF.: ELBERTH LINS COSTA DE MORAES</p>
<br><br>

# Projeto de Gerenciamento de Academias

## Introdução

Para o desenvolvimento do projeto de software, foi considerada a ideia de um negócio fictício que envolvesse a venda de cafés especiais: uma "Cafeteria Virtual Premium". 
A Cafeteria Virtual Premium seria uma plataforma online onde os amantes de café poderiam descobrir e adquirir uma ampla variedade de cafés especiais de diferentes regiões do mundo. Além disso, a cafeteria também poderia oferecer uma seleção de tabacos de alta qualidade para os apreciadores desse produto.

Os usuários poderiam:
-	Navegar pelo catálogo da cafeteria, que incluiria uma variedade de cafés de origem única, blends exclusivos e tabacos selecionados;
-	Ler descrições detalhadas sobre cada produto, incluindo informações sobre sua origem, perfil de sabor, método de cultivo e processamento, entre outros;

Para a aplicação web poderia:
-	Desenvolver uma plataforma onde os usuários pudessem criar uma conta, navegar pelos produtos disponíveis, adicionar itens ao carrinho de compras e finalizar suas compras;
-	Implementar recursos de avaliação e comentários para que os clientes pudessem compartilhar suas opiniões sobre os produtos que compraram;

Usando Spark Java e uma arquitetura RESTful, poderia:
-	Criar uma API para lidar com operações como cadastro de usuários, gerenciamento de produtos, processamento de pedidos e pagamentos online.
-	Integrar serviços de entrega para garantir que os produtos cheguem aos clientes de forma rápida e segura, inclusive utilizando a API Pública ViaCEP.

Este projeto consiste na construção de uma API WEB Restful que implementa operações CRUD (Create, Read, Update, Delete) para um sistema de gerenciamento. Durante o desenvolvimento, foram realizadas as seguintes tarefas:

- Realização de `REQUESTS` para uma `API RESTful` utilizando o software `POSTMAN`.
- Utilização de `REQUESTS` com método `GET` usando parâmetros através do `POSTMAN`.
- Envio de dados em formato `JSON` para uma `API RESTful` utilizando o método `POST` através do `POSTMAN`.
- Exclusão de dados de uma `API RESTful` utilizando o método `DELETE` através do `POSTMAN`.

## Descrição

 Classes:

1. Loja (API ViaCEP):
	// Atributos
		private Integer id;
		private String nome;
		private String email;
		private String localidade;
		private int anoFundacao;


2. Funcionario:
	// Atributos
		private int registro;
		private String nome;
		private String cargo;
		private float salario;


3. Pagamento:
4. Pedido:

5. Produto (Classe mãe):
	// Atributos da classe mãe
		private int codigo;
		private String tipo;
		private String classificacao;
		private int validade;
		private boolean disponibilidade;

5.1. ProdutoCafe (Classe filha de Produto): p/ isso usar `extends Produto` nessa classe que é filha...
	// Atributos da classe filha Produto
		private int codigo;
		private String origem;         // regiao, importado, nacional
		private String intensidade;    // suave, média, intensa
		private String tipoMetodo;     // grãos, torrados e moídos, cápsulas, drip coffee, sachês, solúveis, moagens especiais, microlotes
		private String caracteristica; // orgânico, descafeinado, aromatizado, especiais(premiados)

5.2. ProdutoTabaco (Classe filha de Produto):
	// Atributos da classe filha Produto
		private int codigo;
		private String origem;         // regiao, importado, nacional
		private String intensidade;    // suave, média, forte
		private String tipo;           // p/ enrolar, p/ cachimbo, rapé, kumbaya, mascar, charutos, cigarrilhas e cigarros
		private boolean premiado;      // especiais(premiados)

6. Usuario (Cliente):
	// Atributos
		private int registro;
		private String nome;
		private String email;
		private String idade;
		private boolean maiorIdade;

7. Entrega (API ViaCEP):




Relacionamentos entre Classes:

Loja X Funcionario (UM para UM) `private Funcionario funcionario;`

Loja X (Produto, ProdutoCafe e ProdutoTabaco) (UM para MUITOS) e (MUITOS para MUITOS) 
(Relacionamentos entre classes através de herança --> `private List<Produto> produtos;`)

Produto X (ProdutoCafe e ProdutoTabaco) (UM pra UM) e (UM para MUITOS)


Resumo de como a aplicação vai funcionar:
pom.xml                  ---> Instalação de todas as dependências incluindo Spark-core 2.9.4 (Spark), Gson 2.10 (JsonFormatter)

cafeteria/src/main/...

... java/
cafeteria/App.java       ---> Configura as rotas na inicialização da aplicação e se relaciona com a camada controller

cafeteria.controller/    ---> Aonde cria as lógicas de controle, (GET, POST e DELETE) e se relaciona com a camada service

cafeteria.model.domain/  ---> Aonde estão as classes de negócios com os atributos e getters & setters

cafeteria.model.service/ ---> Camada de inteligência: ela é responsável por chamar uma API externa, Banco da Dados, Mapas, um outro projeto, fazer uma operação de validação, decodificação de senha, as ações de uma forma geral...

cafeteria.util/          ---> Terá a utilidade de formatação dos arquivos JSON com a dependência (Gson)

... resources/           ---> Páginas (front-end)

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE.md](LICENSE.md) para obter detalhes.

---
**Nota:** Este README é uma documentação inicial e pode ser atualizado conforme o projeto evolui e mais funcionalidades são adicionadas.

