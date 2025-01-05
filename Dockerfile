# Use uma imagem base do Java
FROM openjdk:17

# Defina o diretório de trabalho dentro do container
WORKDIR /app

# Copie o arquivo JAR para o container
COPY target/BuscaCepESalva.jar app.jar

# Exponha a porta que a aplicação utiliza
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
