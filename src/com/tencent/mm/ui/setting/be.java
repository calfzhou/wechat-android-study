package com.tencent.mm.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.model.b;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.protocal.a.je;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.e;

final class be
  implements View.OnClickListener
{
  be(SettingsAboutSystemUI paramSettingsAboutSystemUI, LinearLayout paramLinearLayout)
  {
  }

  public final void onClick(View paramView)
  {
    for (int i = 0; i < this.iXK.getChildCount(); i++)
    {
      TextView localTextView = (TextView)this.iXK.getChildAt(i);
      if (i.aSX != localTextView.getId())
        localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, h.ZM, 0);
    }
    ((TextView)paramView).setCompoundDrawablesWithIntrinsicBounds(0, 0, h.ZL, 0);
    int j = ((Integer)com.tencent.mm.model.bg.qW().oQ().get(7, Integer.valueOf(0))).intValue();
    int k = ((Integer)paramView.getTag()).intValue();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(k);
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT+BSAsOwccJqRYDj4eEZzt8=", "settings_silence_update_mode choice: %d", arrayOfObject);
    int m;
    if (k == 0)
    {
      m = 1;
      if ((j & 0x1000000) != 0)
        break label157;
    }
    label157: for (int n = 1; ; n = 0)
    {
      if (m != n)
        break label163;
      return;
      m = 0;
      break;
    }
    label163: int i1 = 0;
    if (k == 0)
      i1 = 1;
    int i2;
    if (i1 != 0)
    {
      i2 = 0xFEFFFFFF & j;
      if (i1 != 0)
        break label283;
    }
    label283: for (int i3 = 1; ; i3 = 2)
    {
      com.tencent.mm.model.bg.qW().oQ().set(7, Integer.valueOf(i2));
      je localje = new je();
      localje.iad = 35;
      localje.iae = i3;
      com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(23, localje));
      a.dWp.hT();
      paramView.post(new bf(this));
      return;
      i2 = j | 0x1000000;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.be
 * JD-Core Version:    0.6.2
 */