package com.tencent.mm.ui.a;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
{
  private final String TAG = "!44@/B4Tb64lLpIdP5qD4tOAzJ8XwC8LkQH47n23jHVKHks=";
  private List iNF = new ArrayList();

  public final c By(String paramString)
  {
    this.iNF.add(paramString);
    return this;
  }

  public final void am(View paramView)
  {
    if ((paramView != null) && (this.iNF.size() > 0))
    {
      Iterator localIterator = this.iNF.iterator();
      String str2;
      for (String str1 = ""; localIterator.hasNext(); str1 = str1 + str2 + ",")
        str2 = (String)localIterator.next();
      paramView.setContentDescription(str1);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.a.c
 * JD-Core Version:    0.6.2
 */