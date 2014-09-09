package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.plugin.exdevice.e.b;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.plugin.exdevice.service.ap;
import com.tencent.mm.plugin.exdevice.service.n;
import com.tencent.mm.plugin.exdevice.service.o;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;

final class k extends ap
{
  k(f paramf)
  {
  }

  public final void b(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = com.tencent.mm.plugin.c.a.d.a.aj(paramLong);
    arrayOfObject1[1] = Integer.valueOf(paramInt1);
    arrayOfObject1[2] = Integer.valueOf(paramInt2);
    arrayOfObject1[3] = Integer.valueOf(paramInt3);
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "onStateChange, deviceId = %s, oldSate = %d, newState = %d, errCode = %d", arrayOfObject1);
    if (ak.getContext() == null)
      com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "MMApplicationContext is null");
    while (true)
    {
      return;
      if (4 == paramInt2)
      {
        an.PN().aE(paramLong);
        long[] arrayOfLong = com.tencent.mm.plugin.exdevice.e.a.lN("shut_down_device");
        if ((arrayOfLong != null) && (arrayOfLong.length != 0))
        {
          int i = arrayOfLong.length;
          for (int j = 0; j < i; j++)
          {
            long l = arrayOfLong[j];
            if (l == paramLong)
            {
              Object[] arrayOfObject4 = new Object[1];
              arrayOfObject4[0] = Long.valueOf(l);
              com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "Stop channel in the shut down device list, deviceId = %d", arrayOfObject4);
              f.ap(l);
              if (!com.tencent.mm.plugin.exdevice.e.a.g("shut_down_device", l))
                com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "removeFromSharedPreferences failed!!!");
            }
          }
        }
      }
      if (paramInt1 != paramInt2)
      {
        b localb = z.Pp().lP(String.valueOf(paramLong));
        if ((localb == null) || (ch.jb(localb.field_brandName)))
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Long.valueOf(paramLong);
          com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "get hdinfo by mac failed : %d", arrayOfObject2);
          return;
        }
        o localo = an.PN().aC(paramLong);
        if (localo != null)
          localo.cLJ = paramInt2;
        while (paramInt2 != 2)
        {
          z.Ps();
          l.C(localb.field_brandName, paramInt2);
          return;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Long.valueOf(paramLong);
          com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "get connect state faild : %d", arrayOfObject3);
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.k
 * JD-Core Version:    0.6.2
 */