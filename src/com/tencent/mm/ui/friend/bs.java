package com.tencent.mm.ui.friend;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cx;
import com.tencent.mm.model.y;
import com.tencent.mm.modelfriend.ax;
import com.tencent.mm.modelfriend.ay;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;

final class bs
  implements c
{
  bs(br parambr)
  {
  }

  public final void E(int paramInt, String paramString)
  {
    ay localay = az.xe();
    ax localax1 = localay.gH(paramString);
    localax1.dJ(2);
    localay.a(localax1.wP(), localax1);
    br.a(this.jJc)[paramInt] = 0;
    this.jJc.notifyDataSetChanged();
    i locali = bg.qW().oT().ys(paramString);
    if (locali != null)
      if (((locali.ja() == null) || (locali.ja().equals(""))) && (localax1.wU() != null) && (!localax1.wU().equals("")))
        y.b(locali, localax1.wU());
    while (true)
    {
      cx.rV().a(26, new Object[0]);
      return;
      ax localax2 = az.xe().gH(paramString);
      localax2.wX();
      z.d("!44@/B4Tb64lLpJnI9lwkJyeeAeaeS3baC7ZIJLQ3cmLpPk=", "user " + paramString + " qq " + localax2.wP());
      az.xe().a(localax2.wP(), localax2);
    }
  }

  public final void c(int paramInt, String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      br.a(this.jJc)[paramInt] = 2;
      ax localax = az.xe().gH(paramString);
      localax.wX();
      z.d("!44@/B4Tb64lLpJnI9lwkJyeeAeaeS3baC7ZIJLQ3cmLpPk=", "user " + paramString + " qq " + localax.wP());
      az.xe().a(localax.wP(), localax);
    }
    this.jJc.notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.bs
 * JD-Core Version:    0.6.2
 */