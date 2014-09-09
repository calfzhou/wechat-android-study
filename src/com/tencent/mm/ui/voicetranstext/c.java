package com.tencent.mm.ui.voicetranstext;

import com.tencent.mm.modelvoice.bs;
import com.tencent.mm.modelvoice.y;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.protocal.a.adu;
import com.tencent.mm.protocal.a.adv;
import com.tencent.mm.protocal.a.adw;
import com.tencent.mm.protocal.a.aet;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

public final class c extends x
  implements ab
{
  private final String TAG = "!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rRBGQvYcItRiUa+QtwuBS0w==";
  private a frT;
  private m frU;
  private String jZM;
  private aet jZO;
  private adu jZU;
  private String mFileName;

  public c(c paramc)
  {
    this.jZM = paramc.jZM;
    this.jZO = paramc.jZO;
    this.jZU = paramc.jZU;
    this.mFileName = paramc.mFileName;
    bch();
  }

  public c(String paramString1, adu paramadu, int paramInt, String paramString2)
  {
    if (paramString2 != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.jZM = paramString1;
      this.jZU = paramadu;
      this.jZO = d.G(paramInt, paramString2);
      this.mFileName = paramString2;
      bch();
      return;
    }
  }

  private void bch()
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new adv());
    localb.b(new adw());
    localb.fi("/cgi-bin/micromsg-bin/uploadvoicefortrans");
    localb.de(547);
    localb.df(0);
    localb.dg(0);
    this.frT = localb.sU();
  }

  public final int a(r paramr, m paramm)
  {
    this.frU = paramm;
    if ((!ap.jb(this.mFileName)) && (!ap.jb(this.jZM)) && (this.jZU != null) && (this.jZO != null));
    for (int i = 1; i == 0; i = 0)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rRBGQvYcItRiUa+QtwuBS0w==", "doScene: Value not Valid, so, do nothing.");
      return -1;
    }
    adv localadv = (adv)this.frT.sO();
    localadv.hTY = this.jZM;
    localadv.hTZ = this.jZO;
    localadv.hUb = this.jZU;
    String str = this.mFileName;
    int j = this.jZU.hUu;
    int k = this.jZU.hQs;
    ws localws = new ws();
    com.tencent.mm.modelvoice.b localb = bs.iw(str);
    if (localb != null)
      localws = ai.z(localb.J(j, k).buf);
    localadv.hQi = localws;
    return a(paramr, this.frT, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    bci();
    Object[] arrayOfObject2;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.jZU = ((adw)this.frT.sP()).hUb;
      this.frU.a(paramInt2, paramInt3, paramString, this);
      if (bci())
      {
        arrayOfObject2 = new Object[1];
        if (this.jZU == null)
          break label120;
      }
    }
    label120: for (boolean bool = true; ; bool = false)
    {
      arrayOfObject2[0] = Boolean.valueOf(bool);
      z.i("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rRBGQvYcItRiUa+QtwuBS0w==", "succeeed finish: %B", arrayOfObject2);
      return;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(paramInt2);
      arrayOfObject1[1] = Integer.valueOf(paramInt3);
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rRBGQvYcItRiUa+QtwuBS0w==", "error upload: errType:%d, errCode:%d", arrayOfObject1);
      break;
    }
  }

  public final adu bcd()
  {
    return this.jZU;
  }

  public final boolean bci()
  {
    return (this.jZU == null) || (this.jZU.hQs <= 0);
  }

  public final int getType()
  {
    return 547;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.c
 * JD-Core Version:    0.6.2
 */