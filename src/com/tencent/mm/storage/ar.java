package com.tencent.mm.storage;

import com.tencent.mm.c.a.jy;
import com.tencent.mm.f.c;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;
import junit.framework.Assert;

public final class ar extends com.tencent.mm.ai.e
{
  public static String ijt = "voip_content_voice";
  public static String iju = "voip_content_video";
  public boolean ijv = false;

  public static ar w(ar paramar)
  {
    if (paramar == null)
    {
      z.d("!32@/B4Tb64lLpLj7S4izLo0fEWYz+HNsMhY", "convertFrom msg is null ");
      return null;
    }
    ar localar = new ar();
    localar.o(paramar.kk());
    localar.p(paramar.kl());
    localar.setType(paramar.getType());
    localar.setStatus(paramar.getStatus());
    localar.bv(paramar.jK());
    localar.bH(paramar.ks());
    localar.q(paramar.kn());
    localar.bJ(paramar.kt());
    localar.setContent(paramar.getContent());
    localar.bK(paramar.kp());
    localar.bL(paramar.ku());
    localar.j(paramar.kv());
    localar.bN(paramar.kw());
    localar.bO(paramar.kx());
    localar.bI(paramar.ky());
    localar.bP(paramar.kz());
    return localar;
  }

  public static String yB(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if (!paramString.endsWith("@t.qq.com"))
        break;
      return "tmessage";
    }
    if (paramString.endsWith("@qqim"))
      return "qmessage";
    if (i.yc(paramString))
      return "bottlemessage";
    return "message";
  }

  public final boolean aJA()
  {
    switch (getType())
    {
    default:
      return false;
    case 3:
    case 13:
    case 23:
    case 33:
    case 39:
    }
    return true;
  }

  public final boolean aJB()
  {
    return getType() == 42;
  }

  public final boolean aJC()
  {
    return getType() == 48;
  }

  public final boolean aJD()
  {
    switch (getType())
    {
    default:
      return false;
    case 1:
    case 11:
    case 21:
    case 31:
    case 36:
    }
    return true;
  }

  public final boolean aJE()
  {
    return getType() == 43;
  }

  public final boolean aJF()
  {
    return getType() == 47;
  }

  public final boolean aJG()
  {
    return getType() == 1048625;
  }

  public final boolean aJH()
  {
    return getType() == 268435505;
  }

  public final boolean aJI()
  {
    return getType() == -1879048191;
  }

  public final boolean aJJ()
  {
    switch (getType())
    {
    case 56:
    default:
      return false;
    case 55:
    case 57:
    }
    return true;
  }

  public final boolean aJK()
  {
    String str = com.tencent.mm.f.e.or().getValue("TranslateMsgOff");
    if ((!ch.jb(str)) && (ch.xy(str) != 0))
      z.d("!32@/B4Tb64lLpLj7S4izLo0fEWYz+HNsMhY", "isTranslateFeatureOn false");
    for (int i = 0; (i != 0) && (!ch.jb(kw())); i = 1)
      return true;
    return false;
  }

  public final boolean aJL()
  {
    return (0x1 & kC()) > 0;
  }

  public final boolean aJM()
  {
    return (aJK()) && ((0x10 & ky()) != 0);
  }

  public final void aJN()
  {
    if (!aJK())
      return;
    bI(0x10 | ky());
  }

  public final boolean aJu()
  {
    return (0xFFFF & getType()) == 49;
  }

  public final boolean aJv()
  {
    return getType() == 285212721;
  }

  public final boolean aJw()
  {
    return getType() == 34;
  }

  public final boolean aJx()
  {
    return getType() == 301989937;
  }

  public final boolean aJy()
  {
    return (getType() == 50) || (getType() == 53);
  }

  public final boolean aNW()
  {
    return getType() == 62;
  }

  public final boolean isSystem()
  {
    return getType() == 10000;
  }

  public final void ok(int paramInt)
  {
    switch (paramInt)
    {
    default:
      z.w("!32@/B4Tb64lLpLj7S4izLo0fEWYz+HNsMhY", "Illgeal forwardflag !!!");
      return;
    case 0:
    case 1:
    }
    bI(paramInt | ky());
  }

  public final void setStatus(int paramInt)
  {
    super.setStatus(paramInt);
    if ((getStatus() == 5) && (jK() == 1))
    {
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = ch.aHN();
      arrayOfObject[1] = Long.valueOf(kk());
      arrayOfObject[2] = Integer.valueOf(getType());
      arrayOfObject[3] = kt();
      z.i("!32@/B4Tb64lLpLj7S4izLo0fEWYz+HNsMhY", "set msg status fail, path:%s, msgId:%d, type:%d, userName:%s", arrayOfObject);
      jy localjy = new jy();
      localjy.cNR.cMU = kt();
      localjy.cNR.cNS = getType();
      a.aGB().g(localjy);
    }
  }

  public final boolean zk(String paramString)
  {
    if ((!ch.jb(kz())) && (!ch.jb(paramString)))
    {
      Map localMap = x.bB(kz(), "msgsource");
      if (localMap == null)
        return false;
      String str = (String)localMap.get(".msgsource.atuserlist");
      if (!ch.jb(str))
      {
        String[] arrayOfString = str.split(",");
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
          if (arrayOfString[j].trim().equals(paramString))
            return true;
      }
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ar
 * JD-Core Version:    0.6.2
 */