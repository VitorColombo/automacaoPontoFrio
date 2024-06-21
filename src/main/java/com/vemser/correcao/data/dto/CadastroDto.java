package com.vemser.correcao.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CadastroDto {
    private String cpf;
    private String nomeCompleto;
    private String celular;
    private String dataNascimento;
    private String email;
    private String senha;
}