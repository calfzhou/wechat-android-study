package com.tencent.mm.ui.contact.profile;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.storage.i;

final class df
  implements View.OnClickListener
{
  df(dd paramdd)
  {
  }

  public final void onClick(View paramView)
  {
    this.jEG.aXX();
    if (NormalUserFooterPreference.A(this.jEG.jEw) != 0)
    {
      n localn = n.fTF;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(NormalUserFooterPreference.A(this.jEG.jEw));
      arrayOfObject[1] = NormalUserFooterPreference.a(this.jEG.jEw).getUsername();
      localn.d(11263, arrayOfObject);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.df
 * JD-Core Version:    0.6.2
 */