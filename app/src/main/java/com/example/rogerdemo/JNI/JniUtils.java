package com.example.rogerdemo.JNI;

public class JniUtils {

    static {
        System.loadLibrary("jniutils-jni");
    }
    public static native String getStringFromNDK();
    public static native String getDate();
}
