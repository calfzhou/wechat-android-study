package com.tencent.mm.modelvoice;

import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;

public final class bp
{
  private String dFV;
  private boolean dFW;
  private long time;

  public bp(String paramString)
  {
    while (true)
    {
      try
      {
        if (paramString.endsWith("\n"))
          paramString = paramString.substring(0, -1 + paramString.length());
        String[] arrayOfString = paramString.split(":");
        if ((arrayOfString.length == 4) && (i.yc(arrayOfString[0])))
        {
          i = 1;
          if (arrayOfString.length > i)
            this.dFV = arrayOfString[i];
          if (arrayOfString.length > i + 1)
            this.time = Long.parseLong(arrayOfString[(i + 1)]);
          if (arrayOfString.length > i + 2)
            this.dFW = arrayOfString[(i + 2)].equals("1");
          return;
        }
      }
      catch (Exception localException)
      {
        this.dFV = "";
        this.dFW = false;
        this.time = 0L;
        z.e("!32@/B4Tb64lLpLuTfcKnpSMB7/OhLfNVcYh", "VoiceContent parse failed.");
        return;
      }
      int i = 0;
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

  public final String BG()
  {
    StringBuilder localStringBuilder = new StringBuilder().append(this.dFV).append(":").append(this.time).append(":");
    if (this.dFW);
    for (int i = 1; ; i = 0)
      return i + "\n";
  }

  public final boolean BH()
  {
    return this.dFW;
  }

  public final void BI()
  {
    this.dFW = true;
  }

  public final long getTime()
  {
    return this.time;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bp
 * JD-Core Version:    0.6.2
 */