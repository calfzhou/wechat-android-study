package com.tencent.mm.ad;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ab;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.e;

public final class r
  implements com.tencent.mm.o.m
{
  private static r dAB;
  private boolean dAf = false;
  private int dAg = 3;

  private void release()
  {
    this.dAf = false;
    bg.qX().b(159, this);
    bg.qX().b(160, this);
  }

  private static void yH()
  {
    bg.qW().oQ().set(81937, Long.valueOf(ch.CL()));
  }

  public static r yM()
  {
    if (dAB == null)
      dAB = new r();
    return dAB;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if ((!(paramx instanceof ab)) || (((ab)paramx).tu() != 8))
      z.d("!44@/B4Tb64lLpJmIJaV8eMcmdDDiiuxActmyM3tbrcywnI=", "another scene");
    int i;
    do
    {
      return;
      i = paramx.getType();
      if (i == 159)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          yH();
          l[] arrayOfl = s.yO().ed(8);
          if ((arrayOfl == null) || (arrayOfl.length == 0))
          {
            z.i("!44@/B4Tb64lLpJmIJaV8eMcmdDDiiuxActmyM3tbrcywnI=", "error no pkg found.");
            release();
            return;
          }
          l locall = arrayOfl[0];
          z.i("!44@/B4Tb64lLpJmIJaV8eMcmdDDiiuxActmyM3tbrcywnI=", "dkregcode Pkg id:" + locall.getId() + " version:" + locall.getVersion() + " status:" + locall.getStatus() + " type:" + locall.yJ());
          if (5 != locall.getStatus())
          {
            release();
            return;
          }
          j localj = new j(locall.getId(), 8);
          bg.qX().d(localj);
          return;
        }
        int j = -1 + this.dAg;
        this.dAg = j;
        if (j <= 0)
        {
          bg.qW().oQ().set(81937, Long.valueOf((3600000L + (ch.CM() - 604800000L)) / 1000L));
          this.dAg = 3;
        }
        release();
        return;
      }
    }
    while (i != 160);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      yH();
      RegionCodeDecoder.aKA().aHZ();
    }
    release();
  }

  public final void update()
  {
    if ((!this.dAf) && (bg.qW().isSDCardAvailable()))
    {
      release();
      this.dAf = true;
      bg.qX().a(159, this);
      bg.qX().a(160, this);
      k localk = new k(8);
      bg.qX().d(localk);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.r
 * JD-Core Version:    0.6.2
 */