package org.soulcodeacademy.helpr.domain.dto;


public class ClienteDTO extends UsuarioDTO{
    private String telefone;
    private Integer idCliente;

    public Integer getIdCliente() {return idCliente;}
    public String getTelefone() { return telefone; }
}
