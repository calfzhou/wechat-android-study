package com.tencent.mm.pluginsdk.model.app;

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

public final class bb
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
  private ay dyc = new ay(bg.qQ().getLooper(), new be(this), false);
  private boolean tm = false;

  public bb()
  {
    bg.qX().a(220, this);
    bg.qX().a(221, this);
    bg.qX().a(222, this);
  }

  public static void cr(long paramLong)
  {
    bg.qX().d(new ap(paramLong));
  }

  private void xW()
  {
    this.dGs.clear();
    this.dxX.clear();
    this.dGr.clear();
    this.dya = false;
    this.dGt = false;
    this.tm = false;
    z.d("!32@/B4Tb64lLpLoJPSIVxJcckmKhlwfO3bY", "Finish service use time(ms):" + this.dyb.nM());
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramx.getType());
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    z.d("!32@/B4Tb64lLpLoJPSIVxJcckmKhlwfO3bY", "onSceneEnd type:%d errType:%d errCode:%d", arrayOfObject);
    bg.qQ().n(new bc(this, paramx, paramInt1, paramInt2));
  }

  protected final void finalize()
  {
    bg.qX().b(220, this);
    bg.qX().b(221, this);
    bg.qX().b(222, this);
    super.finalize();
  }

  public final void run()
  {
    bg.qQ().n(new bd(this));
  }

  public final void stop()
  {
    this.dxY = 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.bb
 * JD-Core Version:    0.6.2
 */