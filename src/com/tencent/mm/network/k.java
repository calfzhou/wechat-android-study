package com.tencent.mm.network;

import java.io.InputStream;

public final class k
{
  private static l dTg;

  public static int a(be parambe)
  {
    try
    {
      int i = parambe.getResponseCode();
      if (i != 200)
        return -1;
      return 0;
    }
    catch (Exception localException)
    {
    }
    return -3;
  }

  public static be a(String paramString, m paramm)
  {
    if (paramm == null)
      paramm = new m(paramString);
    be localbe = new be(paramm.getURL(), m.a(paramm));
    if (1 == m.a(paramm))
    {
      localbe.setRequestProperty("Host", paramm.getHost());
      localbe.setRequestProperty("X-Online-Host", paramm.getHost());
    }
    return localbe;
  }

  public static void a(l paraml)
  {
    dTg = paraml;
  }

  public static InputStream g(String paramString, int paramInt1, int paramInt2)
  {
    be localbe = a(paramString, null);
    localbe.setConnectTimeout(paramInt1);
    localbe.setReadTimeout(paramInt2);
    localbe.setRequestMethod("GET");
    if (a(localbe) != 0)
      return null;
    return localbe.getInputStream();
  }

  public static be jr(String paramString)
  {
    return a(paramString, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.k
 * JD-Core Version:    0.6.2
 */