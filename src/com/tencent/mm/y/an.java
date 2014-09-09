package com.tencent.mm.y;

import android.graphics.BitmapFactory.Options;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.adq;
import com.tencent.mm.protocal.a.adr;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;

public final class an extends x
  implements ab
{
  private m dlH;
  private final a dmI;
  private ao dyC;

  public an(adq paramadq, l paraml, keep_SceneResult paramkeep_SceneResult, ao paramao)
  {
    b localb = new b();
    localb.a(new adq());
    localb.b(new adr());
    localb.fi("/cgi-bin/micromsg-bin/uploadmsgimg");
    localb.de(110);
    localb.df(9);
    localb.dg(1000000009);
    this.dmI = localb.sU();
    this.dyC = paramao;
    adq localadq = (adq)this.dmI.sO();
    localadq.hOP = paramadq.hOP;
    localadq.hOQ = paramadq.hOQ;
    localadq.iws = paramadq.iws;
    localadq.hOR = paramadq.hOR;
    BitmapFactory.Options localOptions = i.wS(ap.yg().f(paraml.xO(), "", ""));
    int i;
    if (localOptions != null)
    {
      i = localOptions.outWidth;
      localadq.iwA = i;
      if (localOptions == null)
        break label329;
    }
    label329: for (int j = localOptions.outHeight; ; j = 0)
    {
      localadq.iwz = j;
      localadq.iwx = paramkeep_SceneResult.field_fileId;
      localadq.iwy = paramkeep_SceneResult.field_thumbimgLength;
      localadq.hQk = paramkeep_SceneResult.field_thumbimgLength;
      localadq.hUu = 0;
      localadq.hQs = paramkeep_SceneResult.field_thumbimgLength;
      localadq.hQi = new ws().cl(new byte[0]);
      localadq.hQm = 1;
      localadq.hXp = paramkeep_SceneResult.field_aesKey;
      localadq.iwB = paramkeep_SceneResult.field_aesKey;
      localadq.icN = paramadq.icN;
      if (paramadq.icN != 1)
        break label335;
      localadq.iwv = paramkeep_SceneResult.field_fileLength;
      localadq.iww = paramkeep_SceneResult.field_midimgLength;
      localadq.iwt = paramkeep_SceneResult.field_fileId;
      localadq.iwu = paramkeep_SceneResult.field_fileId;
      return;
      i = 0;
      break;
    }
    label335: localadq.iwv = 0;
    localadq.iww = paramkeep_SceneResult.field_fileLength;
    localadq.iwt = "";
    localadq.iwu = paramkeep_SceneResult.field_fileId;
  }

  public final int a(r paramr, m paramm)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ((adq)this.dmI.sO()).toString();
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXW0TWGzGcjGtVL6Mf7s8lrSw==", "cdntra req[%s]", arrayOfObject);
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXW0TWGzGcjGtVL6Mf7s8lrSw==", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3);
    adr localadr = (adr)((a)paramaj).sP();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(localadr.hOV);
    arrayOfObject[1] = Long.valueOf(localadr.hOY);
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXW0TWGzGcjGtVL6Mf7s8lrSw==", "onGYNetEnd createtime:%d msgId:%d ", arrayOfObject);
    if (this.dyC != null)
      this.dyC.a(localadr.hOY, localadr.hOV, paramInt2, paramInt3);
    this.dlH.a(0, 0, "", this);
  }

  public final int getType()
  {
    return 110;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.an
 * JD-Core Version:    0.6.2
 */