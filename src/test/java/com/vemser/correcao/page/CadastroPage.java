package com.vemser.correcao.page;

import com.vemser.correcao.data.dto.CadastroDto;
import com.vemser.correcao.data.factory.CadastroFactory;
import org.openqa.selenium.By;

public class CadastroPage extends BasePage{
    private static final By nameInput = By.cssSelector("#name-input");
    private static final By celularInput = By.cssSelector("#phone-input");
    private static final By dataNascInput = By.cssSelector("#date-input");
    private static final By generoSeletor = By.cssSelector("#__next > main > section > form > fieldset:nth-child(6) > div > fieldset.css-7zhfhb > label > span.css-1g0g2r3");
    private static final By emailInput = By.cssSelector("#email-input");
    private static final By confirmaEmailInput = By.cssSelector("#email-confirmation-input");
    private static final By senhaInput = By.cssSelector("#password-input");
    private static final By confirmaSenhaInput = By.cssSelector("#password-confirmation-input");
    private static final By estouCienteSeletor = By.cssSelector("#__next > main > section > form > fieldset:nth-child(17) > label > span.css-1knvv56");
    private static final By finalizarCadastroBtn = By.cssSelector("#__next > main > section > form > button");

    public void preencherFormulario(CadastroDto dados){
        preencherInput(nameInput, dados.getNomeCompleto());
        preencherInput(celularInput, dados.getNomeCompleto());
        preencherInput(dataNascInput, dados.getNomeCompleto());
        clicar(generoSeletor);
        preencherInput(emailInput, dados.getNomeCompleto());
        preencherInput(confirmaEmailInput, dados.getNomeCompleto());
        preencherInput(senhaInput, dados.getNomeCompleto());
        preencherInput(confirmaSenhaInput, dados.getNomeCompleto());
        clicar(estouCienteSeletor);
    }

    public void avancarPagina(){
        clicar(finalizarCadastroBtn);
    }
}

