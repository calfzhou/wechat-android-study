package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListView;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.aw;

final class hw
  implements DialogInterface.OnClickListener
{
  hw(hv paramhv, long paramLong)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i;
    if (bg.qW().oV().r(bg.ig().lp(), this.jtH))
    {
      i = bg.qW().oV().d(bg.ig().lp(), this.jtH, this.jtI.jtA.joh.Us() - this.jtI.jtA.joh.getCount());
      if (i >= 0)
        break label78;
    }
    label78: 
    while (this.jtI.jtA.joh.getCount() <= i)
      return;
    hd.e(this.jtI.jtA).post(new hx(this, i));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hw
 * JD-Core Version:    0.6.2
 */