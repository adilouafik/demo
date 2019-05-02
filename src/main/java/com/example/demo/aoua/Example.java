package com.example.demo.aoua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {


    public static List getList() {

        List<String> list = Arrays.asList("as", "bs","cs");

        return list.stream().filter(s -> s.equals("bs")).collect(Collectors.toList());
    }
}
