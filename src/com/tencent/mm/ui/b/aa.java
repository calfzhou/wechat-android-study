package com.tencent.mm.ui.b;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.model.bt;
import com.tencent.mm.plugin.f.c.n;
import java.lang.ref.WeakReference;

final class aa
  implements View.OnClickListener
{
  aa(s params, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    bt.rn().y(this.eaJ, this.iWN);
    a.l((Context)s.g(this.iWO).get(), "game", ".ui.GameCenterUI");
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(9);
    arrayOfObject[1] = Integer.valueOf(1);
    localn.d(11002, arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.aa
 * JD-Core Version:    0.6.2
 */