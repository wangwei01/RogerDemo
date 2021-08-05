//
// Created by Roger Wang on 2021/8/4.
//

#include "com_example_rogerdemo_JNI_JniUtils.h"

JNIEXPORT jstring JNICALL Java_com_example_rogerdemo_JniUtils_getStringFromNDK
        (JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env, "Hellow World，这是Roger Wang的NDK的第一行代码");
}

JNIEXPORT jstring JNICALL
Java_com_example_rogerdemo_JNI_JniUtils_getDate(JNIEnv *env, jobject obj) {
    jclass cls = (*env)->FindClass(env, "javax/xml/crypto/Data");
    jmethodID jmethodId = (*env)->GetMethodID(env, cls, "<init>", "()V");
    jobject data_obj = (*env)->NewObject(env, cls, jmethodId);
    jmethodID jmethodId1 = (*env)->GetMethodID(env, cls, "getTime", "()J");
    jlong time = (*env)->CallLongMethod(env, data_obj, jmethodId1);

    return (*env)->NewStringUTF(env, (const char *) time);
}