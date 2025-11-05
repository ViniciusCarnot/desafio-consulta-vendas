# Desafio: CONSULTA DE VENDAS
Desafio do curso Java Spring Professional da Dev Superior. 

-------------------------------------------------------------------------------------------------------------------------
## Objetivos
- A partir de endpoints pré-estabelecidos, criar e retornar as informações corretas
- Otimizar e melhorar a performance de consultas ao banco de dados
- Realizar buscas paginadas
-------------------------------------------------------------------------------------------------------------------------
## Tecnologias
- Java (v.17)
- Spring Boot (v2.7.3)
- Maven (Gerenciador de dependências)
- Spring Data JPA
- Banco de Dados: H2
- Postman (Teste de endpoints)
- Swagger (Documentação)
-------------------------------------------------------------------------------------------------------------------------  
## Técnicas
- Consultas SQL personalizadas com JPQL para melhorar a performance, evitando o problema N+1
- Busca pagina e tratamento de Query Params
- Padrão Controller-Service-Repository com DTO
-------------------------------------------------------------------------------------------------------------------------
## End Points da API
``GET/sales/{id}`` : Busca venda por id

``GET/report`` : Busca Paginada de todas as vendas realizadas nos últimos 12 meses

``GET/report?minDate=&maxDate=&name=`` : Busca Paginada de todas as vendas com filtros

``GET/summary`` : Busca o total vendido por vendedor nos últimos 12 meses

``GET/summary?minDate=&maxDate=`` : Busca o total vendido por vendedor com filtros

Para mais detalhes e testes:

- Link Swagger: http://localhost:8081/swagger-ui/index.html#/

## Algumas imagens do código
