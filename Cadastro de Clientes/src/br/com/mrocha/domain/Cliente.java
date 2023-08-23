package br.com.mrocha.domain;

import java.util.Objects;

public class Cliente {
    private String nome;
    private Long cpf;
    private long tel;
    private String end;
    private int numero;
    private String cidade;
    private String estado;

    public Cliente(String nome, long cpf, long tel, String end, int numero, String cidade, String estado) {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf);
        this.tel = Long.valueOf(tel);
        this.end = end;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return cpf == cliente.cpf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "br.com.mrocha.domain.Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
