import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public String str;
    private static Singleton obj;

    private Singleton(){}

    public static Singleton getSingleInstance () {
        if(obj == null)
         obj = new Singleton();
         return obj;
        
    }

}