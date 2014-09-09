package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.plugin.exdevice.service.n;
import com.tencent.mm.sdk.platformtools.az;
import java.util.HashMap;

final class j
  implements az
{
  j(f paramf, long paramLong, String paramString, int paramInt)
  {
  }

  public final boolean kJ()
  {
    int i = an.PN().aB(this.eIQ);
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.eIO;
    arrayOfObject[1] = Long.valueOf(this.eIQ);
    arrayOfObject[2] = Integer.valueOf(this.eIS);
    arrayOfObject[3] = Integer.valueOf(i);
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGvkcKBG/O5Vnm7/yxH+146A2+5GoKI/yg4NHXtSMTNBi", "now it is time to notify ui show the connetct time out tips, brand name = %s, deviceid = %d, bluetooth version = %d, connect state = %d", arrayOfObject);
    if (i != 2)
    {
      z.Ps();
      l.D(this.eIO, 2);
    }
    f.c(this.eIN).remove(Long.valueOf(this.eIQ));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.j
 * JD-Core Version:    0.6.2
 */