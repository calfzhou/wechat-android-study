package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.c;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.d;

public class ScrollingTabContainerView$TabView extends LinearLayout
{
  private View iz;
  private ImageView kF;
  private c qc;
  private TextView qd;
  private ScrollingTabContainerView qe;

  public ScrollingTabContainerView$TabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  final void a(ScrollingTabContainerView paramScrollingTabContainerView, c paramc, boolean paramBoolean)
  {
    this.qe = paramScrollingTabContainerView;
    this.qc = paramc;
    if (paramBoolean)
      setGravity(19);
    update();
  }

  public final void c(c paramc)
  {
    this.qc = paramc;
    update();
  }

  public final c cZ()
  {
    return this.qc;
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.qe != null);
    for (int i = this.qe.pX; ; i = 0)
    {
      if ((i > 0) && (getMeasuredWidth() > i))
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), paramInt2);
      return;
    }
  }

  public final void update()
  {
    c localc = this.qc;
    View localView = localc.getCustomView();
    if (localView != null)
    {
      ViewParent localViewParent = localView.getParent();
      if (localViewParent != this)
      {
        if (localViewParent != null)
          ((ViewGroup)localViewParent).removeView(localView);
        addView(localView);
      }
      this.iz = localView;
      if (this.qd != null)
        this.qd.setVisibility(8);
      if (this.kF != null)
      {
        this.kF.setVisibility(8);
        this.kF.setImageDrawable(null);
      }
    }
    label341: label366: 
    while (true)
    {
      return;
      if (this.iz != null)
      {
        removeView(this.iz);
        this.iz = null;
      }
      Drawable localDrawable = localc.getIcon();
      CharSequence localCharSequence = localc.getText();
      if (localDrawable != null)
      {
        if (this.kF == null)
        {
          ImageView localImageView = new ImageView(getContext());
          LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
          localLayoutParams2.gravity = 16;
          localImageView.setLayoutParams(localLayoutParams2);
          addView(localImageView, 0);
          this.kF = localImageView;
        }
        this.kF.setImageDrawable(localDrawable);
        this.kF.setVisibility(0);
        if (localCharSequence == null)
          break label341;
        if (this.qd == null)
        {
          CompatTextView localCompatTextView = new CompatTextView(getContext(), null, d.actionBarTabTextStyle);
          localCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
          LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
          localLayoutParams1.gravity = 16;
          localCompatTextView.setLayoutParams(localLayoutParams1);
          addView(localCompatTextView);
          this.qd = localCompatTextView;
        }
        this.qd.setText(localCharSequence);
        this.qd.setVisibility(0);
      }
      while (true)
      {
        if (this.kF == null)
          break label366;
        this.kF.setContentDescription(localc.getContentDescription());
        return;
        if (this.kF == null)
          break;
        this.kF.setVisibility(8);
        this.kF.setImageDrawable(null);
        break;
        if (this.qd != null)
        {
          this.qd.setVisibility(8);
          this.qd.setText(null);
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ScrollingTabContainerView.TabView
 * JD-Core Version:    0.6.2
 */