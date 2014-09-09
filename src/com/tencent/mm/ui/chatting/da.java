package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bw;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.storage.ar;

final class da
  implements DialogInterface.OnClickListener
{
  da(cz paramcz, ar paramar)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    s.C(this.fRF);
    bw.v(this.fRF.kk());
    cz.a(this.joN).aVN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.da
 * JD-Core Version:    0.6.2
 */