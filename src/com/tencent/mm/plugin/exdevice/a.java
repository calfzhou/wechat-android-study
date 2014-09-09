package com.tencent.mm.plugin.exdevice;

import android.widget.Toast;
import com.tencent.mm.c.a.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.q.e;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.chatting.hd;

public final class a
{
  private hd eHX;
  private c eHY;

  public a(hd paramhd)
  {
    z.d("!64@/B4Tb64lLpLHXwcx366fGo2wcxwH4rCJR7HpyE+E0/zfnN6G97cBRqZ3oCdpuO6G", "now init the event listener");
    this.eHX = paramhd;
    if (this.eHY == null)
      this.eHY = new c(this);
    com.tencent.mm.sdk.c.a.aGB().a("OpFromExDevice", this.eHY);
  }

  public static boolean e(com.tencent.mm.q.a parama)
  {
    if (parama == null);
    e locale;
    do
    {
      do
        return false;
      while (parama == null);
      locale = parama.tY();
    }
    while ((locale == null) || (locale.uw() == null) || (!locale.uw().uE()));
    return true;
  }

  public final void a(int paramInt, com.tencent.mm.q.a parama)
  {
    if (this.eHX == null)
      z.e("!64@/B4Tb64lLpLHXwcx366fGo2wcxwH4rCJR7HpyE+E0/zfnN6G97cBRqZ3oCdpuO6G", "notifySwitchView, context is null, maybe has been released");
    while ((!y.dj(this.eHX.aUL())) || (!e(parama)))
      return;
    bg.qQ().n(new b(this, paramInt));
  }

  public final void gR(int paramInt)
  {
    if (this.eHX == null)
      z.e("!64@/B4Tb64lLpLHXwcx366fGo2wcxwH4rCJR7HpyE+E0/zfnN6G97cBRqZ3oCdpuO6G", "context is null, maybe has been released");
    do
    {
      return;
      if (paramInt == -1)
      {
        Toast.makeText(this.eHX.agh(), n.bGj, 0).show();
        bd localbd = new bd();
        localbd.cIh.op = 0;
        localbd.cIh.cDi = this.eHX.aUL();
        localbd.cIh.context = this.eHX.agh();
        com.tencent.mm.sdk.c.a.aGB().g(localbd);
        return;
      }
    }
    while (paramInt != 0);
    Toast.makeText(this.eHX.agh(), n.bGi, 0).show();
  }

  public final void release()
  {
    z.d("!64@/B4Tb64lLpLHXwcx366fGo2wcxwH4rCJR7HpyE+E0/zfnN6G97cBRqZ3oCdpuO6G", "now release the event listener");
    if (this.eHY != null)
    {
      com.tencent.mm.sdk.c.a.aGB().b("OpFromExDevice", this.eHY);
      this.eHY = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a
 * JD-Core Version:    0.6.2
 */