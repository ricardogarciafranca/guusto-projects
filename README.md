# Guusto

Merchants API

## Docker Compose

Este comando, irá empacotar o projeto, subir o banco de dados, pré-carregar informações na base, em seguida rodar o projeto.

```bash
docker-compose up --build
```

## Swagger

Todas as Api's podem ser vistas e simuladas neste endereço

```bash
http://localhost:8080/swagger-ui.html
```

## Spring Secutiry

Acesso default spring-security, usuario e senha gerados automaticamente. Senha pode ser vista no console da aplicação,é alterada em todo boot. Usuário sempre permanecerá o mesmo, {user}.

```bash
User= user, Password = Show in console "Using generated security password: ***"
```

## Front End

```python
/guusto-app -> npm install
/guusto-app -> npm start
http://localhost:4200/
```

## Tecnologias utilizadas

```python
Linguagem:  
  Java
  
Frameworks:
  SpringBoot,
  SpringData JPA
  SpringTest
  SpringSecurity
  SpringWeb
  
Base de dados:
  Postgres

Devops:
  Docker
  DockerCompose

FrontEnd: 
  Angular
```



