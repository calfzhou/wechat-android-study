package com.tencent.mm.network;

import com.tencent.mm.sdk.platformtools.cb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class av extends cb
{
  av(ao paramao, Object paramObject, Map paramMap1, Map paramMap2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean)
  {
    super(3000L, paramObject);
  }

  public final Object run()
  {
    Iterator localIterator1 = this.dTA.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator1.next();
      Java2C.saveAuthLongIPs((String)localEntry2.getKey(), (String[])((ArrayList)localEntry2.getValue()).toArray(new String[0]));
    }
    Iterator localIterator2 = this.dTB.entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator2.next();
      Java2C.saveAuthShortIPs((String)localEntry1.getKey(), (String[])((ArrayList)localEntry1.getValue()).toArray(new String[0]));
    }
    Java2C.saveAuthPorts(this.dTC, this.dTD);
    Java2C.onIDCChange(this.dTE);
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.av
 * JD-Core Version:    0.6.2
 */