public static void main(String[] args) {
    Hospital hospital = new Hospital();

    //Si se usa el dispositivo donado y se mide la informacion en lbs y ft
    DispositivoImperial dispositivoImperial = new DispositivoImperial();
    dispositivoImperial.setAlturaP(5.6);
    dispositivoImperial.setPesoLb(155);

    Calculadora imperialAdapter = new ImperialAdapter(dispositivoImperial);
    System.out.println("Altura en pies de Paciente: " + dispositivoImperial.getAlturaP()+ " \nPeso en libras de Paciente: " + dispositivoImperial.getPesoLb());
    hospital.informacionPaciente(imperialAdapter);

    System.out.println("------------------------------------------------------------------------------------\n");
    //Si se usa el dispositivo actual y se mide la informacion en kg y mt
    DispositivoInternacional dispositivoInternacional = new DispositivoInternacional();
    dispositivoInternacional.setAlturaM(1.86);
    dispositivoInternacional.setPesoKg(110);

    Calculadora internacional = new CalculadoraInternacional(dispositivoInternacional);
    System.out.println("Altura en metros de Paciente: " + dispositivoInternacional.getAlturaM()+ " \nPeso en kg de Paciente: " + dispositivoInternacional.getPesoKg());
    hospital.informacionPaciente(internacional);

}