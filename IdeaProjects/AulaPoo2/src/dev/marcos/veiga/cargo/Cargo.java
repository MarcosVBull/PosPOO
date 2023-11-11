package dev.marcos.veiga.cargo;
public class Cargo {
    private String nomeCargo;
    private String departamento;
    private double salarioBase;

    public void cadastrarCargo(String nomeCargo, String departamento, double salarioBase){
        this.nomeCargo = nomeCargo;
        this.departamento = departamento;
        this.salarioBase = salarioBase;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
