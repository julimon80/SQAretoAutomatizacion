package com.utest.tasks;

import com.utest.ui.Page;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static com.utest.ui.Page.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SelectProduct implements Task {

    private DataTable data;


    public SelectProduct(DataTable data){
        this.data=data;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String,String>> values = data.asMaps(String.class,String.class);


        actor.attemptsTo(

                Click.on(btn_a_product.of(String.valueOf(values.get(0).get("namefirstproduct")))),
                Enter.theValue(values.get(0).get("numberoffirstproduct")).into(number_of_product),
                Click.on(btn_submit),
                Click.on(Go_Home),
                Click.on(btn_a_product.of(String.valueOf(values.get(0).get("namesecondproduct")))),
                Enter.theValue(values.get(0).get("numberofsecondproduct")).into(number_of_product),
                Click.on(btn_submit)

        );
    }

    public static SelectProduct Form(DataTable data){
        return Tasks.instrumented(SelectProduct.class,data);
    }
}
