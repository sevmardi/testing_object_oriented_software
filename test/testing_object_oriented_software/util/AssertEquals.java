package testing_object_oriented_software.util;

import testing_object_oriented_software.util.NotEqualExeption;

/**
 * Created by Felix on 18.12.2017.
 */
public class AssertEquals {

    public static void strings(String expected, String result) throws Exception{
        if(expected != result){
            throw new NotEqualExeption("String", expected, result);
        }

    }
    public static void booleans(boolean expected, boolean result) throws Exception{
        if(expected != result){
            throw new NotEqualExeption("boolean", Boolean.toString(expected), Boolean.toString(result));
        }
    }

    public static void integers(int expected, int result) throws Exception{
        if(expected != result){
            throw new NotEqualExeption("int", Integer.toString(expected), Integer.toString(result));
        }
    }


}
