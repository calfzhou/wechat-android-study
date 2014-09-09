package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.g;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ch;

public class IconMsgPreference extends Preference
{
  private Context context;
  private Drawable drawable;
  private String eCj = "";
  private int eCk = -1;
  private int eCl = 8;
  private int eCp = 0;
  private int eCq = 8;
  private ViewGroup eCs = null;
  private int height = -1;
  private int jgI = 8;
  private ImageView jgJ = null;
  private TextView jgK;
  private String jgL = "";

  public IconMsgPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public IconMsgPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(k.biA);
  }

  public final void BX(String paramString)
  {
    this.eCj = paramString;
    this.eCk = -1;
  }

  public final void BY(String paramString)
  {
    this.jgL = paramString;
  }

  public final void aTF()
  {
    this.eCl = 8;
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    ImageView localImageView = (ImageView)paramView.findViewById(i.ayb);
    if (localImageView != null)
    {
      if (this.drawable == null)
        break label219;
      localImageView.setImageDrawable(this.drawable);
      localImageView.setVisibility(0);
    }
    TextView localTextView2;
    while (true)
    {
      LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(i.aEq);
      if (this.height != -1)
        localLinearLayout.setMinimumHeight(this.height);
      TextView localTextView1 = (TextView)paramView.findViewById(i.aSG);
      if (localTextView1 != null)
      {
        localTextView1.setVisibility(this.eCl);
        localTextView1.setText(this.eCj);
        if (this.eCk != -1)
          localTextView1.setBackgroundDrawable(a.n(this.context, this.eCk));
      }
      this.jgJ = ((ImageView)paramView.findViewById(i.aSE));
      this.jgJ.setVisibility(this.jgI);
      this.eCs = ((ViewGroup)paramView.findViewById(i.aMn));
      this.eCs.setVisibility(this.eCp);
      this.jgK = ((TextView)paramView.findViewById(16908310));
      localTextView2 = (TextView)paramView.findViewById(i.cAv);
      if (!ch.jb(this.jgL))
        break;
      localTextView2.setVisibility(8);
      return;
      label219: if (lJ() != 0)
      {
        localImageView.setImageResource(lJ());
        localImageView.setVisibility(0);
      }
      else
      {
        localImageView.setVisibility(8);
      }
    }
    localTextView2.setVisibility(0);
    localTextView2.setText(this.jgL);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), k.cBw, localViewGroup);
    localView.setMinimumHeight(localView.getResources().getDimensionPixelSize(g.PN));
    return localView;
  }

  public final void pS(int paramInt)
  {
    this.jgI = paramInt;
    if (this.jgJ != null)
      this.jgJ.setVisibility(paramInt);
  }

  public final void setIconDrawable(Drawable paramDrawable)
  {
    this.drawable = paramDrawable;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.IconMsgPreference
 * JD-Core Version:    0.6.2
 */