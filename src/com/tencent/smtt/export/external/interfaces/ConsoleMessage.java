package com.tencent.smtt.export.external.interfaces;

public abstract interface ConsoleMessage
{
  public abstract int lineNumber();

  public abstract String message();

  public abstract ConsoleMessage.MessageLevel messageLevel();

  public abstract String sourceId();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.ConsoleMessage
 * JD-Core Version:    0.6.2
 */