
class Desconto {
    public double calcularDesconto(double valor, String tipo) {
        if (tipo.equals("ClienteRegular")) {
            return valor * 0.1; 
        } else if (tipo.equals("ClienteVIP")) {
            return valor * 0.2; 
        }
        return 0;
    }
}
