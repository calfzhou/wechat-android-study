package com.tencent.mm.ui.chatting;

import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.voicereminder.a.f;
import com.tencent.mm.pluginsdk.model.app.ae;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;

final class fa
  implements m
{
  fa(ez paramez, ar paramar, String paramString, int paramInt)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!56@/B4Tb64lLpKwUcOR+EdWcgrQWCeRaP+fpwTv6y+mNLsGtZa7kCGtUQ==", "errType " + paramInt1 + " errCode " + paramInt2 + "  scene " + paramx.getType());
    if ((!((f)bg.qF().eA(f.class.getName())).cj(this.jpQ.kk())) && (paramInt1 == 0) && (paramInt2 == 0) && (((ae)paramx).lj().equals(this.drW)))
      ez.a(this.jpS).joh.joi.b(this.jpR, this.jpQ);
    bg.qX().b(221, ez.b(this.jpS));
    ez.c(this.jpS);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.fa
 * JD-Core Version:    0.6.2
 */