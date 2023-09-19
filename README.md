
# WebHotelHub: Sistema de Gestión Hotelera

WebHotelHub es un sistema de gestión hotelera diseñado para facilitar la administración de hoteles, habitaciones, reservas y clientes.

## Características

- **Gestión de Hoteles**: Permite registrar, actualizar, listar y eliminar hoteles.
- **Gestión de Habitaciones**: Administra las habitaciones de cada hotel, estableciendo tipos, precios y disponibilidad.
- **Gestión de Reservas**: Los clientes pueden reservar habitaciones disponibles y ver sus reservas pasadas y actuales.
- **Gestión de Clientes**: Registro y administración de clientes del sistema.

## Tecnologías Utilizadas

### Backend

- **Lenguaje**: Java 11
- **Framework**: Spring Boot
- **Base de Datos**: H2 (en desarrollo), PostgreSQL (en producción)

### Frontend

- **Framework**: Angular 15

## Metodología y Principios

- **Metodología de Desarrollo**: Scrum
- **Principios de Programación**: SOLID, TDD (Test-Driven Development) y BDD (Behavior-Driven Development).

## Configuración y Despliegue

### Requisitos

- Java 11
- Maven
- Node.js y Angular CLI (para el frontend)

### Pasos

1. Clonar el repositorio:
   ```bash
   git clone https://gitlab.com/uagrm1/mod5/webhotelhub.git
   ```

2. Navegar al directorio del proyecto y construir el backend:
   ```bash
   cd hotelhub
   mvn clean install
   ```

3. Ejecutar el backend:
   ```bash
   mvn spring-boot:run
   ```

4. Navegar al directorio del frontend y instalar las dependencias:
   ```bash
   cd webhotelhub
   npm install
   ```

5. Ejecutar el frontend:
   ```bash
   ng serve
   ```

6. Abrir un navegador y acceder a `http://localhost:4200` para ver la aplicación en funcionamiento.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, crea un "fork" del repositorio y solicita un "pull request" con tus cambios.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

---

Puedes tomar este ejemplo y adaptarlo según las necesidades y características específicas de tu proyecto.