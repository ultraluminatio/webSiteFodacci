# --- ETAPA 1: Build da aplicação ---
FROM maven:3.9-eclipse-temurin-25 AS builder
WORKDIR /app

# Copia o arquivo de dependências e baixa-as (otimiza o cache do Docker)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia o código fonte e gera o pacote (JAR)
COPY src ./src
RUN mvn clean package -DskipTests

# --- ETAPA 2: Imagem final para execução ---
FROM eclipse-temurin:25-jre
WORKDIR /app

# Copia o JAR gerado na etapa de build
COPY --from=builder /app/target/webSiteFodacci-0-0-1.jar app.jar

# Expõe a porta que sua aplicação utiliza (ex: 8080)
EXPOSE 2048

# Executa a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]