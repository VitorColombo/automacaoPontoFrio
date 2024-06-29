package com.vemser.correcao.page;

import com.vemser.correcao.data.dto.CadastroDto;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class CadastroPage extends BasePage{
    private static final By nameInput = By.cssSelector("#name-input");
    private static final By celularInput = By.cssSelector("#phone-input");
    private static final By dataNascInput = By.cssSelector("#date-input");
    private static final By generoSeletor = By.cssSelector("#__next > main > section > form > fieldset:nth-child(6) > div > fieldset.css-7zhfhb > label > span.css-1g0g2r3");
    private static final By emailInput = By.cssSelector("#email-input");
    private static final By confirmaEmailInput = By.cssSelector("#email-confirmation-input");
    private static final By senhaInput = By.cssSelector("#password-input");
    private static final By confirmaSenhaInput = By.cssSelector("#password-confirmation-input");
    private static final By estouCienteSeletor = By.cssSelector("#__next > main > section > form > fieldset:nth-child(17) > label > div");
    private static final By finalizarCadastroBtn = By.cssSelector("#__next > main > section > form > button");
    private static final By estouCienteXPath = By.xpath("//*[@id=\"__next\"]/main/section/form/fieldset[14]/label/span[1]");


    public void preencherFormulario(CadastroDto dados) {
        preencherInput(nameInput, dados.getNomeCompleto());
        preencherInput(dataNascInput, dados.getDataNascimento());
        clicar(celularInput);
        preencherInput(celularInput, dados.getCelular());
        clicar(generoSeletor);
        preencherInput(emailInput, dados.getEmail());
        preencherInput(confirmaEmailInput, dados.getEmail());
        preencherInput(senhaInput, dados.getSenha()+"1Eu!");
        preencherInput(confirmaSenhaInput, dados.getSenha()+"1Eu!");
        clicar(estouCienteXPath);
    }

    public void avancarPagina(){
        clicar(finalizarCadastroBtn);
    }
}

