package com.tencent.mm.o;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.ad;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.ak;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public final class an extends ad
{
  private x cDg;
  private m doE;
  private final long dpj = 600000L;
  private aj dpk;
  private ab dpl;
  private boolean dpm = false;
  private Runnable dpn = new ao(this);
  private cm gQj;

  public an(aj paramaj, ab paramab, x paramx, m paramm)
  {
    this(paramaj, paramab, paramx, paramm, new cm());
  }

  public an(aj paramaj, ab paramab, x paramx, m paramm, cm paramcm)
  {
    this.dpk = paramaj;
    this.dpl = paramab;
    this.cDg = paramx;
    this.doE = paramm;
    this.gQj = paramcm;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, ak paramak, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    arrayOfObject[3] = Boolean.valueOf(this.dpm);
    arrayOfObject[4] = Integer.valueOf(this.cDg.hashCode());
    z.i("!44@/B4Tb64lLpJVmBcdRgwcnCA6wpOd+TXyJoUPBDMn8CE=", "onGYNetEnd netId:%d, errType:%d, errCode:%d, isCancel:%b, hashcode:%d", arrayOfObject);
    this.cDg.ts();
    if (this.dpm)
      return;
    this.gQj.removeCallbacks(this.dpn);
    this.gQj.post(new ap(this, paramInt1, paramInt2, paramInt3, paramString, paramArrayOfByte));
  }

  public final void cancel()
  {
    this.dpm = true;
    this.gQj.removeCallbacks(this.dpn);
  }

  public final void tG()
  {
    this.gQj.postDelayed(this.dpn, 600000L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.an
 * JD-Core Version:    0.6.2
 */