package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class JavaHandler implements RequestHandler<Map<String, Integer>, String> {

    @Override
    /*
     * Takes in an InputRecord, which contains two integers and a String.
     * Logs the String, then returns the sum of the two Integers.
     */
    public String handleRequest(Map<String, Integer> event, Context context)
    {
        context.getLogger().log("Evento recebido: " + event);
        int soma = event.get("num1") + event.get("num2");
        return String.valueOf(soma);
    }
}
