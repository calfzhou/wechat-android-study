wechat-android-study
====================

Decompile WeChat Android source code.

1.  Decompress .apk package
    * `unzip wexin-xxx.apk`
2.  Use [androguard](https://code.google.com/p/androguard/) to convert manifest xml to readable text file:
    * `androguard/androaxml.py -iAndroidManifest.xml -o output.xml`
3.  Use dex2jar to convert .dex to .jar:
    * `brew install dex2jar`
    * `dex2jar classes.dex`
4.  Use JD to decompile .jar to java code.
