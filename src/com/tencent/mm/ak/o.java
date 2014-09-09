package com.tencent.mm.ak;

import com.tencent.mm.sdk.platformtools.z;

public final class o
{
  private String dFV;
  private boolean dFW;
  private long time;

  public o(String paramString)
  {
    if (paramString.endsWith("\n"))
      paramString = paramString.substring(0, -1 + paramString.length());
    String[] arrayOfString = paramString.split(":");
    try
    {
      if (arrayOfString.length > 0)
        this.dFV = arrayOfString[0];
      if (arrayOfString.length > 1)
        this.time = Long.parseLong(arrayOfString[1]);
      if (arrayOfString.length > 2)
        this.dFW = arrayOfString[2].equals("1");
      return;
    }
    catch (Exception localException)
    {
      this.dFV = "";
      this.dFW = false;
      this.time = 0L;
      z.e("!32@/B4Tb64lLpKX2ffrpqRQB3kIHdSomN68", "VoiceContent parse failed.");
    }
  }

  public static String a(String paramString, long paramLong, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(paramString).append(":").append(paramLong).append(":");
    if (paramBoolean);
    for (int i = 1; ; i = 0)
      return i + "\n";
  }

  public final String AN()
  {
    return this.dFV;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.o
 * JD-Core Version:    0.6.2
 */