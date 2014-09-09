package com.tencent.mm.ui.friend;

import android.content.Context;
import android.widget.Toast;
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

final class t
  implements h
{
  t(s params, com.tencent.mm.pluginsdk.ui.preference.n paramn, f paramf)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    if (paramBoolean1)
    {
      i locali = bg.qW().oT().ys(this.jIe.username);
      if ((int)locali.dhv == 0)
      {
        locali = m.a(this.jIh.jId, this.jIf);
        if (!bg.qW().oT().F(locali))
        {
          z.e("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "canAddContact fail, insert fail");
          return;
        }
      }
      y.k(locali);
      l.AF().q(this.jIe.username, 1);
      e.aw(m.a(this.jIh.jId), m.a(this.jIh.jId).getString(com.tencent.mm.n.bsH));
      m.a(this.jIh.jId, this.jIe.username);
    }
    while (true)
    {
      this.jIh.jId.notifyDataSetChanged();
      return;
      if (!paramBoolean2)
        Toast.makeText(m.a(this.jIh.jId), com.tencent.mm.n.bJT, 1).show();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.t
 * JD-Core Version:    0.6.2
 */