package designpatterns;

public class Main {

    public static void main(String[] args) {

        double valorCompra = 100.00;

        DescontoStrategy descontoNormal = new DescontoNormal();
        DescontoStrategy descontoEstudante = new DescontoEstudante();
        DescontoStrategy descontoEspecial = new DescontoEspecial();

        System.out.println("Valor da compra: R$ " + valorCompra);

        System.out.println("Desconto normal: R$ "
                + descontoNormal.calcularDesconto(valorCompra));

        System.out.println("Desconto estudante: R$ "
                + descontoEstudante.calcularDesconto(valorCompra));

        System.out.println("Desconto especial: R$ "
                + descontoEspecial.calcularDesconto(valorCompra));
    }
}