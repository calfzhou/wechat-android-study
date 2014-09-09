package com.tencent.mm.kvcomm;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.jni.platformcomm.PlatformComm.C2Java;
import com.tencent.mm.sdk.platformtools.y;

public class KVReportJni$KVReportC2Java
{
  public static String getKVCommPath()
  {
    return PlatformComm.C2Java.getAppFilePath() + "/kvcomm/";
  }

  public static KVReportJni.KVCommBaseInfo getKVCommReqBaseInfo()
  {
    KVReportJni.KVCommBaseInfo localKVCommBaseInfo = new KVReportJni.KVCommBaseInfo();
    localKVCommBaseInfo.deviceModel = (Build.MODEL + Build.CPU_ABI);
    localKVCommBaseInfo.deviceBrand = Build.BRAND;
    localKVCommBaseInfo.osName = ("android-" + Build.MANUFACTURER);
    localKVCommBaseInfo.osVersion = Build.VERSION.SDK_INT;
    localKVCommBaseInfo.languageVer = y.aGW();
    return localKVCommBaseInfo;
  }

  public static int getSingleReportBufSizeB()
  {
    return 51200;
  }

  public static void onReportKVDataReady(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      if ((KVReportJni.kvReportNotify != null) && (paramArrayOfByte2 != null) && (paramArrayOfByte2.length > 0))
        KVReportJni.kvReportNotify.onReportKVDataReady(paramArrayOfByte1, paramArrayOfByte2);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.kvcomm.KVReportJni.KVReportC2Java
 * JD-Core Version:    0.6.2
 */