FROM maven:3.9-eclipse-temurin-21
WORKDIR /app
COPY . .
RUN mvn package -DskipTests -q
EXPOSE 8080
CMD ["java", "-jar", "target/NguyenNgocPhuocSang-0.0.1-SNAPSHOT.jar"]
