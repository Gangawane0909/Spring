package com.codekul.JavaSpring.ioc;

public class Vodafone implements sim {

    @Override
    public void calling() {
        System.out.println("In vodafone calling");

    }

    @Override
    public void data() {
        System.out.println("In vodafone data");

    }
}
