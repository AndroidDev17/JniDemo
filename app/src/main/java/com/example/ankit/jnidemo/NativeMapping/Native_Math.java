package com.example.ankit.jnidemo.NativeMapping;

/**
 * Created by ankit on 18/8/18.
 */

public class Native_Math
{
    // Used to load the  library on application startup.
    static {
        System.loadLibrary("math-lib");
    }
    private static final Native_Math ourInstance = new Native_Math();

    public static Native_Math getInstance() {
        return ourInstance;
    }

    private Native_Math() {
    }

    public native int add(int a,int b);
}
