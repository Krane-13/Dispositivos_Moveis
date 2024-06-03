public class ex5 {
    public static void main(String[] args) {
        int salario = 1200;
        int c1=200;
        int c2=120;
        float multa = 0.02f;

        float c1Multa=c1*multa;
        float c2Multa=c2*multa;
        float cTotal = (c1+c1Multa) + (c2+c2Multa);

        System.out.println("Restara do salário de Joao R$"+(salario-cTotal));
    }
}
