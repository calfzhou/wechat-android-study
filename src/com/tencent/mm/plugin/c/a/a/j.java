package com.tencent.mm.plugin.c.a.a;

import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

final class j
  implements Runnable
{
  j(g paramg)
  {
  }

  public final void run()
  {
    int i = 1;
    z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "Write descriptor timeout!!!");
    if (i != g.d(this.eiG))
    {
      Assert.assertTrue(i);
      if (3 != g.d(this.eiG))
        break label48;
      z.w("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "Bluetooth device is aready disconnet or close, just leave");
    }
    label48: 
    do
    {
      return;
      int j = 0;
      break;
      g.e(this.eiG).removeCallbacks(g.i(this.eiG));
      g.j(this.eiG);
    }
    while (g.f(this.eiG) == null);
    g.f(this.eiG).eic.b(g.g(this.eiG), false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.a.j
 * JD-Core Version:    0.6.2
 */