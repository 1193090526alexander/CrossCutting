package co.edu.uco.crosscutting.util.object;

import co.edu.uco.crosscutting.util.object.UtilObject;
public class UtilObject {
    private static final  UtilObject INSTANCE =new UtilObject();
    private UtilObject (){

    }
    public static UtilObject getUtilobject(){
        return INSTANCE;
    }
    public <T> boolean isNULL(T object){
        return object == null;
    }
    public <T> T getDefault(T object , T defaultValue){
        return isNULL(object) ? defaultValue : object;
    }
}

