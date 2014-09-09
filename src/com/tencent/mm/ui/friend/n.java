package com.tencent.mm.ui.friend;

import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.dj;
import java.util.Iterator;
import java.util.Set;

final class n
  implements dj
{
  n(m paramm)
  {
  }

  public final void a(MMSlideDelView paramMMSlideDelView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      gHS.add(paramMMSlideDelView);
      return;
    }
    gHS.remove(paramMMSlideDelView);
  }

  public final boolean aoL()
  {
    return gHS.size() > 0;
  }

  public final void aoM()
  {
    Iterator localIterator = gHS.iterator();
    while (localIterator.hasNext())
    {
      MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
      if (localMMSlideDelView != null)
        localMMSlideDelView.aSA();
    }
    gHS.clear();
  }

  public final void aoN()
  {
    Iterator localIterator = gHS.iterator();
    while (localIterator.hasNext())
    {
      MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
      if (localMMSlideDelView != null)
        localMMSlideDelView.aSz();
    }
    gHS.clear();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.n
 * JD-Core Version:    0.6.2
 */