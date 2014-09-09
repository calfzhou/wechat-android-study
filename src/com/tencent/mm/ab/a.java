package com.tencent.mm.ab;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.o.n;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.ti;
import com.tencent.mm.protocal.a.tj;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.an;
import com.tencent.mm.protocal.ao;
import com.tencent.mm.protocal.p;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;
import java.util.Queue;

public final class a extends x
  implements ab
{
  private m dlH;
  private final ay dmV = new ay(bg.qQ().getLooper(), new b(this), true);
  final ti dyV = new ti();
  private l dyW;
  private StringBuilder dyX = new StringBuilder();
  private int dyY = 0;
  private boolean dyZ = false;
  private n dyf = null;
  private int dza = 0;
  private int dzb = 0;
  private boolean dzc = false;
  private final Queue dzd = new LinkedList();
  private final o dze = new o();
  private int retryCount = 3;

  public a(n paramn)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(hashCode());
    arrayOfObject[1] = ch.aHN();
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "NetSceneInit hash:%d stack:%s", arrayOfObject);
    this.dyX.append("stack:" + ch.aHN() + " time:" + ch.CL());
    this.dyf = paramn;
  }

  private int a(com.tencent.mm.network.r paramr, ws paramws1, ws paramws2)
  {
    this.dyX.append(" lastd:" + this.doA + " dotime:" + ch.CL() + " net:" + bc.aT(ak.getContext()));
    e locale = new e();
    if (paramws1 == null)
      paramws1 = ai.z(ch.jg(ch.ja((String)bg.qW().oQ().get(8197))));
    if (paramws2 == null)
      paramws2 = ai.z(ch.jg(ch.ja((String)bg.qW().oQ().get(8198))));
    if ((ch.a((Integer)bg.qW().oQ().get(16)) != 0) && ((paramws1 == null) || (paramws1.aLK() <= 0)))
      locale.tk().di(7);
    while (true)
    {
      this.dyV.iof = paramws1;
      this.dyV.iog = paramws2;
      ((an)locale.tk()).hNJ = this.dyV;
      Object[] arrayOfObject = new Object[8];
      arrayOfObject[0] = Integer.valueOf(hashCode());
      arrayOfObject[1] = Long.valueOf(this.dyW.nM());
      arrayOfObject[2] = Integer.valueOf(this.dyY);
      arrayOfObject[3] = this.dyV.gnq;
      arrayOfObject[4] = this.dyV.eJv;
      arrayOfObject[5] = Integer.valueOf(locale.tk().tJ());
      arrayOfObject[6] = ch.cH(ai.a(paramws1));
      arrayOfObject[7] = ch.cH(ai.a(paramws2));
      z.i("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "doScene hash:%d time:%d count:%d user%s lan:%s status:%d cur[%s] max[%s]", arrayOfObject);
      this.dyY = (1 + this.dyY);
      return a(paramr, locale, this);
      if (ch.ja((String)bg.qW().oQ().get(8195)).length() <= 0)
        locale.tk().di(3);
      else
        locale.tk().di(4);
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, String paramString, tj paramtj)
  {
    d locald = new d(this);
    locald.dvR = paramInt1;
    locald.errCode = paramInt3;
    locald.errType = paramInt2;
    locald.cGy = paramString;
    locald.dzi = paramtj;
    this.dzd.add(locald);
    if (this.dmV.aNx())
      this.dmV.cP(50L);
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(com.tencent.mm.network.r paramr, m paramm)
  {
    this.dyW = new l();
    this.dlH = paramm;
    if (com.tencent.mm.pluginsdk.am.ayh() != null)
      com.tencent.mm.pluginsdk.am.ayh().amm();
    this.dyV.gnq = ((String)bg.qW().oQ().get(2));
    this.dyV.eJv = y.aGW();
    return a(paramr, null, null);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    this.dyX.append(" endtime:" + ch.CL());
    if ((paramInt2 != 0) || (paramInt3 != 0))
      if ((paramInt2 == 4) && (paramInt3 != -17))
      {
        Object[] arrayOfObject3 = new Object[5];
        arrayOfObject3[0] = Integer.valueOf(hashCode());
        arrayOfObject3[1] = Integer.valueOf(paramInt2);
        arrayOfObject3[2] = Integer.valueOf(paramInt3);
        arrayOfObject3[3] = paramString;
        arrayOfObject3[4] = Long.valueOf(this.dyW.nM());
        z.e("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "onGYNetEnd Error hash:%d [%d,%d,%s] time:%d ", arrayOfObject3);
        a(2147483647, paramInt2, paramInt3, paramString, null);
      }
    tj localtj;
    do
    {
      do
      {
        return;
        if (this.retryCount <= 0)
          break;
        this.retryCount = (-1 + this.retryCount);
        Object[] arrayOfObject2 = new Object[4];
        arrayOfObject2[0] = Integer.valueOf(hashCode());
        arrayOfObject2[1] = Integer.valueOf(paramInt2);
        arrayOfObject2[2] = Integer.valueOf(paramInt3);
        arrayOfObject2[3] = Integer.valueOf(this.retryCount);
        z.w("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "onGYNetEnd hash:%d [%d,%d] ignore update and doscene again retryCount:%d", arrayOfObject2);
      }
      while (a(tp(), null, null) != -1);
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "doScene Failed stop init");
      a(2147483647, 3, -1, "", null);
      return;
      Object[] arrayOfObject1 = new Object[5];
      arrayOfObject1[0] = Integer.valueOf(hashCode());
      arrayOfObject1[1] = Integer.valueOf(paramInt2);
      arrayOfObject1[2] = Integer.valueOf(paramInt3);
      arrayOfObject1[3] = paramString;
      arrayOfObject1[4] = Long.valueOf(this.dyW.nM());
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "onGYNetEnd Error hash:%d [%d,%d,%s] time:%d ", arrayOfObject1);
      a(2147483647, paramInt2, paramInt3, paramString, null);
      return;
      localtj = ((ao)paramaj.sS()).hNK;
      this.dza += localtj.ioi;
      Object[] arrayOfObject4 = new Object[7];
      arrayOfObject4[0] = Integer.valueOf(hashCode());
      arrayOfObject4[1] = Integer.valueOf(paramInt2);
      arrayOfObject4[2] = Integer.valueOf(paramInt3);
      arrayOfObject4[3] = Long.valueOf(this.dyW.nM());
      arrayOfObject4[4] = Integer.valueOf(this.dza);
      arrayOfObject4[5] = Integer.valueOf(this.dyY);
      arrayOfObject4[6] = Integer.valueOf(localtj.hSL);
      z.i("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "onGYNetEnd hash:%d [%d,%d] time:%d cmdSum:%d doscenecount:%d conFlag:%d", arrayOfObject4);
      a(-1 + this.dyY, paramInt2, paramInt3, paramString, localtj);
      if (((0x7 & localtj.hSL) == 0) || (super.to()))
        break;
    }
    while (a(tp(), localtj.iof, localtj.iog) != -1);
    z.e("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "doScene Failed stop init");
    a(2147483647, 3, -1, "", null);
    return;
    Object[] arrayOfObject5 = new Object[3];
    arrayOfObject5[0] = Integer.valueOf(hashCode());
    arrayOfObject5[1] = Long.valueOf(this.dyW.nM());
    arrayOfObject5[2] = Integer.valueOf(this.dyY);
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "NETWORK FINISH onGYNetEnd hash:%d time:%d netCnt:%d", arrayOfObject5);
    this.dyZ = true;
    a(2147483647, 0, 0, "", null);
  }

  protected final void cancel()
  {
    super.cancel();
    this.dzc = true;
  }

  public final String getInfo()
  {
    return this.dyX.toString();
  }

  public final int getType()
  {
    return 37;
  }

  protected final int sB()
  {
    return 500;
  }

  public final boolean to()
  {
    return super.to();
  }

  final void yv()
  {
    int i = 50;
    float f1 = 1.0F;
    if (this.dyf == null)
    {
      z.w("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "dkinit doProgressCallBack progress is null");
      return;
    }
    if (this.dyY > i);
    int j;
    while (!this.dyZ)
    {
      j = i;
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(this.dzb);
      arrayOfObject[1] = Integer.valueOf(this.dza);
      arrayOfObject[2] = Float.valueOf(f1);
      arrayOfObject[3] = Integer.valueOf(i);
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvnIKeokfDtW+c2Qn4D1oK2g=", "doProgressCallBack index:%d sum:%d ratiocmd:%f ratioDoScene:%d", arrayOfObject);
      this.dyf.a(j, 100, this);
      return;
      i = this.dyY;
    }
    float f2 = this.dzb / this.dza;
    if (f2 > f1);
    while (true)
    {
      j = (int)(f1 * (100 - i) + i);
      break;
      f1 = f2;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.a
 * JD-Core Version:    0.6.2
 */