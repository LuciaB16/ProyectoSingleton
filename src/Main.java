public class Main {
    public static void main(String[] args){

        //hacemos pruebas(creamos un objeto)
    BasesDeDatos obx = BasesDeDatos.getInstance();
        //le damos valor a los atributos
        obx.setUsuario("Lucía");
        obx.setToken("A1B2");


        //hacemos otro objeto de la misma clase
    BasesDeDatos obx2 = BasesDeDatos.getInstance();

        obx2.setUsuario("Esther");
        obx2.setToken("C3D4");

}
}