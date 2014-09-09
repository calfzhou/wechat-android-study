package com.tencent.mm.u;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;
import com.tencent.mm.y.n;
import junit.framework.Assert;

public final class c extends x
  implements ab
{
  private ar cCp = null;
  private m dlH;
  private long dsA;
  private long dsz;
  private cm gQj = new d(this);

  public c(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2)
  {
    PString localPString = new PString();
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    this.dsz = ap.yg().a(paramString3, paramInt1, paramInt2, localPString, localPInt1, localPInt2);
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWXUqGzVrvIh3GjvVON7+gyQ==", "send local msgImg, imgLocalId = " + this.dsz + ", fromUserName = " + paramString1 + ", toUserName = " + paramString2 + ", origImgPath = " + paramString3);
    this.cCp = new ar();
    this.cCp.setStatus(1);
    this.cCp.setType(y.dS(paramString2));
    this.cCp.bJ(paramString2);
    this.cCp.bv(1);
    this.cCp.bK(localPString.value);
    this.cCp.bJ(localPInt1.value);
    this.cCp.bK(localPInt2.value);
    this.cCp.q(bw.eo(this.cCp.kt()));
    this.dsA = bg.qW().oV().y(this.cCp);
    if (this.dsA >= 0L);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      z.i("!56@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWXUqGzVrvIh3GjvVON7+gyQ==", "NetSceneUploadMsgImgFake: local msgId = " + this.dsA);
      l locall = ap.yg().Q(this.dsz);
      locall.O((int)this.dsA);
      ap.yg().a(this.dsz, locall);
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWXUqGzVrvIh3GjvVON7+gyQ==", "NetSceneUploadMsgImg: local imgId = " + this.dsz + " img len = " + locall.sp());
      return;
    }
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    if (this.dsz < 0L);
    do
    {
      return -1;
      this.dlH = paramm;
    }
    while (ap.yg().Q(this.dsz).getStatus() == -1);
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWXUqGzVrvIh3GjvVON7+gyQ==", "send local msgimg, imgLocalId = " + this.dsz);
    this.gQj.sendEmptyMessageDelayed(0, 500L);
    return 999;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWXUqGzVrvIh3GjvVON7+gyQ==", "recv local msgimg, imgLocalId = " + this.dsz);
    this.cCp.setStatus(2);
    this.cCp.q(bw.b(this.cCp.kt(), System.currentTimeMillis() / 1000L));
    bg.qW().oV().a(this.dsA, this.cCp);
    this.dlH.a(0, 0, "", this);
  }

  public final int getType()
  {
    return 110;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.u.c
 * JD-Core Version:    0.6.2
 */