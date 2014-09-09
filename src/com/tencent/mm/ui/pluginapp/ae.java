package com.tencent.mm.ui.pluginapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.tencent.mm.aj.i;
import com.tencent.mm.aj.l;
import com.tencent.mm.am.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.LauncherUI;

final class ae
  implements DialogInterface.OnClickListener
{
  ae(t paramt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    e locale;
    if (t.g(this.jKV) != null)
    {
      locale = bg.qW().oQ();
      if (t.g(this.jKV).isChecked())
        break label85;
    }
    label85: for (boolean bool = true; ; bool = false)
    {
      locale.set(4104, Boolean.valueOf(bool));
      LauncherUI localLauncherUI = LauncherUI.aPm();
      if (localLauncherUI != null)
        localLauncherUI.Bs("tab_find_friend");
      if (l.AG().Ay() <= 0)
        break;
      a.l(this.jKV.agh(), "nearby", ".ui.NearbyFriendShowSayHiUI");
      return;
    }
    a.l(this.jKV.agh(), "nearby", ".ui.NearbyFriendsUI");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.ae
 * JD-Core Version:    0.6.2
 */