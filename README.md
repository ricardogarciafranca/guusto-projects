# guusto-projects
Guusto projects

### DOCKER COMPOSE

    docker-compose up --build
    
### SPRING-SECURITY
    
    User= user, Password = Show in console "Using generated security password: ***"

### SWAGGER 

    http://localhost:8080/swagger-ui.html

### FRONT-END
    
    /guusto-app -> npm install
    
    /guusto-app -> npm start
    
    http://localhost:4200/
    


##

Linguagem:
Java

Frameworks utilizados:
SpringBoot,
SpringData JPA
SpringTest
SpringSecurity
SpringWeb

Base de dados:
Postgres

Container:
Docker
DockerCompose

FrontEnd:
Angular

obs. Para subir o projeto, basta acessar a raiz, em guusto-projects, e executar:

docker-compose up --build, este comando, irá empacotar o projeto, subir o banco de dados, pré-carregar informações na base, em seguida rodar o projeto.

Para o frontEnd basta acessar a raiz do projeto front e rodar npm install && npm start.

Ao acessar o frontend a primeira vez, será solicitado usuário e senha: 

Usuario: user
A Senha, pode ser vista no console da aplicação, ela é alterada a cada boot.

Para visualizar todas as apis da aplicação e executá-las, independente do front, pode ser feito via swagger: http://localhost:8080/swagger-ui.html

