package src.main.resources; 

# Configuração do banco H2 em memória
spring.datasource.url=jdbc:h2:mem:acervoDB
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

# Criar e popular o banco automaticamente
spring.jpa.hibernate.ddl-auto=update

# Habilitar console web do H2 para visualizar o banco
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
