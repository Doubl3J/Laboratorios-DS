public class Hospital {
    public void informacionPaciente(Calculadora calculadora){
        String resultado = calculadora.IMCcalculate();
        System.out.println("BMI de paciente indica que es: "+ resultado);
    };
}
