package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class ap
  implements m
{
  private static int dGw = 0;
  Queue dGr = new LinkedList();
  Map dGs = new HashMap();
  private boolean dGt = false;
  Queue dxX = new LinkedList();
  private int dxY = 0;
  private long dxZ = 0L;
  private boolean dya = false;
  l dyb = new l();
  private ay dyc = new ay(bg.qQ().getLooper(), new as(this), false);
  private boolean tm = false;

  public ap()
  {
    bg.qX().a(127, this);
    bg.qX().a(128, this);
  }

  private void xW()
  {
    this.dGs.clear();
    this.dxX.clear();
    this.dGr.clear();
    this.dya = false;
    this.dGt = false;
    this.tm = false;
    z.d("!32@/B4Tb64lLpJjyqE6YDnAp2GSi9zkoYuv", "Finish service use time(ms):" + this.dyb.nM());
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    bg.qQ().n(new aq(this, paramx, paramInt1, paramInt2));
  }

  public final void run()
  {
    bg.qQ().n(new ar(this));
  }

  public final void stop()
  {
    this.dxY = 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.ap
 * JD-Core Version:    0.6.2
 */