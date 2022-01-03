Ejercicios sesiones 19, 20 y 21

1. Ejercicio sesión 19. Implementa Args en uno de los proyectos que se han ido trabajando y aplica las buenas 
prácticas que se han visto en la sesión 19.

  Este ejercicio estará dentro del paquete sesion19 y contiene las clases del ejercicio de ls sesiones 15-18,
  que trataba sobre las excepciones.

  He añadido como argumentos en Args: 4 "aritmetica" "array" "fichero".
  El 4 indica el número de argumentos que se le pasa a Args. Se recorrerán con un bucle los argumentos y se
  realizarán las diferente operaciones con su respectivo tratamiento de la excepción para cada argumento en 
  Args.
    

2.Ejercicio sesión 20. Identifica las características principales de la arquitectura limpia, indica en que casos 
tendría que utilizar la arquitectura limpia y como lo harías.

  La arquitectura limpia consiste en la simplificación y la consistencia de cualquier tipo de aplicación. Del 
  mismo modo que es necesario que el diseño sea legible y fácil de entender para los desarrolladores a fin de 
  trabajar de manera más eficiente, la arquitectura requiere una coherencia de modo que sea lo más eficiente
  posible para minimizaar tiempos de producción , costes, errores por inconsistencia,etc. La arquitectura es el
  primer peldaño en cualquier proyecto o aplicación de forma que sin ésta, ningún diseño será de calidad. También
  la arquitectura limpia le da robustez a la aplicación gracias a su modelo de capas donde éstas están solo
  relacionadas con sus adyacentes, evitando dependencias en caso de errores.

  Sus capas son: de Entidades, de Casos de Uso, de Interfaces Adaptadoras y de Frameworks.

  Se aplican los principios SOLID:
 
  *S(Single Responsability Principle). Una clase tiene una sola funcionalidad. La clase Coche, por ejemplo,
   tendrá solo las propiedades de un coche(marca, modelo, motor...) y si queremos añadir ese coche a una base de
   datos, crearemos otra clase para tratar esa conexión, no lo haremos en la clase Coche

  *O(Open Close Principle).Cuando tengamos muchas clases parecidas como Coche, Moto, Camión que tengan muchos
   atributos y métodos en común, podremos abstraer la funcionalidad implementando una clase abstracta Vehiculo
   que defina los métodos comunes que cada clase implementará en su clase.De este modo en el Main solo
   tendremos que llamar a la funcion de cada clase en vez de crear un if que llame al método con diferentes
   parámetros, creando dependencia. Y si agregamos una nueva clase, implementando el respectivo método se 
   soluciona el problema sin tener que añadir más líneas de código.

  *L(Principio de sutitución de Liskov). Hay una jerarquía de clases, donde el código sería reutilizable.

  *I(Segregación de Interfaces). Una clse no implementará una interfaz que no tenga nada en común con ella. La
   clase Coche no va a imp,emntar un método obtenerUsuario.

  *D(Inversión de Dependencias). Las dependencias se abstraen mediante métodos abstractos. Por ejemplo, conexión
   a diferentes base de datos. Si me creo clases de Base de Datos(MySQL, Oracle, PostGree) que implementen la 
   misma interfaz, si luego cambio de base de datos solo tengo que instanciar la clase correspondiente



3.Teniendo en cuenta lo visto en la sesión 21, utiliza un proyecto de los trabajados y límpialo. Si encuentras código 
duplicado, elimínalo y realiza la mimificación de las clases y los métodos.

    Este ejercicio estará dentro del paquete sesion21 y es el ejercicio del reto del dia 5

    Esta funcion convierte la cadena que recibe como parametro en un ArrayList de Integer de forma que si recibe
    una cadena del tipo "[1,5,8,7,8] devuelve una ArrayList de 5 elementos donde cada elemento es el Integer que
    representa al caracter.Si no recibe una cadena de ese tipo o la cadena no es de enteros, lanzará Excepción.

    