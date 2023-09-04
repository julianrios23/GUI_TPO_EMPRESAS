package vistas;


import java.util.ArrayList;

/**
 *
 * @author Julian Development
 */
public class Empresa {

    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }



    public void mostrarEmpleados() {

        for (Empleado emp : empleados) {
            System.out.println(emp);
        }
    }

    @Override
    public String toString() {
        return "Empresa{" + "razonSocial=" + razonSocial + ", cuit=" + cuit + ", empleados=" + empleados + '}';
    }

    void agregarEmpleados(Empleado empleado) {

        if (empleados == null) {
            empleados = new ArrayList<>();
        }
        empleados.add(empleado);
        System.out.println(empleado);
    }

}
