package com.tencent.mm.ab;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.a;
import com.tencent.mm.protocal.a.ee;
import com.tencent.mm.protocal.a.ef;
import com.tencent.mm.protocal.a.tn;
import com.tencent.mm.protocal.a.to;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.aq;
import com.tencent.mm.protocal.ar;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.cg;
import com.tencent.mm.storage.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k extends x
  implements ab
{
  protected static int dzw = 7;
  private static boolean dzx = false;
  private String cGy = "";
  private com.tencent.mm.o.m dlH;
  private ay dmV;
  private com.tencent.mm.compatible.g.l dyW;
  private StringBuilder dyX = new StringBuilder();
  private boolean dzA = false;
  private boolean dzB = false;
  private boolean dzC = false;
  private long dzm = -1L;
  private final s dzu;
  private final int dzv;
  private boolean dzy = false;
  private int dzz = 0;
  private int errCode = 0;
  private int errType = 0;

  public k(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(hashCode());
    arrayOfObject[1] = ch.aHN();
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "dksord NetSceneSync hash:%d stack:%s", arrayOfObject);
    this.dyW = new com.tencent.mm.compatible.g.l();
    this.dzv = paramInt;
    this.dzu = new s(this);
    if (paramInt == 7)
      dzx = true;
    if ((bg.qW() != null) && (bg.oE()) && (bg.qW().oQ() != null) && (!bg.rd()))
    {
      long l = ch.a((Long)bg.qW().oQ().get(8196), 0L);
      if (l != 0L)
      {
        bg.qW().oQ().set(8196, Long.valueOf(0L));
        int i = (int)(l | dzw);
        dzw = i;
        dzw = i & 0x5F;
      }
    }
    if (paramInt == 9)
    {
      dzw = 0x8 | dzw;
      dzx = true;
    }
    if (paramInt == 10)
    {
      dzw = 0x10 | dzw;
      dzx = true;
    }
    if (paramInt == 11)
    {
      dzw = 0x40 | dzw;
      dzx = true;
    }
    this.dyX.append("stack:" + ch.aHN() + " scene:" + this.dzv + " time:" + ch.CL());
  }

  public k(ar paramar, int paramInt, long paramLong)
  {
    this(14);
    this.dzz = paramInt;
    this.dzm = paramLong;
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "dkpush do scene resp SCENE_SYNC_WAIT");
    this.dmV = new ay(bg.qQ().getLooper(), new l(this, paramar), false);
  }

  private static ef q(List paramList)
  {
    ef localef = new ef();
    Iterator localIterator = paramList.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      cg localcg = (cg)localIterator.next();
      byte[] arrayOfByte = localcg.getBytes();
      if (arrayOfByte == null)
        break label113;
      ee localee = new ee();
      localee.hUq = localcg.getCmdId();
      localee.hUr = new ws().cl(arrayOfByte);
      localef.hQc.add(localee);
    }
    label113: for (int j = i + 1; ; j = i)
    {
      i = j;
      break;
      localef.huF = i;
      return localef;
    }
  }

  protected static void yx()
  {
    z.w("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "resp canceled, synckey not set");
    bg.oE();
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, com.tencent.mm.o.m paramm)
  {
    int i = 1;
    byte[] arrayOfByte1 = a.hrs;
    long l = dzw;
    if (n.yy())
    {
      z.e("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "dkinit never do sync before init done");
      return -1;
    }
    this.dlH = paramm;
    this.dyX.append(" lastd:" + this.doA + " dotime:" + ch.CL() + " net:" + bc.aT(ak.getContext()));
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(hashCode());
    arrayOfObject[i] = Long.valueOf(l);
    arrayOfObject[2] = Integer.valueOf(this.dzv);
    if (this.dmV != null);
    int k;
    for (int j = i; ; k = 0)
    {
      arrayOfObject[3] = Boolean.valueOf(j);
      z.i("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "doScene[%d] selector:%d scene:%d pusher:%b ", arrayOfObject);
      if (this.dmV == null)
        break;
      c(paramr);
      this.dmV.cP(0L);
      this.dmV = null;
      return -1;
    }
    m localm;
    tn localtn;
    byte[] arrayOfByte2;
    label279: int i1;
    if (this.dzv == 8)
    {
      int m = i;
      localm = new m(m);
      localtn = ((aq)localm.tk()).hNL;
      localtn.hTp = ((int)l);
      if ((arrayOfByte1 != null) && (arrayOfByte1.length > 0))
        break label355;
      arrayOfByte2 = ch.jg(ch.ja((String)bg.qW().oQ().get(8195, new byte[0])));
      localtn.hTq = ai.z(arrayOfByte2);
      i1 = this.dzv;
      if (!this.dzB)
        break label362;
      i = 6;
    }
    while (true)
    {
      localtn.hOi = i;
      localtn.ioz = q(bg.qW().oS().aKu());
      localtn.ieD = a.hrg;
      dzx = false;
      return a(paramr, localm, this);
      int n = 0;
      break;
      label355: arrayOfByte2 = arrayOfByte1;
      break label279;
      label362: if (7 != i1)
        if (3 == i1)
          i = 2;
        else if (i == i1)
          i = 4;
        else if (13 == i1)
          i = 5;
        else if (12 == i1)
          i = 3;
        else if (14 == i1)
          i = 8;
        else
          i = 7;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramaj == null) || (paramaj.getType() != 38))
    {
      Object[] arrayOfObject1 = new Object[1];
      if (paramaj == null);
      for (int i = -2; ; i = paramaj.getType())
      {
        arrayOfObject1[0] = Integer.valueOf(i);
        z.e("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "onGYNetEnd error type:%d", arrayOfObject1);
        return;
      }
    }
    this.dyX.append(" endtime:" + ch.CL());
    Object[] arrayOfObject2 = new Object[7];
    arrayOfObject2[0] = Integer.valueOf(hashCode());
    arrayOfObject2[1] = Integer.valueOf(paramInt2);
    arrayOfObject2[2] = Integer.valueOf(paramInt3);
    arrayOfObject2[3] = paramString;
    arrayOfObject2[4] = Boolean.valueOf(this.dzA);
    arrayOfObject2[5] = Long.valueOf(this.dyW.nM());
    arrayOfObject2[6] = this.dyX;
    z.i("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "onGYNetEnd: %d [%d,%d,%s] hash isnotifydata:%b time:%d [%s]", arrayOfObject2);
    this.dzy = true;
    bb localbb = bg.qW().oS();
    boolean bool;
    if ((!this.dzA) && (paramInt2 == 0) && (paramInt3 == 0))
    {
      bool = true;
      localbb.eh(bool);
      if ((paramInt2 != 4) || (paramInt3 != -2006))
        break label654;
      paramInt2 = 0;
      paramInt3 = 0;
    }
    label647: label654: for (int j = 1; ; j = 0)
    {
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        if (this.dzu.dzR != null)
        {
          z.i("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "oreh sync mIRH.processingResp is not null, and simulate not continue");
          this.errType = paramInt2;
          this.errCode = paramInt3;
          this.cGy = paramString;
          ((ar)paramaj.sS()).hNM.hSL = 0;
          return;
          bool = false;
          break;
        }
        this.dlH.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      ar localar = (ar)paramaj.sS();
      byte[] arrayOfByte1;
      int k;
      byte[] arrayOfByte2;
      if (j == 0)
      {
        arrayOfByte1 = ai.a(((aq)paramaj.tk()).hNL.hTq);
        Object[] arrayOfObject3 = new Object[2];
        if (arrayOfByte1 != null)
          break label567;
        k = -1;
        arrayOfObject3[0] = Integer.valueOf(k);
        arrayOfObject3[1] = ch.cF(arrayOfByte1);
        z.d("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "dkpush req Key : %d[%s]", arrayOfObject3);
        if (!ch.B(arrayOfByte1))
          break label647;
        arrayOfByte2 = ch.jg(ch.ja((String)bg.qW().oQ().get(8195, new byte[0])));
        Object[] arrayOfObject4 = new Object[2];
        arrayOfObject4[0] = Integer.valueOf(arrayOfByte2.length);
        arrayOfObject4[1] = ch.cF(arrayOfByte2);
        z.d("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "dkpush userinfo key : %d[%s]", arrayOfObject4);
      }
      while (true)
      {
        byte[] arrayOfByte3 = ai.a(localar.hNM.hTq);
        byte[] arrayOfByte4;
        if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0))
        {
          z.d("!32@/B4Tb64lLpJRvkgZo4JKS+ippUZtfBu8", "empty old key, use new key");
          arrayOfByte4 = arrayOfByte3;
        }
        while (true)
        {
          if ((arrayOfByte4 == null) || (arrayOfByte4.length <= 0))
          {
            z.w("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "merge key failed, use server side instead");
            arrayOfByte4 = arrayOfByte3;
          }
          localar.hNM.hTq = ai.z(arrayOfByte4);
          bg.qW().v(localar.hNM.dZy, localar.hNM.ioA);
          this.dzu.c(localar);
          return;
          label567: k = arrayOfByte1.length;
          break;
          if ((arrayOfByte3 == null) || (arrayOfByte3.length <= 0))
          {
            z.e("!32@/B4Tb64lLpJRvkgZo4JKS+ippUZtfBu8", "newKey is null");
            arrayOfByte4 = null;
          }
          else
          {
            PByteArray localPByteArray = new PByteArray();
            if (!MMProtocalJni.mergeSyncKey(arrayOfByte2, arrayOfByte3, localPByteArray))
            {
              z.e("!32@/B4Tb64lLpJRvkgZo4JKS+ippUZtfBu8", "merge key failed");
              arrayOfByte4 = null;
            }
            else
            {
              arrayOfByte4 = localPByteArray.value;
            }
          }
        }
        arrayOfByte2 = arrayOfByte1;
      }
    }
  }

  protected final void a(ar paramar)
  {
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "onRespHandled sync");
    bg.qW().oQ().set(8195, ch.cH(ai.a(paramar.hNM.hTq)));
    bg.qW().oQ().set(8196, Long.valueOf(paramar.hNM.hSL));
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(dzx);
    arrayOfObject[1] = Integer.valueOf(this.dzz);
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "dkpush notifyPending:%s pushSyncFlag:%d", arrayOfObject);
    if (this.dzu.b(paramar))
    {
      this.dzB = true;
      a(tp(), this.dlH);
      return;
    }
    if (dzx)
    {
      z.i("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "new notify pending, sync now");
      this.dzB = true;
      a(tp(), this.dlH);
      return;
    }
    if ((0x1 & this.dzz) > 0)
    {
      z.d("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "dkpush TODO NotifyData ack");
      bg.qX().d(new f(this.dzm));
    }
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "sync or init end: reset selector : now = " + dzw + " default = 7");
    dzw = 7;
    this.dlH.a(this.errType, this.errCode, this.cGy, this);
  }

  protected final boolean a(x paramx)
  {
    if (!(paramx instanceof k));
    k localk;
    do
    {
      do
      {
        return false;
        localk = (k)paramx;
      }
      while ((localk.dzy) || (!dzx));
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(localk.doA);
      z.e("!32@/B4Tb64lLpK+IBX8XDgnvuZ02Tr1POdM", "old not busy and notified, maybe cancel old scene, last dispatch=%d", arrayOfObject);
      this.dyX.append(" cp:" + ch.ad(localk.doA));
    }
    while (ch.ad(localk.doA) <= 240000L);
    return true;
  }

  protected final void cancel()
  {
    super.cancel();
    this.dzu.cancel();
  }

  public final String getInfo()
  {
    return this.dyX.toString();
  }

  public final int getType()
  {
    return 38;
  }

  protected final int sB()
  {
    return 500;
  }

  public final boolean to()
  {
    return super.to();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.k
 * JD-Core Version:    0.6.2
 */