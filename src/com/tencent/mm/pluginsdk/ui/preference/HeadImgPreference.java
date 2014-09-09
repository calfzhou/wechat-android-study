package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.preference.Preference;

public final class HeadImgPreference extends Preference
{
  private ImageView fpi;
  private View.OnClickListener fqU;
  private Bitmap hHj;
  private int height = -1;

  public HeadImgPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public HeadImgPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public HeadImgPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
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
    if (this.fqU != null)
      this.fpi.setOnClickListener(this.fqU);
    if (this.hHj != null)
    {
      this.fpi.setImageBitmap(this.hHj);
      this.hHj = null;
    }
    LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(i.aEq);
    if (this.height != -1)
      localLinearLayout.setMinimumHeight(this.height);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), k.biR, localViewGroup);
    this.fpi = ((ImageView)localView.findViewById(i.axY));
    return localView;
  }

  public final void p(Bitmap paramBitmap)
  {
    this.hHj = null;
    if (this.fpi != null)
    {
      this.fpi.setImageBitmap(paramBitmap);
      return;
    }
    this.hHj = paramBitmap;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.HeadImgPreference
 * JD-Core Version:    0.6.2
 */