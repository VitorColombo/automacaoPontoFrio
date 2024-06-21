package com.vemser.correcao.util;

import java.util.Random;

public class CPFUtil {
    public static String gerarCPF() {
        Random random = new Random();
        int[] cpf = new int[11];

        for (int i = 0; i < 9; i++) {
            cpf[i] = random.nextInt(10);
        }
        cpf[9] = calcularDigitoVerificador(cpf, 9);
        cpf[10] = calcularDigitoVerificador(cpf, 10);
        return formatarCPF(cpf);
    }

    private static int calcularDigitoVerificador(int[] cpf, int length) {
        int soma = 0;
        int peso = length + 1;

        for (int i = 0; i < length; i++) {
            soma += cpf[i] * peso--;
        }
        int digito = 11 - (soma % 11);
        return (digito > 9) ? 0 : digito;
    }

    private static String formatarCPF(int[] cpf) {
        StringBuilder cpfStr = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            cpfStr.append(cpf[i]);
            if (i == 2 || i == 5) {
                cpfStr.append('.');
            } else if (i == 8) {
                cpfStr.append('-');
            }
        }
        return cpfStr.toString();
    }
}