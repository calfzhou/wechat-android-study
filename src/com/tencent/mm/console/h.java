package com.tencent.mm.console;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.sdk.platformtools.ak;

final class h
  implements Runnable
{
  h(f paramf, boolean paramBoolean, long paramLong)
  {
  }

  public final void run()
  {
    this.dPs.dPr.dismiss();
    com.tencent.mm.plugin.f.c.n localn;
    Object[] arrayOfObject;
    if (this.dPt)
    {
      Toast.makeText(ak.getContext(), ak.getContext().getString(com.tencent.mm.n.bXO), 1).show();
      localn = com.tencent.mm.plugin.f.c.n.fTF;
      arrayOfObject = new Object[3];
      if (!this.dPt)
        break label111;
    }
    label111: for (int i = 1; ; i = 0)
    {
      arrayOfObject[0] = Integer.valueOf(i);
      arrayOfObject[1] = Integer.valueOf(b.nB());
      arrayOfObject[2] = Long.valueOf(this.dPu);
      localn.d(11224, arrayOfObject);
      return;
      Toast.makeText(ak.getContext(), ak.getContext().getString(com.tencent.mm.n.bXK), 1).show();
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.h
 * JD-Core Version:    0.6.2
 */