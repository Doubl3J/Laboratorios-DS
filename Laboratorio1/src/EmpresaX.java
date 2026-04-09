import java.util.ArrayList;
import java.util.List;

public class EmpresaX {
    private List<Empleado> empleados;
    private List<Departamento> departamentos;

    public EmpresaX(){
        this.empleados = new ArrayList<Empleado>();
        this.departamentos = new ArrayList<Departamento>();
        setTest();
    }

    public void setEmpleados(Empleado e){
        this.empleados.add(e);
    }

    public void setDepartamentos(Departamento d){
        this.departamentos.add(d);
    }

    private void setTest(){
        this.empleados.add(new Empleado("John",111,"Smith",22));
        this.departamentos.add(new Departamento("IT",3201));
    }

    public void test(){
        Empleado e = empleados.getFirst();
        Departamento d = departamentos.getFirst();

        d.CrearConfiguracionSistema();
        e.verConfiguracionSistema();

        ConfiguracionSistema cs1 = e.getConfiguracionSistema();
        ConfiguracionSistema cs2 = d.getConfig();

        System.out.print("cs1 == cs2: ");
        System.out.print(cs1 == cs2);
    }
}
