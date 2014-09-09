package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.v;
import com.tencent.mm.model.cx;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.transmit.m;

final class nm
  implements cm
{
  nm(ar paramar, Context paramContext)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    String str = paramMenuItem.getTitle();
    q localq = v.ij(this.dxM.kp());
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = str;
    arrayOfObject[1] = this.dxM.kp();
    z.i("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "connector click[video]: to[%s] imgPath[%s]", arrayOfObject);
    m localm = new m();
    Context localContext = this.dLL;
    this.dLL.getResources().getString(n.buo);
    cr localcr = e.a(localContext, this.dLL.getResources().getString(n.bui), true, new nn(this, localm));
    localm.context = this.dLL;
    localm.rI = this.dxM.kp();
    localm.dXD = localcr;
    localm.cDi = str;
    localm.jYf = localq.AX();
    localm.dGd = localq.AU();
    localm.execute(new Object[0]);
    cx.rV().a(cx.dmr, null);
    e.aw(this.dLL, this.dLL.getString(n.bue));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.nm
 * JD-Core Version:    0.6.2
 */