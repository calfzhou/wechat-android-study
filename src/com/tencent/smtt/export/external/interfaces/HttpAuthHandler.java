package com.tencent.smtt.export.external.interfaces;

public abstract interface HttpAuthHandler
{
  public abstract void cancel();

  public abstract void proceed(String paramString1, String paramString2);

  public abstract boolean useHttpAuthUsernamePassword();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.HttpAuthHandler
 * JD-Core Version:    0.6.2
 */