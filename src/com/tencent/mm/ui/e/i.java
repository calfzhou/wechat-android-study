package com.tencent.mm.ui.e;

import android.content.pm.IPackageStatsObserver.Stub;
import android.content.pm.PackageStats;
import com.tencent.mm.sdk.platformtools.z;

final class i extends IPackageStatsObserver.Stub
{
  i(f paramf)
  {
  }

  public final void onGetStatsCompleted(PackageStats paramPackageStats, boolean paramBoolean)
  {
    f.f(this.jXU)[0] = paramPackageStats.cacheSize;
    f.f(this.jXU)[1] = paramPackageStats.dataSize;
    f.f(this.jXU)[2] = paramPackageStats.codeSize;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Long.valueOf(paramPackageStats.cacheSize);
    arrayOfObject[1] = Long.valueOf(paramPackageStats.dataSize);
    arrayOfObject[2] = Long.valueOf(paramPackageStats.codeSize);
    z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "package cacheSize :%d ,dataSize :%d ,codeSize :%d ", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.e.i
 * JD-Core Version:    0.6.2
 */