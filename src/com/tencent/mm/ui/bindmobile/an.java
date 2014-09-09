package com.tencent.mm.ui.bindmobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.storage.e;

final class an
  implements DialogInterface.OnClickListener
{
  an(FindMContactAlertUI paramFindMContactAlertUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bg.qW().oQ().set(12322, Boolean.valueOf(true));
    com.tencent.mm.plugin.a.b.jE("R200_100");
    Intent localIntent = new Intent();
    localIntent.putExtra("mobile_input_purpose", 4);
    localIntent.putExtra("regsetinfo_ticket", FindMContactAlertUI.a(this.jkD));
    localIntent.putExtra("regsetinfo_NextStep", FindMContactAlertUI.b(this.jkD));
    localIntent.putExtra("regsetinfo_NextStyle", FindMContactAlertUI.c(this.jkD));
    a.dWo.a(this.jkD, localIntent);
    com.tencent.mm.plugin.a.b.jE("R300_300_phone");
    com.tencent.mm.plugin.a.b.b(false, bg.qS() + "," + this.jkD.getClass().getName() + ",R300_200_phone," + bg.eg("R300_200_phone") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.an
 * JD-Core Version:    0.6.2
 */