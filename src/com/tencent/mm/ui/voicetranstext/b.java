package com.tencent.mm.ui.voicetranstext;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.protocal.a.aev;
import com.tencent.mm.protocal.a.og;
import com.tencent.mm.protocal.a.oh;
import com.tencent.mm.protocal.a.vh;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

public final class b extends x
  implements ab
{
  private final String TAG = "!56@/B4Tb64lLpK+IBX8XDgnvteT4hO0zG8rsBAjy9sXOChKMZcfndXfBg==";
  private a frT;
  private m frU;
  private String jZM;
  private aev jZT;
  private int jZX = -1;

  public b(String paramString)
  {
    if (!ap.jb(paramString));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.jZM = paramString;
      com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
      localb.a(new og());
      localb.b(new oh());
      localb.fi("/cgi-bin/micromsg-bin/getvoicetransres");
      localb.de(548);
      localb.df(0);
      localb.dg(0);
      this.frT = localb.sU();
      return;
    }
  }

  public final int a(r paramr, m paramm)
  {
    this.frU = paramm;
    ((og)this.frT.sO()).hTY = this.jZM;
    return a(paramr, this.frT, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      oh localoh = (oh)this.frT.sP();
      if (localoh.hUc != null)
        this.jZX = localoh.hUc.iqg;
      this.jZT = localoh.hUa;
    }
    while (true)
    {
      this.frU.a(paramInt2, paramInt3, paramString, this);
      return;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt2);
      arrayOfObject[1] = Integer.valueOf(paramInt3);
      z.i("!56@/B4Tb64lLpK+IBX8XDgnvteT4hO0zG8rsBAjy9sXOChKMZcfndXfBg==", "error get: errType:%d, errCode:%d", arrayOfObject);
    }
  }

  public final aev bcc()
  {
    return this.jZT;
  }

  public final boolean bcg()
  {
    return (this.jZT != null) && (!ap.jb(this.jZT.ixB));
  }

  public final int getInterval()
  {
    return this.jZX;
  }

  public final int getType()
  {
    return 548;
  }

  public final boolean isComplete()
  {
    return (this.jZT != null) && (this.jZT.hQj == 1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.b
 * JD-Core Version:    0.6.2
 */