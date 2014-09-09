package com.tencent.mm.pluginsdk.model;

import com.tencent.mm.protocal.a.hq;
import com.tencent.mm.protocal.a.hu;
import com.tencent.mm.protocal.a.hv;
import com.tencent.mm.protocal.a.hx;
import com.tencent.mm.protocal.a.hy;
import com.tencent.mm.protocal.a.il;
import com.tencent.mm.protocal.a.io;
import com.tencent.mm.protocal.a.iz;
import com.tencent.mm.protocal.a.jb;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  public static hu a(int paramInt, hy paramhy, iz paramiz)
  {
    if (paramhy == null)
      z.w("!32@/B4Tb64lLpJdilZqE3zQgZEgF2biJ1Xc", "proto item is null");
    hu localhu;
    LinkedList localLinkedList;
    do
    {
      return null;
      localhu = new hu();
      il localil = paramhy.aLG();
      if (localil != null)
      {
        localhu.diG = localil.acg();
        localhu.hZl = localil.aLw();
        localhu.appId = localil.getAppId();
        localhu.hZi = localil.aLB();
      }
      if (paramiz != null)
      {
        if (paramiz.hZG != null)
          localhu.hZm.addAll(paramiz.hZG);
        if (paramiz.hZH != null)
          localhu.hZm.addAll(paramiz.hZH);
      }
      localhu.cMK = paramhy;
      localhu.type = paramInt;
      switch (paramInt)
      {
      case 3:
      case 9:
      case 13:
      default:
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramInt);
        z.w("!32@/B4Tb64lLpJdilZqE3zQgZEgF2biJ1Xc", "unknown type %d", arrayOfObject);
        return localhu;
      case 1:
        localhu.title = "";
        localhu.desc = paramhy.getDesc();
        return localhu;
      case 4:
        if ((paramhy.hZx != null) && (!paramhy.hZx.isEmpty()))
          localhu.title = ((hq)paramhy.hZx.get(0)).getTitle();
        return localhu;
      case 5:
        if (paramhy.aLm() != null)
        {
          localhu.title = paramhy.aLm().getTitle();
          localhu.desc = paramhy.aLm().aLI();
        }
        if ((ch.jb(localhu.title)) && (paramhy.hZx != null) && (!paramhy.hZx.isEmpty()))
          localhu.title = ((hq)paramhy.hZx.get(0)).getTitle();
        if ((ch.jb(localhu.desc)) && (localil != null))
          localhu.desc = localil.aLz();
        return localhu;
      case 6:
        localhu.title = paramhy.aLp();
        if (ch.jb(localhu.title))
          if (paramhy.aLl() != null)
          {
            localhu.title = paramhy.aLl().aLE();
            localhu.desc = paramhy.aLl().getLabel();
          }
        while (true)
        {
          return localhu;
          if (paramhy.aLl() != null)
            localhu.desc = paramhy.aLl().aLE();
        }
      case 2:
        if ((paramhy.hZx != null) && (paramhy.hZx.size() > 0))
          localhu.title = ((hq)paramhy.hZx.get(0)).getTitle();
        return localhu;
      case 7:
        if ((paramhy.hZx != null) && (!paramhy.hZx.isEmpty()))
        {
          localhu.title = ((hq)paramhy.hZx.get(0)).getTitle();
          localhu.desc = ((hq)paramhy.hZx.get(0)).getDesc();
        }
        return localhu;
      case 8:
        localhu.title = paramhy.getTitle();
        if ((ch.jb(localhu.title)) && (paramhy.hZx != null) && (!paramhy.hZx.isEmpty()))
          localhu.title = ((hq)paramhy.hZx.get(0)).getTitle();
        return localhu;
      case 10:
      case 11:
        if (paramhy.aLn() != null)
        {
          localhu.title = paramhy.aLn().getTitle();
          localhu.desc = paramhy.aLn().getDesc();
        }
        return localhu;
      case 12:
      case 15:
        if (paramhy.aLo() != null)
        {
          localhu.title = paramhy.aLo().getTitle();
          localhu.desc = paramhy.aLo().getDesc();
        }
        return localhu;
      case 14:
      }
      localLinkedList = paramhy.hZx;
    }
    while (localLinkedList == null);
    Iterator localIterator = localLinkedList.iterator();
    while (localIterator.hasNext())
    {
      hq localhq = (hq)localIterator.next();
      if (1 == localhq.getDataType())
        localhu.title = localhq.getDesc();
    }
    return localhu;
  }

  public static String be(String paramString1, String paramString2)
  {
    if (ch.jb(paramString1))
      return paramString2;
    if (ch.jb(paramString2))
      return paramString1;
    return paramString1 + '​' + paramString2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.b
 * JD-Core Version:    0.6.2
 */