#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_ankit_jnidemo_NativeMapping_Native_1Main_stringFromJNI(JNIEnv *env,
                                                                        jobject instance) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}