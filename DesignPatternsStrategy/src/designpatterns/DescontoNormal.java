package designpatterns;

public class DescontoNormal implements DescontoStrategy {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.05;
    }
}