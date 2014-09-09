package com.tencent.mm.modelcdntran;

import com.tencent.mm.model.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import java.io.File;
import java.util.HashMap;

public class k
  implements bd
{
  private static k dsq;
  private CdnTransportEngine dsr = null;
  private c dss = null;

  public static k vj()
  {
    k localk = (k)bg.qF().eA(k.class.getName());
    dsq = localk;
    if (localk == null)
    {
      dsq = new k();
      bg.qF().a(k.class.getName(), dsq);
    }
    return dsq;
  }

  public static String vk()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    return bg.qW().pt() + "cdndnsinfo/";
  }

  public static c vl()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    return vj().dss;
  }

  public static CdnTransportEngine vm()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (vj().dsr == null)
      vj().dsr = new CdnTransportEngine(bg.qW().pt(), vl());
    return vj().dsr;
  }

  public final void O(boolean paramBoolean)
  {
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    bg.a(null);
    if (this.dsr != null)
    {
      this.dsr.release();
      this.dsr = null;
    }
    if (this.dss != null)
    {
      this.dss.release();
      this.dss = null;
    }
  }

  public final HashMap nw()
  {
    return null;
  }

  public final void r(String paramString1, String paramString2)
  {
    if (vj().dss == null)
      vj().dss = new c();
    if (bg.qW().oD() == 0)
      throw new a();
    File localFile = new File(vk());
    if (!localFile.exists())
      localFile.mkdir();
    bg.a(new l(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcdntran.k
 * JD-Core Version:    0.6.2
 */