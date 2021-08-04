//
// Created by Roger Wang on 2021/8/4.
//

#include "com_example_rogerdemo_JniUtils.h"

JNIEXPORT jstring JNICALL Java_com_example_rogerdemo_JniUtils_getStringFromNDK
  (JNIEnv *env, jobject obj){
     return (*env)->NewStringUTF(env,"Hellow World，这是Roger Wang的NDK的第一行代码");
  }