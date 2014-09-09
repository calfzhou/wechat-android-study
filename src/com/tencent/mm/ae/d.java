package com.tencent.mm.ae;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.j;
import com.tencent.mm.o.k;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import java.util.LinkedList;
import java.util.Queue;

public final class d
  implements j, m
{
  private Queue dBc = null;
  private boolean dBd = false;

  private void yS()
  {
    if (this.dBd);
    String str;
    do
    {
      do
        return;
      while (this.dBc.size() == 0);
      e locale = (e)this.dBc.peek();
      if (locale.dBf.size() == 0)
      {
        this.dBc.poll();
        bg.qW().oQ().set(8193, locale.dBe);
        bg.qW().oQ().set(8449, Long.valueOf(ch.CL()));
        return;
      }
      str = (String)locale.dBf.peek();
    }
    while ((str == null) || (str.length() <= 0));
    this.dBd = true;
    a locala = new a(str);
    bg.qX().a(141, this);
    bg.qX().d(locala);
  }

  public final k a(q paramq)
  {
    String str = ai.a(paramq.hOS);
    if (this.dBc == null)
      this.dBc = new LinkedList();
    e locale = new e(str);
    if (locale.dBe != null)
    {
      this.dBc.offer(locale);
      yS();
    }
    return null;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() != 141)
    {
      this.dBd = false;
      return;
    }
    bg.qX().b(141, this);
    String str = ((a)paramx).getUrl();
    e locale = (e)this.dBc.peek();
    if ((locale == null) || (locale.dBf.size() == 0))
    {
      z.e("!44@/B4Tb64lLpIeWAyce14PnSoaZ878e2B/PLRAkCxQjzY=", "getDoSceneQueue failed ! reset queue!");
      this.dBc = new LinkedList();
      this.dBd = false;
      return;
    }
    if (locale.dBf.size() == 0)
    {
      z.e("!44@/B4Tb64lLpIeWAyce14PnSoaZ878e2B/PLRAkCxQjzY=", "get imgQueue failed ! ignore this message");
      this.dBc.poll();
      this.dBd = false;
      return;
    }
    if (!((String)locale.dBf.peek()).equals(str))
    {
      z.e("!44@/B4Tb64lLpIeWAyce14PnSoaZ878e2B/PLRAkCxQjzY=", "check img url failed ! ignore this message");
      this.dBc.poll();
      this.dBd = false;
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      z.e("!44@/B4Tb64lLpIeWAyce14PnSoaZ878e2B/PLRAkCxQjzY=", "down failed [" + paramInt1 + "," + paramInt2 + "] ignore this message : img:[" + str + "] ");
      this.dBc.poll();
      this.dBd = false;
      return;
    }
    locale.dBf.poll();
    this.dBd = false;
    yS();
  }

  public final void d(ar paramar)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ae.d
 * JD-Core Version:    0.6.2
 */