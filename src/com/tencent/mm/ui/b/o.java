package com.tencent.mm.ui.b;

import android.content.Context;
import android.view.View;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.pluginsdk.ui.a.b;

public final class o extends b
{
  public o(Context paramContext)
  {
    super(paramContext);
    if (this.view != null)
      this.view.findViewById(i.ask).setOnClickListener(new p(this));
  }

  public final int getLayoutId()
  {
    return k.beL;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.o
 * JD-Core Version:    0.6.2
 */