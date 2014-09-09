package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.ui.tools.gx;

public class IconSwitchKeyValuePreference extends Preference
{
  private TextView fWR;
  private int status = 0;

  public IconSwitchKeyValuePreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public IconSwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public IconSwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void Mg()
  {
    if (this.fWR == null)
      return;
    int i = e.a(getContext(), 2.0F);
    this.fWR.setTextColor(gx.cF(getContext()));
    if (this.status == 0)
    {
      this.fWR.setCompoundDrawablesWithIntrinsicBounds(h.abp, 0, 0, 0);
      this.fWR.setCompoundDrawablePadding(i);
      return;
    }
    if (this.status == 1)
    {
      this.fWR.setCompoundDrawablesWithIntrinsicBounds(h.abn, 0, 0, 0);
      this.fWR.setCompoundDrawablePadding(i);
      return;
    }
    if (this.status == 2)
    {
      this.fWR.setCompoundDrawablesWithIntrinsicBounds(h.abo, 0, 0, 0);
      this.fWR.setCompoundDrawablePadding(i);
      return;
    }
    this.fWR.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
  }

  public final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.fWR = ((TextView)paramView.findViewById(16908304));
    Mg();
  }

  public final void pW(int paramInt)
  {
    this.status = paramInt;
    Mg();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference
 * JD-Core Version:    0.6.2
 */