package com.tencent.mm.n;

import com.tencent.mm.a.c;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.protocal.a.ls;
import com.tencent.mm.protocal.a.lt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.q;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

final class aa extends com.tencent.mm.o.x
  implements ab
{
  private com.tencent.mm.o.m dlH;
  private int dnN;
  private FileOutputStream dnO = null;
  private String dnP;
  private String dns;
  private int dnv;
  private String dnx;
  private String username;

  public aa(String paramString)
  {
    this.username = paramString;
    if (i.yc(paramString))
      this.username = i.ye(paramString);
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvh9wthY+DyUiZGVNdnL9sXM=", "init Headimage in_username:" + paramString + " out_username" + this.username);
    this.dnv = 480;
    this.dnN = 480;
    this.dnx = "jpg";
  }

  public static void G(String paramString1, String paramString2)
  {
    af.sh().E(paramString1, paramString2);
  }

  private int q(byte[] paramArrayOfByte)
  {
    try
    {
      if (this.dnO == null)
        this.dnO = new FileOutputStream(new File(this.dnP));
      this.dnO.write(paramArrayOfByte);
      return paramArrayOfByte.length;
    }
    catch (IOException localIOException)
    {
    }
    return -1;
  }

  private void sC()
  {
    try
    {
      if (this.dnO != null)
      {
        this.dnO.flush();
        this.dnO.close();
        this.dnO = null;
      }
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  protected final int a(aj paramaj)
  {
    if ((this.username == null) || (this.username.length() == 0))
      return com.tencent.mm.o.aa.doN;
    return com.tencent.mm.o.aa.doM;
  }

  public final int a(r paramr, com.tencent.mm.o.m paramm)
  {
    this.dlH = paramm;
    if ((this.username == null) || (this.username.length() == 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvh9wthY+DyUiZGVNdnL9sXM=", "username is null");
      return -1;
    }
    if (this.username.endsWith("@qqim"))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvh9wthY+DyUiZGVNdnL9sXM=", "never try get qq user hd.");
      return -1;
    }
    w localw = af.sK();
    this.dns = af.sh().g(this.username, true);
    if (c.ac(this.dns))
    {
      z.i("!44@/B4Tb64lLpK+IBX8XDgnvh9wthY+DyUiZGVNdnL9sXM=", "The HDAvatar of " + this.username + " is already exists");
      return 0;
    }
    this.dnP = (this.dns + ".tmp");
    v localv1 = localw.fd(this.username);
    v localv2;
    a locala;
    ls localls;
    if (localv1 == null)
    {
      c.deleteFile(this.dnP);
      v localv3 = new v();
      localv3.setUsername(this.username);
      localv3.fc(this.dnx);
      localv3.cX(this.dnv);
      localv3.cY(this.dnN);
      localw.a(localv3);
      localv2 = localv3;
      com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
      localb.a(new ls());
      localb.b(new lt());
      localb.fi("/cgi-bin/micromsg-bin/gethdheadimg");
      localb.de(158);
      localb.df(47);
      localb.dg(1000000047);
      locala = localb.sU();
      localls = (ls)locala.sO();
      if (i.yc(this.username))
        break label639;
      localls.gnq = this.username;
      localls.ici = 1;
    }
    while (true)
    {
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvh9wthY+DyUiZGVNdnL9sXM=", "inUser:" + this.username + " outUser:" + localls.gnq + " outType:" + localls.ici);
      localls.icf = this.dnv;
      localls.icg = this.dnN;
      localls.ich = this.dnx;
      localls.hQk = localv2.sp();
      localls.hUu = localv2.sq();
      return a(paramr, locala, this);
      String str = this.dnP;
      int i = 0;
      if (localv1 != null)
      {
        i = 0;
        if (str != null)
        {
          int j = str.length();
          i = 0;
          if (j != 0)
            break label536;
        }
      }
      while (true)
      {
        if (i == 0)
        {
          c.deleteFile(this.dnP);
          localv1.reset();
          localv1.setUsername(this.username);
          localv1.fc(this.dnx);
          localv1.cX(this.dnv);
          localv1.cY(this.dnN);
          localw.a(this.username, localv1);
        }
        localv2 = localv1;
        break;
        label536: boolean bool1 = localv1.so().equals(this.dnx);
        i = 0;
        if (bool1)
        {
          int k = localv1.sm();
          int m = this.dnv;
          i = 0;
          if (k == m)
          {
            int n = localv1.sn();
            int i1 = this.dnN;
            i = 0;
            if (n == i1)
            {
              boolean bool2 = new File(str).length() < localv1.sq();
              i = 0;
              if (!bool2)
                i = 1;
            }
          }
        }
      }
      label639: if (this.username.equals(com.tencent.mm.model.x.pG() + "@bottle"))
      {
        localls.gnq = com.tencent.mm.model.x.pG();
        localls.ici = 2;
      }
      else
      {
        localls.gnq = this.username;
        localls.ici = 2;
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    lt locallt = (lt)((a)paramaj).sP();
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvh9wthY+DyUiZGVNdnL9sXM=", "errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 4) && (paramInt3 != 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvh9wthY+DyUiZGVNdnL9sXM=", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      sC();
      return;
    }
    if ((paramInt2 == 4) || (paramInt2 == 5))
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvh9wthY+DyUiZGVNdnL9sXM=", "ErrType:" + paramInt2);
      sC();
      return;
    }
    int i = paramaj.sS().tQ();
    if ((i == -4) || (i == -54) || (i == -55))
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvh9wthY+DyUiZGVNdnL9sXM=", "retcode == " + i);
    for (int j = 1; j != 0; j = 0)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvh9wthY+DyUiZGVNdnL9sXM=", "handleCertainError");
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      sC();
      return;
    }
    int k = q(locallt.hQi.aLL().getBytes());
    if (k < 0)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvh9wthY+DyUiZGVNdnL9sXM=", "appendBuf fail");
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      sC();
      return;
    }
    w localw = af.sK();
    v localv = localw.fd(this.username);
    localv.da(k + locallt.hUu);
    localv.cZ(locallt.hQk);
    localw.a(this.username, localv);
    if (!localv.sl())
    {
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvh9wthY+DyUiZGVNdnL9sXM=", "doScene again");
      a(tp(), this.dlH);
      return;
    }
    new File(this.dnP).renameTo(new File(this.dns));
    G(this.dns, this.username);
    sC();
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  protected final void cancel()
  {
    super.cancel();
    sC();
  }

  public final int getType()
  {
    return 158;
  }

  protected final int sB()
  {
    return 10;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.aa
 * JD-Core Version:    0.6.2
 */