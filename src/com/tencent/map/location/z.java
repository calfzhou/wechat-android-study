package com.tencent.map.location;

import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class z
  implements Cloneable
{
  private List a = null;

  public z(List paramList)
  {
    if (paramList != null)
    {
      this.a = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        ScanResult localScanResult = (ScanResult)localIterator.next();
        this.a.add(localScanResult);
      }
    }
  }

  public final Object clone()
  {
    try
    {
      localz = (z)super.clone();
      if (this.a != null)
      {
        localz.a = new ArrayList();
        localz.a.addAll(this.a);
      }
      return localz;
    }
    catch (Exception localException)
    {
      while (true)
        z localz = null;
    }
  }

  public final List gY()
  {
    return this.a;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.z
 * JD-Core Version:    0.6.2
 */