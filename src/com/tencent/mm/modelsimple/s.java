package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.du;
import com.tencent.mm.protocal.a.dv;
import com.tencent.mm.sdk.platformtools.z;

public final class s extends x
  implements ab
{
  public static int dCA = 4;
  public static int dCx = 1;
  public static int dCy = 2;
  public static int dCz = 3;
  private m dlH;
  private a dmI;

  public s(int paramInt)
  {
    b localb = new b();
    localb.a(new du());
    localb.b(new dv());
    localb.fi("/cgi-bin/micromsg-bin/checkunbind");
    localb.de(254);
    localb.df(131);
    localb.dg(1000000131);
    this.dmI = localb.sU();
    ((du)this.dmI.sO()).hTW = paramInt;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 254;
  }

  public final String zi()
  {
    try
    {
      String str = ((dv)this.dmI.sP()).hTX;
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvvJxLLvm/u5PfJqHJ9mAfMc=", "getRandomPasswd() " + str);
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.s
 * JD-Core Version:    0.6.2
 */