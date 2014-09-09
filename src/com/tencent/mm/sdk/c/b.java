package com.tencent.mm.sdk.c;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import junit.framework.Assert;

public final class b
  implements f
{
  private final HashMap iDe = new HashMap();

  public final boolean AH(String paramString)
  {
    z.v("!32@/B4Tb64lLpJwGyDFQ0FSxSvydslKDcGg", "hasListener %s", new Object[] { paramString });
    Assert.assertNotNull("EventPoolImpl.hasListener", paramString);
    LinkedList localLinkedList = (LinkedList)this.iDe.get(paramString);
    return (localLinkedList != null) && (localLinkedList.size() > 0);
  }

  public final void a(e parame, Looper paramLooper)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = parame.getId();
    z.v("!32@/B4Tb64lLpJwGyDFQ0FSxSvydslKDcGg", "publish %s", arrayOfObject);
    Assert.assertNotNull("EventPoolImpl.asyncPublish event", parame);
    Assert.assertNotNull("EventPoolImpl.asyncPublish looper", paramLooper);
    new cm(paramLooper).post(new c(this, parame));
  }

  public final boolean a(String paramString, g paramg)
  {
    try
    {
      z.v("!32@/B4Tb64lLpJwGyDFQ0FSxSvydslKDcGg", "addListener %s", new Object[] { paramString });
      Assert.assertNotNull("EventPoolImpl.add", paramg);
      LinkedList localLinkedList = (LinkedList)this.iDe.get(paramString);
      if (localLinkedList == null)
      {
        HashMap localHashMap = this.iDe;
        localLinkedList = new LinkedList();
        localHashMap.put(paramString, localLinkedList);
      }
      boolean bool = localLinkedList.add(paramg);
      return bool;
    }
    finally
    {
    }
  }

  public final boolean b(String paramString, g paramg)
  {
    try
    {
      z.v("!32@/B4Tb64lLpJwGyDFQ0FSxSvydslKDcGg", "removeListener %s", new Object[] { paramString });
      Assert.assertNotNull("EventPoolImpl.remove", paramg);
      LinkedList localLinkedList = (LinkedList)this.iDe.get(paramString);
      if (localLinkedList == null);
      boolean bool1;
      for (boolean bool2 = false; ; bool2 = bool1)
      {
        return bool2;
        bool1 = localLinkedList.remove(paramg);
      }
    }
    finally
    {
    }
  }

  public final boolean c(String paramString, g paramg)
  {
    Assert.assertNotNull("EventPoolImpl.containListener[arg0:eventId]", paramString);
    Assert.assertNotNull("EventPoolImpl.containListener[arg1:listener]", paramg);
    LinkedList localLinkedList = (LinkedList)this.iDe.get(paramString);
    return (localLinkedList != null) && (!localLinkedList.isEmpty()) && (localLinkedList.contains(paramg));
  }

  public final boolean g(e parame)
  {
    int i = 0;
    while (true)
    {
      try
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = parame.getId();
        z.v("!32@/B4Tb64lLpJwGyDFQ0FSxSvydslKDcGg", "publish %s", arrayOfObject1);
        Assert.assertNotNull("EventPoolImpl.publish", parame);
        String str = parame.getId();
        LinkedList localLinkedList = (LinkedList)this.iDe.get(str);
        boolean bool;
        if (localLinkedList == null)
        {
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = str;
          arrayOfObject2[1] = ch.aHN();
          z.w("!32@/B4Tb64lLpJwGyDFQ0FSxSvydslKDcGg", "No listener for this event %s, Stack: %s.", arrayOfObject2);
          bool = false;
          return bool;
        }
        if (parame.aGC())
          Collections.sort(localLinkedList, new d(this));
        g[] arrayOfg = new g[localLinkedList.size()];
        localLinkedList.toArray(arrayOfg);
        int j = arrayOfg.length;
        if ((i >= j) || ((arrayOfg[i].a(parame)) && (parame.aGC())))
        {
          if (parame.idI != null)
            parame.idI.run();
          bool = true;
          continue;
        }
      }
      finally
      {
      }
      i++;
    }
  }

  public final boolean h(e parame)
  {
    return AH(parame.getId());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.c.b
 * JD-Core Version:    0.6.2
 */