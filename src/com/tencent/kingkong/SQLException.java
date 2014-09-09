package com.tencent.kingkong;

public class SQLException extends RuntimeException
{
  public SQLException()
  {
  }

  public SQLException(String paramString)
  {
    super(paramString);
  }

  public SQLException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.SQLException
 * JD-Core Version:    0.6.2
 */