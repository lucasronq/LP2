
package aula1309.collections.comparables.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContaCorrente implements Comparable<ContaCorrente>{
    String codigo;
    double saldo;

    public ContaCorrente(String codigo, double saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(ContaCorrente cc) {
        if(this.saldo < cc.getSaldo())
            return -1;
        if(this.saldo > cc.getSaldo())
            return 1;
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "codigo=" + codigo + ", saldo=" + saldo + '}';
    }
    
    
    
    
}
