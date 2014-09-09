package com.tencent.mm.aa;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.pn;
import com.tencent.mm.protocal.a.po;
import com.tencent.mm.sdk.platformtools.z;

public final class c extends x
  implements ab
{
  private m dlH;
  private final a dsx;

  public c(String paramString1, String paramString2, String paramString3)
  {
    b localb = new b();
    localb.a(new pn());
    localb.b(new po());
    localb.fi("/cgi-bin/micromsg-bin/invitelinkedinfriend");
    localb.de(677);
    localb.df(0);
    localb.dg(0);
    this.dsx = localb.sU();
    pn localpn = (pn)this.dsx.sO();
    localpn.ifr = paramString1;
    localpn.ift = paramString2;
    localpn.ifs = paramString3;
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dsx, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    arrayOfObject[3] = paramString;
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvhaozS6gV+K/39XkuZsYAsZ7cIpacrC6MQ==", "[oneliang][NetSceneInviteLinkedInFriend]:netId:%s,errType:%s,errCode:%s,errMsg:%s", arrayOfObject);
    if ((paramInt2 == 0) && (paramInt3 == 0))
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvhaozS6gV+K/39XkuZsYAsZ7cIpacrC6MQ==", "[oneliang][NetSceneInviteLinkedInFriend]:net end ok");
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 677;
  }

  protected final int sB()
  {
    return 10;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aa.c
 * JD-Core Version:    0.6.2
 */