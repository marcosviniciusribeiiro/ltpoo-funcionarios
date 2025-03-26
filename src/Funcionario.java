public class Funcionario {
    private String nome;
    private double salarioBase;
    private int horasTrabalhadas;

    public Funcionario(String nome, double salarioBase, int horasTrabalhadas){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double calcularSalarioFinal(){
        int horasNormais = 120;
        double valorHora = salarioBase / horasNormais;
        if (horasTrabalhadas > horasNormais){
            int horasExtras = horasTrabalhadas - horasNormais;
            return salarioBase + (horasExtras * valorHora * 1.5);
        }
        return salarioBase;
    }
    public void exibirDados(){
        System.out.printf("Funcionario: %s\n", nome);
        System.out.printf("Salario Base: R$%.2f\n", salarioBase);
        System.out.printf("Horas Trabalhadas: %d\n", horasTrabalhadas);
        System.out.printf("Salário Final: R$%.2f\n", calcularSalarioFinal());
        System.out.println("__________________________");
    }
}
