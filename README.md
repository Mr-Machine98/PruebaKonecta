# PRUEBA KONECTA PARA EL CARGO DE ANALISTA DE DESARROLLO JAVA
Cordial saludo, aqui hago entrega del proyecto con los requerimientos solicitados, utilice' el framework de springboot, recientemente estaba haciendo un curso de ese framework por eso en mi hoja de vida no aparecera' esa habilidad, por parte de la persistencia de datos utilice' jpa del spring, y la base de datos usada fue MySql.

- A continuacio'n el proyecto...

Como es un proyecto de springboot, la instalacion es sencilla, es solo arrancar en su entorno favorito el proyecto ya que fue creado con el springboot initializer ,por defecto usa maven, asi' que todas las dependecias vendran en el archivo .POM del proyecto, basta con hacerle cLean and build y el decargara todas las dependencias que necesitara'.

- Igualmente la configuracio'n para la conexio'n de la bd esta en el archivo application.propperties.
- el script de la copia de la base de datos vienen aqui en el repositorio con nombre **bd_konecta_prueba**

## A CONTINUACIO'N MUESTRO CON IMA'GENES EL FUNCIONAMIENTO DEL PROYECTO
-------------------------------------------------------------
> Asi' luce cuando arrancas el proyecto y lista los productos de la bd
> 
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/listarProductos.PNG)
-------------------------------------------------------------
> Cuando se agrega un nuevo producto presionando en **almacenar producto** y luego se lista en el inicio
> 
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/AgregandoProd.PNG)
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/listar2.PNG)
-------------------------------------------------------------
> Editar el producto Presionandole en **Editar Producto** nos carga el producto para modificarlo.
> 
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/modificar.PNG)
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/Listar3.PNG)
-------------------------------------------------------------
> Para eliminar el producto solo presionames en eliminar producto y se elimina el producto
> 
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/eliminar1.PNG)
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/eliminar2.PNG)
-------------------------------------------------------------
> Demos clic en un registro que no tiene stock, saldra' un msm de localhost diciendo que no hay productos y luego marcara en rojo que no hay disponibilidad
> 
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/comprarProducto.PNG)
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/ComprarProducto2.PNG)
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/comprarProducto3.PNG)
> 
> Ahora seleccionemos un registro que si tiene stock, se mostrara' de la siguiente manera, por ejemplo, escojamos el primero de la lista que tiene stock en 4 y observe como se modifica a estado 3: 
> 
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/comprarProducto4.PNG)
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/comprarProducto5.PNG)
-------------------------------------------------------------
> Cada vez que se compra se alamacena en la tabla de ventas un producto comprado:
> ![LISTAR](https://github.com/Mr-Machine98/PruebaKonecta/blob/main/registroVentas.PNG)
> 
> Estos son los querys directos a la bd para elu'ltimo punto:
> > Realizar una consulta que permita conocer cuál es el producto que más stock tiene:
> > > select nombre_producto , max(stock) as producto_con_mas_stock from productos;
> > Realizar una consulta que permita conocer cuál es el producto más vendido:
> > > SELECT producto_vendido, COUNT(*) AS veces, IF (COUNT(*)>1,"duplicado", "no duplicado") AS duplicacion FROM ventas GROUP BY producto_vendido;
