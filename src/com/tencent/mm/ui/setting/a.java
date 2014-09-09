package com.tencent.mm.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.f.c.n;

final class a
  implements View.OnClickListener
{
  a(AccountInfoPreference paramAccountInfoPreference)
  {
  }

  public final void onClick(View paramView)
  {
    if (AccountInfoPreference.a(this.jLk) != null)
    {
      n localn = n.fTF;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(1);
      localn.d(11264, arrayOfObject);
      AccountInfoPreference.a(this.jLk).show();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.a
 * JD-Core Version:    0.6.2
 */