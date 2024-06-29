package com.vemser.correcao.data.factory;

import com.github.javafaker.Faker;
import com.vemser.correcao.data.dto.CadastroDto;
import com.vemser.correcao.util.CPFUtil;

import java.util.Locale;

public class CadastroFactory {
    private static final Faker faker = new Faker(new Locale("pt-BR"));

    public CadastroDto cadastroValido() {
        CadastroDto cadastroDto = new CadastroDto();
        cadastroDto.setNomeCompleto(faker.name().firstName() + " " + faker.name().lastName());
        cadastroDto.setCelular("51991087557");
        cadastroDto.setCpf(CPFUtil.gerarCPF());
        cadastroDto.setEmail(faker.internet().emailAddress());
        cadastroDto.setDataNascimento("20061996");
        cadastroDto.setSenha(faker.internet().password().substring(0,8));

        return cadastroDto;
    }
}