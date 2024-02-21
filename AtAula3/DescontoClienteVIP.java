
interface EstrategiaDesconto {
    double calcularDesconto(double valor);
}

class DescontoClienteRegular implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.1; 
    }
}

class DescontoClienteVIP implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.2; 
    }
}

class CalculadoraDesconto {
    private EstrategiaDesconto estrategiaDesconto;

    public CalculadoraDesconto(EstrategiaDesconto estrategiaDesconto) {
        this.estrategiaDesconto = estrategiaDesconto;
    }

    public double calcular(double valor) {
        return estrategiaDesconto.calcularDesconto(valor);
    }
}