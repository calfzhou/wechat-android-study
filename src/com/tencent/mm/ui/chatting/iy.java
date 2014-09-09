package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.q.a;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.r;
import com.tencent.mm.q.s;

final class iy
  implements DialogInterface.OnClickListener
{
  iy(hd paramhd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    hd.B(this.jtA).field_hadAlert = 1;
    a locala = hd.B(this.jtA);
    if (locala != null)
    {
      locala.field_brandFlag = (0xFFFFFFFB & locala.field_brandFlag);
      r.c(locala);
    }
    aa.va().fI(this.jtA.aUL());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.iy
 * JD-Core Version:    0.6.2
 */