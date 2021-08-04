package com.example.rogerdemo;

public class JniUtils {

    static {
        System.loadLibrary("jniutils-jni");
    }
    public static native String getStringFromNDK();
}
