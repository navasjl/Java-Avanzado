Ejercicio 1:

Crea una pequeña apliacación implementando el patrón Singlenton y demuestra que, efectivamente no crea 
instancias nuevas

Ejercicio 2:

Identifica las características principales de los patrones de diseño más conocidos. indica para qué valen y
un caso de uso para cada uno de ellos.

**Respuesta del Ejercicio2 aquí abajo**

-Singlenton. 

    Se crea una clase que tiene una instancia única (en ejemplo del ejercicio1 es la clase Sol).
    No se crean instancias nuevas porque queremos que esa clase sea única como puede ser que haya una sola
    aplicación, un solo sistema o una base de datos con la que trabajemos, por ejemplo.
    Ahorra memoria porque no tenemos que reservarla para todas las instancias de la clase, solo hay una.

-Factory

    Crea una jerarquía de clases y utiliza todas esas clases de manera transparente. 
    Cada clase implementa la misma interfaz y usa el/los mismo/s método/s pero devuelven un valor diferente 
    y la clase Factory, a través de un atributo del tipo de la Interfaz, llamará al método correspondiente
    de cada clase en función de un valor que las distingue.
    Por ejemplo, un traductor que para cada palabra que haya en la interfaz, dependiendo del idioma (que puede
    ser el atributo que las distingue) llamara al metodo traducir de la clase correspondiente

-Builder

    Construye objetos complejos en vez de crear una clase con todos los tipos y posibilidades diferentes. 
    Por ejemplo, si tienes la clase Ejercicio con su enunciado y respuesta. Puedes crear un Builder que
    creara nuevos enunciados y nuevas respuestas para diferentes tipos de ejercicios de esa clase

-Prototype

    Sirve para copiar objetos no solo la referencia. Puedes copiar objetos (sin crear uno nuevo) con las
    mismas priopiedades, mismos métodos e incluso los mismos valores.
    Ahoora código porque si quieres crear 100 objetos nuevos de la misma clase y asignarles 10 atributos
    a cada uno, son más de 1000 líneas de código. Sin embargo, creando un objeto y haciendo las 100 clonaciones
    tendrías solo 100 líneas. 
    Un caso de uso podriá ser si necesitas 2 matrices enormes con los mismos elementos. Una vez hayas introducido
    los datos de la primera, solo tendrás que clonar la segunda.

-Decorator

    Añade funcionalidad a un clase que ya existe sin modifiacr esa clase. De esta forma, si creamos nuevas
    clases que necesitan esa funcionalidad pero además aportan nuevas características, podremos usar el patrón
    Decorator para poder usar cualquiera de las clases de manera individual o cualquier combinación de ellas
    y sus funcionalidades.
    Si tenemos una base de datos con productos tecnológicos y queremos añadirle los nuevos productos que van
    saliendo en el mercado, podremos añdirlos a su categoría con sus nuevas propiedades pero podremos añadirle
    otras que ya existen en otros componentes de la base de datos. Así, por ejemplo, si tengo un nuevo portátil
    con pantalla OLED podré añadirle la funcionalidad del procesador, Ram,... que quiera, a través de llamadas
    al Decorador(clase padre que extiende a todas las clases nuevas que se quieren incorporar en base de datos)
    
-Adapter

    Permite que clases con una misma implementación y otras clases con distinta implemementación, funcionen
    de manera coherente,adaptando los métodos de las clases que implememntan cierta interfaz con los métodos
    de otras clases que no la implementan.
    Había antes PC´s que solo podin recibir datos externos de disquettes, cd... Si había un dispositivo
    que podía obtener datos a través de USB no funcionaría de la misma forma. Pero con Adapter puedes
    sincronizar y adaptar esas funciones para que introduzacn datos en el PC aunque de forma relativamente
    distinta.

-Facade

    Simplifica la complejidad del código que hay por detrás.
    Un caso de uso sería cualquier entorno de desarrollo de programación que a través de ventanas, botones...
    ocultan todo el código que cada uno de esos objetos lleva

    
    