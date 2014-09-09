package com.tencent.mm.ui.pluginapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.ui.setting.gc;

final class g
  implements View.OnClickListener
{
  g(AddMoreFriendsUI paramAddMoreFriendsUI)
  {
  }

  public final void onClick(View paramView)
  {
    if (AddMoreFriendsUI.a(this.jKD) != null)
    {
      n localn = n.fTF;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(1);
      localn.d(11264, arrayOfObject);
      AddMoreFriendsUI.a(this.jKD).show();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.g
 * JD-Core Version:    0.6.2
 */