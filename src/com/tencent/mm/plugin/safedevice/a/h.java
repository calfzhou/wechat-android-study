package com.tencent.mm.plugin.safedevice.a;

import com.tencent.mm.c.a.ej;
import com.tencent.mm.c.a.ek;
import com.tencent.mm.c.a.em;
import com.tencent.mm.c.a.mi;
import com.tencent.mm.c.a.mj;
import com.tencent.mm.c.a.mk;
import com.tencent.mm.c.a.ml;
import com.tencent.mm.sdk.c.g;

final class h extends g
{
  h(f paramf)
  {
    super(0);
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    if (parame.getId().equals("UpdateLocalSafeDevice"))
      e.a(((mi)parame).cPc.cPd);
    while (true)
    {
      return false;
      if (parame.getId().equals("UpdateLocalVerifySwitch"))
      {
        mk localmk = (mk)parame;
        e.j(localmk.cPe.cPf, localmk.cPe.cPg);
      }
      else if (parame.getId().equals("GetSafeDeviceName"))
      {
        ej localej = (ej)parame;
        localej.cJZ.cFd = e.aN(localej.cJY.context);
      }
      else if (parame.getId().equals("GetSafeDeviceType"))
      {
        ((em)parame).cKa.cFf = e.afj();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.a.h
 * JD-Core Version:    0.6.2
 */