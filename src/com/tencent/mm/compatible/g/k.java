package com.tencent.mm.compatible.g;

public final class k
{
  public static int nJ()
  {
    return new java.lang.Throwable().getStackTrace()[1].getLineNumber();
  }

  public static String nK()
  {
    return new java.lang.Throwable().getStackTrace()[1].toString();
  }

  public static String nL()
  {
    StackTraceElement localStackTraceElement = new java.lang.Throwable().getStackTrace()[1];
    int i = localStackTraceElement.getMethodName().lastIndexOf('.');
    return localStackTraceElement.getMethodName().substring(i + 1) + "(" + localStackTraceElement.getFileName() + ":" + localStackTraceElement.getLineNumber() + ")";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.k
 * JD-Core Version:    0.6.2
 */