package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.ui.tools.gx;

public class SwitchKeyValuePreference extends Preference
{
  private boolean ebT = true;
  private TextView fWR;

  public SwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
  }

  private void Mg()
  {
    if (this.fWR == null)
      return;
    if (this.ebT)
    {
      this.fWR.setTextColor(gx.cE(getContext()));
      return;
    }
    this.fWR.setTextColor(gx.cF(getContext()));
  }

  public final void fc(boolean paramBoolean)
  {
    this.ebT = paramBoolean;
    Mg();
  }

  public final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.fWR = ((TextView)paramView.findViewById(16908304));
    Mg();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.SwitchKeyValuePreference
 * JD-Core Version:    0.6.2
 */