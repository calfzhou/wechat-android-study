package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;

final class ba
  implements DialogInterface.OnClickListener
{
  ba(LauncherUI paramLauncherUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bg.eh("");
    MMAppMgr.aQc();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ba
 * JD-Core Version:    0.6.2
 */