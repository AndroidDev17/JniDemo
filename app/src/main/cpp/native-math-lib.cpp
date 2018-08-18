//
// Created by ankit on 18/8/18.
//
#include <jni.h>

extern "C"
JNIEXPORT jint JNICALL
Java_com_example_ankit_jnidemo_NativeMapping_Native_1Math_add(JNIEnv *env, jobject instance, jint a,
                                                              jint b) {
    return a+b;

}

