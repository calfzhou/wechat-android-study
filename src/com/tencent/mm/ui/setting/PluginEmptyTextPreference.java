package com.tencent.mm.ui.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.preference.Preference;

public final class PluginEmptyTextPreference extends Preference
{
  private Context context;
  private TextView euQ = null;
  private String text;

  public PluginEmptyTextPreference(Context paramContext, int paramInt)
  {
    this(paramContext, null, 0);
    this.text = paramContext.getString(paramInt);
  }

  public PluginEmptyTextPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(k.bkt);
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.euQ = ((TextView)paramView.findViewById(i.arH));
    this.euQ.setText(this.text);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    View.inflate(this.context, k.bkt, null);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.PluginEmptyTextPreference
 * JD-Core Version:    0.6.2
 */