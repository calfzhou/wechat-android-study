package com.tencent.mm.ad;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;

public final class c
  implements m
{
  private static c dAh;
  private boolean dAf = false;
  private int dAg = 3;

  private void release()
  {
    this.dAf = false;
    bg.qX().b(159, this);
  }

  public static c yG()
  {
    if (dAh == null)
      dAh = new c();
    return dAh;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() == 159)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label41;
      bg.qW().oQ().set(81938, Long.valueOf(ch.CL()));
    }
    while (true)
    {
      release();
      return;
      label41: int i = -1 + this.dAg;
      this.dAg = i;
      if (i < 0)
      {
        bg.qW().oQ().set(81938, Long.valueOf((3600000L + (ch.CM() - 86400000L)) / 1000L));
        this.dAg = 3;
      }
    }
  }

  public final void update()
  {
    new StringBuilder("isUpdateing : ").append(this.dAf);
    new StringBuilder("isSDCardAvailable : ").append(bg.qW().isSDCardAvailable());
    if ((!this.dAf) && (bg.qW().isSDCardAvailable()))
    {
      release();
      this.dAf = true;
      bg.qX().a(159, this);
      k localk = new k(7);
      bg.qX().d(localk);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.c
 * JD-Core Version:    0.6.2
 */