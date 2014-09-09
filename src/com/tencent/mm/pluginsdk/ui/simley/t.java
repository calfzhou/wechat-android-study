package com.tencent.mm.pluginsdk.ui.simley;

import android.content.Context;
import com.tencent.mm.pluginsdk.ui.SmileyGrid;

public final class t extends g
{
  public t(String paramString, int paramInt, i parami, n paramn, boolean paramBoolean)
  {
    super(paramString, paramInt, parami, paramn, paramBoolean);
  }

  public final Object getItem(int paramInt)
  {
    if (this.hID != null)
    {
      Context localContext = this.hID.aEv();
      u localu = new u();
      localu.setIndex(paramInt);
      localu.a(this);
      localu.setContext(localContext);
      if (localu.aEO())
        return localu.aEN();
      return new SmileyGrid(localContext);
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.simley.t
 * JD-Core Version:    0.6.2
 */