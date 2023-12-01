package com.utest.questions;

import com.utest.ui.ResultForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.utest.ui.Page.Fininish;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ResultQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(Fininish),
                WaitUntil.the(ResultForm.question_, isVisible()).forNoMoreThan(100).seconds());
        return true;
    }

    public static ResultQuestion succesRegister(){
        return new ResultQuestion();
    }
}
