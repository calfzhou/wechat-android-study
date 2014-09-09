package com.tencent.mm.ui.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.ui.base.preference.Preference;

public final class HeadImgNewPreference extends Preference
{
  private ImageView fpi;
  private View.OnClickListener fqU;
  private int height = -1;
  private View hzI;
  private TextView jLs;
  private String jLt;
  private boolean jLu = false;
  private boolean jLv = false;

  public HeadImgNewPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public HeadImgNewPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public HeadImgNewPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
  }

  public final void Df(String paramString)
  {
    this.jLt = null;
    if (this.fpi != null)
      c.a(this.fpi, paramString);
    while (paramString == null)
    {
      this.jLu = false;
      return;
      this.jLt = paramString;
    }
    this.jLu = true;
  }

  public final void i(View.OnClickListener paramOnClickListener)
  {
    this.fqU = paramOnClickListener;
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    if (this.fpi == null)
      this.fpi = ((ImageView)paramView.findViewById(i.axY));
    if (this.jLs == null)
      this.jLs = ((TextView)paramView.findViewById(i.aGq));
    if (this.hzI == null)
      this.hzI = paramView.findViewById(i.aDg);
    if (this.fqU != null)
      this.hzI.setOnClickListener(this.fqU);
    if (this.jLt != null)
    {
      c.a(this.fpi, this.jLt);
      this.jLt = null;
    }
    if (!this.jLu)
    {
      this.hzI.setVisibility(8);
      this.jLs.setVisibility(0);
    }
    while (true)
    {
      RelativeLayout localRelativeLayout = (RelativeLayout)paramView.findViewById(i.aEq);
      if (this.height != -1)
        localRelativeLayout.setMinimumHeight(this.height);
      return;
      this.jLs.setVisibility(8);
      this.hzI.setVisibility(0);
    }
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    if (this.jLv)
      View.inflate(getContext(), k.bjU, localViewGroup);
    while (true)
    {
      this.fpi = ((ImageView)localView.findViewById(i.axY));
      this.jLs = ((TextView)localView.findViewById(i.aGq));
      this.hzI = localView.findViewById(i.aDg);
      return localView;
      View.inflate(getContext(), k.biS, localViewGroup);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.HeadImgNewPreference
 * JD-Core Version:    0.6.2
 */