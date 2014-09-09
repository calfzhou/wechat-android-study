package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bt;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;
import java.lang.ref.WeakReference;

final class ac
  implements View.OnClickListener
{
  ac(s params, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    bt.rn().y(this.eaJ, this.iWN);
    Context localContext = (Context)s.i(this.iWO).get();
    String str = (String)bg.qW().oQ().get(68377);
    bg.qW().oQ().set(68377, "");
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_timeline_NeedFirstLoadint", true);
    if (!ch.jb(str));
    for (boolean bool = false; ; bool = true)
    {
      if ((am.ayi() != null) && (am.ayi().Ay() > 0))
        bool = false;
      localIntent.putExtra("sns_resume_state", bool);
      a.b(localContext, "sns", ".ui.SnsTimeLineUI", localIntent);
      n localn = n.fTF;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(8);
      arrayOfObject[1] = Integer.valueOf(1);
      localn.d(11002, arrayOfObject);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.ac
 * JD-Core Version:    0.6.2
 */