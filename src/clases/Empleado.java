package vistas;


public class Empleado {

    private int dni;
    private String nombre, apellido, categoria;
    private double sueldo;
    Empresa empresa;

    public Empleado(int dni, String nombre, String apellido, String categoria, double sueldo, Empresa empresa) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "DNI: " + dni
                + ", Nombre: " + nombre
                + ", Apellido: " + apellido
                + ", Categoría: " + categoria
                + ", Sueldo: " + sueldo;
    }

}
