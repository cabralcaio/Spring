package org.soulcodeacademy.helpr.domain;

import javax.persistence.*;

//transformar a classe em uma entidade/tabela no banco
@Entity
public class Cargo { // nome da tabela = cargo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // faz o Auto_INCREMENT do MySQL
    private Integer idCargo;// Por conta do @Id será a chave primária
    @Column(nullable = false, length = 50) // NOT NULL e limite de 50 chars
    private String nome;
    @Column(nullable = false, length = 120)
    private String descricao;
    @Column(nullable = false)
    private Double salario;

    public Cargo() {} // construtor usado pela ORM para gerar os dados

    public Cargo(Integer idCargo, String nome, String descricao, Double salario) {
        this.idCargo = idCargo;
        this.nome = nome;
        this.descricao = descricao;
        this.salario = salario;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
