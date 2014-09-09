package com.tencent.mm.jdbiz;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.util.Map;

public final class f
{
  public String cJr = "";
  public boolean dQA = false;
  public boolean dQB = false;
  public String dQC = "";
  public String dQD = "";
  public String dQE = "";
  public String dQF = "";
  public String dQw = "";
  public String dQx = "";
  public long dQy = 0L;
  public String dQz = "";
  public String daK = "";

  public static f Cm()
  {
    String str = (String)bg.qW().oQ().get(327942, "");
    f localf = new f();
    z.i("!32@/B4Tb64lLpKkzHS3T0+TXSKXekD3nDHE", " create xml : " + str);
    localf.iP(str);
    return localf;
  }

  public final boolean Cn()
  {
    return (this.dQy != 0L) && (this.dQy < System.currentTimeMillis() / 1000L);
  }

  public final String Co()
  {
    return ch.Y(this.cJr, "");
  }

  public final boolean a(f paramf)
  {
    if (paramf == null);
    while (!ch.Y(this.dQx, "").equals(ch.Y(paramf.dQx, "")))
      return true;
    return false;
  }

  public final void iP(String paramString)
  {
    this.dQw = "";
    this.dQx = "";
    this.dQy = 0L;
    this.dQz = "";
    this.dQA = false;
    this.dQB = false;
    this.dQD = "";
    this.dQE = "";
    this.dQF = "";
    this.dQC = "";
    this.daK = "";
    this.cJr = "";
    this.cJr = paramString;
    if (ch.jb(paramString));
    Map localMap;
    do
    {
      return;
      z.i("!32@/B4Tb64lLpKkzHS3T0+TXSKXekD3nDHE", "feed xml %s", new Object[] { paramString });
      localMap = x.bB(paramString, "sysmsg");
    }
    while (localMap == null);
    this.dQw = ch.Y((String)localMap.get(".sysmsg.biztype"), "");
    this.dQC = ch.Y((String)localMap.get(".sysmsg.alert"), "");
    this.dQx = ch.Y((String)localMap.get(".sysmsg.activityid"), "");
    this.dQy = ch.xz((String)localMap.get(".sysmsg.expiretime"));
    this.dQz = ch.Y((String)localMap.get(".sysmsg.content.jdcelltitle"), "");
    this.daK = ch.Y((String)localMap.get(".sysmsg.content.jumpurl"), "");
    this.dQA = "1".equals(localMap.get(".sysmsg.content.findshowreddot"));
    this.dQB = "1".equals(localMap.get(".sysmsg.content.jdcellshowred"));
    this.dQD = ch.Y((String)localMap.get(".sysmsg.content.alertviewtitle"), "");
    this.dQE = ch.Y((String)localMap.get(".sysmsg.content.alertviewconfirm"), "");
    this.dQF = ch.Y((String)localMap.get(".sysmsg.content.alertviewcancel"), "");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jdbiz.f
 * JD-Core Version:    0.6.2
 */