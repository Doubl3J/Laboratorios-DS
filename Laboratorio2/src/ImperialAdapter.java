public class ImperialAdapter implements Calculadora{
    private DispositivoImperial d;
    private CalculadoraInternacional ci;

    public ImperialAdapter(DispositivoImperial d){
        this.d = d;
        this.ci = new CalculadoraInternacional(null);

    }

    @Override
    public String IMCcalculate(){


        double alturaP = d.getAlturaP();
        double pesoLb = d.getPesoLb();

        double alturaM = alturaP * 0.3048;
        double pesoKg = pesoLb * 0.4536;

        return ci.RangoSalud(alturaM,pesoKg);
    }
}
