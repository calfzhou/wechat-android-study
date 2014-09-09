package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.mm.g.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.base.ck;

final class bm
  implements ck
{
  bm(Context paramContext)
  {
  }

  public final void a(TextView paramTextView, MenuItem paramMenuItem)
  {
    i locali;
    if (paramTextView != null)
    {
      locali = bg.qW().oT().ys(paramMenuItem.getTitle());
      if ((locali == null) || ((int)locali.dhv <= 0))
        paramTextView.setText(paramMenuItem.getTitle());
    }
    else
    {
      return;
    }
    paramTextView.setText(com.tencent.mm.ar.b.e(this.dLL, locali.oc(), (int)paramTextView.getTextSize()));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bm
 * JD-Core Version:    0.6.2
 */