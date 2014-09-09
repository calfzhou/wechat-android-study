package com.tencent.mm.ui.friend;

import android.content.Context;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.l;
import com.tencent.mm.g.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.pluginsdk.ui.applet.h;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.base.e;

final class r
  implements h
{
  r(q paramq, com.tencent.mm.pluginsdk.ui.preference.n paramn, f paramf)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    if (paramBoolean1)
    {
      i locali = bg.qW().oT().ys(this.jIe.username);
      if ((int)locali.dhv == 0)
      {
        locali = m.a(this.jIg.jId, this.jIf);
        if (!bg.qW().oT().F(locali))
        {
          z.e("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "canAddContact fail, insert fail");
          return;
        }
      }
      y.k(locali);
      l.AF().q(this.jIe.username, 1);
      e.aw(m.a(this.jIg.jId), m.a(this.jIg.jId).getString(com.tencent.mm.n.bsH));
      m.a(this.jIg.jId, this.jIe.username);
    }
    while (true)
    {
      this.jIg.jId.notifyDataSetChanged();
      return;
      if (!paramBoolean2)
        break;
      l.AF().q(this.jIe.username, 2);
    }
    z.e("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "canAddContact fail, username = " + this.jIe.username);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.r
 * JD-Core Version:    0.6.2
 */