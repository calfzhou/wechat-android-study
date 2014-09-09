package com.tencent.mm.o;

import com.tencent.mm.network.ab;
import com.tencent.mm.sdk.platformtools.z;

final class ap
  implements Runnable
{
  ap(an paraman, int paramInt1, int paramInt2, int paramInt3, String paramString, byte[] paramArrayOfByte)
  {
  }

  public final void run()
  {
    if (an.c(this.dpo))
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(this.dpp);
      z.w("!44@/B4Tb64lLpJVmBcdRgwcnCA6wpOd+TXyJoUPBDMn8CE=", "netId:%d has been canceled", arrayOfObject3);
    }
    do
    {
      return;
      Object[] arrayOfObject1 = new Object[5];
      arrayOfObject1[0] = Integer.valueOf(this.dpp);
      arrayOfObject1[1] = Integer.valueOf(this.dpd);
      arrayOfObject1[2] = Integer.valueOf(this.dpe);
      arrayOfObject1[3] = Boolean.valueOf(an.c(this.dpo));
      arrayOfObject1[4] = Integer.valueOf(an.d(this.dpo).hashCode());
      z.i("!44@/B4Tb64lLpJVmBcdRgwcnCA6wpOd+TXyJoUPBDMn8CE=", "onGYNetEnd after post to worker netId:%d, errType:%d, errCode:%d, isCancel:%b, hashcode:%d", arrayOfObject1);
      an.b(this.dpo).a(this.dpp, this.dpd, this.dpe, this.dpf, an.a(this.dpo), this.dpq);
    }
    while ((!an.d(this.dpo).tq()) || (an.d(this.dpo).tr()));
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(an.d(this.dpo).getType());
    z.e("!44@/B4Tb64lLpJVmBcdRgwcnCA6wpOd+TXyJoUPBDMn8CE=", "the netscene hasn't call callback to onSceneEnd, type:%d", arrayOfObject2);
    z.appenderFlush();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.ap
 * JD-Core Version:    0.6.2
 */