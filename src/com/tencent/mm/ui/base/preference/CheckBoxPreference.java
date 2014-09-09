package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class CheckBoxPreference extends Preference
{
  private boolean jgs = false;
  private MMSwitchBtn jgt;

  public CheckBoxPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.bjC);
    setWidgetLayoutResource(k.biE);
  }

  public final boolean isChecked()
  {
    if (this.jgt != null)
      return this.jgt.bcq();
    return this.jgs;
  }

  public final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.jgt = ((MMSwitchBtn)paramView.findViewById(i.checkbox));
    this.jgt.a(new c(this));
    this.jgt.gp(this.jgs);
  }

  public final void setChecked(boolean paramBoolean)
  {
    this.jgs = paramBoolean;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.CheckBoxPreference
 * JD-Core Version:    0.6.2
 */