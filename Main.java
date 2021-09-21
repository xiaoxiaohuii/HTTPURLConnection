import java.net.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args)
            throws Exception {
        URL hp = new URL("https://www.google.ru/");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        System.out.println("Метод запроса: " + hpCon.getRequestMethod());
        System.out.println("Код ответа:" + hpCon.getResponseCode());
        System.out.println("Ответное сообщение: " + hpCon.getResponseMessage());

        //Список полей и множество ключей из заголовка
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nЗаголовок:");

        for(String k : hdrField)
            System.out.println("Ключ: " + k + ". Значение: " + hdrMap.get(k));
    }
}