public class ConfiguracionSistema {

    private static ConfiguracionSistema instance;
    private String puertoServidor;
    private String urlBase;
    private String tiempoTimeout;

    private ConfiguracionSistema(String ps,String bd,String tt){
            this.puertoServidor = ps;
            this.urlBase = bd;
            this.tiempoTimeout =tt;
    }

    public static ConfiguracionSistema getInstancia(){
       if (instance == null){
           instance = new ConfiguracionSistema("N/A","N/A","N/A");
       }
       return instance;
    }

    public String getPuertoServidor() {
        return puertoServidor;
    }

    public void setPuertoServidor(String puertoServidor) {
        this.puertoServidor = puertoServidor;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public void setUrlBase(String urlBase) {
        this.urlBase = urlBase;
    }

    public String getTiempoTimeout() {
        return tiempoTimeout;
    }

    public void setTiempoTimeout(String tiempoTimeout) {
        this.tiempoTimeout = tiempoTimeout;
    }
}
