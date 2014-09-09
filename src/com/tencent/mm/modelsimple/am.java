package com.tencent.mm.modelsimple;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.xo;
import com.tencent.mm.protocal.az;
import com.tencent.mm.protocal.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import junit.framework.Assert;

public final class am extends com.tencent.mm.o.x
  implements ab
{
  private m dlH;
  private final aj dpk = new h();

  public am(int paramInt, String paramString)
  {
    this(paramInt, paramString, "");
  }

  public am(int paramInt, String paramString1, String paramString2)
  {
    az localaz = (az)this.dpk.tk();
    localaz.hNQ.gnq = com.tencent.mm.model.x.pG();
    xo localxo = localaz.hNQ;
    StringBuilder localStringBuilder1 = new StringBuilder();
    if (paramInt == 0)
      paramInt = 64;
    StringBuilder localStringBuilder2 = localStringBuilder1.append(paramInt).append(";");
    if (paramString1 == null)
      paramString1 = "";
    localxo.fxG = paramString1;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvjg+e5iBgO1ic9GoOq2qW5U=", "content:" + localaz.hNQ.fxG);
    Assert.assertTrue("empty sendcard", true);
    localaz.hNQ.inN = 64;
    if ((paramString2 != null) && (paramString2.length() > 0))
      localaz.hNQ.irF = paramString2;
  }

  public am(String paramString)
  {
    az localaz = (az)this.dpk.tk();
    localaz.hNQ.gnq = com.tencent.mm.model.x.pG();
    localaz.hNQ.fxG = paramString;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvjg+e5iBgO1ic9GoOq2qW5U=", "content:" + paramString);
    localaz.hNQ.hEu = ch.a((Integer)bg.qW().oQ().get(66561));
    Assert.assertTrue("empty sendcard", true);
    localaz.hNQ.inN = 128;
  }

  public am(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    az localaz = (az)this.dpk.tk();
    localaz.hNQ.gnq = com.tencent.mm.model.x.pG();
    localaz.hNQ.fxG = paramString;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvjg+e5iBgO1ic9GoOq2qW5U=", "content:" + paramString);
    localaz.hNQ.hEu = ch.a((Integer)bg.qW().oQ().get(66561));
    int i;
    int j;
    if (paramBoolean1)
    {
      i = 1;
      j = 0x0 | (i | 0x0);
      if (!paramBoolean2)
        break label150;
    }
    label150: for (int k = 4; ; k = 0)
    {
      int m = 0x8 | (k | j);
      Assert.assertTrue("empty sendcard", true);
      localaz.hNQ.inN = m;
      return;
      i = 0;
      break;
    }
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dpk, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    this.dlH.a(paramInt2, paramInt3, paramaj.sS().tP(), this);
  }

  public final int getType()
  {
    return 26;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.am
 * JD-Core Version:    0.6.2
 */