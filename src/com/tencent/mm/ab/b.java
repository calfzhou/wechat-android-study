package com.tencent.mm.ab;

import com.tencent.mm.as.h;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.r;
import com.tencent.mm.protocal.a.ee;
import com.tencent.mm.protocal.a.tj;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.e;
import java.util.LinkedList;
import java.util.Queue;
import junit.framework.Assert;

final class b
  implements az
{
  b(a parama)
  {
  }

  public final boolean kJ()
  {
    int i = 1;
    if ((!bg.oE()) || (bg.rd()))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "acc is not ready stop handle resp");
      return false;
    }
    if (a.a(this.dzf))
    {
      if (com.tencent.mm.pluginsdk.am.ayh() != null)
        com.tencent.mm.pluginsdk.am.ayh().amn();
      Object[] arrayOfObject3 = new Object[i];
      arrayOfObject3[0] = Integer.valueOf(this.dzf.hashCode());
      z.w("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "Init CANCELED hash:%d", arrayOfObject3);
      return false;
    }
    if (a.b(this.dzf).isEmpty())
    {
      z.v("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "queue maybe this time is null , wait doscene!");
      return false;
    }
    Object[] arrayOfObject1 = new Object[7];
    arrayOfObject1[0] = Integer.valueOf(this.dzf.hashCode());
    arrayOfObject1[i] = Long.valueOf(a.c(this.dzf).nM());
    arrayOfObject1[2] = Integer.valueOf(a.b(this.dzf).size());
    arrayOfObject1[3] = Integer.valueOf(a.d(this.dzf));
    arrayOfObject1[4] = Boolean.valueOf(a.e(this.dzf));
    arrayOfObject1[5] = Integer.valueOf(a.f(this.dzf));
    arrayOfObject1[6] = Integer.valueOf(a.g(this.dzf));
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "pusher hash:%d time:%d list:%d [%d/%b,%d/%d]", arrayOfObject1);
    long l = bg.qW().oO().dc(Thread.currentThread().getId());
    bg.qW().oV().aKl();
    int j;
    if (a.e(this.dzf))
      j = 40;
    for (int k = 0; ; k++)
    {
      d locald;
      if (k < j)
      {
        locald = (d)a.b(this.dzf).peek();
        if (locald.dvR != 2147483647)
          break label567;
        if (locald.dzi != null)
          break label561;
        int m = i;
        label303: Assert.assertTrue("in Queue tail , resp should be null", m);
        if (com.tencent.mm.pluginsdk.am.ayh() != null)
          com.tencent.mm.pluginsdk.am.ayh().amn();
        String str = (String)bg.qW().oQ().get(8198);
        bg.qW().oQ().set(8195, str);
        bg.qW().oQ().set(8197, "");
        bg.qW().oQ().set(8198, "");
        bg.qW().oQ().set(15, Integer.valueOf(i));
        bg.qW().oQ().Ai();
        Object[] arrayOfObject2 = new Object[6];
        arrayOfObject2[0] = Integer.valueOf(this.dzf.hashCode());
        arrayOfObject2[i] = Long.valueOf(a.c(this.dzf).nM());
        arrayOfObject2[2] = Integer.valueOf(a.d(this.dzf));
        arrayOfObject2[3] = Integer.valueOf(a.g(this.dzf));
        arrayOfObject2[4] = Integer.valueOf(locald.errType);
        arrayOfObject2[5] = Integer.valueOf(locald.errCode);
        z.i("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "INIT DONE: hash:%d time:%d netCnt:%d cmdCnt:%d err:[%d,%d] ", arrayOfObject2);
        bg.qQ().n(new c(this, locald));
        i = 0;
      }
      while (true)
      {
        bg.qW().oV().aKm();
        bg.qW().oO().dd(l);
        this.dzf.yv();
        return i;
        j = 10;
        break;
        label561: int n = 0;
        break label303;
        label567: LinkedList localLinkedList = locald.dzi.ioj;
        if ((localLinkedList != null) && (localLinkedList.size() > locald.dzj) && (a.i(this.dzf).a((ee)localLinkedList.get(locald.dzj), i)))
          break label748;
        a.i(this.dzf).yz();
        a.b(this.dzf).poll();
        bg.qW().oQ().set(8197, ch.cH(ai.a(locald.dzi.iof)));
        bg.qW().oQ().set(8198, ch.cH(ai.a(locald.dzi.iog)));
        bg.qW().oQ().set(16, Integer.valueOf(0));
        bg.qW().oQ().set(8196, Long.valueOf(locald.dzi.ioh));
        bg.qW().oQ().Ai();
      }
      label748: locald.dzj = (1 + locald.dzj);
      a.j(this.dzf);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.b
 * JD-Core Version:    0.6.2
 */