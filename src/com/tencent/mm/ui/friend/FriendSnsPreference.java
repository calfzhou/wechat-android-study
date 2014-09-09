package com.tencent.mm.ui.friend;

import android.content.Context;
import android.content.res.Resources;
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
import com.tencent.mm.g;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.ui.base.preference.Preference;

public final class FriendSnsPreference extends Preference
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
  private String jIG = null;

  public FriendSnsPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public FriendSnsPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FriendSnsPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(k.biA);
  }

  public final void Db(String paramString)
  {
    this.eCm = null;
    this.eCn = -1;
    this.jIG = paramString;
    if (this.eCr != null)
      c.a(this.eCr, paramString);
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
    int i;
    if (localImageView != null)
    {
      localImageView.setImageDrawable(this.drawable);
      if (this.drawable == null)
      {
        i = 8;
        localImageView.setVisibility(i);
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
      this.eCr = ((ImageView)paramView.findViewById(i.ayj));
      this.eCs = ((ViewGroup)paramView.findViewById(i.aMn));
      this.eCt = paramView.findViewById(i.aMm);
      this.eCt.setVisibility(this.eCq);
      if (this.eCm == null)
        break label246;
      this.eCr.setImageBitmap(this.eCm);
    }
    while (true)
    {
      this.eCr.setVisibility(this.eCo);
      this.eCs.setVisibility(this.eCp);
      if (this.eCu != null)
        this.eCr.setLayoutParams(this.eCu);
      return;
      i = 0;
      break;
      label246: if (this.eCn != -1)
        this.eCr.setImageResource(this.eCn);
      else if (this.jIG != null)
        c.a(this.eCr, this.jIG);
    }
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), k.biT, localViewGroup);
    localView.setMinimumHeight(localView.getResources().getDimensionPixelSize(g.PN));
    return localView;
  }

  public final void pT(int paramInt)
  {
    this.eCl = paramInt;
  }

  public final void pV(int paramInt)
  {
    this.eCo = paramInt;
    if (this.eCr != null)
      this.eCr.setVisibility(this.eCo);
  }

  public final void qF(int paramInt)
  {
    this.eCq = paramInt;
    if (this.eCt != null)
      this.eCt.setVisibility(this.eCq);
  }

  public final void setIconDrawable(Drawable paramDrawable)
  {
    this.drawable = paramDrawable;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.FriendSnsPreference
 * JD-Core Version:    0.6.2
 */