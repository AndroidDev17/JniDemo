package com.example.ankit.jnidemo.NativeMapping;

/**
 * Created by ankit on 18/8/18.
 */

public class Native_Main
{
    private static Native_Main ref=null;

    public static synchronized final Native_Main getInstance()
    {
        if (ref == null) {
            ref=new Native_Main();
        }
        return ref;
    }
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
