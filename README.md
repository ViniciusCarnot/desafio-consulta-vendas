# Desafio: CONSULTA DE VENDAS
Desafio 4 do curso Java Spring Professional da Dev Superior. O projeto se trata de um sistema de vendas (Sale) e vendedores (Seller). Cada venda está para um vendedor, e um 
vendedor pode ter várias vendas.

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
- Intellij IDE
-------------------------------------------------------------------------------------------------------------------------  
## Técnicas
- Consultas SQL personalizadas com JPQL para melhorar a performance, evitando o problema N+1
- Busca pagina e tratamento de Query Params
- Padrão Controller-Service-Repository e uso de DTO
-------------------------------------------------------------------------------------------------------------------------
## Modelo Relacional
<img width="798" height="200" alt="Image" src="https://github.com/user-attachments/assets/73ff2f70-44ba-4dd1-ad41-0a597b6838e4" />

-------------------------------------------------------------------------------------------------------------------------

## End Points pré-estabelecidos do desafio
``GET/sales/{id}`` : Busca venda por id

``GET /sales/report`` : Busca Paginada de todas as vendas realizadas nos últimos 12 meses

``GET sales/report?minDate=&maxDate=&name=`` : Busca Paginada de todas as vendas do período/vendedor informados

``GET /sales/summary `` : Busca o total vendido por vendedor nos últimos 12 meses

``GET /sales/summary?minDate=&maxDate=`` : Busca o total vendido por vendedor no período informado

Para mais detalhes e testes:

- Link Swagger: http://localhost:8081/swagger-ui/index.html#/

-------------------------------------------------------------------------------------------------------------------------

## Algumas imagens do código
### Interface 'SaleRepository', com consultas otimizadas ao banco de dados
<img width="2560" height="1080" alt="Image" src="https://github.com/user-attachments/assets/6625423a-5d26-4624-868c-f381e4214095" />

--------------------------------------------------------------------------------------------------------------------------------------

### Classe 'SaleService', com as regras de negócio
<img width="2560" height="1080" alt="Image" src="https://github.com/user-attachments/assets/f639f590-8604-4173-904a-7bce34595c6d" />

--------------------------------------------------------------------------------------------------------------------------------------

### Classe 'SaleController', trata as requisições
<img width="2560" height="1080" alt="Image" src="https://github.com/user-attachments/assets/01eb0f7f-a257-405f-afc7-bb3003fc0cc1" />

--------------------------------------------------------------------------------------------------------------------------------------

### Classe 'SaleMinDTO'
<img width="2560" height="1080" alt="Image" src="https://github.com/user-attachments/assets/06c73b7e-3fd5-4b81-8112-0c79a3c33dc6" />

--------------------------------------------------------------------------------------------------------------------------------------

### Classe 'SaleReportDTO'
<img width="2560" height="1080" alt="Image" src="https://github.com/user-attachments/assets/9c7c64b5-bd9d-474e-96a3-221f170f2488" />

--------------------------------------------------------------------------------------------------------------------------------------

### Classe 'SaleSummaryDTO'
<img width="2560" height="1080" alt="Image" src="https://github.com/user-attachments/assets/1ff64d36-8f82-4526-8ebd-9024f779bf58" />

--------------------------------------------------------------------------------------------------------------------------------------

### Classe Sale
<img width="2560" height="1080" alt="Image" src="https://github.com/user-attachments/assets/7153044f-b0de-4570-9b7d-0f0aa5b2fb7f" />

--------------------------------------------------------------------------------------------------------------------------------------

### Classe Seller
<img width="2560" height="1080" alt="Image" src="https://github.com/user-attachments/assets/206f31ed-2f58-413a-a466-62ad1238b931" />

--------------------------------------------------------------------------------------------------------------------------------------

### Seed do banco de dados
<img width="2560" height="1080" alt="Image" src="https://github.com/user-attachments/assets/ffcd2b0a-c983-4296-8d0c-2667c7a083cd" />

--------------------------------------------------------------------------------------------------------------------------------------

### Consulta otimizada, evitando problema N+1 consultas
<img width="2560" height="1080" alt="Image" src="https://github.com/user-attachments/assets/b5a0d601-f841-4a46-9e19-7e35a87947c4" />

--------------------------------------------------------------------------------------------------------------------------------------
