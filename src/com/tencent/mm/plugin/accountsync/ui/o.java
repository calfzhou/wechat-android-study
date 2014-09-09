package com.tencent.mm.plugin.accountsync.ui;

import android.os.Bundle;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ag;
import com.tencent.mm.modelfriend.ah;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bp;
import com.tencent.mm.storage.bq;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.c.a.d;
import com.tencent.mm.ui.c.a.g;
import com.tencent.mm.ui.c.a.h;
import java.util.ArrayList;
import java.util.List;

final class o
  implements g
{
  o(n paramn, long[] paramArrayOfLong)
  {
  }

  public final void a(Bundle paramBundle)
  {
    z.i("!56@/B4Tb64lLpI1xvkrLEXBhhg96dI0eWcb0x/iHQfmkIg6em4Z80TVkw==", "fbinvite oncomplete");
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new bq(33, Integer.toString(this.dXa.length)));
    bg.qW().oS().a(new bp(localArrayList));
    for (long l : this.dXa)
    {
      ag localag = new ag();
      localag.setUsername(Long.toString(l));
      localag.dx(5);
      localag.dy((int)ch.CL());
      az.xd().a(localag);
    }
    e.a(this.dXb.dWW, com.tencent.mm.n.bGS, com.tencent.mm.n.buo, com.tencent.mm.n.buB, com.tencent.mm.n.btP, new p(this), new q(this));
  }

  public final void a(d paramd)
  {
    z.e("!56@/B4Tb64lLpI1xvkrLEXBhhg96dI0eWcb0x/iHQfmkIg6em4Z80TVkw==", "fbinvite error");
  }

  public final void a(h paramh)
  {
    z.e("!56@/B4Tb64lLpI1xvkrLEXBhhg96dI0eWcb0x/iHQfmkIg6em4Z80TVkw==", "fbinvite error");
  }

  public final void onCancel()
  {
    z.e("!56@/B4Tb64lLpI1xvkrLEXBhhg96dI0eWcb0x/iHQfmkIg6em4Z80TVkw==", "fbinvite cancle");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.o
 * JD-Core Version:    0.6.2
 */