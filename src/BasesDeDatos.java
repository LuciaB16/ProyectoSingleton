public class BasesDeDatos {
    private String usuario;
    private String token;

    private static BasesDeDatos instance = null;

    /**
     * Bloqueo el constructor con private
     */
    private BasesDeDatos(){
    }

    public static BasesDeDatos getInstance(){
        if (instance == null){
        //puedo acceder al constructor porque estoy en la misma clase
            instance = new BasesDeDatos();
        }
        return instance;


    }

    /*public static BasesDeDatos getInstance2(){

        if (ejemplo==null){

        }
        return ejemplo;

    }
    */


    public void setUsuario(String usuario){
        this.usuario = usuario;

    }

    public String getUsuario(){
        return usuario;
    }

    public void setToken(String token){
        this.token = token;
    }

    public String getToken(){
        return token;
    }

}
