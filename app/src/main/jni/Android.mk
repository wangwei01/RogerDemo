LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := jniutils-jni

LOCAL_SRC_FILES := jniutils.c

include $(BUILD_SHARED_LIBRARY)