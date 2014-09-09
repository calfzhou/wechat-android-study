package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.preference.Preference;

public class ContactListCustomPreference extends Preference
{
  private int background = -1;
  private View.OnClickListener eRs;
  private final View.OnTouchListener hBM = new ai(this);
  private View hov;

  public ContactListCustomPreference(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(k.biI);
  }

  public ContactListCustomPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setLayoutResource(k.biI);
  }

  public ContactListCustomPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biI);
  }

  public final void mE(int paramInt)
  {
    this.background = paramInt;
  }

  public final void onBindView(View paramView)
  {
    ViewGroup localViewGroup = (ViewGroup)paramView;
    if ((this.hov != null) && (this.hov != null))
    {
      localViewGroup.removeAllViews();
      if (this.hov.getParent() != null)
        ((ViewGroup)this.hov.getParent()).removeAllViews();
      localViewGroup.addView(this.hov);
      if (this.eRs == null)
        break label85;
      localViewGroup.setOnClickListener(this.eRs);
    }
    while (true)
    {
      if (this.background >= 0)
        paramView.setBackgroundResource(this.background);
      return;
      label85: localViewGroup.setOnTouchListener(this.hBM);
    }
  }

  public final void setCustomView(View paramView)
  {
    if (paramView == null)
      return;
    this.hov = paramView;
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.eRs = paramOnClickListener;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.ContactListCustomPreference
 * JD-Core Version:    0.6.2
 */