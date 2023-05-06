/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo3;

/**
 *
 * @author Alberto
 */
public class ContaBancariaPJ extends ContaBancaria {
    private String empresa;

    public ContaBancariaPJ(String titular, double saldo, String empresa){
        super(titular,saldo);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
     @Override
    public String toString() {
        return "ContaBancariaPJ[ [titular= " + super.titular + ", saldo= " + super.saldo + "empresa= " + empresa + ']';
    }
}
