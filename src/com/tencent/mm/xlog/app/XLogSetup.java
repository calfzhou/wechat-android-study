package com.tencent.mm.xlog.app;

import android.os.Looper;
import com.tencent.mm.jni.platformcomm.PlatformComm;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.xlog.LogLogicJni;
import com.tencent.mm.xlog.Xlog;

public class XLogSetup
{
  public static Boolean appendIsSync;
  private static boolean hasInit = false;
  public static Boolean isLogcatOpen;
  public static String nameprefix;
  public static String path;
  public static boolean sAlpha;
  private static boolean setup = false;
  public static Integer toolsLevel;
  public static Integer version;
  public static Xlog xlog = new Xlog();

  public static void keep_setupXLog(boolean paramBoolean1, Integer paramInteger1, String paramString1, Integer paramInteger2, Boolean paramBoolean2, Boolean paramBoolean3, String paramString2, boolean paramBoolean4)
  {
    int i = 1;
    if ((paramInteger1 == null) || (paramInteger1.intValue() == 0));
    do
    {
      return;
      version = paramInteger1;
      path = paramString1;
      toolsLevel = paramInteger2;
      appendIsSync = paramBoolean2;
      isLogcatOpen = paramBoolean3;
      nameprefix = paramString2;
      sAlpha = paramBoolean4;
      if (!hasInit)
      {
        PlatformComm.a(ak.getContext(), new cm(Looper.getMainLooper()));
        hasInit = i;
      }
    }
    while ((!paramBoolean1) || (setup));
    setup = i;
    z.a(xlog);
    if (appendIsSync.booleanValue());
    while (true)
    {
      if (toolsLevel != null)
        LogLogicJni.setIPxxLogML(toolsLevel.intValue(), i);
      LogLogicJni.setConsoleLogOpen(isLogcatOpen.booleanValue());
      LogLogicJni.setIsAlphaVersion(sAlpha);
      int j = LogLogicJni.getLogLevelFromCfg(version.intValue());
      if ((toolsLevel == null) && (6 == j))
        j = 2;
      Xlog.setLogLevel(j);
      Xlog.appenderOpen(LogLogicJni.getAppenderModeFromCfg(version.intValue()), path, nameprefix);
      return;
      i = 0;
    }
  }

  public static void realSetupXlog()
  {
    keep_setupXLog(true, version, path, toolsLevel, appendIsSync, isLogcatOpen, nameprefix, sAlpha);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.xlog.app.XLogSetup
 * JD-Core Version:    0.6.2
 */