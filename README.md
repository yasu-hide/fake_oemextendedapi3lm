# Fake OemExtendedAPI3LM

## これなあに
特定のアプリを起動した時に発生するかもしれない
```
NoClassDefFoundError: Failed resolution of: "Landroid/os/IOemExtendedAPI3LM$Stub"
```
を回避するやつ

## 使い方
oemextendedapi3LM.jarを/system/frameworkに置いて、

BOOTCLASSPATHに書いて、

dalvik-cache消して再起動。

device.mkとかに、<strong>PRODUCT_BOOT_JARS += oemextendedapi3LM</strong> とか書いておくと幸せ。


## 作りかた
- IOemExtendedAPI3LM.javaをAndroid Studioあたりでlibraryとしてビルド
- こんなjarができる
```
mylibrary.jar
  android
    os
      IOemExtendedApi3LM$Stub$Proxy.class
      IOemExtendedApi3LM$Stub.class
      IOemExtendedApi3LM.class
```
- dxコマンドでjar-classをjar-dex化
```
dx.bat --dex --output oemextendedapi3LM.jar os\release\mylibrary.jar
```
- oemextendedapi3LM.jarができた
