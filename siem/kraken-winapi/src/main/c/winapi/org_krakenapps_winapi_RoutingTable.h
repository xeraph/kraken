/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_krakenapps_winapi_RoutingTable */

#ifndef _Included_org_krakenapps_winapi_RoutingTable
#define _Included_org_krakenapps_winapi_RoutingTable
#ifdef __cplusplus
extern "C" {
#endif

/*
 * Class:     org_krakenapps_winapi_RoutingTable
 * Method:    getRoutingEntries
 * Signature: ()[Lorg/krakenapps/winapi/RoutingTable;
 */
JNIEXPORT jobjectArray JNICALL Java_org_krakenapps_winapi_RoutingTable_getRoutingEntries
  (JNIEnv *, jobject);

jobject getForwardRow(JNIEnv *, MIB_IPFORWARDROW);

#ifdef __cplusplus
}
#endif
#endif
