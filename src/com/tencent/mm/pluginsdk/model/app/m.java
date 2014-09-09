package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.os.Looper;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class m
  implements au, com.tencent.mm.o.m, x
{
  private List huH = null;
  private List huI = null;
  private Map huJ = null;
  private ay huK = new ay(Looper.getMainLooper(), new n(this), false);
  private List huM = new ArrayList();
  private List huN = new ArrayList();
  private volatile boolean huO = false;

  public m()
  {
    this.huK.cP(600000L);
    bg.qX().a(231, this);
    bf.Uq().a(7, this);
  }

  private void ayG()
  {
    int i = 20;
    if (this.huO)
    {
      z.d("!32@/B4Tb64lLpIuLnUbSWxToYcRvBbje375", " batch get appinfo doing now");
      return;
    }
    if ((this.huM == null) || (this.huM.isEmpty()))
    {
      z.d("!32@/B4Tb64lLpIuLnUbSWxToYcRvBbje375", "batchwaitinglist is empty, no need to doscene");
      return;
    }
    int j = this.huM.size();
    if (j > i);
    while (true)
    {
      this.huN.addAll(this.huM.subList(0, i));
      if ((this.huN == null) || (this.huN.isEmpty()))
        break;
      this.huO = true;
      ad localad = new ad(7, new al(this.huN));
      bg.qX().d(localad);
      return;
      i = j;
    }
  }

  private void kb(String paramString)
  {
    try
    {
      if ((!ch.jb(paramString)) && (!this.huM.contains(paramString)))
      {
        z.i("!32@/B4Tb64lLpIuLnUbSWxToYcRvBbje375", "add appid:[%s]", new Object[] { paramString });
        this.huM.add(paramString);
      }
      while (true)
      {
        return;
        z.i("!32@/B4Tb64lLpIuLnUbSWxToYcRvBbje375", "should not add this appid:[%s], it is already runing", new Object[] { paramString });
      }
    }
    finally
    {
    }
  }

  public final void S(LinkedList paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToYcRvBbje375", "batch push appinfo err: null or nil applist");
      return;
    }
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
      kb((String)localIterator.next());
    ayG();
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    int i = paramx.getType();
    switch (i)
    {
    default:
      z.e("!32@/B4Tb64lLpIuLnUbSWxToYcRvBbje375", "error type: " + i);
    case 231:
      do
      {
        return;
        String str1 = ((ak)paramx).getAppId();
        if (this.huH.contains(str1))
          this.huH.remove(str1);
      }
      while (this.huI.size() <= 0);
      String str2 = (String)this.huI.remove(0);
      int j;
      if ((str2 == null) || (str2.length() == 0))
      {
        z.e("!32@/B4Tb64lLpIuLnUbSWxToYcRvBbje375", "startDownload fail, appId is null");
        j = 0;
      }
      while (j != 0)
      {
        this.huH.add(str2);
        return;
        int k;
        if (str2 == null)
        {
          z.e("!32@/B4Tb64lLpIuLnUbSWxToYcRvBbje375", "increaseCounter fail, appId is null");
          k = 0;
        }
        while (true)
        {
          if (k != 0)
            break label269;
          z.e("!32@/B4Tb64lLpIuLnUbSWxToYcRvBbje375", "increaseCounter fail");
          j = 0;
          break;
          Integer localInteger = Integer.valueOf(ch.a((Integer)this.huJ.get(str2), 0));
          if (localInteger.intValue() >= 5)
          {
            z.e("!32@/B4Tb64lLpIuLnUbSWxToYcRvBbje375", "increaseCounter fail, has reached the max try count");
            k = 0;
          }
          else
          {
            this.huJ.put(str2, Integer.valueOf(1 + localInteger.intValue()));
            k = 1;
          }
        }
        label269: ak localak = new ak(str2);
        bg.qX().d(localak);
        j = 1;
      }
    case 451:
    }
    if ((this.huN != null) && (!this.huN.isEmpty()))
    {
      this.huM.removeAll(this.huN);
      this.huN.clear();
    }
    this.huO = false;
    ayG();
  }

  public final void a(int paramInt1, int paramInt2, String paramString, ac paramac)
  {
    if (paramac.getType() != 7)
    {
      z.d("!32@/B4Tb64lLpIuLnUbSWxToYcRvBbje375", "not the getappinfolist scene, ignore");
      return;
    }
    if ((this.huN != null) && (!this.huN.isEmpty()))
    {
      this.huM.removeAll(this.huN);
      this.huN.clear();
    }
    this.huO = false;
    ayG();
  }

  public final String c(Context paramContext, String paramString)
  {
    return l.c(paramContext, paramString);
  }

  public final void uX(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToYcRvBbje375", "push fail, appId is null");
      return;
    }
    kb(paramString);
    ayG();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.m
 * JD-Core Version:    0.6.2
 */