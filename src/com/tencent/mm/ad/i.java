package com.tencent.mm.ad;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ab;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class i
  implements com.tencent.mm.o.m
{
  private i()
  {
    bg.qX().a(159, this);
    bg.qX().a(160, this);
    k localk = new k(5);
    bg.qX().d(localk);
  }

  private void release()
  {
    bg.qX().b(159, this);
    bg.qX().b(160, this);
  }

  public static void update()
  {
    long l = ch.a((Long)bg.qW().oQ().get(81939), 0L);
    if (ch.CM() - l > 86400000L);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        new i();
      return;
    }
  }

  private static void yH()
  {
    bg.qW().oQ().set(81939, Long.valueOf(ch.CM()));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if ((!(paramx instanceof ab)) || (((ab)paramx).tu() != 5))
      z.d("!44@/B4Tb64lLpJGl7p3Wcq6OAPEB5iHmCIIWEbf2PIkuc4=", "another scene");
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
          l[] arrayOfl = s.yO().ed(5);
          if ((arrayOfl == null) || (arrayOfl.length == 0))
          {
            z.i("!44@/B4Tb64lLpJGl7p3Wcq6OAPEB5iHmCIIWEbf2PIkuc4=", "error no pkg found.");
            release();
            return;
          }
          l locall = arrayOfl[0];
          z.i("!44@/B4Tb64lLpJGl7p3Wcq6OAPEB5iHmCIIWEbf2PIkuc4=", "dkregcode Pkg id:" + locall.getId() + " version:" + locall.getVersion() + " status:" + locall.getStatus() + " type:" + locall.yJ());
          if (5 != locall.getStatus())
          {
            release();
            return;
          }
          j localj = new j(locall.getId(), 5);
          bg.qX().d(localj);
          return;
        }
        release();
        return;
      }
    }
    while (i != 160);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      yH();
    release();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.i
 * JD-Core Version:    0.6.2
 */