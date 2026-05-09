## Ejecucion

Compilar:

javac -d out $(find src -name "*.java")

Ejecutar:

java -cp out com.techlab.app.Main

# Pre-Entrega Proyecto

Sistema simple de gestión para productos y pedidos hecho en Java por consola.

## Funcionalidades

- agregar productos
- listar productos
- buscar producto por id
- actualizar precio o stock
- eliminar producto
- crear pedidos con varias lineas
- validar stock disponible
- listar pedidos realizados

## Estructura

- `com.techlab.app`: menu principal
- `com.techlab.productos`: clase `Producto`
- `com.techlab.pedidos`: clases `Pedido` y `LineaPedido`
- `com.techlab.excepciones`: excepciones personalizadas
- `com.techlab.servicios`: logica de productos y pedidos


