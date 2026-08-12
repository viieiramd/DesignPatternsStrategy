package designpatterns;

public class DescontoEstudante implements DescontoStrategy {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.10;
    }
}