package com.tencent.mm.v;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.protocal.a.do;
import com.tencent.mm.protocal.a.dp;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;
import junit.framework.Assert;

public final class k extends x
  implements ab
{
  private m dlH;
  private final a dmI;

  public k(String paramString1, String paramString2, String paramString3, int paramInt1, LinkedList paramLinkedList, String paramString4, int paramInt2, int paramInt3)
  {
    if (paramString2 != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("The NetSceneCheckCanSubscribeBiz toUserName can not be null", bool);
      b localb = new b();
      localb.a(new do());
      localb.b(new dp());
      localb.fi("/cgi-bin/micromsg-bin/checkcansubscribebiz");
      localb.de(605);
      localb.df(0);
      localb.dg(0);
      this.dmI = localb.sU();
      do localdo = (do)this.dmI.sO();
      localdo.hsT = paramString1;
      localdo.hPs = paramString2;
      localdo.hTI = paramString3;
      localdo.hTJ = paramInt1;
      localdo.hTK = paramLinkedList;
      localdo.hTL = null;
      localdo.hTM = paramString4;
      localdo.hPv = paramInt2;
      localdo.hOi = paramInt3;
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = paramString1;
      arrayOfObject[1] = paramString2;
      arrayOfObject[2] = paramString3;
      arrayOfObject[3] = Integer.valueOf(paramInt1);
      arrayOfObject[4] = Integer.valueOf(paramInt3);
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvm6gJrUuLd1phgmWE1bPvtkU+pLdjVHVoQ==", "appId(%s) , toUsername(%s) , extInfo(%s) , packNum(%d), scene(%d)", arrayOfObject);
      return;
    }
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvm6gJrUuLd1phgmWE1bPvtkU+pLdjVHVoQ==", "onGYNetEnd, errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 605;
  }

  public final boolean xt()
  {
    dp localdp = (dp)this.dmI.sP();
    return (localdp != null) && (!ap.jb(localdp.hTN)) && (!ap.jb(localdp.hPs));
  }

  public final String xu()
  {
    dp localdp = (dp)this.dmI.sP();
    if (localdp == null)
      return null;
    return localdp.hTN;
  }

  public final String xv()
  {
    dp localdp = (dp)this.dmI.sP();
    if (localdp == null)
      return null;
    return localdp.hPs;
  }

  public final String xw()
  {
    dp localdp = (dp)this.dmI.sP();
    if (localdp == null)
      return null;
    return localdp.hTO;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.k
 * JD-Core Version:    0.6.2
 */