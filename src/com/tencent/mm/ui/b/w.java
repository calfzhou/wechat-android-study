package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bt;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.setting.SettingsPersonalInfoUI;
import java.lang.ref.WeakReference;

final class w
  implements View.OnClickListener
{
  w(s params, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    bt.rn().y(this.eaJ, this.iWN);
    Context localContext = (Context)s.c(this.iWO).get();
    if (localContext == null)
      return;
    if (!bg.qW().isSDCardAvailable())
    {
      en.cp(localContext);
      return;
    }
    Intent localIntent = new Intent(localContext, SettingsPersonalInfoUI.class);
    localIntent.putExtra("!44@/B4Tb64lLpJkrm2DE1IrT3Y9IGxzqR8LWx0lkoXfqyE=intent_set_avatar", true);
    localIntent.putExtra("KEnterFromBanner", true);
    localContext.startActivity(localIntent);
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(4);
    arrayOfObject[1] = Integer.valueOf(1);
    localn.d(11002, arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.w
 * JD-Core Version:    0.6.2
 */