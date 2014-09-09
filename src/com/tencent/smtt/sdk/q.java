package com.tencent.smtt.sdk;

final class q
  implements com.tencent.smtt.export.external.interfaces.ConsoleMessage
{
  private String fdT;
  private com.tencent.smtt.export.external.interfaces.ConsoleMessage.MessageLevel kel;
  private String kem;
  private int ken;

  q(android.webkit.ConsoleMessage paramConsoleMessage)
  {
    this.kel = com.tencent.smtt.export.external.interfaces.ConsoleMessage.MessageLevel.valueOf(paramConsoleMessage.messageLevel().name());
    this.fdT = paramConsoleMessage.message();
    this.kem = paramConsoleMessage.sourceId();
    this.ken = paramConsoleMessage.lineNumber();
  }

  q(String paramString1, String paramString2, int paramInt)
  {
    this.kel = com.tencent.smtt.export.external.interfaces.ConsoleMessage.MessageLevel.LOG;
    this.fdT = paramString1;
    this.kem = paramString2;
    this.ken = paramInt;
  }

  public final int lineNumber()
  {
    return this.ken;
  }

  public final String message()
  {
    return this.fdT;
  }

  public final com.tencent.smtt.export.external.interfaces.ConsoleMessage.MessageLevel messageLevel()
  {
    return this.kel;
  }

  public final String sourceId()
  {
    return this.kem;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.q
 * JD-Core Version:    0.6.2
 */