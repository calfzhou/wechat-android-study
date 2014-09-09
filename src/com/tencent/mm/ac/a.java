package com.tencent.mm.ac;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.ne;
import com.tencent.mm.protocal.a.nf;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.z;

public final class a extends x
  implements ab
{
  private int dAc = 0;
  private m dAd = null;
  private final com.tencent.mm.o.a dmI;
  private String url = "";

  public a(int paramInt, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    if (paramString == null);
    for (String str = "null"; ; str = paramString)
    {
      arrayOfObject[1] = str;
      z.i("!56@/B4Tb64lLpK+IBX8XDgnvqCY1qFnc2pwVDVC1bPHIjuXQOoljo0Iyg==", "request music lyric: songId: %d, url: %s", arrayOfObject);
      b localb = new b();
      localb.a(new ne());
      localb.b(new nf());
      localb.fi("/cgi-bin/micromsg-bin/getqqmusiclyric");
      localb.de(520);
      localb.df(0);
      localb.dg(0);
      this.dmI = localb.sU();
      this.dAc = paramInt;
      this.url = paramString;
      return;
    }
  }

  public final int a(r paramr, m paramm)
  {
    this.dAd = paramm;
    ne localne = (ne)this.dmI.sO();
    localne.idq = this.dAc;
    localne.idr = ai.z(this.url.getBytes());
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    this.dAd.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 520;
  }

  public final ws yD()
  {
    nf localnf = (nf)this.dmI.sP();
    if ((localnf == null) || (localnf.ids == null))
      return null;
    return localnf.ids;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ac.a
 * JD-Core Version:    0.6.2
 */