package com.vemser.correcao.data.factory;

import com.github.javafaker.Faker;
import com.vemser.correcao.data.dto.CadastroDto;
import com.vemser.correcao.util.CPFUtil;

import java.util.Locale;

public class CadastroFactory {
    private static final Faker faker = new Faker(new Locale("pt-BR"));

    public CadastroDto cadastroValido() {
        CadastroDto cadastroDto = new CadastroDto();
        cadastroDto.setCelular(faker.phoneNumber().cellPhone());
        cadastroDto.setCpf(CPFUtil.gerarCPF());
        cadastroDto.setEmail(faker.internet().emailAddress());
        cadastroDto.setDataNascimento(faker.date().birthday().toString());
        cadastroDto.setSenha(faker.internet().password());

        return cadastroDto;
    }
}