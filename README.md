🍕 ERP Pizzeria
API REST para la gestión de una pizzería con servicio de take away y delivery, desarrollada con Spring Boot y PostgreSQL.

🛠️ Tecnologías

Java 26
Spring Boot 3.x
Spring Data JPA
PostgreSQL
Maven

📁 Estructura del proyecto
com.pizzeria.erp_pizzeria
    ├── controller      # Recibe las peticiones HTTP
    ├── service         # Lógica de negocio
    ├── repository      # Acceso a base de datos
    ├── model           # Entidades JPA
    └── ErpPizzeriaApplication.java

🚀 Cómo ejecutar el proyecto
Requisitos

Java 21+
PostgreSQL
Maven

Configuración de la base de datos
Crea una base de datos en PostgreSQL:
sqlCREATE DATABASE restaurante;
Configura las credenciales en src/main/resources/application.properties:
propertiesspring.datasource.url=jdbc:postgresql://localhost:5432/restaurante
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Ejecutar
bashmvn spring-boot:run
La API estará disponible en http://localhost:8080

📡 Endpoints
Productos
MétodoEndpointDescripciónGET/productosListar todos los productosGET/productos/{id}Buscar producto por idPOST/productosCrear nuevo productoPUT/productos/{id}Actualizar productoDELETE/productos/{id}Eliminar producto

Ejemplo de petición POST
json{
    "nombre": "Pizza Pepperoni",
    "precio": 9.99
}
📚 Aprendizaje
Este proyecto forma parte de mi roadmap de aprendizaje hacia el desarrollo backend con Java y Spring Boot:

✅ POO — clases, herencia, interfaces, polimorfismo
✅ Java moderno — Streams, lambdas, Optional
✅ Maven y gestión de dependencias
✅ JUnit y tests
✅ Patrones de diseño — DAO, Factory
✅ SQL y PostgreSQL
✅ Spring Boot — API REST
✅ Spring Data JPA
⬜ Spring Security
⬜ JavaFX — interfaz TPV
⬜ Docker

👨‍💻 Autor
Joaquin Bertuzzi — DAM (Desarrollo de Aplicaciones Multiplataforma)
