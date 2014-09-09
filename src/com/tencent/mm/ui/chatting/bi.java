package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import java.util.Iterator;
import java.util.List;

final class bi
  implements br
{
  bi(Context paramContext, String paramString, Runnable paramRunnable)
  {
  }

  public final boolean rD()
  {
    Iterator localIterator = bf.aUG().jnU.iterator();
    while (localIterator.hasNext())
    {
      ar localar = (ar)localIterator.next();
      bf.f(this.dLL, this.dmX, localar, bf.aUG().iWI);
    }
    return true;
  }

  public final boolean rE()
  {
    int i = 0;
    List localList;
    if (bf.aUG().jnU != null)
    {
      n localn = n.fTF;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(5);
      arrayOfObject[1] = Integer.valueOf(bf.aUG().jnU.size());
      int j = bf.aUG().jnU.size();
      localList = bf.aUG().jnU;
      if (localList == null)
      {
        z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "get invalid send to friend msg num error, select item empty");
        arrayOfObject[2] = Integer.valueOf(j - i);
        localn.d(10811, arrayOfObject);
      }
    }
    else
    {
      if (this.eND != null)
      {
        z.v("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXNIwXR+/wPCUtE4pSafxclQ==", "call back is not null, do call back");
        this.eND.run();
      }
      if (bf.aUG().jnP != null)
        bf.aUG().jnP.aVe();
      bf.aUF();
      return true;
    }
    Iterator localIterator = localList.iterator();
    int k = 0;
    label153: if (localIterator.hasNext())
    {
      ar localar = (ar)localIterator.next();
      if ((!localar.aJw()) && (!be.F(localar)) && (!localar.aJC()) && (!be.G(localar)) && (!be.H(localar)))
        break label234;
    }
    label234: for (int m = k + 1; ; m = k)
    {
      k = m;
      break label153;
      i = k;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bi
 * JD-Core Version:    0.6.2
 */