package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.i;
import com.tencent.mm.k;

public class IconPreference extends Preference
{
  private Context context;
  private Drawable drawable;
  private String eCj = "";
  private int eCk = -1;
  private int eCl = 8;
  private Bitmap eCm = null;
  private int eCn = -1;
  private int eCo = 8;
  private int eCp = 0;
  private int eCq = 8;
  private ImageView eCr = null;
  private ViewGroup eCs = null;
  private View eCt = null;
  RelativeLayout.LayoutParams eCu;
  private int height = -1;
  private int jgI = 8;
  private ImageView jgJ = null;
  private TextView jgK;

  public IconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public IconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(k.biA);
  }

  public final void aTG()
  {
    this.eCu = new RelativeLayout.LayoutParams(-2, -2);
    this.eCu.addRule(13);
    if (this.eCr == null)
      return;
    this.eCr.setLayoutParams(this.eCu);
  }

  public final void aq(String paramString, int paramInt)
  {
    this.eCj = paramString;
    this.eCk = paramInt;
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    ImageView localImageView = (ImageView)paramView.findViewById(i.ayb);
    if (localImageView != null)
    {
      if (this.drawable != null)
      {
        localImageView.setImageDrawable(this.drawable);
        localImageView.setVisibility(0);
      }
    }
    else
    {
      LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(i.aEq);
      if (this.height != -1)
        localLinearLayout.setMinimumHeight(this.height);
      TextView localTextView = (TextView)paramView.findViewById(i.aSG);
      if (localTextView != null)
      {
        localTextView.setVisibility(this.eCl);
        localTextView.setText(this.eCj);
        if (this.eCk != -1)
          localTextView.setBackgroundDrawable(a.n(this.context, this.eCk));
      }
      this.jgJ = ((ImageView)paramView.findViewById(i.aSE));
      this.jgJ.setVisibility(this.jgI);
      this.eCr = ((ImageView)paramView.findViewById(i.ayj));
      this.eCs = ((ViewGroup)paramView.findViewById(i.aMn));
      this.eCt = paramView.findViewById(i.aMm);
      this.eCt.setVisibility(this.eCq);
      if (this.eCm == null)
        break label305;
      this.eCr.setImageBitmap(this.eCm);
    }
    while (true)
    {
      this.eCr.setVisibility(this.eCo);
      this.eCs.setVisibility(this.eCp);
      if (this.eCu != null)
        this.eCr.setLayoutParams(this.eCu);
      this.jgK = ((TextView)paramView.findViewById(16908310));
      return;
      if (lJ() != 0)
      {
        localImageView.setImageResource(lJ());
        localImageView.setVisibility(0);
        break;
      }
      localImageView.setVisibility(8);
      break;
      label305: if (this.eCn != -1)
        this.eCr.setImageResource(this.eCn);
    }
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), k.biT, localViewGroup);
    return localView;
  }

  public final void pS(int paramInt)
  {
    this.jgI = paramInt;
    if (this.jgJ != null)
      this.jgJ.setVisibility(paramInt);
  }

  public final void pT(int paramInt)
  {
    this.eCl = paramInt;
  }

  public final void pU(int paramInt)
  {
    this.eCn = paramInt;
    this.eCm = null;
    if (this.eCr != null)
      this.eCr.setImageResource(paramInt);
  }

  public final void pV(int paramInt)
  {
    this.eCo = paramInt;
    if (this.eCr != null)
      this.eCr.setVisibility(this.eCo);
  }

  public final void setIconDrawable(Drawable paramDrawable)
  {
    this.drawable = paramDrawable;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.IconPreference
 * JD-Core Version:    0.6.2
 */