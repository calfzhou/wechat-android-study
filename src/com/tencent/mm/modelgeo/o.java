package com.tencent.mm.modelgeo;

import com.tencent.map.a.a.b;
import com.tencent.map.a.a.d;
import com.tencent.mm.sdk.platformtools.z;

public abstract class o extends b
{
  public o()
  {
    super(0);
  }

  public final void a(d paramd)
  {
    super.a(paramd);
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Double.valueOf(paramd.KL);
    arrayOfObject[1] = Double.valueOf(paramd.KM);
    arrayOfObject[2] = Double.valueOf(paramd.KP);
    arrayOfObject[3] = Integer.valueOf(paramd.Lj);
    arrayOfObject[4] = Integer.valueOf(paramd.Lk);
    arrayOfObject[5] = Double.valueOf(paramd.KQ);
    arrayOfObject[6] = Integer.valueOf(paramd.KN);
    z.i("!44@/B4Tb64lLpJfn8anhv+Gj4lPDE5/r0LjV8acCqgU1Wc=", "lat=%f, lng=%f, accuracy=%f errcode=%d, info=%d, speed=%f, loctype=%d", arrayOfObject);
    if (paramd.Lj == 0)
    {
      a(true, paramd.KL, paramd.KM, paramd.KN, paramd.KQ, paramd.KP);
      return;
    }
    a(false, paramd.KL, paramd.KM, paramd.KN, paramd.KQ, paramd.KP);
  }

  public void a(boolean paramBoolean, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4)
  {
  }

  public final void a(byte[] paramArrayOfByte, int paramInt)
  {
    super.a(paramArrayOfByte, paramInt);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpJfn8anhv+Gj4lPDE5/r0LjV8acCqgU1Wc=", "onLocationDataUpdate, status=%d", arrayOfObject);
  }

  public final void aQ(int paramInt)
  {
    super.aQ(paramInt);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpJfn8anhv+Gj4lPDE5/r0LjV8acCqgU1Wc=", "onStatusUpdate, status=%d", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.o
 * JD-Core Version:    0.6.2
 */