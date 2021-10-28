# Taller-SOLID
Analisis del codigo a partir de los principios SOLID

Single Responsability(Cada clase deberia tener una sola responsabilidad)
Open-Closed (que no se modifique codigo existente cada vez que se quiere añadir una nueva funcionalidad, codigo que no se tenga que cambiar cuando se requiere un cambio en los requerimientos, ejemplo herencia y polimorfismo)
Liskov Substitution (Toda clase que es hija de otra clase, debe poder utilizarse como la clase padre. las clases padre e hijo tienen interfaces de los metodos que quieren implementar)
Interface Segregation(Interfaces que se orientan o enfocan en un comportamiento, es mejor tener muchas clases pequeñas y especializadas que una clase enorme)
Dependency inversion(Los modulos de alto nivel no depende de los modulos de bajo nivel, sino de interfaces, ejm no depender de la base de datos)


En las clases Helado y Pastel se esta violando el principio Open-Closed ya que ambas clases tienen atributos y comportamientos iguales. Las clases no deberian realizar comportamientos que se repiten en otra clase sino que estos deberian heredarse de una sola clase para que los cambios que se realicen en un futuro se modifiquen en una sola clase y no en ambas, haciendo el codigo mas facil de entender. Se creo una super clase llamada Postre donde estaban los comportamientos y atributos repetidos.

La clase OperacionesAderezo no es necesaria, viola el principio de Single Responsability ya que al tener 4 metodos no se concentraba en una sola funcionalidad. Al eliminarse esta clase y agregarse sus metodos a la clase Postre, estamos arreglando el problema ya que esta es la unica clase que deberia tomar esta responsabilidad. 

Los metodos calcularPrecioFinal y showPrecioFinal estan en clases que tienen otras responsabilidades, por lo que al eliminar estos metodos de esta clase e implementarlos en otra clase llamada ManejadorDePrecio, se esta cumpliendo el principio de Single Responsability ya que cada clase se ocupa de su propia responsabilidad. Ademas se cumple el metodo Open-Close ya que al querer añadir una nueva forma de calcular solo se modifica la clase que maneja los precios.


 Al convertir la clase Aderezo a una clase Abstracta e implementar un metodo abstracto en esta clase, cada tipo de Aderezo (subclases) la heredara. Se realiza este tipo de cambio ya que se necesita que cada tipo de aderezo pueda implementar su propio nombre.Así, se cumple con el principio Open-closed el cual nos dice que cuando necesitamos cambiar un requerimiento el codigo existente no cambia.
 
En la clase ManejadorDeLeche, se cambio el metodo cambiarTipoLeche para que solo reciba el postre y el comportamiento asigne que tipo de leche usar segun el postre. Ademas, en cada tipo de leche se requiere implementar todos los metodos de su clase Padre LecheEntera, para poder asignar correctamente a que tipo de postre le ponemos la leche. Estos cambios nos permiten evitar los problemas que conlleva ignorar el principio Liskov Substitution. En el metodo usarPastel de la clase LecheDeslactosada ocurria una excepcion, metodo que viola este principio ya que al tira un error el sistema se comportara de manera diferente, se soluciona al hacer que el sistema de un Warning al usuario.


  
  

