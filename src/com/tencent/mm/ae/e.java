package com.tencent.mm.ae;

import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

final class e
{
  public String dBe;
  public Queue dBf;

  e(String paramString)
  {
    this.dBe = paramString;
    this.dBf = new LinkedList();
    z.d("!44@/B4Tb64lLpIeWAyce14PnSoaZ878e2B/PLRAkCxQjzY=", "DoSceneStruct:" + paramString);
    ArrayList localArrayList = b.l(ak.getContext(), paramString);
    if ((localArrayList == null) || (localArrayList.size() <= 0))
      z.e("!44@/B4Tb64lLpIeWAyce14PnSoaZ878e2B/PLRAkCxQjzY=", "Parse Message Failed !");
    while (true)
    {
      return;
      for (int i = 0; i < localArrayList.size(); i++)
      {
        Map localMap = ((b)localArrayList.get(i)).dAW;
        if (localMap != null)
        {
          Iterator localIterator = localMap.entrySet().iterator();
          while (localIterator.hasNext())
            this.dBf.offer(((Map.Entry)localIterator.next()).getValue());
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ae.e
 * JD-Core Version:    0.6.2
 */