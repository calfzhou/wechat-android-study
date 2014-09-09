package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.p;

public final class PluginTextPreference extends Preference
{
  private TextView euQ = null;
  private ImageView gHX = null;
  private int jhB;
  private String text;
  private int textColor;
  private int visibility;

  public PluginTextPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public PluginTextPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PluginTextPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.bjb);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cyf);
    this.jhB = localTypedArray.getResourceId(p.cyg, 0);
    this.text = localTypedArray.getString(p.cyh);
    this.textColor = localTypedArray.getColor(p.cyi, -7039852);
    localTypedArray.recycle();
  }

  public final void aTR()
  {
    this.visibility = 8;
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.gHX = ((ImageView)paramView.findViewById(i.ayb));
    this.gHX.setImageResource(this.jhB);
    this.gHX.setVisibility(this.visibility);
    this.euQ = ((TextView)paramView.findViewById(i.aSF));
    this.euQ.setText(this.text);
    this.euQ.setTextColor(this.textColor);
  }

  public final void pY(int paramInt)
  {
    this.text = getContext().getString(paramInt);
  }

  public final void setImageResource(int paramInt)
  {
    this.jhB = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.PluginTextPreference
 * JD-Core Version:    0.6.2
 */