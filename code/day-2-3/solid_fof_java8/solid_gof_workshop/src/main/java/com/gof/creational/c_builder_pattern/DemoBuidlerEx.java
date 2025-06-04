package com.gof.creational.c_builder_pattern;

public class DemoBuidlerEx {
    public static void main(String[] args) {
        String str1="a"+ "b"+"c"+"d"+"e";

        String str = new StringBuilder("a")
                .append("b")
                .append("c")
                .append("d")
                .append("e")
                .toString();
    }
}
