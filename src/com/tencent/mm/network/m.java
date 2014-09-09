package com.tencent.mm.network;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.net.URL;
import java.util.ArrayList;

public final class m
{
  private int dTh = 0;
  private String host = null;
  private String ip = "";
  private URL url = null;

  public m(String paramString)
  {
    try
    {
      this.url = new URL(paramString);
      this.host = this.url.getHost();
      ArrayList localArrayList = new ArrayList();
      if ((k.CT() == null) || (k.CT().rk() == null))
      {
        Object[] arrayOfObject1 = new Object[2];
        if (k.CT() == null);
        for (Object localObject = "-1"; ; localObject = k.CT().rk())
        {
          arrayOfObject1[0] = localObject;
          arrayOfObject1[1] = ch.aHN();
          z.e("!32@/B4Tb64lLpLNXJYrN+XyJY3MIXY4yYEd", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", arrayOfObject1);
          return;
        }
      }
      this.dTh = k.CT().rk().c(this.host, localArrayList);
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(this.dTh);
      arrayOfObject2[1] = this.host;
      arrayOfObject2[2] = paramString;
      z.d("!32@/B4Tb64lLpLNXJYrN+XyJY3MIXY4yYEd", "[Arth.302] dnsType:%d  host:%s url:%s", arrayOfObject2);
      if (localArrayList.size() <= 0)
      {
        this.dTh = 0;
        return;
      }
      if (1 == this.dTh)
      {
        String str = (String)localArrayList.get((int)(ch.CM() % localArrayList.size()));
        this.ip = str;
        this.url = new URL(paramString.replaceFirst(this.host, str));
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final String getHost()
  {
    return this.host;
  }

  public final String getIp()
  {
    return this.ip;
  }

  public final int getType()
  {
    return this.dTh;
  }

  public final URL getURL()
  {
    return this.url;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.m
 * JD-Core Version:    0.6.2
 */