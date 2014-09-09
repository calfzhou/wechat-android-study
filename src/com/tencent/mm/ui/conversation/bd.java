package com.tencent.mm.ui.conversation;

import android.view.MenuItem;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.aw;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.tools.t;

final class bd
  implements cm
{
  bd(aj paramaj)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    int i = -1;
    switch (paramMenuItem.getItemId())
    {
    default:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    }
    while (true)
    {
      if (i > 0)
      {
        com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i);
        localn.d(11090, arrayOfObject2);
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(i);
        z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "jacks kv long click: %d", arrayOfObject3);
      }
      return;
      aj.a(this.jGZ, aj.t(this.jGZ));
      i = 1;
      continue;
      i = 4;
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "placed to the top");
      bg.qW().oW().yI(aj.t(this.jGZ));
      e.aw(this.jGZ.agh(), this.jGZ.getString(com.tencent.mm.n.bQR));
      continue;
      i = 5;
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "unplaced to the top");
      bg.qW().oW().yJ(aj.t(this.jGZ));
      e.aw(this.jGZ.agh(), this.jGZ.getString(com.tencent.mm.n.bQS));
      continue;
      i = 3;
      Object[] arrayOfObject6 = new Object[1];
      arrayOfObject6[0] = aj.t(this.jGZ);
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "jacks mark read: %s", arrayOfObject6);
      bg.qW().oW().yF(aj.t(this.jGZ));
      MMAppMgr.cb(aj.t(this.jGZ));
      aw.u(aj.t(this.jGZ), 1);
      continue;
      i = 2;
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = aj.t(this.jGZ);
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "jacks set unread: %s", arrayOfObject5);
      bg.qW().oW().yG(aj.t(this.jGZ));
      continue;
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = aj.t(this.jGZ);
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "jacks clear history: %s", arrayOfObject4);
      aj.t(this.jGZ).endsWith("@chatroom");
      aj.c(this.jGZ, aj.t(this.jGZ));
      continue;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = aj.t(this.jGZ);
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "delete biz service: %s", arrayOfObject1);
      i locali = bg.qW().oT().ys(aj.t(this.jGZ));
      t.a(r.fE(aj.t(this.jGZ)), this.jGZ.agh(), locali, false);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.bd
 * JD-Core Version:    0.6.2
 */