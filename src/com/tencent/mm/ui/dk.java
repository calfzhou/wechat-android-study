package com.tencent.mm.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import com.tencent.mm.h;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ak;

final class dk
  implements DialogInterface.OnClickListener
{
  dk(Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent1 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
    localIntent1.putExtra("android.intent.extra.shortcut.NAME", this.dLL.getString(n.bPB));
    localIntent1.putExtra("duplicate", false);
    Intent localIntent2 = new Intent("android.intent.action.MAIN");
    localIntent2.addCategory("android.intent.category.LAUNCHER");
    localIntent2.setComponent(new ComponentName(this.dLL.getPackageName(), ak.aHh() + ".ui.LauncherUI"));
    localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
    localIntent1.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this.dLL, h.icon));
    this.dLL.sendBroadcast(localIntent1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.dk
 * JD-Core Version:    0.6.2
 */