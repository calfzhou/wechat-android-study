package com.tencent.mm.w;

import com.tencent.mm.protocal.a.aeh;
import com.tencent.mm.protocal.a.oe;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

final class b
  implements az
{
  b(a parama)
  {
  }

  public final boolean kJ()
  {
    if (a.a(this.dwl) < 0)
      return false;
    oe localoe = (oe)a.b(this.dwl).sP();
    try
    {
      localaeh = (aeh)localoe.iel.get(a.a(this.dwl));
      if (localaeh != null)
      {
        z.d("!44@/B4Tb64lLpK+IBX8XDgnviARrLmr0Ct8vO5+LRFl3DY=", "onGYNetEnd ver:" + localoe.hWt + " idx:" + a.a(this.dwl) + " id:" + Integer.toHexString(localaeh.ixd) + " size:" + localaeh.ixe.aLK() + " hdsize:" + localaeh.ixf.aLK());
        a.b(localaeh.ixd, true, localaeh.ixf.aLL().toByteArray());
        a.b(localaeh.ixd, false, localaeh.ixe.aLL().toByteArray());
      }
      a.c(this.dwl);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        z.e("!44@/B4Tb64lLpK+IBX8XDgnviARrLmr0Ct8vO5+LRFl3DY=", "get item :" + a.a(this.dwl) + " not Found");
        aeh localaeh = null;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.b
 * JD-Core Version:    0.6.2
 */