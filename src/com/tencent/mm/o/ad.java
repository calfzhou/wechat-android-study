package com.tencent.mm.o;

import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Vector;

final class ad
  implements az
{
  ad(ac paramac)
  {
  }

  public final boolean kJ()
  {
    if (ac.a(this.doZ) == null)
      return false;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(ac.b(this.doZ).size());
    arrayOfObject[1] = Integer.valueOf(ac.c(this.doZ).size());
    arrayOfObject[2] = Boolean.valueOf(ac.d(this.doZ));
    z.v("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "onQueueIdle, running=%d, waiting=%d, foreground=%b", arrayOfObject);
    ak localak = ac.a(this.doZ);
    ac localac = this.doZ;
    boolean bool1 = ac.e(this.doZ);
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = ac.b(this.doZ).isEmpty();
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = ac.c(this.doZ).isEmpty();
        bool2 = false;
        if (bool4)
          bool2 = true;
      }
    }
    localak.a(localac, bool2);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.ad
 * JD-Core Version:    0.6.2
 */