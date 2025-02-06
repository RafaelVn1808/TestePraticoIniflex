package entidades;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String Nome;
    private LocalDate nascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate nascimento) {
        Nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public int getIdade() {
        return Period.between(this.nascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + Nome + ", Data de Nascimento: " + nascimento.format(formatter);
    }
}
