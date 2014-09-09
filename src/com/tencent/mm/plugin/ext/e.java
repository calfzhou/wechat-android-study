package com.tencent.mm.plugin.ext;

import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.ba;
import java.util.ArrayList;
import java.util.HashMap;

final class e
  implements ay
{
  e(b paramb)
  {
  }

  public final void a(aw paramaw, ba paramba)
  {
    if ((paramaw == null) || (paramba == null) || (paramba.ikd == null))
      z.e("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "onMsgChange, wrong args");
    label187: 
    do
    {
      return;
      int i = 0;
      if (i < paramba.ikd.size())
      {
        ar localar = (ar)paramba.ikd.get(i);
        Integer localInteger;
        if ((localar != null) && (localar.jK() == 0) && (localar.getStatus() != 4) && (localar.getType() != 9999) && (localar.getType() != 10000) && (!y.dQ(localar.kt())))
        {
          localInteger = (Integer)b.a(this.eLF).get(localar.kt());
          if (localInteger != null)
            break label187;
          b.a(this.eLF).put(localar.kt(), Integer.valueOf(1));
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = localar.kt();
          arrayOfObject2[1] = Integer.valueOf(1);
          z.d("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "onMsgChange %s, %d", arrayOfObject2);
        }
        while (true)
        {
          i++;
          break;
          b.a(this.eLF).put(localar.kt(), Integer.valueOf(1 + localInteger.intValue()));
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = localar.kt();
          arrayOfObject1[1] = Integer.valueOf(1 + localInteger.intValue());
          z.d("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "onMsgChange %s, %d", arrayOfObject1);
        }
      }
    }
    while (b.a(this.eLF).size() <= 0);
    this.eLF.Qd();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.e
 * JD-Core Version:    0.6.2
 */