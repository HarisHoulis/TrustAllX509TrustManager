# TrustAllX509TrustManager
Demo repo to reproduce the `TrustAllX509TrustManager` lint error introduced with the [1.2.0](https://mvnrepository.com/artifact/app.cash.paparazzi/paparazzi/1.2.0) version of the `Paparazzi` library.

## Report of the `lintDebug` task:

```
/Users/.../.gradle/caches/modules-2/files-2.1/org.bouncycastle/bcpkix-jdk15on/1.67/5f48020a2a60a8d6bcbecceca23529d225b28efb/bcpkix-jdk15on-1.67.jar: Error: checkClientTrusted is empty, which could cause insecure network traffic due to trusting arbitrary TLS/SSL certificates presented by peers [TrustAllX509TrustManager]
/Users/.../.gradle/caches/modules-2/files-2.1/org.bouncycastle/bcpkix-jdk15on/1.67/5f48020a2a60a8d6bcbecceca23529d225b28efb/bcpkix-jdk15on-1.67.jar: Error: checkClientTrusted is empty, which could cause insecure network traffic due to trusting arbitrary TLS/SSL certificates presented by peers [TrustAllX509TrustManager]
/Users/.../.gradle/caches/modules-2/files-2.1/org.bouncycastle/bcpkix-jdk15on/1.67/5f48020a2a60a8d6bcbecceca23529d225b28efb/bcpkix-jdk15on-1.67.jar: Error: checkServerTrusted is empty, which could cause insecure network traffic due to trusting arbitrary TLS/SSL certificates presented by peers [TrustAllX509TrustManager]

   Explanation for issues of type "TrustAllX509TrustManager":
   This check looks for X509TrustManager implementations whose
   checkServerTrusted or checkClientTrusted methods do nothing (thus trusting
   any certificate chain) which could result in insecure network traffic
   caused by trusting arbitrary TLS/SSL certificates presented by peers.

   https://goo.gle/TrustAllX509TrustManager
```
