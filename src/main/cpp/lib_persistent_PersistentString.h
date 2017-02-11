/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class lib_persistent_PersistentString */

#ifndef _Included_lib_persistent_PersistentString
#define _Included_lib_persistent_PersistentString
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     lib_persistent_PersistentString
 * Method:    nativeCheckByteArrayExists
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_lib_persistent_PersistentString_nativeCheckByteArrayExists
  (JNIEnv *, jclass, jlong);

/*
 * Class:     lib_persistent_PersistentString
 * Method:    nativeReserveByteArrayMemory
 * Signature: (I)J
 */
JNIEXPORT jlong JNICALL Java_lib_persistent_PersistentString_nativeReserveByteArrayMemory
  (JNIEnv *, jobject, jint);

/*
 * Class:     lib_persistent_PersistentString
 * Method:    nativeGetLength
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_lib_persistent_PersistentString_nativeGetLength
  (JNIEnv *, jobject, jlong);

/*
 * Class:     lib_persistent_PersistentString
 * Method:    nativePut
 * Signature: (J[BII)I
 */
JNIEXPORT jint JNICALL Java_lib_persistent_PersistentString_nativePut
  (JNIEnv *, jobject, jlong, jbyteArray, jint, jint);

/*
 * Class:     lib_persistent_PersistentString
 * Method:    nativeGet
 * Signature: (J[BII)I
 */
JNIEXPORT jint JNICALL Java_lib_persistent_PersistentString_nativeGet
  (JNIEnv *, jobject, jlong, jbyteArray, jint, jint);

#ifdef __cplusplus
}
#endif
#endif
