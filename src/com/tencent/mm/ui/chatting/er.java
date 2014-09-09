package com.tencent.mm.ui.chatting;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.model.app.a;
import com.tencent.mm.pluginsdk.model.app.ae;
import com.tencent.mm.sdk.platformtools.z;

final class er
  implements m
{
  er(eo parameo, a parama)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!56@/B4Tb64lLpKwUcOR+EdWcgrQWCeRaP+fpwTv6y+mNLuv5Zxah8/EmQ==", "errType " + paramInt1 + " errCode " + paramInt2 + "  scene " + paramx.getType());
    if (((ae)paramx).lj().equals(this.jpK.field_mediaSvrId))
    {
      bg.qX().b(221, eo.b(this.jpJ));
      eo.a(this.jpJ, null);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.er
 * JD-Core Version:    0.6.2
 */