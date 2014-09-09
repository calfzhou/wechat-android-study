package com.tencent.mm.v;

import android.os.Looper;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.v;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.ld;
import com.tencent.mm.protocal.a.sk;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

final class g
  implements az
{
  g(c paramc)
  {
  }

  public final boolean kJ()
  {
    if (c.c(this.dvY).isEmpty())
    {
      z.i("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene respHandler queue maybe this time is null , wait doscene!");
      return false;
    }
    long l1 = ch.CM();
    int i;
    ArrayList localArrayList;
    int j;
    label55: h localh;
    boolean bool1;
    if (c.d(this.dvY))
    {
      i = 5;
      localArrayList = new ArrayList(i * 2);
      j = 0;
      if (j >= i)
        break label712;
      localh = (h)c.c(this.dvY).peek();
      if (localh != null)
        break label165;
      z.i("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene respHandler queue maybe this time is null , break and wait doscene!");
      bool1 = false;
    }
    while (true)
    {
      label93: int k = localArrayList.size();
      if (k > 0)
      {
        long l2 = bg.qW().oO().dc(Thread.currentThread().getId());
        b localb = m.xy();
        int m = 0;
        while (true)
          if (m < k)
          {
            localb.gI((String)localArrayList.get(m));
            m++;
            continue;
            i = 15;
            break;
            label165: LinkedList localLinkedList1 = localh.dSr.ibL;
            LinkedList localLinkedList2 = localh.dSr.ibM;
            int n = localh.dzj;
            int i1 = localLinkedList1.size();
            if (i1 <= n)
            {
              c.c(this.dvY).poll();
              if (c.c(this.dvY).isEmpty())
              {
                Object[] arrayOfObject2 = new Object[2];
                arrayOfObject2[0] = Integer.valueOf(n);
                arrayOfObject2[1] = Integer.valueOf(i1);
                z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene respHandler resp proc fin gr.curIdx:%d size:%d and retList is empty break", arrayOfObject2);
                c.e(this.dvY);
                c.f(this.dvY).cP(0L);
                bool1 = false;
                break label93;
              }
              Object[] arrayOfObject1 = new Object[2];
              arrayOfObject1[0] = Integer.valueOf(n);
              arrayOfObject1[1] = Integer.valueOf(i1);
              z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene respHandler resp proc fin gr.curIdx:%d size:%d and retList is not empty continue next", arrayOfObject1);
              j++;
              break label55;
            }
            sk localsk = (sk)localLinkedList1.get(n);
            int i2 = ((Integer)localLinkedList2.get(n)).intValue();
            String str1 = ai.a(localsk.hVf);
            String str2 = localsk.dti;
            localArrayList.add(str1);
            localArrayList.add(str2);
            boolean bool2;
            label446: aw localaw1;
            switch (i2)
            {
            default:
              z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene respHandler getFailed ErrName: %s %s", new Object[] { str1, str2 });
              v.cQ(str1);
              bool2 = false;
              localaw1 = (aw)c.g(this.dvY).remove(str1);
              if (!ch.jb(str2))
                break;
            case 0:
            case 1:
            }
            for (aw localaw2 = null; ; localaw2 = (aw)c.g(this.dvY).remove(str2))
            {
              if ((localaw1 != null) || (localaw2 != null))
                new cm(Looper.getMainLooper()).post(new e(this, localaw1, str1, bool2, localaw2, str2));
              localh.dzj = (1 + localh.dzj);
              break;
              z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene respHandler mod contact: %s %s", new Object[] { str1, str2 });
              o.a(localsk);
              bool2 = true;
              break label446;
              z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene respHandler getFailed ErrName: %s %s", new Object[] { str1, str2 });
              v.cQ(str1);
              bool2 = false;
              break label446;
            }
          }
        bg.qW().oO().dd(l2);
      }
      z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene respHandler onTimerExpired netSceneRunning : " + c.d(this.dvY) + " ret: " + bool1 + " maxCnt: " + i + " deleteCount: " + k + " take: " + (ch.CM() - l1) + "ms");
      return bool1;
      label712: bool1 = true;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.g
 * JD-Core Version:    0.6.2
 */