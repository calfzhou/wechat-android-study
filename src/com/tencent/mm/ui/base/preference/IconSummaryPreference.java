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
import com.tencent.mm.sdk.platformtools.e;

public class IconSummaryPreference extends Preference
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
  private int jgM = 8;
  private TextView jgN = null;
  private int jgO = -1;

  public IconSummaryPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public IconSummaryPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public IconSummaryPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(k.biA);
  }

  public final void aTF()
  {
    this.eCl = 0;
  }

  public final void aTH()
  {
    this.jgM = 0;
    if (this.jgN != null)
      this.jgN.setVisibility(this.jgM);
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
      localImageView.setVisibility(8);
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
      if (this.eCr == null)
        this.eCr = ((ImageView)paramView.findViewById(i.ayj));
      if (this.eCs == null)
        this.eCs = ((ViewGroup)paramView.findViewById(i.aMn));
      if (this.eCt == null)
        this.eCt = paramView.findViewById(i.aMm);
      this.eCt.setVisibility(this.eCq);
      if (this.eCm == null)
        break label429;
      this.eCr.setImageBitmap(this.eCm);
    }
    while (true)
    {
      this.eCr.setVisibility(this.eCo);
      this.eCs.setVisibility(this.eCp);
      if (this.eCu != null)
        this.eCr.setLayoutParams(this.eCu);
      this.jgN = ((TextView)paramView.findViewById(i.aMq));
      if ((this.jgN != null) && (getSummary() != null) && (getSummary().length() > 0))
      {
        this.jgN.setText(getSummary());
        this.jgN.setVisibility(this.jgM);
      }
      if ((this.jgN != null) && (this.jgO != -1))
      {
        this.jgN.setCompoundDrawablesWithIntrinsicBounds(this.jgO, 0, 0, 0);
        int i = e.a(getContext(), 2.0F);
        this.jgN.setCompoundDrawablePadding(i);
        this.jgN.setVisibility(this.jgM);
      }
      return;
      if (getIcon() != null)
      {
        localImageView.setImageDrawable(getIcon());
        localImageView.setVisibility(0);
        break;
      }
      if (lJ() == 0)
        break;
      localImageView.setImageResource(lJ());
      localImageView.setVisibility(0);
      break;
      label429: if (this.eCn != -1)
        this.eCr.setImageResource(this.eCn);
    }
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), k.biU, localViewGroup);
    return localView;
  }

  public final void setSummary(int paramInt)
  {
    super.setSummary(paramInt);
    if ((this.jgN != null) && (getSummary() != null) && (getSummary().length() > 0))
      this.jgN.setText(getSummary());
  }

  public final void setSummary(CharSequence paramCharSequence)
  {
    super.setSummary(paramCharSequence);
    if ((this.jgN != null) && (getSummary() != null) && (getSummary().length() > 0))
      this.jgN.setText(getSummary());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.IconSummaryPreference
 * JD-Core Version:    0.6.2
 */