package com.tencent.mm.ui.b;

import android.content.Context;
import android.view.View;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.player.ScrollAlwaysTextView;

public final class ae extends b
{
  private ScrollAlwaysTextView iWQ;

  public ae(Context paramContext)
  {
    super(paramContext);
    if (this.view != null)
    {
      this.iWQ = ((ScrollAlwaysTextView)this.view.findViewById(i.aFj));
      this.view.setOnClickListener(new af(this));
    }
  }

  public final void BJ(String paramString)
  {
    if (this.iWQ != null)
      this.iWQ.setText(paramString);
  }

  public final int getLayoutId()
  {
    return k.aFk;
  }

  public final void setVisibility(int paramInt)
  {
    if (this.view != null)
      this.view.findViewById(i.aFk).setVisibility(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.ae
 * JD-Core Version:    0.6.2
 */