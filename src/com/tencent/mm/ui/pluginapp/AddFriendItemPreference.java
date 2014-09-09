package com.tencent.mm.ui.pluginapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.preference.Preference;

public class AddFriendItemPreference extends Preference
{
  private Context context;
  private Drawable drawable;
  private String eCj = "";
  private int eCk = -1;
  private int eCl = 8;
  private int height = -1;

  public AddFriendItemPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public AddFriendItemPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AddFriendItemPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(k.biA);
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
      if (this.drawable == null)
        break label133;
      localImageView.setImageDrawable(this.drawable);
      localImageView.setVisibility(0);
    }
    while (true)
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
      return;
      label133: if (getIcon() != null)
      {
        localImageView.setImageDrawable(getIcon());
        localImageView.setVisibility(0);
      }
      else if (lJ() != 0)
      {
        localImageView.setImageResource(lJ());
        localImageView.setVisibility(0);
      }
    }
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), k.biK, localViewGroup);
    localViewGroup.setPadding(0, localViewGroup.getPaddingTop(), localViewGroup.getPaddingRight(), localViewGroup.getPaddingBottom());
    return localView;
  }

  public final void pT(int paramInt)
  {
    this.eCl = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.AddFriendItemPreference
 * JD-Core Version:    0.6.2
 */