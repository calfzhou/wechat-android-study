package com.tencent.mm.ui.b;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.a.c;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;

public final class l extends com.tencent.mm.pluginsdk.ui.a.b
{
  private String iWF = null;
  private String iWG = null;
  private boolean iWI = false;

  public l(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext);
    this.iWF = paramString1;
    this.iWG = paramString2;
    this.iWI = paramBoolean;
    TextView localTextView;
    String str2;
    if (this.view != null)
    {
      localTextView = (TextView)this.view.findViewById(i.alY);
      String str1 = bg.qW().py().C(this.iWF, "wording");
      str2 = bg.qW().py().C(this.iWG, "wording");
      if (ch.jb(str1))
        break label156;
      localTextView.setText(str1);
    }
    while (true)
    {
      ((TextView)this.view.findViewById(i.alX)).setOnClickListener(new m(this));
      ((ImageView)this.view.findViewById(i.alW)).setOnClickListener(new n(this));
      return;
      label156: if (!ch.jb(str2))
        localTextView.setText(str2);
    }
  }

  public final int getLayoutId()
  {
    return k.bdh;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.l
 * JD-Core Version:    0.6.2
 */