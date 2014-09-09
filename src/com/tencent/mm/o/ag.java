package com.tencent.mm.o;

import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Vector;

final class ag
  implements Runnable
{
  ag(ac paramac, x paramx)
  {
  }

  public final void run()
  {
    this.dpb.a(this.doZ);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(this.dpb.hashCode());
    z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "post to worker, scene begin do, hashcode:%d", arrayOfObject1);
    int i;
    if (ac.f(this.doZ) != null)
    {
      i = this.dpb.a(ac.f(this.doZ), this.doZ);
      if (i >= 0);
    }
    while (true)
    {
      Object[] arrayOfObject2 = new Object[3];
      boolean bool;
      if (ac.f(this.doZ) == null)
        bool = true;
      Object[] arrayOfObject3;
      while (true)
      {
        arrayOfObject2[0] = Boolean.valueOf(bool);
        arrayOfObject2[1] = Integer.valueOf(i);
        arrayOfObject2[2] = Integer.valueOf(this.dpb.hashCode());
        z.w("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "not doScene, autoAuth is null :%b, ret %d, hashcode:%d", arrayOfObject2);
        this.dpb.a(null);
        synchronized (ac.g(this.doZ))
        {
          ac.b(this.doZ).remove(this.dpb);
          ac.h(this.doZ).post(new ah(this));
          return;
          bool = false;
        }
      }
      arrayOfObject3[0] = Integer.valueOf(this.dpb.hashCode());
      z.i("!44@/B4Tb64lLpIqYzU7qGnF+NcV4MJCYIeZURnPWibJAbg=", "scene done, hashcode:%d", arrayOfObject3);
      this.dpb.V(false);
      return;
      i = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.ag
 * JD-Core Version:    0.6.2
 */