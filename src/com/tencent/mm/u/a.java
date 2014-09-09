package com.tencent.mm.u;

import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import junit.framework.Assert;

public final class a extends x
  implements ab
{
  private ar cCp = new ar();
  private m dlH;
  private cm gQj = new b(this);

  public a(String paramString1, String paramString2)
  {
    this.cCp.setStatus(i);
    this.cCp.bJ(paramString1);
    this.cCp.q(bw.eo(paramString1));
    this.cCp.bv(i);
    this.cCp.setContent(paramString2);
    this.cCp.setType(y.dR(paramString1));
    long l = bg.qW().oV().y(this.cCp);
    if (l != -1L);
    while (true)
    {
      Assert.assertTrue(i);
      z.i("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBy0B7+2aqDGs=", "new msg inserted to db , local id = " + l);
      return;
      int j = 0;
    }
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBy0B7+2aqDGs=", "send local msg, msgId = " + this.cCp.kk());
    this.gQj.sendEmptyMessageDelayed(0, 500L);
    return 999;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvsPvmyRJXaBBy0B7+2aqDGs=", "recv local msg, msgId = " + this.cCp.kk());
    this.cCp.setStatus(2);
    this.cCp.q(bw.b(this.cCp.kt(), System.currentTimeMillis() / 1000L));
    bg.qW().oV().a(this.cCp.kk(), this.cCp);
    this.dlH.a(0, 0, paramString, this);
  }

  public final int getType()
  {
    return 522;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.u.a
 * JD-Core Version:    0.6.2
 */