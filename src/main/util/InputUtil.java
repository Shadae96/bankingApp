package util;

import java.util.Scanner;

public class InputUtil {


    Scanner scanner = new Scanner(System.in);

    public String retrieveString(String msg){
        System.out.print(msg);
        return scanner.nextLine();
    }

    public Integer retrieveInt(String msg){
        


    }
    
}
