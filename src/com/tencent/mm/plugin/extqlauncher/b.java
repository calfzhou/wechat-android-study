package com.tencent.mm.plugin.extqlauncher;

import android.os.Looper;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.storage.s;
import java.util.HashMap;

public final class b
  implements bd
{
  private f eMP;
  private g eMQ;
  private boolean eMR = false;
  private as eMS = new c(this);
  private boolean eMT = false;
  private long eMU = 0L;
  private final long eMV = 300000L;
  private final long eMW = 4000L;
  private final String eMX = "fun1";
  private int eMY = 0;
  private cm eMZ = new e(this, Looper.getMainLooper());

  public static b Qn()
  {
    b localb = (b)bg.qF().eA("plugin.extqlauncher");
    if (localb == null)
    {
      localb = new b();
      bg.qF().a("plugin.extqlauncher", localb);
    }
    return localb;
  }

  public static int Qo()
  {
    int i;
    if (!bg.oE())
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "getMMUnread account not ready");
      i = 0;
    }
    int j;
    do
    {
      return i;
      i = com.tencent.mm.model.z.a(y.dkj, null);
      j = com.tencent.mm.model.z.qs();
    }
    while ((0x8000 & x.pK()) != 0);
    return i - j;
  }

  public final void O(boolean paramBoolean)
  {
    bg.qW().oW().a(this.eMS);
    if (this.eMP == null)
      this.eMP = new f();
    a.aGB().a("ExtCall", this.eMP);
    if (this.eMQ == null)
      this.eMQ = new g(this);
    a.aGB().a("PublishScanCodeResult", this.eMQ);
  }

  public final void Qp()
  {
    this.eMZ.removeMessages(0);
    this.eMZ.sendEmptyMessageDelayed(0, 4000L);
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    if (this.eMP != null)
      a.aGB().b("ExtCall", this.eMP);
    if (this.eMQ != null)
      a.aGB().b("PublishScanCodeResult", this.eMQ);
    bg.qW().oW().b(this.eMS);
    this.eMZ.removeMessages(0);
  }

  public final HashMap nw()
  {
    return null;
  }

  public final void r(String paramString1, String paramString2)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.b
 * JD-Core Version:    0.6.2
 */