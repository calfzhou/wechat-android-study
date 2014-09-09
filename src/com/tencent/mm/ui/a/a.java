package com.tencent.mm.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.tencent.mm.l;
import com.tencent.mm.sdk.platformtools.ch;

public final class a
{
  private Context dkf;
  private AccessibilityManager iND;

  public a(Context paramContext)
  {
    this.dkf = paramContext;
    this.iND = ((AccessibilityManager)this.dkf.getSystemService("accessibility"));
  }

  public static final a aQs()
  {
    return b.aQu();
  }

  public final void a(View paramView, TextView paramTextView1, TextView paramTextView2, String paramString, TextView paramTextView3)
  {
    if (!this.iND.isEnabled());
    while ((this.dkf == null) || (paramView == null) || (paramTextView1 == null) || (ch.jb(paramString)) || (paramTextView2 == null))
      return;
    c localc = new c();
    localc.By(paramTextView1.getText().toString());
    localc.By(paramString);
    if (paramTextView3 != null)
      localc.By(paramTextView3.getText().toString());
    localc.am(paramView);
  }

  public final void a(View paramView, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    if (!this.iND.isEnabled());
    while ((this.dkf == null) || (paramView == null) || (paramString1 == null) || (paramString2 == null) || (paramString3 == null))
      return;
    c localc = new c();
    localc.By(paramString1);
    if (paramInt > 0)
    {
      Resources localResources = this.dkf.getResources();
      int i = l.bqB;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      localc.By(localResources.getQuantityString(i, 1, arrayOfObject));
    }
    localc.By(paramString2).By(paramString3);
    localc.am(paramView);
  }

  public final void a(View paramView, String paramString1, String paramString2, int paramInt)
  {
    if (!this.iND.isEnabled());
    while ((paramView == null) || (ch.jb(paramString1)) || (this.dkf == null))
      return;
    c localc = new c();
    localc.By(paramString1);
    if (!ch.jb(paramString2));
    while (true)
    {
      try
      {
        int m = Integer.parseInt(paramString2);
        i = m;
        if (i > 0)
        {
          if (i > 0)
          {
            Resources localResources2 = this.dkf.getResources();
            int k = l.brf;
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Integer.valueOf(i);
            localc.By(localResources2.getQuantityString(k, 1, arrayOfObject2));
          }
          Resources localResources1 = this.dkf.getResources();
          int j = l.brg;
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = Integer.valueOf(3);
          arrayOfObject1[1] = Integer.valueOf(paramInt + 1);
          localc.By(localResources1.getQuantityString(j, 5, arrayOfObject1));
          localc.am(paramView);
          return;
        }
      }
      catch (Exception localException)
      {
      }
      int i = 0;
    }
  }

  public final boolean aQt()
  {
    return this.iND.isEnabled();
  }

  public final void q(View paramView, int paramInt)
  {
    if (!this.iND.isEnabled());
    while ((this.dkf == null) || (paramView == null))
      return;
    int i = Math.max(paramInt, 1);
    c localc = new c();
    Resources localResources = this.dkf.getResources();
    int j = l.bqA;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    localc.By(localResources.getQuantityString(j, i, arrayOfObject));
    localc.am(paramView);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.a.a
 * JD-Core Version:    0.6.2
 */