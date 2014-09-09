package com.tencent.mm.network.a;

import com.tencent.mm.sdk.platformtools.v;
import java.net.InetAddress;

public final class f
{
  private InetAddress dUC;
  private int port;
  private int type;

  public f(InetAddress paramInetAddress, int paramInt1, int paramInt2)
  {
    this.dUC = paramInetAddress;
    this.port = paramInt1;
    this.type = paramInt2;
  }

  public static f ju(String paramString)
  {
    if (paramString == null);
    String[] arrayOfString;
    do
    {
      return null;
      arrayOfString = paramString.split(":");
    }
    while ((arrayOfString == null) || (arrayOfString.length != 3));
    try
    {
      f localf = new f(v.AK(arrayOfString[0]), Integer.parseInt(arrayOfString[1]), Integer.parseInt(arrayOfString[2]));
      return localf;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final String toString()
  {
    String str = "hc";
    if (this.type == 2)
      str = "dns";
    while (true)
    {
      return this.dUC.getHostAddress() + ":" + this.port + "(" + str + ")";
      if (this.type == 3)
        str = "svrdns";
      else if (this.type == 4)
        str = "waphc";
      else if (this.type == 5)
        str = "newdns";
      else if (this.type == 6)
        str = "auth";
      else if (this.type == 7)
        str = "debug";
    }
  }

  public final int type()
  {
    return this.type;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.a.f
 * JD-Core Version:    0.6.2
 */