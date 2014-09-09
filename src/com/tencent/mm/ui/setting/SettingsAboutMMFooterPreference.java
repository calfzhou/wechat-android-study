package com.tencent.mm.ui.setting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.preference.Preference;

public class SettingsAboutMMFooterPreference extends Preference
{
  public SettingsAboutMMFooterPreference(Context paramContext)
  {
    super(paramContext);
  }

  public SettingsAboutMMFooterPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SettingsAboutMMFooterPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected final void onBindView(View paramView)
  {
    TextView localTextView = (TextView)paramView.findViewById(i.aoU);
    Resources localResources = paramView.getResources();
    int i = n.bsQ;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(2014);
    localTextView.setText(localResources.getString(i, arrayOfObject));
    super.onBindView(paramView);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    localView.findViewById(i.aSB).setOnClickListener(new ai(this, localView));
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsAboutMMFooterPreference
 * JD-Core Version:    0.6.2
 */