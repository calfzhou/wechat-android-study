package com.tencent.mm.sandbox.updater;

import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.sandbox.c;
import com.tencent.mm.sandbox.monitor.g;
import com.tencent.mm.sdk.platformtools.z;

final class at
  implements c
{
  at(ar paramar)
  {
  }

  public final void a(int paramInt1, int paramInt2, vo paramvo)
  {
    ar.a(this.iCJ);
    ar.b(this.iCJ).stop();
    ar.c(this.iCJ);
    if (ar.d(this.iCJ) == null)
    {
      this.iCJ.s(2, true);
      return;
    }
    if ((paramInt1 == 200) && (paramInt2 == 0))
    {
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "packCallback onSceneEnd ok");
      if (this.iCJ.eZP != 2)
        ar.a(this.iCJ, 100, 100);
      if (this.iCJ.iCC)
      {
        an.t(this.iCJ.mContext, 0);
        if (this.iCJ.eZP != 1)
          break label172;
        an.u(this.iCJ.mContext, 8);
        ar.e(this.iCJ);
        this.iCJ.AC(ar.d(this.iCJ).aMu());
      }
      while (true)
      {
        an.aMP();
        return;
        an.t(this.iCJ.mContext, 9);
        break;
        label172: if (this.iCJ.eZP == 0)
        {
          this.iCJ.AC(ar.d(this.iCJ).aMu());
        }
        else if (this.iCJ.eZP == 2)
        {
          an.u(this.iCJ.mContext, 1);
          ar.e(this.iCJ);
        }
      }
    }
    if (paramInt2 == -13)
    {
      z.e("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "session timeout, killself and restart");
      UpdaterService.aMV();
      AppUpdaterUI.aMz();
      an.aMO();
      return;
    }
    if ((ar.d(this.iCJ) instanceof aa))
    {
      z.e("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "download package from cdn error.");
      if (this.iCJ.iCC)
      {
        if ((paramInt1 == 3) || (paramInt1 == 4) || (paramInt1 == 2) || (paramInt1 == 1) || (paramInt1 == 13))
          an.t(this.iCJ.mContext, paramInt1);
        this.iCJ.iCC = false;
        if (this.iCJ.eZP == 1)
          ar.f(this.iCJ);
      }
    }
    while (true)
    {
      this.iCJ.a(ar.d(this.iCJ));
      return;
      if (this.iCJ.eZP == 0)
      {
        this.iCJ.s(1, true);
      }
      else if (this.iCJ.eZP == 2)
      {
        ar.g(this.iCJ);
        continue;
        ar localar = this.iCJ;
        int i = this.iCJ.size;
        String str1 = this.iCJ.cHL;
        int j = this.iCJ.iBm;
        int k = this.iCJ.uin;
        String str2 = this.iCJ.dSO;
        byte[] arrayOfByte = this.iCJ.dpA;
        String[] arrayOfString = this.iCJ.iCy;
        if (this.iCJ.eZP == 2);
        for (boolean bool = true; ; bool = false)
        {
          ar.a(localar, new x(i, str1, j, k, str2, arrayOfByte, arrayOfString, bool));
          ar.h(this.iCJ);
          break;
        }
        z.e("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "update failed");
        an.t(this.iCJ.mContext, 10);
        if (this.iCJ.eZP == 1)
          ar.i(this.iCJ);
        else if (this.iCJ.eZP == 0)
          this.iCJ.s(1, true);
      }
    }
  }

  public final void cM(long paramLong)
  {
    ar.b(this.iCJ).cM(paramLong);
  }

  public final void cN(long paramLong)
  {
    ar.b(this.iCJ).cN(paramLong);
  }

  public final void w(int paramInt1, int paramInt2)
  {
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC9wTRgf8U5GU7", "total=" + paramInt1 + ", offset=" + paramInt2);
    if (this.iCJ.eZP != 2)
      ar.a(this.iCJ, paramInt2, paramInt1);
    this.iCJ.w(paramInt1, paramInt2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.at
 * JD-Core Version:    0.6.2
 */