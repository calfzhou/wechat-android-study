package com.tencent.mm.ui.chatting;

import android.app.Activity;
import com.tencent.mm.ab.h;
import com.tencent.mm.compatible.c.q;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cx;
import com.tencent.mm.model.y;
import com.tencent.mm.modelsimple.an;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.storage.cm;
import com.tencent.mm.storage.i;

final class ls
  implements Runnable
{
  ls(hd paramhd, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    if (hd.Y(this.jtA))
    {
      this.jtA.zj();
      com.tencent.mm.u.a locala = new com.tencent.mm.u.a(this.jtA.jnf.getUsername(), this.juo);
      bg.qX().d(locala);
    }
    String str1;
    do
    {
      return;
      if ((this.jtA.joh.getCount() == 0) && (i.ya(this.jtA.aUL())))
      {
        cx localcx = cx.rV();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(1);
        localcx.a(10076, arrayOfObject);
      }
      str1 = this.jtA.aUL();
      int i = y.dR(str1);
      String str2 = this.juo;
      if ((i == 1) && (y.dx(str1)))
        str2 = com.tencent.mm.ar.a.Bg(this.juo);
      h localh = new h(str1, str2, i);
      bg.qX().d(localh);
    }
    while (!y.dO(str1));
    an localan = new an(ap.DI(), this.juo + " key " + cm.aKL() + " local key " + cm.aKK() + "NetType:" + bc.bz(this.jtA.agh().getApplicationContext()) + " hasNeon: " + q.mY() + " isArmv6: " + q.na() + " isArmv7: " + q.mZ());
    bg.qX().d(localan);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ls
 * JD-Core Version:    0.6.2
 */