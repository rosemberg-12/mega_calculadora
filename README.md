Megacalculadora binaria

la calculadora binaria es una calculadora que permite realizar va REST, operaciones de suma y resta de manera decimal y binaria, estas operaciones se hacen por POST, recibiendo cada endpoint un Json con la siguiente estructura:

{
	"numero1":"5",
	"numero2":"3"
}

y se obtiene de vuelta una respuesta Json con el siguiente formato

{
    "resultado": "2"
}

El formato de los endpoint los cuales estan expuestos usando el puerto 8085 son: 

http://xxxxx:8085/api/sumar/decimal
http://xxxxx:8085/api/restar/decimal
http://xxxxx:8085/api/sumar/binario
http://xxxxx:8085/api/restar/binario

Adicionalmente, cada operacion realizada queda almacenada en una base de datos en memoria, y este historial se puede ver mediante el endpoint el cual se accede con el metodo GET:

http://xxxxx:8085/api/historial

el cual muestra el historailente de las operaciones en el siguiente formato

{
    "operaciones": []
}

actualmente la funcionalidad de las operaciones binarias no se encuentra realizada, se tiene que modificar el proyecto con el fin de hacer que funcione, solo se deben hacer los cambios minimos para que el endpoint de sumar binario y restar binario funcione, acorde a la estructura planteada en el proyecto.

el proyecto está desarrollado en Java, usando un servidor web embebido y una implementacion de Jax-rs (Jersey) para la administracion de los REST services, y una persistencia con una base de datos local H2 administrada desde codigo por Hubernate, se debe analizar toda la estructura del proyecto para hacer los cambios pertinentes y que quede funcionando.

el proyecto es gestionado por Gradle, asi que no necesaariamente se tiene que usar un IDE para llevar a cambio estos cambios aunque se recomienda IntelliJ o Eclipse.

de quererse ejecutar la aplicacion se puede hacer con el mismo gradle wrapper que viene dentro del proyecto ejecutando estos comandos desde la raiz del proyecto:

./gradlew  
./gradlew build 
./gradlew run 

asi que si se quiere, solo se modifican directamente los archivos Java necesarios y con los comandos anteriores pueden correr la aplicacion para probarla