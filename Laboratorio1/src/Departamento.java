public class Departamento {
    private String nombreDepartamento;
    private int departamentoID;

    public Departamento(String nd, int id){
        this.nombreDepartamento =nd;
        this.departamentoID =id;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
    public void setNombreDepartamento(String NombreDepartamento) {
        this.nombreDepartamento = NombreDepartamento;
    }
    public int getDepartamentoID() {
        return departamentoID;
    }
    public void setDepartamentoID(int DepartamentoID) {
        this.departamentoID = DepartamentoID;
    }

    public void CrearConfiguracionSistema(){
        ConfiguracionSistema cs = ConfiguracionSistema.getInstancia();
        cs.setUrlBase("localhost");
        cs.setTiempoTimeout("1 minuto");
        cs.setPuertoServidor("203.0.113.2");
    }

    public ConfiguracionSistema getConfig(){
        return ConfiguracionSistema.getInstancia();
    }
}

