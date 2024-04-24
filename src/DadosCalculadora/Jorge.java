package DadosCalculadora;

public class Jorge {
    private int valor1;
    private int valor2;
    private int calcular;

    public Jorge(int valor1, int valor2, int calcular) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.calcular = calcular;
    }

    public int calcular(int valor1, int valor2) {
        int resultado = valor1 + valor2;
        return this.calcular = resultado;
    }
    public int subtracao(int valor1, int valor2) {
        int resultado = valor1 - valor2;
        return this.calcular = resultado;
    }
}
