package org.soulcodeacademy.helpr.domain.dto;


import javax.validation.constraints.NotBlank;

public class ClienteDTO extends UsuarioDTO{
    @NotBlank( message = "Telefone é obrigatorio")
    private String telefone;
    private Integer idCliente;

    public Integer getIdCliente() {return idCliente;}
    public String getTelefone() { return telefone; }
}
