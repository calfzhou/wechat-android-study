package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;

public class PreferenceInfoCategory extends Preference
{
  public int iMv = 0;
  private View.OnClickListener jhU = null;
  private View.OnClickListener jhV = null;

  public PreferenceInfoCategory(Context paramContext)
  {
    super(paramContext);
  }

  public PreferenceInfoCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PreferenceInfoCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.cBx);
  }

  public final void m(View.OnClickListener paramOnClickListener)
  {
    this.jhU = paramOnClickListener;
  }

  public final void n(View.OnClickListener paramOnClickListener)
  {
    this.jhV = paramOnClickListener;
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(16908310);
    if (localTextView == null)
      return;
    if ((getTitle() == null) || (getTitle().length() <= 0))
      localTextView.setVisibility(8);
    ImageView localImageView;
    while (true)
    {
      localImageView = (ImageView)paramView.findViewById(i.aYg);
      localImageView.setOnClickListener(this.jhU);
      if (this.iMv <= 0)
        break;
      localImageView.setImageResource(this.iMv);
      localImageView.setVisibility(0);
      return;
      localTextView.setVisibility(0);
      localTextView.setText(getTitle());
      localTextView.setOnClickListener(this.jhV);
    }
    localImageView.setVisibility(8);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.PreferenceInfoCategory
 * JD-Core Version:    0.6.2
 */