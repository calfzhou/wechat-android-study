package com.tencent.mm.plugin.ext;

import android.os.Looper;
import com.tencent.mm.c.a.bj;
import com.tencent.mm.compatible.c.p;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.h;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.ci;
import com.tencent.mm.storage.cs;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;

public class b
  implements bd
{
  private static HashMap cZG;
  private String djU;
  private cm eLA = new g(this, Looper.getMainLooper());
  private LinkedList eLB = new LinkedList();
  private final long eLC = 60L;
  private cm eLD = new i(this, Looper.getMainLooper());
  private al eLE = new j(this);
  private final long eLt = 1600L;
  private ci eLu;
  private cs eLv;
  private k eLw;
  private HashMap eLx = new HashMap();
  private ay eLy = new e(this);
  private com.tencent.mm.pluginsdk.model.i eLz = new f(this);

  static
  {
    int i = p.mU();
    if ((i & 0x400) != 0);
    try
    {
      com.tencent.mm.compatible.g.o.a("wechatvoicesilk_v7a", b.class.getClassLoader());
      while (true)
      {
        HashMap localHashMap = new HashMap();
        cZG = localHashMap;
        localHashMap.put(Integer.valueOf("OPENMSGLISTENER_TABLE".hashCode()), new c());
        cZG.put(Integer.valueOf("USEROPENIDINAPP_TABLE".hashCode()), new d());
        return;
        if ((i & 0x200) == 0)
          break;
        com.tencent.mm.compatible.g.o.a("wechatvoicesilk", b.class.getClassLoader());
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        z.e("hakon SilkCodec", "load library failed!");
        continue;
        z.e("hakon SilkCodec", "load library failed! silk don't support armv5!!!!");
      }
    }
  }

  public static b PZ()
  {
    b localb = (b)bg.qF().eA("plugin.ext");
    if (localb == null)
    {
      localb = new b();
      bg.qF().a("plugin.ext", localb);
    }
    return localb;
  }

  public static ci Qa()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (PZ().eLu == null)
      PZ().eLu = new ci(bg.qW().oO());
    return PZ().eLu;
  }

  public static cs Qb()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (PZ().eLv == null)
      PZ().eLv = new cs(bg.qW().oO());
    return PZ().eLv;
  }

  public static String Qc()
  {
    return PZ().djU + "image/ext/pcm";
  }

  public static com.tencent.mm.storage.i aQ(long paramLong)
  {
    if ((bg.oE()) && (paramLong > 0L))
      return bg.qW().oT().cT(paramLong);
    return null;
  }

  public static void aR(long paramLong)
  {
    if (paramLong <= 0L)
      return;
    try
    {
      if (bg.qW().oV().cY(paramLong))
      {
        bg.qW().oV().z(bg.qW().oV().cV(paramLong));
        return;
      }
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", localException.getMessage());
      return;
    }
    z.e("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "msgId is out of range, " + paramLong);
  }

  public final void O(boolean paramBoolean)
  {
    bj localbj = new bj();
    localbj.cIl.op = 1;
    if (!com.tencent.mm.sdk.c.a.aGB().g(localbj))
      z.e("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "ExtAgentLifeEvent event fail in onAccountPostReset");
    h.ayq().ayr();
    bg.qW().oV().a(this.eLy, null);
    if (this.eLw == null)
      this.eLw = new k();
    com.tencent.mm.sdk.c.a.aGB().a("ExtOpenApiCall", this.eLw);
    com.tencent.mm.pluginsdk.model.app.o localo = bf.GO();
    if (localo != null)
      localo.g(this.eLE);
  }

  public final void Qd()
  {
    this.eLA.removeMessages(0);
    this.eLA.sendEmptyMessageDelayed(0, 1600L);
  }

  public final void ci(int paramInt)
  {
  }

  public final void d(String paramString, LinkedList paramLinkedList)
  {
    if ((!ch.jb(paramString)) && (paramLinkedList.size() > 0))
      h.ayq().a(ak.getContext(), this.eLz, paramLinkedList, paramString);
  }

  public final void nv()
  {
    if (this.eLw != null)
      com.tencent.mm.sdk.c.a.aGB().b("ExtOpenApiCall", this.eLw);
    com.tencent.mm.pluginsdk.model.app.o localo = bf.GO();
    if (localo != null)
      localo.h(this.eLE);
    bg.qW().oV().a(this.eLy);
    bj localbj = new bj();
    localbj.cIl.op = 2;
    if (!com.tencent.mm.sdk.c.a.aGB().g(localbj))
      z.e("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "ExtAgentLifeEvent event fail in onAccountRelease");
    h.ayq().ays();
    this.djU = "";
  }

  public final HashMap nw()
  {
    return cZG;
  }

  public final void r(String paramString1, String paramString2)
  {
    this.djU = paramString1;
    File localFile1 = new File(paramString1);
    if (!localFile1.exists())
      localFile1.mkdirs();
    File localFile2 = new File(paramString1 + "image/ext/pcm");
    if (!localFile2.exists())
      localFile2.mkdirs();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.b
 * JD-Core Version:    0.6.2
 */