public class CalculadoraInternacional implements Calculadora{
    private DispositivoInternacional dispositivo;

    public CalculadoraInternacional(DispositivoInternacional dispositivo){
        this.dispositivo = dispositivo;
    }

    @Override
    public String IMCcalculate() {
        return (RangoSalud(dispositivo.getAlturaM(), dispositivo.getPesoKg()));
    }

    public String RangoSalud(double alturaM, double pesoKg){
        double imc = pesoKg / Math.pow(alturaM,2);
        if (imc < 18.5 ){
            return "Bajo peso";
        }
        else if (imc >= 30 ){
            return "Sobrepeso";
        }
        return "Normal";
    }

}
