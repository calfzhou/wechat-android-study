package com.tencent.mm.ui.setting;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.Preference;

public class SelfVuserPreference extends Preference
{
  private Drawable drawable;
  private String jLM;
  private String text;

  public SelfVuserPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public SelfVuserPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SelfVuserPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    ImageView localImageView = (ImageView)paramView.findViewById(i.ayb);
    if (localImageView != null)
    {
      localImageView.setImageDrawable(this.drawable);
      z.d("!44@/B4Tb64lLpJGJHAy9etYMyhLCnembrEZDoO5vMKMeSQ=", "onBindView set icon=" + this.drawable);
      if (!ch.jb(this.jLM))
        localImageView.setContentDescription(this.jLM);
    }
    TextView localTextView = (TextView)paramView.findViewById(i.aSF);
    if (localTextView != null)
    {
      localTextView.setVisibility(0);
      localTextView.setText(this.text);
    }
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), k.bjz, localViewGroup);
    return localView;
  }

  public final void setIconDrawable(Drawable paramDrawable)
  {
    this.drawable = paramDrawable;
  }

  public final void setText(String paramString)
  {
    this.text = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SelfVuserPreference
 * JD-Core Version:    0.6.2
 */