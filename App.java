package com.example;

public class App 
{
    public static void main( String[] args )
    {
        // Departamento[] departamento = new Departamento[10];
        // Funcionario[] funcionario = new Funcionario[100];

        // 1 - Cria uma empresa 
        Empresa empresa = new Empresa("PetHouse", "123.456.0001-89");

        // 2 - Adicione a essa empresa um departamento

        Departamento dep1 = new Departamento("Banho e Tosa");
        Departamento dep2 = new Departamento("Treinamento");

        empresa.setDepartamento(dep1);

        // 3 - Adicione aos departamento alguns funcionários

        Funcionario funcionario = new Funcionario("Laíz", 1000.00f, "12/03/1985"); 
        Funcionario funcionario2 = new Funcionario("Patricia", 800.00f, "12/03/1985");
        Funcionario funcionario3 = new Funcionario("Lucas", 1500.00f, "02/03/2000");

        dep1.setFuncionario(funcionario);
        dep1.setFuncionario(funcionario3);

        dep2.setFuncionario(funcionario2);
        

        // 4 - Dê um aumento de 10% a todos funcionários de determinado departamento

        funcionario.setSalario(1000.00f);
        funcionario.getSalario();
        //System.out.println(funcionario.setSalario(1000.00f));
        System.out.println("Salário Com Reajuste: " + funcionario.getSalario());


        // 5 - Transfira um funcionário de um departamento para outro

        dep1.removeFuncionario(funcionario3);  //remove o funcionario3 do departamento1
        dep2.addFuncionario(funcionario3); //insere o funcionario3 no departamento2


        System.out.println("\nEmpresa: ");
        System.out.println(empresa.getNome());

        System.out.println("\nFuncionários da Empresa "+ empresa.getNome()+ ":");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario3.getNome());

        System.out.println("\nDepartamentos da Empresa "+ empresa.getNome()+ "+");
        System.out.println(dep1.getNome());
        System.out.println(dep2.getNome());

        System.out.println("\nFuncionários do departamento Banho e Tosa:");
        for (Funcionario func : dep1.getFuncionario()) {
            System.out.println(func.getNome());
        }

        System.out.println("\nFuncionários do departamento treinamento:");
        for (Funcionario func : dep2.getFuncionario()) {
            System.out.println(func.getNome());
        }

    }
}
