package com.tencent.mm.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.aq.a;

final class el
  implements LayoutInflater.Factory
{
  el(LayoutInflater paramLayoutInflater)
  {
  }

  public final View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    Object localObject = null;
    if ((!paramString.equals("TextView")) && (!paramString.equals("com.tencent.mm.ui.base.MMTextView")))
      return null;
    try
    {
      boolean bool = paramString.equals("com.tencent.mm.ui.base.MMTextView");
      localObject = null;
      if (bool)
        localObject = this.iNw.createView(paramString, "", paramAttributeSet);
      while (true)
      {
        TextView localTextView = (TextView)localObject;
        localTextView.setTextSize(1, localTextView.getTextSize() * ek.aQq() / a.getDensity(localTextView.getContext()));
        return localObject;
        int i = paramString.indexOf(".");
        localObject = null;
        if (i == -1)
        {
          localObject = this.iNw.createView(paramString, "android.widget.", paramAttributeSet);
        }
        else
        {
          View localView = this.iNw.createView(paramString, null, paramAttributeSet);
          localObject = localView;
        }
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      return localObject;
    }
    catch (InflateException localInflateException)
    {
    }
    return localObject;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.el
 * JD-Core Version:    0.6.2
 */