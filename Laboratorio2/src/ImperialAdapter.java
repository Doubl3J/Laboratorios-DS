public class ImperialAdapter implements Calculadora{
    private DispositivoImperial dispositivo;
    private CalculadoraInternacional calculadoraI;

    public ImperialAdapter(DispositivoImperial d){
        this.dispositivo = d;
        this.calculadoraI = new CalculadoraInternacional(null);

    }

    @Override
    public String IMCcalculate(){


        double alturaP = dispositivo.getAlturaP();
        double pesoLb = dispositivo.getPesoLb();

        double alturaM = alturaP * 0.3048;
        double pesoKg = pesoLb * 0.4536;

        return calculadoraI.RangoSalud(alturaM,pesoKg);
    }
}
