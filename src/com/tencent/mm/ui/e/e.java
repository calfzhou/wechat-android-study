package com.tencent.mm.ui.e;

import android.content.pm.IPackageStatsObserver.Stub;
import android.content.pm.PackageStats;
import com.tencent.mm.sdk.platformtools.z;

final class e extends IPackageStatsObserver.Stub
{
  e(a parama)
  {
  }

  public final void onGetStatsCompleted(PackageStats paramPackageStats, boolean paramBoolean)
  {
    a.f(this.jXI)[0] = paramPackageStats.cacheSize;
    a.f(this.jXI)[1] = paramPackageStats.dataSize;
    a.f(this.jXI)[2] = paramPackageStats.codeSize;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Long.valueOf(paramPackageStats.cacheSize);
    arrayOfObject[1] = Long.valueOf(paramPackageStats.dataSize);
    arrayOfObject[2] = Long.valueOf(paramPackageStats.codeSize);
    z.i("!44@/B4Tb64lLpKt4OWd5OHuPC+IfVrbYXPiiFECu72P1p0=", "package cacheSize :%d ,dataSize :%d ,codeSize :%d ", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.e.e
 * JD-Core Version:    0.6.2
 */