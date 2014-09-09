package com.tencent.mm.t;

import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.protocal.a.hf;
import com.tencent.mm.protocal.a.hg;
import com.tencent.mm.protocal.a.uz;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import java.util.LinkedList;

public final class a extends x
  implements ab
{
  private m dlH;
  private final com.tencent.mm.o.a dsx;

  public a(int paramInt1, String paramString1, String paramString2, int paramInt2, long paramLong, String paramString3, long[] paramArrayOfLong)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new hf());
    localb.b(new hg());
    localb.fi("/cgi-bin/micromsg-bin/exposewithproof");
    localb.de(661);
    localb.df(0);
    localb.dg(0);
    this.dsx = localb.sU();
    hf localhf = (hf)this.dsx.sO();
    localhf.hOi = paramInt1;
    localhf.hWS = ap.ja(paramString1);
    localhf.hWT = paramInt2;
    if (paramLong >= 0L)
    {
      localuz1 = new uz();
      localuz1.hOY = paramLong;
      localuz1.fxG = paramString3;
      localuz1.ipX = ap.ja(paramString2);
      localhf.dJw.add(localuz1);
    }
    while (paramArrayOfLong == null)
    {
      uz localuz1;
      Object[] arrayOfObject1 = new Object[4];
      arrayOfObject1[0] = Integer.valueOf(localhf.hOi);
      arrayOfObject1[1] = localhf.hWS;
      arrayOfObject1[2] = Integer.valueOf(localhf.hWT);
      arrayOfObject1[3] = Integer.valueOf(localhf.dJw.size());
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvk83Yrw+OAaM0+/MlLC0btPAhEWNLFBpbg==", "[oneliang][ExposeWithProof]scene:%d,chatname:%s,exposetype:%s,list.size:%s", arrayOfObject1);
      return;
    }
    int i = paramArrayOfLong.length;
    int j = 0;
    label234: uz localuz2;
    ar localar;
    label314: String str;
    if (j < i)
    {
      Long localLong = Long.valueOf(paramArrayOfLong[j]);
      localuz2 = new uz();
      localar = bg.qW().oV().cV(localLong.longValue());
      localuz2.hOY = localar.kl();
      localuz2.hOR = localar.getType();
      if (!localar.aJD())
        break label415;
      localuz2.fxG = localar.getContent();
      str = bw.em(localar.getContent());
      if (!ap.jb(str))
        break label441;
      if (localar.jK() != 1)
        break label425;
      localuz2.ipX = ap.ja(paramString2);
    }
    while (true)
    {
      localhf.dJw.add(localuz2);
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(localuz2.hOR);
      arrayOfObject2[1] = Long.valueOf(localuz2.hOY);
      arrayOfObject2[2] = localuz2.ipX;
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvk83Yrw+OAaM0+/MlLC0btPAhEWNLFBpbg==", "[oneliang][ExposeWithProof]MsgType:%s,NewMsgId:%s,Sender:%s", arrayOfObject2);
      j++;
      break label234;
      break;
      label415: localuz2.fxG = "";
      break label314;
      label425: localuz2.ipX = ap.ja(localar.kt());
      continue;
      label441: localuz2.ipX = ap.ja(str);
    }
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
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvk83Yrw+OAaM0+/MlLC0btPAhEWNLFBpbg==", "[oneliang][NetSceneExposeWithProof]:netId:%s,errType:%s,errCode:%s,errMsg:%s", arrayOfObject);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 661;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.t.a
 * JD-Core Version:    0.6.2
 */