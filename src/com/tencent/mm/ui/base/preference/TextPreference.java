package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.k;

public class TextPreference extends Preference
{
  private Context context;
  private int ei;
  private String ffE;
  private TextView qd;

  public TextPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    setLayoutResource(k.bjr);
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.qd = ((TextView)paramView.findViewById(16908310));
    if (this.qd != null)
    {
      this.qd.setText(this.ffE);
      this.qd.setGravity(this.ei);
    }
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    return super.onCreateView(paramViewGroup);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.TextPreference
 * JD-Core Version:    0.6.2
 */