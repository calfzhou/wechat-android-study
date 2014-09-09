package com.tencent.mm.ui.b;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.i;
import com.tencent.mm.n.c;
import com.tencent.mm.pluginsdk.ui.a.b;

public final class j extends b
{
  private String iWF = null;
  private String iWG = null;

  public j(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    this.iWF = paramString1;
    this.iWG = paramString2;
    if (this.view != null)
    {
      ImageView localImageView = (ImageView)this.view.findViewById(i.alg);
      this.view.setOnClickListener(new k(this));
      localImageView.setImageBitmap(c.a(this.iWF, true, -1));
    }
  }

  public final int getLayoutId()
  {
    return com.tencent.mm.k.bdg;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.j
 * JD-Core Version:    0.6.2
 */