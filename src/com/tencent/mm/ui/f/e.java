package com.tencent.mm.ui.f;

import android.os.Bundle;
import android.os.Looper;
import c.a.d.i;
import c.a.d.k;
import c.a.e.b;
import com.tencent.mm.sdk.platformtools.cm;

final class e
  implements Runnable
{
  e(a parama, Bundle paramBundle)
  {
  }

  public final void run()
  {
    a.bca();
    String str = this.jZc.getString("oauth_verifier");
    Object localObject = null;
    k localk;
    if (str != null)
      localk = new k(str);
    try
    {
      i locali = a.b(this.jZb).a(a.c(this.jZb), localk);
      localObject = locali;
      if (localObject != null)
      {
        a.b(this.jZb, localObject);
        a.b(a.e(this.jZb));
        new cm(Looper.getMainLooper()).post(new f(this));
        return;
      }
      new cm(Looper.getMainLooper()).post(new g(this));
      return;
    }
    catch (c.a.b.a locala)
    {
      while (true)
        localObject = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.e
 * JD-Core Version:    0.6.2
 */