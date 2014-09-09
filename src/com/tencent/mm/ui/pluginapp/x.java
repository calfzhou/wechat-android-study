package com.tencent.mm.ui.pluginapp;

import android.os.Looper;
import com.tencent.mm.c.a.ew;
import com.tencent.mm.c.a.kv;
import com.tencent.mm.c.a.kw;
import com.tencent.mm.jdbiz.f;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class x extends com.tencent.mm.sdk.c.g
{
  x(t paramt)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if ((parame instanceof kv))
    {
      localkv = (kv)parame;
      arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(localkv.cOi.cKw);
      z.i("!44@/B4Tb64lLpLZlZzKaYOI/yivpFQ+kVwcf+qE8n6dW1E=", "mark sns read %d", arrayOfObject2);
      if (localkv.cOi.cKw == 9)
        new cm(Looper.getMainLooper()).post(new y(this));
    }
    while (!(parame instanceof ew))
    {
      kv localkv;
      Object[] arrayOfObject2;
      return true;
    }
    n localn = n.fTF;
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = ch.ja(t.aYR());
    arrayOfObject1[1] = com.tencent.mm.jdbiz.g.Cp().Cu().dQx;
    arrayOfObject1[2] = Integer.valueOf(t.aYS());
    localn.d(11178, arrayOfObject1);
    t.b(this.jKV);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.x
 * JD-Core Version:    0.6.2
 */