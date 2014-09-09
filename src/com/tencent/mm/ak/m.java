package com.tencent.mm.ak;

import android.os.HandlerThread;
import com.tencent.mm.model.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.o.l;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.HashMap;

public class m
  implements bd
{
  private static HashMap cZG;
  private w dFS = new w();
  private r dFT;
  private z dFU = null;
  private HandlerThread dSJ = null;
  private cm dSK = null;

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("VIDEOINFO_TABLE".hashCode()), new n());
  }

  private static m AK()
  {
    m localm = (m)bg.qF().eA(m.class.getName());
    if (localm == null)
    {
      localm = new m();
      bg.qF().a(m.class.getName(), localm);
    }
    return localm;
  }

  public static r AL()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (AK().dFT == null)
      AK().dFT = new r(bg.qW().oO(), bg.qW().pk());
    return AK().dFT;
  }

  public static z AM()
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (AK().dFU == null)
      AK().dFU = new z();
    return AK().dFU;
  }

  public static void c(Runnable paramRunnable, long paramLong)
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (AK().dSK == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpIAhUt0Bg2QTpUmGQoVnGOu", "short video decoder handler is null");
      return;
    }
    if (paramLong > 0L)
    {
      AK().dSK.postDelayed(paramRunnable, paramLong);
      return;
    }
    AK().dSK.post(paramRunnable);
  }

  public static void d(Runnable paramRunnable)
  {
    if (bg.qW().oD() == 0)
      throw new a();
    if (AK().dSK == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpIAhUt0Bg2QTpUmGQoVnGOu", "short video decoder handler is null");
      return;
    }
    AK().dSK.removeCallbacks(paramRunnable);
  }

  public final void O(boolean paramBoolean)
  {
    l.a(Integer.valueOf(43), this.dFS);
    l.a(Integer.valueOf(44), this.dFS);
    l.a(Integer.valueOf(62), this.dFS);
    this.dSJ = new HandlerThread("Short-Video-Decoder-Thread", 5);
    this.dSJ.start();
    this.dSK = new cm(this.dSJ.getLooper());
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    if (AK().dFU != null)
      AK().dFU.stop();
    Integer localInteger1 = Integer.valueOf(43);
    l.O(localInteger1);
    Integer localInteger2 = Integer.valueOf(44);
    l.O(localInteger2);
    Integer localInteger3 = Integer.valueOf(62);
    l.O(localInteger3);
    this.dSK.removeCallbacksAndMessages(null);
    this.dSJ.quit();
    this.dSK = null;
    this.dSJ = null;
  }

  public final HashMap nw()
  {
    return cZG;
  }

  public final void r(String paramString1, String paramString2)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.m
 * JD-Core Version:    0.6.2
 */