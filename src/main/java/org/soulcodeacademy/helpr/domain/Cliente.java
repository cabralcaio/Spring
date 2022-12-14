package org.soulcodeacademy.helpr.domain;

import org.soulcodeacademy.helpr.domain.enums.Perfil;

import javax.persistence.Entity;

@Entity
public class Cliente extends Usuario{
    private String telefone;

    public Cliente() {}

    public Cliente (Integer idCliente, String nome, String email, String cpf, String senha, String telefone) {
        super(idCliente, nome, email, cpf, senha, Perfil.CLIENTE);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
