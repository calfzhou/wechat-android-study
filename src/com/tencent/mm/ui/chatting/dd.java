package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.ai.b;
import com.tencent.mm.c.a.if;
import com.tencent.mm.model.bw;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.storage.ar;

final class dd
  implements DialogInterface.OnClickListener
{
  dd(dc paramdc, ar paramar)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b localb = b.iS(dc.a(this.joQ).at(this.fRF.getContent(), this.fRF.jK()));
    if ((localb != null) && (19 == localb.type))
    {
      if localif = new if();
      localif.cMG.type = 4;
      localif.cMG.cMM = this.fRF;
      localif.cMG.cIA = this.fRF.kt();
      a.aGB().g(localif);
    }
    while (true)
    {
      bw.v(this.fRF.kk());
      dc.a(this.joQ).aVN();
      return;
      s.C(this.fRF);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dd
 * JD-Core Version:    0.6.2
 */