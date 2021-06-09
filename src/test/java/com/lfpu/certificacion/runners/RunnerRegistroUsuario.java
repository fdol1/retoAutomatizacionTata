package com.lfpu.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/RegistrarUsuario.feature",
        tags = {"@RegistroDeUsuario"},
        glue ="com.lfpu.certificacion.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerRegistroUsuario {
}
