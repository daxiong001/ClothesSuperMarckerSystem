package utils;

/**
 * @description:
 * @author: daixiongkun
 * @time: 2019-07-21 14:42
 */
public class BusinessException extends RuntimeException{

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }
}
