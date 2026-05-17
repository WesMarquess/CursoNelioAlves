package POO.Ex017;

import POO.Ex017.enums.Senioridade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Empregado {

    private String nome;
    private Double salarioBase;
    private Senioridade senoridade;
    private Departamento departamento;
    private List<ContratoPorHora> contratos = new ArrayList<>();

    public Empregado() {

    }

    public Empregado(String nome, Double salarioBase, Senioridade senoridade, Departamento departamento) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.senoridade = senoridade;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Senioridade getSenoridade() {
        return senoridade;
    }

    public void setSenoridade(Senioridade senoridade) {
        this.senoridade = senoridade;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoPorHora> getContratos() {
        return contratos;
    }

    public void adicionarContrato(ContratoPorHora contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(ContratoPorHora contrato) {
        contratos.remove(contrato);
    }

    public double salarioAReceber(int ano, int mes) {

        double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();

        for (ContratoPorHora contratos : contratos) {
            calendario.setTime(contratos.getData());

            /*Pega a data do de um contrato e verifica se é o mesmo passado na função, se for
              Soma os valores para que seja possível calcular o valor total a ser pago neste mês*/

            int ano_contrato = calendario.get(Calendar.YEAR);
            int mes_contrato = 1 + calendario.get(Calendar.MONTH);
            if (ano_contrato == ano && mes_contrato == mes) {
                soma += contratos.valorTotal();
            }
        }
        return soma;
    }
}
