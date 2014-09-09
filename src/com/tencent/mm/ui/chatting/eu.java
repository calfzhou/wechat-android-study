package com.tencent.mm.ui.chatting;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.tencent.mm.ai.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;

final class eu
  implements m
{
  eu(et paramet)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!56@/B4Tb64lLpKwUcOR+EdWcgrQWCeRaP+fpwTv6y+mNLuv5Zxah8/EmQ==", "errType " + paramInt1 + " errCode " + paramInt2 + "  scene " + paramx.getType());
    String str2;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      String str1 = this.jpN.jpM.jpH.getContent();
      str2 = ch.xw(str1);
      if (str2 == null)
        break label238;
    }
    label238: for (b localb = b.iS(str2); ; localb = null)
    {
      if (localb != null)
        s.vb(localb.dQY);
      bw.v(this.jpN.jpM.jpH.kk());
      Toast.makeText(eo.a(this.jpN.jpM.jpJ).agh(), eo.a(this.jpN.jpM.jpJ).getString(n.bzr), 0).show();
      bg.qX().b(331, eo.b(this.jpN.jpM.jpJ));
      eo.a(this.jpN.jpM.jpJ, null);
      if (eo.c(this.jpN.jpM.jpJ) != null)
        eo.c(this.jpN.jpM.jpJ).dismiss();
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.eu
 * JD-Core Version:    0.6.2
 */