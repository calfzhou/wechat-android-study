package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.model.bt;
import com.tencent.mm.plugin.f.c.n;
import java.lang.ref.WeakReference;

final class z
  implements View.OnClickListener
{
  z(s params, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    bt.rn().y(this.eaJ, this.iWN);
    Context localContext = (Context)s.f(this.iWO).get();
    Intent localIntent = new Intent();
    localIntent.putExtra("preceding_scence", 2);
    a.b(localContext, "emoji", ".ui.EmojiStoreUI", localIntent);
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(10);
    arrayOfObject[1] = Integer.valueOf(1);
    localn.d(11002, arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.z
 * JD-Core Version:    0.6.2
 */