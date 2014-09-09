package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.q.a;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.r;
import com.tencent.mm.q.s;

final class ix
  implements DialogInterface.OnClickListener
{
  ix(hd paramhd, boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    hd.B(this.jtA).field_hadAlert = 1;
    a locala = hd.B(this.jtA);
    if (locala != null)
    {
      locala.field_brandFlag = (0x4 | locala.field_brandFlag);
      r.c(locala);
    }
    if (this.jtN)
    {
      Intent localIntent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
      this.jtA.startActivity(localIntent);
      return;
    }
    aa.va().fI(this.jtA.aUL());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ix
 * JD-Core Version:    0.6.2
 */