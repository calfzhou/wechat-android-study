package com.tencent.mm.booter;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.model.ao;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.List;

final class p
  implements Runnable
{
  p(i parami)
  {
  }

  public final void run()
  {
    i.d(this.dil).aNu();
    Iterator localIterator = i.c(this.dil).iterator();
    while (localIterator.hasNext())
    {
      ao localao = (ao)localIterator.next();
      if (localao != null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localao.toString();
        z.e("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "on error call back: %s", arrayOfObject);
        localao.mj();
      }
    }
    Toast.makeText(ak.getContext(), ak.getContext().getString(n.bTu), 1).show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.p
 * JD-Core Version:    0.6.2
 */