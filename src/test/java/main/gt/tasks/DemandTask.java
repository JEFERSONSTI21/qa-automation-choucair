package main.gt.tasks;

import core.Helpers.GeneralParams;
import core.actions.*;
import core.questions.QuestionContaints;
import core.questions.QuestionValidate;
import core.utilities.Util;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.springframework.util.StringUtils;


public class DemandTask {

    Actor actor;
    String ramdonUsernameAndPass;

    @Managed
    WebDriver navegador;

    Util util = new Util();


    @Before
    public void abrirNavegador() {
        actor = Actor.named("usuario");
        actor.can(BrowseTheWeb.with(navegador)); //Abrir navegador
        actor.has(new OpenUrlAction().Execute(new GeneralParams(
                "https://serenity.is/demo/")));
    }


    @Dado("^Que el Usuario entra al portal y ingresa usuario y clavw$")
    public void queElUsuarioEntraAlPortalYIngresaUsuarioYClavw() {
        actor.attemptsTo(new WaitElement().Execute(new GeneralParams(
                "Espera Objeto Username",
                "//input[@id='StartSharp_Membership_LoginPanel0_Username']")));
        actor.attemptsTo(new EnterTextAction("admin").Execute(new GeneralParams(
                "#actorName ingresa texto en un campo Username",
                "Campo Username",
                "//input[@id='StartSharp_Membership_LoginPanel0_Username']"
        )));
        actor.attemptsTo(new EnterTextAction("serenity").Execute(new GeneralParams(
                "#actorName ingresa texto en un campo Password",
                "Campo Password",
                "//input[@id='StartSharp_Membership_LoginPanel0_Password']"
        )));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto SignIn",
                "Usuario da click en el Objeto SignUp",
                "//*[@id='StartSharp_Membership_LoginPanel0_LoginButton']"
        )));


    }

    @Cuando("^el usuario crea una Business Unit$")
    public void elUsuarioCreaUnaBusinessUnit() {

        actor.attemptsTo(new WaitElement().Execute(new GeneralParams(
                "Espera Objeto Organization",
                "(//*[contains(text(),'Organization') or contains(text(),'Organización')])[position()=2]")));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Organization",
                "Usuario da click en el Objeto Organization",
                "(//*[contains(text(),'Organization') or contains(text(),'Organización')])[position()=2]"
        )));

        actor.attemptsTo(new WaitElement().Execute(new GeneralParams(
                "Espera Objeto Business Units",
                "(//*[contains(text(),'Business Units') or contains(text(),'Unidades de negocios')])[position()=1]")));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Business Units",
                "Usuario da click en el Objeto Organization",
                "(//*[contains(text(),'Business Units') or contains(text(),'Unidades de negocios')])[position()=1]"
        )));

        actor.attemptsTo(new WaitElement().Execute(new GeneralParams(
                "Espera Objeto New Business Unit",
                "//*[contains(text(),'New Business Unit') or contains(text(),'Nueva Unidad de Negocios')]")));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto New Business Unit",
                "Usuario da click en el Objeto New Business Unit",
                "//*[contains(text(),'New Business Unit') or contains(text(),'Nueva Unidad de Negocios')]"
        )));

        actor.attemptsTo(new WaitElement().Execute(new GeneralParams(
                "Espera Objeto Business Name",
                "//input[@class='editor s-Serenity-StringEditor s-StringEditor required']")));

        actor.attemptsTo(new EnterTextAction("Grupo Choucair").Execute(new GeneralParams(
                "#actorName ingresa texto en un campo Name",
                "Campo Name",
                "//input[@class='editor s-Serenity-StringEditor s-StringEditor required']"
        )));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Parent Unit",
                "Usuario da click en el Objeto Parent Unit",
                "//*[@id='select2-chosen-1']"
        )));


        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Administration",
                "Usuario da click en el Objeto Administration",
                "//div[contains(text(),'Administration')]"
        )));


        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Save",
                "Usuario da click en el Objeto Save",
                "//*[contains(text(),'Save') or contains(text(),'Guardar')]"
        )));

    }

    @Entonces("^el usuario crea una Meetings$")
    public void elUsuarioCreaUnaMeetings() {
        actor.attemptsTo(new WaitElement().Execute(new GeneralParams(
                "Espera Objeto Meeting",
                "(//*[contains(text(),'Meeting') or contains(text(),'Reunión')])[position()=2]")));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Meeting",
                "Usuario da click en el Meeting",
                "(//*[contains(text(),'Meeting') or contains(text(),'Reunión')])[position()=2]"
        )));


        actor.attemptsTo(new WaitElement().Execute(new GeneralParams(
                "Espera Objeto Meetings",
                "//*[contains(text(),'Meetings') or contains(text(),'Reuniones')]")));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Meetings",
                "Usuario da click en el Objeto Meetings",
                "//*[contains(text(),'Meetings') or contains(text(),'Reuniones')]"
        )));

        actor.attemptsTo(new WaitElement().Execute(new GeneralParams(
                "Espera Objeto New Meeting",
                "//*[contains(text(),'New Meeting') or contains(text(),'Nueva reunión')]")));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto New Meeting",
                "Usuario da click en el Objeto New Meeting",
                "//*[contains(text(),'New Meeting') or contains(text(),'Nueva reunión')]"
        )));


        actor.attemptsTo(new WaitElement().Execute(new GeneralParams(
                "Espera Objeto Meeting Name",
                "//input[@class='editor s-Serenity-StringEditor s-StringEditor required']")));


        actor.attemptsTo(new EnterTextAction("Reunion Choucair").Execute(new GeneralParams(
                "#actorName ingresa texto en un campo Name",
                "Campo Name",
                "//input[@class='editor s-Serenity-StringEditor s-StringEditor required']"
        )));


        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Meeting Type",
                "Usuario da click en el Objeto Meeting Type",
                "//div[@class='select2-container select2-allowclear editor s-Serenity-LookupEditor s-LookupEditor has-inplace-button required']"
        )));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Strategy",
                "Usuario da click en el Objeto Strategy",
                "//div[contains(text(),'Strategy')]"
        )));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Start Date",
                "Usuario da click en el Objeto Start Date",
                "(//button[@class='ui-datepicker-trigger'])[position()=1]"
        )));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Start Date 13",
                "Usuario da click en el Objeto Start Date 13",
                "//a[contains(text(),'13')]"
        )));

        actor.attemptsTo(new SelectFromOptionsAction("12:15").Execute(new GeneralParams(
                "#actorName selecciona la fecha de reunion",
                "Usuario selecciona la fecha de reunion",
                "(//select[@class='editor s-DateTimeEditor time'])[position()=1]"
        )));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Start Date",
                "Usuario da click en el Objeto Start Date",
                "(//button[@class='ui-datepicker-trigger'])[position()=2]"
        )));

        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Start Date 13",
                "Usuario da click en el Objeto Start Date 13",
                "//a[contains(text(),'13')]"
        )));

        actor.attemptsTo(new SelectFromOptionsAction("12:30").Execute(new GeneralParams(
                "#actorName selecciona la fecha de reunion",
                "Usuario selecciona la fecha de reunion",
                "(//select[@class='editor s-DateTimeEditor time'])[position()=1]"
        )));




        actor.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario da click en el Objeto Save",
                "Usuario da click en el Objeto Save",
                "//*[contains(text(),'Save') or contains(text(),'Guardar')]"
        )));

        actor.attemptsTo(new WaitElement().Execute(new GeneralParams(
                "Se encuentra el objeto exitosamente",
                "//*[contains(text(),'Reunion Choucair')]")));



    }


}
