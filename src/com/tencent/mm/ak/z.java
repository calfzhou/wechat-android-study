package com.tencent.mm.ak;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class z
  implements m
{
  private static int dGw = 0;
  Queue dGr = new LinkedList();
  Map dGs = new HashMap();
  private boolean dGt = false;
  private d dGu = null;
  private g dGv = null;
  Queue dxX = new LinkedList();
  private int dxY = 0;
  private long dxZ = 0L;
  private boolean dya = false;
  l dyb = new l();
  private ay dyc = new ay(bg.qQ().getLooper(), new ac(this), false);
  private boolean tm = false;

  public z()
  {
    bg.qX().a(149, this);
    bg.qX().a(150, this);
  }

  private void xW()
  {
    this.dGs.clear();
    this.dxX.clear();
    this.dGr.clear();
    this.dya = false;
    this.dGt = false;
    this.tm = false;
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLVp/k2HKC5ReM1DewbkulZ", "Finish service use time(ms):" + this.dyb.nM());
  }

  public final void Bc()
  {
    if (this.dGu != null)
      this.dGu.stop();
    this.dGs.clear();
    this.dxX.clear();
    this.dGr.clear();
  }

  public final void Bd()
  {
    if (this.dGv != null)
      this.dGv.stop();
    this.dGs.clear();
    this.dxX.clear();
    this.dGr.clear();
  }

  public final void CQ()
  {
    bg.qX().c(this.dGu);
    xW();
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    bg.qQ().n(new aa(this, paramx, paramInt1, paramInt2));
  }

  public final void run()
  {
    bg.qQ().n(new ab(this));
  }

  public final void stop()
  {
    this.dxY = 0;
    if (this.dGu != null)
      this.dGu.stop();
    if (this.dGv != null)
      this.dGv.stop();
    bg.qX().b(149, this);
    bg.qX().b(150, this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.z
 * JD-Core Version:    0.6.2
 */