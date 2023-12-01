package com.utest.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Page {
    public static final Target btn_a_product = Target.the("click a product").locatedBy("//h2[contains(.,\"{0}\")]");

    public static final Target number_of_product = Target.the("number of product").locatedBy("//input[@type=\"number\"]");

    public static final Target btn_submit = Target.the("submit product").locatedBy("//button[@type=\"submit\"]");

    public static final Target Go_Home = Target.the("home").locatedBy("//a[@href=\"https://sanangel.com.co/\"]");

    public static final Target Fininish = Target.the("finish buy").locatedBy("//a[@href=\"https://sanangel.com.co/finalizar-compra/\"]");



}
