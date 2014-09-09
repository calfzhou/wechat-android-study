package com.tencent.mm.xlog;

import com.tencent.mm.compatible.g.o;
import com.tencent.mm.sdk.a;
import com.tencent.mm.sdk.platformtools.ac;

public class Xlog
  implements ac
{
  static
  {
    init();
    onCreate();
  }

  public static native void appenderOpen(int paramInt, String paramString1, String paramString2);

  public static void init()
  {
    o.a(a.iCT, Xlog.class.getClassLoader());
  }

  public static native void logWrite(Xlog.XLoggerInfo paramXLoggerInfo, String paramString);

  public static native void logWrite2(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, int paramInt3, long paramLong1, long paramLong2, String paramString4);

  private static native void onCreate();

  public static native void setAppenderMode(int paramInt);

  public static native void setLogLevel(int paramInt);

  public native void appenderClose();

  public native void appenderFlush();

  public native void appenderFlushSync();

  public native int getLogLevel();

  public final void logD(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    logWrite2(1, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
  }

  public final void logE(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    logWrite2(4, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
  }

  public final void logF(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    logWrite2(5, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
  }

  public final void logI(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    logWrite2(2, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
  }

  public final void logV(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    logWrite2(0, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
  }

  public final void logW(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    logWrite2(3, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.xlog.Xlog
 * JD-Core Version:    0.6.2
 */