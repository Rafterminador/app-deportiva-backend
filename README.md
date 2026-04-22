# APP-DEPORTIVA-BACKEND
App deportiva backend contiene la logica para consumir una api deportiva

## Arquitectura

El proyecto está diseñado bajo una arquitectura **monolito modular**, donde cada dominio de negocio (usuarios, productos, carrito de compras) está separado en su propio módulo con controllers, servicios y repositorios independientes.

Esta estructura está pensada para escalar a una arquitectura de **microservicios reales** en el futuro (con API Gateway, Service Discovery y despliegue independiente por servicio), pero por el alcance actual de la prueba técnica se implementa como un único proyecto Spring Boot para simplificar el desarrollo, la configuración y el despliegue.

## Módulos

- **Usuarios** — Registro, login con JWT y gestión de perfil
- **Productos** — Catálogo de productos deportivos
- **Carrito de compras** — Gestión de pedidos
