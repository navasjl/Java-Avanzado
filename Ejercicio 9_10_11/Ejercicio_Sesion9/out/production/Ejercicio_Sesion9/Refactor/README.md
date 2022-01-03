Ejercicio Sesiones 9,10,11

1. Aplica a uno de los proyectos anteriores un patrón de comportamiento de los vistos durante la sesión 9 y
explica por qué has escogido ese patrón en concreto.
    
    Viendo los proyectos anteriores, me he decidido por aplicar el patrón Iterator porque que creo que es muy
    versátil y creo que se puede aplicar a casi todo tipo de clases y proyectos. En el paquete Iterator pondré
    las clases e interfaces de la sesión 5 de Java Básico(Coche, CocheCRUD, CocheCRUDImplm y Main) y crearé una
    interfaz CocheIterator, y una clase que recorre todas las instancias de tipo Coche, llamada Coches. 
   
    A su vez, para simplificar convertiré las clase CocheCRUDImpl y la clase Coches en una sola clase, llamada
    Coches, que implementara las interfaces CocheCRUD(que antes implementaba CocheCRUDImpl) y CocheIterator.
    Luego tendremos las clases Coche, Coches y Main, y las interfaces CocheIterator y CocheCRUDImpl.
    
    Es un poco redundante, porque los metodos de CocheCRUD son para crear, actualizar y borrar Coches y son muy
    parecidos a los del iterador, pero pra que se vea bien el ejercicio los he dejado tal como estaban.
    


3. Aplica refactoring a cualquiera de los proyectos que se han ido tratando en el curso y recuerda hacerte valer
de las técnicas vistas en clase, incluiods los patrone de diseño.

    En el paquete Refactor, aplico las refactorizaciones

    a)El paquete JBSession4 hace referencia al ejercicio de la sesión 4 de Java Básico. Las refactorizaciones 
      son:
   
         * Incluir la clase SmartDeviceBuilder, SmartPhoneBuilder, SmartWatchBuilder para construir todo tipo
         de Smart Devices, Smart Phones y SmartWatches
         * Eliminar los constructores super largos en la clase Main y build los objetos con patrón Builder.
         
         Tengo una pregunta. ¿Sería mejor hacer un solo Builder en vez de 3? Lo he hecho pero es una clase
         mostruosa, creo que no refactoriza.
         Tengo otra pregunta.¿Sería buena idea que SmartPhoneBuilder y SmartWatchBuilder heredaran de
         SmartDeviceBuilder del mismo modo que SmartPhone y SmartWatch lo hacen de SmartDevice? Lo he intentado
         pero tengo que llamar al constructor padre(con super, por cierto me da error y no lo pude solucionar)
         y crear otra vez constructores largos, creo que tampoco tiene sentido para refactorizar.

   b)El paquete JBSession7_8_9 se refiere a todos lo ejercicios de las sesiones 7,8 y 9. En mi caso construí en
     su momento un main, que con un gigantesco switch llamaba a cada ejercicio(del 1 al 9) y una sola clase,
      llamada Funciones que implementaba todos los metodos de cada ejercicio. Ahora voy a optimizar el Main,
      reduciré las líneas de código de los bucles e intentaré hacer programación funcional. Eliminaré el switch
      y crearé una clase por cada ejercicio y las instanciaré con los respectivos objetos que crearé en el main.