# quitanda api rest



#### Esse projeto utiliza:

- Maven
- Java 11
- PostgreSQL
- Hibernate
- Swagger



Start o banco com docker:

```shell script
docker run --name quitanda -d -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=@Hoje2019 -e POSTGRES_DB=loja postgres:13.2-alpine
```

- Start o projeto Maven, na sua IDE. (a persistencia de dados irá criar as tabelas no DB)



Acesse via browser:

```shell script
http://localhost:8080/swagger-ui.html/
```



Você terá uma API Rest, com todas as possibilidades CRUD,

- Adcionar
- Remover
- Consultar ( listar todos )
- Consultar ( item especifico )
- Editar / Atualizar item

