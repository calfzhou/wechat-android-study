package com.tencent.mm.ui.setting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.preference.Preference;

public class SettingsAboutMMHeaderPreference extends Preference
{
  private String jLZ = "";

  public SettingsAboutMMHeaderPreference(Context paramContext)
  {
    super(paramContext);
  }

  public SettingsAboutMMHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SettingsAboutMMHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(i.adY);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramView.getResources().getString(n.age);
    arrayOfObject[1] = this.jLZ;
    localTextView.setText(String.format("%s %s", arrayOfObject));
  }

  public final void setVersion(String paramString)
  {
    this.jLZ = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsAboutMMHeaderPreference
 * JD-Core Version:    0.6.2
 */