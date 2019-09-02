package com.github.johnnyodonnell;

import java.io.File;

import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlScript;


public class App {
    public static void main( String[] args ) {
        String filename = args[0];
        File file = new File(filename);

        JexlEngine jexlEngine = new JexlBuilder().create();
        JexlScript jexlScript = jexlEngine.createScript(file);
        Object output = jexlScript.execute(null);

        System.out.println(output);
    }
}

