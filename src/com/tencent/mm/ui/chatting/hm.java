package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.plugin.f.c.n;

final class hm
  implements DialogInterface.OnClickListener
{
  hm(hd paramhd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(14);
    arrayOfObject[1] = Integer.valueOf(0);
    arrayOfObject[2] = Integer.valueOf(0);
    arrayOfObject[3] = Integer.valueOf(0);
    localn.d(10997, arrayOfObject);
    paramDialogInterface.dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hm
 * JD-Core Version:    0.6.2
 */