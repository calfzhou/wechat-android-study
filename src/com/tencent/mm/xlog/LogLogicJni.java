package com.tencent.mm.xlog;

public class LogLogicJni
{
  public static native int getAppenderModeFromCfg(int paramInt);

  public static native int getIPxxLogLevel();

  public static native int getLogLevelFromCfg(int paramInt);

  public static native void initLogInfo();

  public static native void setConsoleLogOpen(boolean paramBoolean);

  public static native void setErrLogOpen(boolean paramBoolean);

  public static native void setIPxxLogML(int paramInt1, int paramInt2);

  public static native void setIsAlphaVersion(boolean paramBoolean);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.xlog.LogLogicJni
 * JD-Core Version:    0.6.2
 */