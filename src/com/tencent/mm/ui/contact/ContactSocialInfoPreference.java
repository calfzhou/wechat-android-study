package com.tencent.mm.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.preference.Preference;

public class ContactSocialInfoPreference extends Preference
{
  private int jzA = 8;
  private int jzB = 8;
  private int jzD = 8;
  private int jzE = 8;
  private ImageView jzu;
  private ImageView jzv;
  private ImageView jzw;
  private ImageView jzx;
  private ImageView jzy;
  private int jzz = 8;

  public ContactSocialInfoPreference(Context paramContext)
  {
    super(paramContext);
  }

  public ContactSocialInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ContactSocialInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
  }

  private void Mg()
  {
    if (this.jzu != null)
      this.jzu.setVisibility(this.jzz);
    if (this.jzv != null)
      this.jzv.setVisibility(this.jzA);
    if (this.jzw != null)
      this.jzw.setVisibility(this.jzB);
    if (this.jzx != null)
      this.jzx.setVisibility(this.jzD);
    if (this.jzy != null)
      this.jzy.setVisibility(this.jzE);
  }

  public final void onBindView(View paramView)
  {
    this.jzu = ((ImageView)paramView.findViewById(i.bXs));
    this.jzv = ((ImageView)paramView.findViewById(i.bXz));
    this.jzw = ((ImageView)paramView.findViewById(i.bXq));
    this.jzx = ((ImageView)paramView.findViewById(i.bUA));
    this.jzy = ((ImageView)paramView.findViewById(i.bVk));
    Mg();
    super.onBindView(paramView);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(k.cBv, localViewGroup);
    return localView;
  }

  public final void qr(int paramInt)
  {
    this.jzz = paramInt;
    Mg();
  }

  public final void qs(int paramInt)
  {
    this.jzA = paramInt;
    Mg();
  }

  public final void qt(int paramInt)
  {
    this.jzB = paramInt;
    Mg();
  }

  public final void qu(int paramInt)
  {
    this.jzE = paramInt;
    Mg();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactSocialInfoPreference
 * JD-Core Version:    0.6.2
 */