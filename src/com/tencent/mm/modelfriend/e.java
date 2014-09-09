package com.tencent.mm.modelfriend;

import com.tencent.mm.sdk.platformtools.z;
import java.util.HashSet;

final class e
  implements Runnable
{
  e(long paramLong, h paramh)
  {
  }

  public final void run()
  {
    if ((c.vr() != null) && (c.vr().isAlive()));
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Boolean.valueOf(bool);
      arrayOfObject[1] = Integer.valueOf(c.dsK.size());
      arrayOfObject[2] = Long.valueOf(this.dsM);
      arrayOfObject[3] = this.dsN;
      z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "syncAddrBook running:%b setSize:%d call:%d callback:%s", arrayOfObject);
      c.dsK.add(this.dsN);
      if (!bool)
        break;
      return;
    }
    c.a(new f());
    aa.vY();
    c.vr().start();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.e
 * JD-Core Version:    0.6.2
 */