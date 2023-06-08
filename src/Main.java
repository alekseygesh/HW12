import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //чтение в буфер введенного значения
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What programming language do you like?");
        String answer = buffer.readLine();

        if(answer.contains("I like Java!!!") && answer.startsWith("I like") && answer.endsWith("!!!")){
            System.out.println(answer.toUpperCase());
            System.out.println(answer.substring(7,11).replace('a','o'));
        }
        else{
            System.out.println("Мы ожидали другого ответа, а именно \"I like Java!!!\"");
        }

    }
}