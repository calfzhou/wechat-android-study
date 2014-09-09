package com.tencent.mm.platformtools;

public final class ar
{
  public final String toString()
  {
    StackTraceElement[] arrayOfStackTraceElement = new Throwable().getStackTrace();
    if ((arrayOfStackTraceElement == null) || (arrayOfStackTraceElement.length < 4))
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 3; i < arrayOfStackTraceElement.length; i++)
      if (arrayOfStackTraceElement[i].getClassName().contains("com.tencent.mm"))
      {
        localStringBuilder.append("[");
        localStringBuilder.append(arrayOfStackTraceElement[i].getClassName().substring(15));
        localStringBuilder.append(":");
        localStringBuilder.append(arrayOfStackTraceElement[i].getMethodName());
        localStringBuilder.append("(" + arrayOfStackTraceElement[i].getLineNumber() + ")]");
      }
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ar
 * JD-Core Version:    0.6.2
 */