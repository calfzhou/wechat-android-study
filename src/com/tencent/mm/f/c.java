package com.tencent.mm.f;

import com.tencent.mm.c.a.av;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.util.HashMap;
import java.util.Map;

public class c
{
  private static c dPi = null;
  private HashMap dPj = new HashMap();
  private boolean dPk = false;

  private void a(Map paramMap)
  {
    if (paramMap == null);
    int i;
    label14: Object localObject;
    label39: String str3;
    String str4;
    do
    {
      return;
      this.dPj.clear();
      i = 0;
      if (i >= 10000)
        break;
      StringBuilder localStringBuilder = new StringBuilder(".sysmsg.dynacfg.Item");
      if (i != 0)
        break label182;
      localObject = "";
      String str1 = localObject;
      String str2 = str1 + ".$key";
      str3 = (String)paramMap.get(str1);
      str4 = (String)paramMap.get(str2);
    }
    while ((str4 == null) || (ch.jb(str4.trim())));
    HashMap localHashMap = this.dPj;
    String str5 = str4.trim();
    if (str3 != null);
    for (String str6 = str3; ; str6 = "")
    {
      localHashMap.put(str5, str6);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str4.trim();
      arrayOfObject[1] = str3;
      z.d("!32@/B4Tb64lLpJX2xqu8Tj3tCMRbqMu26rl", "put %s %s", arrayOfObject);
      i++;
      break label14;
      break;
      label182: localObject = Integer.valueOf(i);
      break label39;
    }
  }

  private void dM(String paramString)
  {
    a(x.bB(paramString, "sysmsg"));
  }

  public static c om()
  {
    if (dPi == null);
    try
    {
      if (dPi == null)
        dPi = new c();
      return dPi;
    }
    finally
    {
    }
  }

  public final void a(String paramString, Map paramMap)
  {
    while (true)
    {
      try
      {
        boolean bool = ch.jb(paramString);
        if (bool)
          return;
        bg.qW().oQ().set(278529, paramString);
        if (paramMap != null)
        {
          a(paramMap);
          av localav = new av();
          a.aGB().g(localav);
          continue;
        }
      }
      finally
      {
      }
      dM(paramString);
    }
  }

  public final String getValue(String paramString)
  {
    if (!this.dPk)
    {
      z.e("!32@/B4Tb64lLpJX2xqu8Tj3tCMRbqMu26rl", "DynamicConfig hadnot load");
      gu();
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString.trim();
    arrayOfObject[1] = this.dPj.get(paramString);
    z.d("!32@/B4Tb64lLpJX2xqu8Tj3tCMRbqMu26rl", "get configs.get(config) %s %s", arrayOfObject);
    return (String)this.dPj.get(paramString);
  }

  public final void gu()
  {
    try
    {
      if ((bg.qW() != null) && (bg.qW().oQ() != null))
      {
        this.dPk = true;
        dM((String)bg.qW().oQ().get(278529));
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void put(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString1.trim();
      arrayOfObject[1] = paramString2;
      z.d("!32@/B4Tb64lLpJX2xqu8Tj3tCMRbqMu26rl", "put configs.put(key,value) %s %s", arrayOfObject);
      this.dPj.put(paramString1, paramString2);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.f.c
 * JD-Core Version:    0.6.2
 */