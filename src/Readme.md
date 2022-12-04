## PROYECTO SINGLETON
# Pasos a seguir:
1. Creamos una clase llamada BasesDeDatos.
2. Declaramos private el constructor para así no poder acceder a él desde la Main (es lo que queremos ya que así nos devuelve un objeto único).
3. Declaramos también los atributos usuario y token, a los que después les daremos valor.
4. Definimos un atributo static de tipo Singleton para que compuebe nuestro programa si es null o no. Si lo es quiere decir que nunca se instanció y por lo tanto tenemos que instanciarlo. Si no lo fuera, es que ya se creó antes, por lo que sólo lo retornamos.
5. Realizamos las pruebas en la clase Main, creando dos objetos dinstintos con el mismo método GetInstance() y dándole valores, viendo así que ambos objetos son iguales.