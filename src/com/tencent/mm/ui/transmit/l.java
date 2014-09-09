package com.tencent.mm.ui.transmit;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.tencent.mm.ak.c;
import com.tencent.mm.ak.v;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;

final class l
  implements c
{
  l(MsgRetransmitUI paramMsgRetransmitUI)
  {
  }

  public final void a(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    MsgRetransmitUI.f(this.jYo);
    if (paramInt1 == -50002)
      Toast.makeText(this.jYo, this.jYo.getString(n.cnS), 0).show();
    while (true)
    {
      z.i("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", MsgRetransmitUI.c(this.jYo) + " " + MsgRetransmitUI.d(this.jYo));
      if ((this.jYo.jYm) || (MsgRetransmitUI.c(this.jYo) == MsgRetransmitUI.d(this.jYo)))
      {
        if (MsgRetransmitUI.g(this.jYo) != null)
        {
          MsgRetransmitUI.g(this.jYo).dismiss();
          MsgRetransmitUI.h(this.jYo);
        }
        this.jYo.finish();
      }
      return;
      if (paramInt1 < 0)
      {
        Toast.makeText(this.jYo, this.jYo.getString(n.cnR), 0).show();
      }
      else
      {
        v.a(paramString1, paramInt2, this.jYo.cDi, paramString2);
        v.ih(paramString1);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.l
 * JD-Core Version:    0.6.2
 */