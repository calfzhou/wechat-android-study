package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.tencent.mm.aj.i;
import com.tencent.mm.aj.l;
import com.tencent.mm.am.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.e;

final class ef
  implements DialogInterface.OnClickListener
{
  ef(ed paramed, CheckBox paramCheckBox)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    e locale;
    if (this.gYH != null)
    {
      locale = bg.qW().oQ();
      if (this.gYH.isChecked())
        break label79;
    }
    label79: for (boolean bool = true; ; bool = false)
    {
      locale.set(4104, Boolean.valueOf(bool));
      LauncherUI localLauncherUI = LauncherUI.aPm();
      if (localLauncherUI != null)
        localLauncherUI.Bs("tab_find_friend");
      if (l.AG().Ay() <= 0)
        break;
      a.l(ed.c(this.iNn), "nearby", ".ui.NearbyFriendShowSayHiUI");
      return;
    }
    a.l(ed.c(this.iNn), "nearby", ".ui.NearbyFriendsUI");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ef
 * JD-Core Version:    0.6.2
 */