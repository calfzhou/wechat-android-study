package com.tencent.mm.n;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class g
  implements Runnable
{
  g(e parame, String paramString)
  {
  }

  public final void run()
  {
    if (ch.jb(this.dmX));
    label10: m localm;
    do
    {
      x localx;
      do
      {
        y localy;
        do
        {
          break label10;
          do
            return;
          while (this.dmX.equals(e.a(this.dmW)));
          localy = e.si();
        }
        while (localy == null);
        localx = localy.fg(this.dmX);
      }
      while ((localx == null) || (!localx.getUsername().equals(this.dmX)) || (!localx.sw()));
      if (ch.jb(localx.su()))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.dmX;
        z.w("!32@/B4Tb64lLpJO3ngf+FD8EZfQGyZYk2Ww", "dkhurl user has no url [%s]", arrayOfObject);
        return;
      }
      localm = e.sj();
    }
    while (localm == null);
    localm.h(this.dmX, false);
    localm.h(this.dmX, true);
    this.dmW.eN(this.dmX);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.g
 * JD-Core Version:    0.6.2
 */