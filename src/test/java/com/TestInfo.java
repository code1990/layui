package com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestInfo {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");

    public static void main(String[] args) {
        System.out.println(sdf.format(new Date()));
    }
}
