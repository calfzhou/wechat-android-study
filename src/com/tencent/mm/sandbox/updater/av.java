package com.tencent.mm.sandbox.updater;

import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class av
  implements az
{
  av(UpdaterService paramUpdaterService)
  {
  }

  public final boolean kJ()
  {
    if ((UpdaterService.a(this.iCR) != null) && ((UpdaterService.a(this.iCR).QQ()) || (System.currentTimeMillis() - UpdaterService.a(this.iCR).aMR() <= UpdaterService.aMX())))
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Boolean.valueOf(UpdaterService.a(this.iCR).QQ());
      arrayOfObject[1] = Long.valueOf(UpdaterService.a(this.iCR).aMR());
      arrayOfObject[2] = Long.valueOf(System.currentTimeMillis() - UpdaterService.a(this.iCR).aMR());
      z.i("!32@/B4Tb64lLpJ7QNEsxPPC91DVMPhfLHr7", "dont stop, because of updateManager.isDownloading() %s / updateManager.getIdleTimestamp() %s / System.currentTimeMillis() - updateManager.getIdleTimestamp() %s", arrayOfObject);
      return true;
    }
    z.i("!32@/B4Tb64lLpJ7QNEsxPPC91DVMPhfLHr7", "UpdaterService killed self");
    this.iCR.stopSelf();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.av
 * JD-Core Version:    0.6.2
 */