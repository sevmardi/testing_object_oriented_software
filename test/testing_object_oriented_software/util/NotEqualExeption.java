package testing_object_oriented_software.util;

/**
 * Created by Felix on 18.12.2017.
 */
public class NotEqualExeption extends Exception{
    public NotEqualExeption(String type, String argument1, String argument2){
        super("Arguments of type " + type + " was not equal, value 1: " + argument1 + ", value 2: " + argument2);
    }
}
