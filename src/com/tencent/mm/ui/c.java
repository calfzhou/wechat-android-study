package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.ch;

public final class c
{
  private TextView eyZ;
  private View iHR;
  private ImageView iHS;
  private TextView iHT;
  private ImageView iHU;
  private ImageView iHV;
  private ImageView iHW;

  public c(View paramView)
  {
    this.eyZ = ((TextView)paramView.findViewById(i.aSY));
    this.iHT = ((TextView)paramView.findViewById(i.aSe));
    this.iHU = ((ImageView)paramView.findViewById(i.aFl));
    this.iHV = ((ImageView)paramView.findViewById(i.aHJ));
    this.iHW = ((ImageView)paramView.findViewById(i.aII));
    this.iHR = paramView.findViewById(i.aYz);
    this.iHS = ((ImageView)paramView.findViewById(i.aYI));
  }

  public final void eo(boolean paramBoolean)
  {
    ImageView localImageView = this.iHU;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      return;
    }
  }

  public final void ep(boolean paramBoolean)
  {
    ImageView localImageView = this.iHV;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      return;
    }
  }

  public final void eq(boolean paramBoolean)
  {
    ImageView localImageView = this.iHW;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      return;
    }
  }

  public final void l(View.OnClickListener paramOnClickListener)
  {
    this.iHR.setOnClickListener(paramOnClickListener);
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    this.eyZ.setText(paramCharSequence);
  }

  public final void u(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (ch.jb(paramCharSequence.toString())))
    {
      this.iHT.setVisibility(8);
      return;
    }
    this.iHT.setVisibility(0);
    this.iHT.setText(paramCharSequence);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.c
 * JD-Core Version:    0.6.2
 */