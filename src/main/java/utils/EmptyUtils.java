package utils;

/**
 * @description:
 * @author: daixiongkun
 * @time: 2019-07-22 10:38
 */
public class EmptyUtils {

    public static boolean isEmpty(String s){
        if (null==s || "".equals(s)){
            return true;
        }else {
            return false;
        }
    }
}
