public class Empleado {
    private String nombre;
    private int empleadoID;
    private String apellido;
    private int edad;

    public Empleado(String n,int e_id,String a,int e){
        this.nombre =n;
        this.empleadoID =e_id;
        this.apellido =a;
        this.edad =e;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
    public int getEmpleadoID() {
        return empleadoID;
    }
    public void setEmpleadoID(int EmpleadoID) {
        this.empleadoID = EmpleadoID;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int Edad) {
        this.edad = Edad;
    }

    public void verConfiguracionSistema(){
        ConfiguracionSistema cs = ConfiguracionSistema.getInstancia();
        System.out.println("Puerto del Servidor: " + cs.getPuertoServidor());
        System.out.println("Url de Base de datos: " + cs.getUrlBase());
        System.out.println("Tiempo de timeout: " + cs.getTiempoTimeout());
    }

    public ConfiguracionSistema getConfiguracionSistema(){
        return ConfiguracionSistema.getInstancia();
    }
}
