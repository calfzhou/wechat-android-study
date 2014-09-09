package com.tencent.mm.modelgeo;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class i extends n
{
  i(h paramh)
  {
  }

  public final void a(boolean paramBoolean, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4)
  {
    if (paramBoolean)
    {
      h.a(this.dvB, paramDouble1);
      h.b(this.dvB, paramDouble2);
      h.a(this.dvB, paramInt);
      h.c(this.dvB, paramDouble3);
      h.d(this.dvB, paramDouble4);
      h.a(this.dvB, System.currentTimeMillis());
      h.a(this.dvB);
      h.b(this.dvB, 67592);
    }
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Double.valueOf(paramDouble2);
    arrayOfObject[1] = Double.valueOf(paramDouble1);
    arrayOfObject[2] = Integer.valueOf(paramInt);
    arrayOfObject[3] = Double.valueOf(paramDouble3);
    z.d("!32@/B4Tb64lLpIu6Y+BscdrxN3pFdbvvih6", "onGetLocation fLongitude: %f fLatitude:%f locType:%d %f:spped", arrayOfObject);
    new cm(Looper.getMainLooper()).postDelayed(new j(this, paramBoolean, paramDouble2, paramDouble1, paramInt, paramDouble3, paramDouble4), 200L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.i
 * JD-Core Version:    0.6.2
 */