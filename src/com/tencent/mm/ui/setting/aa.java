package com.tencent.mm.ui.setting;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.ui.base.preference.Preference;

final class aa extends Preference
{
  private float jLR;

  public aa(SetTextSizeUI paramSetTextSizeUI, Context paramContext, float paramFloat)
  {
    super(paramContext);
    this.jLR = paramFloat;
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(16908310);
    if (localTextView != null)
      localTextView.setTextSize(1, SetTextSizeUI.ae(this.jLR));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.aa
 * JD-Core Version:    0.6.2
 */