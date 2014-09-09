package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public final class t
  implements x
{
  private List huH = new ArrayList();
  private Vector huS = new Vector();
  private volatile boolean huT = false;

  public t()
  {
    bf.Uq().a(1, this);
  }

  private void TY()
  {
    int i = 20;
    if (this.huT)
    {
      z.d("!44@/B4Tb64lLpJgljyYwF0Mkoh8FkmSsNRo7tGM1IN9cR0=", "tryDoScene fail, doing Scene");
      return;
    }
    if (this.huS.size() <= 0)
    {
      z.d("!44@/B4Tb64lLpJgljyYwF0Mkoh8FkmSsNRo7tGM1IN9cR0=", "tryDoScene fail, appIdList is empty");
      return;
    }
    z.d("!44@/B4Tb64lLpJgljyYwF0Mkoh8FkmSsNRo7tGM1IN9cR0=", "tryDoScene, appid list size = " + this.huS.size());
    int j = this.huS.size();
    if (j > i);
    while (true)
    {
      this.huT = true;
      this.huH.addAll(this.huS.subList(0, i));
      ad localad = new ad(1, new am(this.huH));
      bg.qX().d(localad);
      return;
      i = j;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, ac paramac)
  {
    if (paramac.getType() != 1)
      return;
    this.huT = false;
    List localList = ((am)paramac).ayP();
    z.d("!44@/B4Tb64lLpJgljyYwF0Mkoh8FkmSsNRo7tGM1IN9cR0=", "onSceneEnd, list size = " + localList.size());
    this.huS.removeAll(this.huH);
    this.huH.clear();
    TY();
  }

  public final void aT(List paramList)
  {
    if ((paramList == null) || (paramList.size() == 0))
    {
      z.e("!44@/B4Tb64lLpJgljyYwF0Mkoh8FkmSsNRo7tGM1IN9cR0=", "addAll list is null");
      return;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((!ch.jb(str)) && (!this.huS.contains(str)))
        this.huS.add(str);
    }
    TY();
  }

  public final void stop()
  {
    z.d("!44@/B4Tb64lLpJgljyYwF0Mkoh8FkmSsNRo7tGM1IN9cR0=", "stop service");
    this.huS.clear();
    bf.Uq().b(1, this);
  }

  public final void vd(String paramString)
  {
    z.d("!44@/B4Tb64lLpJgljyYwF0Mkoh8FkmSsNRo7tGM1IN9cR0=", "appId = " + paramString);
    if (ch.jb(paramString))
    {
      z.e("!44@/B4Tb64lLpJgljyYwF0Mkoh8FkmSsNRo7tGM1IN9cR0=", "add appId is null");
      return;
    }
    if (!this.huS.contains(paramString))
      this.huS.add(paramString);
    TY();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.t
 * JD-Core Version:    0.6.2
 */