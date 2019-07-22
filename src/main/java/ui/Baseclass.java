package ui;


import com.vince.bean.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

/**
 * @description:
 * @author: daixiongkun
 * @time: 2019-07-20 15:42
 */
public abstract class Baseclass {

    public static Scanner input = new Scanner(System.in);

    public static User currUser;

    public static String getString(String key){
        Properties ps = new Properties();
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("temp.properties");
        try {
            ps.load(is);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return ps.getProperty(key);
    }

    public static void print(String s){
        System.out.print(s);
    }

    public static void println(String s){
        System.out.println(s);
    }

}
