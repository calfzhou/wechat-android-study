package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelvoice.bm;
import com.tencent.mm.modelvoice.br;
import com.tencent.mm.modelvoice.bs;
import com.tencent.mm.modelvoice.cb;
import com.tencent.mm.modelvoice.w;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.e;

final class nk
  implements cm
{
  nk(ar paramar, Context paramContext)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    String str1 = paramMenuItem.getTitle();
    if (ch.jb(this.dxM.kp()))
    {
      z.e("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "Transfer fileName erro: fileName null");
      return;
    }
    String str2 = this.dxM.kp();
    br localbr = bm.BD().iG(str2);
    String str3 = this.dxM.kp();
    if (localbr == null);
    for (int i = 0; ; i = localbr.BM())
    {
      String str4 = bs.c(str1, str3, i);
      z.i("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "connector click[voice]: to[%s] filePath[%s]", new Object[] { str1, str4 });
      w localw = new w(str4, 1);
      bg.qX().d(localw);
      com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(34);
      arrayOfObject[1] = Integer.valueOf(2);
      arrayOfObject[2] = str1;
      localn.d(10424, arrayOfObject);
      e.aw(this.dLL, this.dLL.getString(com.tencent.mm.n.bue));
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.nk
 * JD-Core Version:    0.6.2
 */