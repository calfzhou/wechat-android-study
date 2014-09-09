package com.tencent.mm.model;

import com.tencent.mm.o.j;
import com.tencent.mm.o.k;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.e;
import java.util.Map;

public final class dy
  implements j
{
  public final k a(q paramq)
  {
    if (paramq == null)
    {
      z.e("!44@/B4Tb64lLpKTf3tIYEdRWAbQakTf/CzT1WVqlfuvggk=", "onPreAddMessage cmdAM is null");
      return null;
    }
    try
    {
      Map localMap = x.bB("<root>" + paramq.hOS + "</root>", "root");
      int i = Integer.valueOf((String)localMap.get(".root.newcount")).intValue();
      int j = Integer.valueOf((String)localMap.get(".root.version")).intValue();
      e locale = bg.qW().oQ();
      if (j == ch.a((Integer)locale.get(12305)))
      {
        z.i("!44@/B4Tb64lLpKTf3tIYEdRWAbQakTf/CzT1WVqlfuvggk=", "ignore new sys notice count, same version");
        return null;
      }
      locale.set(12304, Integer.valueOf(i));
      locale.set(12305, Integer.valueOf(j));
      return null;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final void d(ar paramar)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.dy
 * JD-Core Version:    0.6.2
 */