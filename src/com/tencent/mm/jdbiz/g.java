package com.tencent.mm.jdbiz;

import android.os.Looper;
import com.tencent.mm.model.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.model.dw;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Map;

public class g
  implements bd
{
  private c dQG = null;
  private f dQH = null;
  private Map dQI = new HashMap();

  public static g Cp()
  {
    g localg = (g)bg.qF().eA(g.class.getName());
    if (localg == null)
    {
      localg = new g();
      bg.qF().a(g.class.getName(), localg);
    }
    return localg;
  }

  public static boolean Cq()
  {
    return "1".equals((String)bg.qW().oQ().get(327939, ""));
  }

  public static boolean Cr()
  {
    return "1".equals((String)bg.qW().oQ().get(327938, ""));
  }

  public static void Cs()
  {
    bg.qW().oQ().set(327938, "");
  }

  public static void Ct()
  {
    bg.qW().oQ().set(327939, "");
  }

  private void Cv()
  {
    new cm(Looper.getMainLooper()).post(new h(this));
  }

  public static void Cw()
  {
    if (bg.oE())
    {
      Cp();
      if (!Cq())
      {
        Cp();
        if (!Cr());
      }
      else
      {
        f localf = Cp().Cu();
        if (((!ch.jb(localf.dQz)) || (localf.dQB)) && (localf.Cn()))
        {
          z.i("!32@/B4Tb64lLpIAhUt0Bg2QTtWB4LwsluWk", "clear red dot/friend dot");
          Cp();
          Cs();
          Cp();
          Ct();
          Cp().Cv();
        }
      }
    }
  }

  public static boolean Cx()
  {
    String str1 = com.tencent.mm.f.e.or().getValue("JDEntranceConfigName");
    String str2 = com.tencent.mm.f.e.or().getValue("JDEntranceConfigIconUrl");
    String str3 = com.tencent.mm.f.e.or().getValue("JDEntranceConfigJumpUrl");
    return (!ch.jb(str1)) && (!ch.jb(str2)) && (!ch.jb(str3));
  }

  public static void b(f paramf)
  {
    if (bg.qW().oD() == 0)
      throw new a();
    g localg = Cp();
    if (localg.dQH == null)
      localg.dQH = f.Cm();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = localg.dQH.Co();
    arrayOfObject[1] = paramf.Co();
    z.i("!32@/B4Tb64lLpIAhUt0Bg2QTtWB4LwsluWk", "updatejdMsgContent old: %s new: %s", arrayOfObject);
    if (!paramf.a(localg.dQH))
    {
      z.i("!32@/B4Tb64lLpIAhUt0Bg2QTtWB4LwsluWk", "fo zu baoyou! the activityid is same");
      return;
    }
    if ((!ch.jb(paramf.dQz)) || (paramf.dQB))
      bg.qW().oQ().set(327939, "1");
    if (paramf.dQA)
      bg.qW().oQ().set(327938, "1");
    while (true)
    {
      localg.dQH = paramf;
      bg.qW().oQ().set(327942, paramf.cJr);
      localg.Cv();
      return;
      bg.qW().oQ().set(327938, "");
    }
  }

  public static String t(String paramString, int paramInt)
  {
    if (-1 == paramString.indexOf('#'))
    {
      if (-1 == paramString.indexOf('?'))
        paramString = paramString + "?wc_scene=" + paramInt;
    }
    else
      return paramString;
    return paramString + "&wc_scene=" + paramInt;
  }

  public final f Cu()
  {
    if (this.dQH == null)
      this.dQH = f.Cm();
    return this.dQH;
  }

  public final void O(boolean paramBoolean)
  {
    z.i("!32@/B4Tb64lLpIAhUt0Bg2QTtWB4LwsluWk", "onAccountPostReset");
    if (this.dQG == null)
      this.dQG = new c();
    bg.qR().a("jd", this.dQG, true);
  }

  public final void ci(int paramInt)
  {
  }

  public final void iQ(String paramString)
  {
    if (ch.jb(paramString))
      return;
    this.dQI.put(paramString, Integer.valueOf(1));
  }

  public final boolean iR(String paramString)
  {
    if (ch.jb(paramString))
      return false;
    return this.dQI.containsKey(paramString);
  }

  public final void nv()
  {
    z.i("!32@/B4Tb64lLpIAhUt0Bg2QTtWB4LwsluWk", "onAccountRelease");
    if (this.dQG != null)
    {
      this.dQG.nv();
      bg.qR().b("jd", this.dQG, true);
    }
    this.dQI.clear();
    this.dQG = null;
  }

  public final HashMap nw()
  {
    return null;
  }

  public final void r(String paramString1, String paramString2)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jdbiz.g
 * JD-Core Version:    0.6.2
 */