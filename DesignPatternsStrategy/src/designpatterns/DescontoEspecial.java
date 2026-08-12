package designpatterns;

public class DescontoEspecial implements DescontoStrategy {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.20;
    }
}