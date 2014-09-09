package com.tencent.mm.storage;

import com.tencent.mm.sdk.platformtools.ch;

public final class z
{
  private String cHL = "-1";
  private String dFV;
  private boolean dFW;
  private String iix = "";
  private long time;

  private z(String paramString)
  {
    if (ch.jb(paramString))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKW6XSoHkFWUDGIRzi24Rmyw+IMteJ3XT4=", "EmojiContent parse failed. content is null.");
      return;
    }
    while (true)
    {
      try
      {
        if (paramString.endsWith("\n"))
        {
          paramString = paramString.substring(0, -1 + paramString.length());
          String[] arrayOfString = paramString.split(":", 5);
          int i = arrayOfString.length;
          int j = 0;
          if (i == 4)
          {
            boolean bool = i.yc(arrayOfString[0]);
            j = 0;
            if (bool)
              j = 1;
          }
          if (arrayOfString.length > j)
            this.dFV = arrayOfString[j];
          if (arrayOfString.length > j + 1)
            this.time = Long.parseLong(arrayOfString[(j + 1)]);
          if (arrayOfString.length > j + 2)
            this.dFW = arrayOfString[(j + 2)].equals("1");
          if (arrayOfString.length > j + 3)
            this.cHL = arrayOfString[(j + 3)];
          if (arrayOfString.length <= j + 4)
            break;
          this.iix = arrayOfString[(j + 4)].replace("*#*", ":");
          return;
        }
      }
      catch (Exception localException)
      {
        this.time = 0L;
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKW6XSoHkFWUDGIRzi24Rmyw+IMteJ3XT4=", "EmojiContent parse failed.");
        return;
      }
      this.iix = paramString.replace(":", "*#*");
    }
  }

  public static String a(String paramString, long paramLong, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(paramString).append(":").append(paramLong).append(":");
    if (paramBoolean);
    for (int i = 1; ; i = 0)
      return i + "\n";
  }

  public static z yW(String paramString)
  {
    return new z(paramString);
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
      return i + ":" + this.cHL + ":" + this.iix + "\n";
  }

  public final boolean BH()
  {
    return this.dFW;
  }

  public final void BI()
  {
    this.dFW = true;
  }

  public final String aIO()
  {
    return this.iix;
  }

  public final void fS(String paramString)
  {
    this.cHL = paramString;
  }

  public final long getTime()
  {
    return this.time;
  }

  public final String vu()
  {
    return this.cHL;
  }

  public final String yV(String paramString)
  {
    String str = paramString.replace(":", "*#*");
    StringBuilder localStringBuilder = new StringBuilder().append(this.dFV).append(":").append(this.time).append(":");
    if (this.dFW);
    for (int i = 1; ; i = 0)
      return i + ":" + this.cHL + ":" + str + "\n";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.z
 * JD-Core Version:    0.6.2
 */