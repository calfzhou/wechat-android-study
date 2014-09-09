package com.tencent.mm.v;

import com.tencent.mm.ab.n;
import com.tencent.mm.model.av;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.protocal.a.ld;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

final class c
  implements av, com.tencent.mm.o.m
{
  private Queue dSj = new LinkedList();
  private long dSk = 0L;
  private boolean dmO = false;
  private long dmY = 0L;
  private com.tencent.mm.a.d dvP = new com.tencent.mm.a.d(200);
  private Map dvQ = new HashMap();
  private final ay dvT = new ay(bg.qQ().getLooper(), new g(this), true);
  final int dvU = 500;
  private ay dvV = new ay(bg.qQ().getLooper(), new d(this), false);
  final int dvW = 10000;
  private ay dvX = new ay(bg.qQ().getLooper(), new f(this), false);
  private Queue dzd = new LinkedList();

  public c()
  {
    bg.qX().a(182, this);
    this.dmO = false;
  }

  private void xs()
  {
    long l1;
    b localb;
    List localList;
    while (true)
    {
      try
      {
        if (n.yy())
        {
          z.w("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene need init , never get contact");
          return;
        }
        l1 = ch.CM();
        if ((this.dmO) && (l1 - this.dmY > 600000L))
          this.dmO = false;
        if (this.dmO)
        {
          z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene netSceneRunning: " + this.dmO + " ret");
          continue;
        }
      }
      finally
      {
      }
      localb = m.xy();
      localList = localb.ae(this.dSk);
      if ((localList != null) && (localList.size() != 0))
        break;
      z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene list null ret");
    }
    String str1 = com.tencent.mm.model.x.pG();
    String str2 = com.tencent.mm.model.x.pH();
    int i = localList.size();
    int j = 0;
    break label639;
    label157: ArrayList localArrayList = new ArrayList();
    int n = j;
    label170: int m;
    if (n < m)
    {
      a locala = (a)localList.get(n);
      String str3 = locala.getUsername();
      if ((str3 != null) && ((str3.equals(str1)) || (str3.equals(str2))))
      {
        localb.gI(str3);
      }
      else
      {
        long l2 = locala.CH();
        Integer localInteger = (Integer)this.dvP.get(str3);
        z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "username:" + str3 + " inserttime: " + l2 + " mapCnt:" + localInteger);
        if (localInteger == null)
          this.dvP.b(str3, Integer.valueOf(1));
        while (true)
        {
          localArrayList.add(str3);
          this.dSk = l2;
          break label667;
          if (localInteger.intValue() >= 3)
            break;
          this.dvP.b(str3, Integer.valueOf(1 + localInteger.intValue()));
        }
        z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "LRUMap Max now :" + str3);
        if (this.dvQ.containsKey(str3))
        {
          aw localaw = (aw)this.dvQ.get(str3);
          if (localaw != null)
            localaw.f(str3, false);
          this.dvQ.remove(str3);
        }
      }
    }
    else
    {
      if (localArrayList.size() <= 0)
        break label673;
      this.dSj.add(new l(localArrayList));
      break label673;
    }
    label667: label673: label678: 
    while (true)
    {
      if (!this.dmO)
      {
        l locall = (l)this.dSj.poll();
        if (locall != null)
        {
          this.dmY = l1;
          this.dmO = true;
          bg.qX().d(locall);
        }
      }
      z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene ret ok lastNetscene: " + this.dmY + " netSceneRunning: " + this.dmO + " lastInsertTime: " + this.dSk + " db list size: " + localList.size() + " reqList size: " + this.dSj.size() + " take " + (System.currentTimeMillis() - l1) + " ms");
      break;
      label632: int k;
      m = k;
      break label157;
      while (true)
      {
        label639: if (j >= i)
          break label678;
        k = j + 20;
        if (k <= i)
          break label632;
        m = i;
        break;
        n++;
        break label170;
        j = n;
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if (paramx.getType() != 182)
      return;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene onSceneEnd errType:" + paramInt1 + " errCode:" + paramInt2 + " will retry");
      this.dvX.cP(10000L);
      return;
    }
    if (((l)paramx).dmI != null)
    {
      h localh = new h(this);
      localh.errType = paramInt1;
      localh.errCode = paramInt2;
      localh.cGy = paramString;
      localh.dSr = ((ld)((l)paramx).dmI.sP());
      this.dzd.add(localh);
    }
    if ((!this.dzd.isEmpty()) && (this.dvT.aNx()))
      this.dvT.cP(50L);
    l locall = (l)this.dSj.poll();
    if (locall == null)
    {
      this.dmO = false;
      z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene onSceneEnd next null tryStartNetscene netSceneRunning: " + this.dmO);
      xs();
      return;
    }
    this.dmY = ch.CM();
    z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "tryStartNetscene onSceneEnd continue next netSceneRunning: " + this.dmO + " lastNetscene: " + this.dmY);
    bg.qX().d(locall);
  }

  public final void a(String paramString, aw paramaw)
  {
    z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "summert getNow :" + paramString + " stack:" + ch.aHN());
    if (!ch.jb(paramString))
    {
      a locala = new a();
      locala.setUsername(paramString);
      locala.M(ch.CM());
      m.xy().a(locala);
      this.dvQ.put(paramString, paramaw);
    }
    xs();
  }

  public final void ec(String paramString)
  {
    z.d("!44@/B4Tb64lLpKOioi6heEMa+nss2R0N18Y/sePu/YutrI=", "add Contact :" + paramString + " stack:" + ch.aHN());
    if (ch.jb(paramString))
      return;
    a locala = new a();
    locala.setUsername(paramString);
    locala.M(ch.CM());
    m.xy().a(locala);
    this.dvV.cP(500L);
  }

  public final void ed(String paramString)
  {
    this.dvQ.remove(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.c
 * JD-Core Version:    0.6.2
 */