package com.tencent.mm.n;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.mm.a.c;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.protocal.a.adf;
import com.tencent.mm.protocal.a.adg;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.io.File;
import java.io.FileOutputStream;

public final class ab extends com.tencent.mm.o.x
  implements com.tencent.mm.network.ab
{
  private com.tencent.mm.o.m dlH;
  private int dnA;
  private String dnQ;
  private String dnR;
  private String dnS;
  private String dnT = com.tencent.mm.model.x.pG();
  private int dny;
  private int dnz;

  public ab(int paramInt, String paramString)
  {
    if (paramInt == 2)
      this.dnT = com.tencent.mm.storage.i.ye(this.dnT);
    this.dnR = af.sh().g(this.dnT, true);
    String str = this.dnR + ".tmp";
    if (H(paramString, str) == 0)
    {
      this.dnQ = str;
      this.dnA = paramInt;
      this.dnS = af.sh().eU(this.dnT);
      this.dny = 0;
      this.dnz = 0;
    }
  }

  private static int H(String paramString1, String paramString2)
  {
    BitmapFactory.Options localOptions1 = new BitmapFactory.Options();
    localOptions1.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString1, localOptions1);
    if ((localOptions1.outHeight < 640) && (localOptions1.outWidth < 640))
    {
      p.f(paramString1, paramString2, false);
      Object[] arrayOfObject4 = new Object[2];
      arrayOfObject4[0] = Integer.valueOf(localOptions1.outHeight);
      arrayOfObject4[1] = Integer.valueOf(localOptions1.outWidth);
      z.v("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "outHeight and outWidth: %d,%d , do not scale.", arrayOfObject4);
      return 0;
    }
    int i = Math.max(localOptions1.outWidth / 640, localOptions1.outHeight / 640);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(localOptions1.outWidth);
    arrayOfObject1[1] = Integer.valueOf(localOptions1.outHeight);
    arrayOfObject1[2] = Integer.valueOf(i);
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "src w:%d h:%d samp:%d", arrayOfObject1);
    BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
    localOptions2.inPreferredConfig = Bitmap.Config.ARGB_8888;
    localOptions2.inSampleSize = i;
    com.tencent.mm.sdk.platformtools.i.a(localOptions2);
    Bitmap localBitmap1 = BitmapFactory.decodeFile(paramString1, localOptions2);
    if (localBitmap1 == null)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(i);
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "decode file fail %d", arrayOfObject3);
      return 0 - k.nJ();
    }
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(localBitmap1.getWidth());
    arrayOfObject2[1] = Integer.valueOf(localBitmap1.getHeight());
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "dest:w:%d h:%d", arrayOfObject2);
    Bitmap localBitmap2 = Bitmap.createScaledBitmap(localBitmap1, 640, 640, true);
    if (localBitmap1 != localBitmap2)
      localBitmap1.recycle();
    if (localBitmap2 == null)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "Scale file fail");
      return 0 - k.nJ();
    }
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(paramString2);
      localBitmap2.compress(Bitmap.CompressFormat.JPEG, 40, localFileOutputStream);
      localFileOutputStream.close();
      localBitmap2.recycle();
      return 0;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "open FileOutputStream fail");
      localBitmap2.recycle();
    }
    return 0 - k.nJ();
  }

  protected final int a(aj paramaj)
  {
    if ((this.dnQ == null) || (this.dnQ.length() == 0))
      return aa.doN;
    return aa.doM;
  }

  public final int a(r paramr, com.tencent.mm.o.m paramm)
  {
    this.dlH = paramm;
    if ((this.dnQ == null) || (this.dnQ.length() == 0))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "imgPath is null or length = 0");
      return -1;
    }
    if (!c.ac(this.dnQ))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "The img does not exist, imgPath = " + this.dnQ);
      return -1;
    }
    if (this.dny == 0)
      this.dny = ((int)new File(this.dnQ).length());
    int i = Math.min(this.dny - this.dnz, 8192);
    byte[] arrayOfByte = c.a(this.dnQ, this.dnz, i);
    if (arrayOfByte == null)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "readFromFile error");
      return -1;
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(arrayOfByte.length);
    arrayOfObject[1] = Integer.valueOf(this.dny);
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "doScene uploadLen:%d, total: %d", arrayOfObject);
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new adf());
    localb.b(new adg());
    localb.fi("/cgi-bin/micromsg-bin/uploadhdheadimg");
    localb.de(157);
    localb.df(46);
    localb.dg(1000000046);
    a locala = localb.sU();
    adf localadf = (adf)locala.sO();
    localadf.hQk = this.dny;
    localadf.hUu = this.dnz;
    localadf.ici = this.dnA;
    localadf.hQi = new ws().cl(arrayOfByte);
    localadf.iwe = this.dnS;
    return a(paramr, locala, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    adg localadg = (adg)((a)paramaj).sP();
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 4) && (paramInt3 != 0))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) || (paramInt2 == 5))
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "ErrType:" + paramInt2);
      return;
    }
    int i = paramaj.sS().tQ();
    int j = 0;
    if (i == -4)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "retcode == %d", arrayOfObject);
      j = 1;
    }
    if (j != 0)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "handleCertainError");
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.dnz = localadg.hUu;
    if (this.dnz < this.dny)
    {
      if (a(tp(), this.dlH) < 0)
      {
        z.e("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "doScene again failed");
        this.dlH.a(3, -1, "", this);
      }
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "doScene again");
      return;
    }
    try
    {
      new File(this.dnQ).renameTo(new File(this.dnR));
      bg.qW().oQ().set(12297, localadg.iwf);
      af.sh().d(this.dnT, com.tencent.mm.sdk.platformtools.i.wU(this.dnR));
      String str = com.tencent.mm.model.x.pG();
      if (!ch.jb(str))
      {
        x localx = new x();
        localx.setUsername(str);
        localx.T(true);
        localx.db(32);
        localx.bi(3);
        localx.db(34);
        af.sJ().a(localx);
      }
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvr3T7iTM8n4bvyrpMrXmVPURKTzfu5kE6A==", "rename temp file failed :" + localException.getMessage());
      this.dlH.a(3, -1, "", this);
    }
  }

  protected final void cancel()
  {
    super.cancel();
  }

  public final int getType()
  {
    return 157;
  }

  protected final int sB()
  {
    return 200;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.ab
 * JD-Core Version:    0.6.2
 */