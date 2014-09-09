package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.i;

final class mr extends ck
{
  ProgressBar fIh;
  ImageView jlS;
  TextView jlV;
  ImageView jms;
  TextView juT;
  ImageView juU;
  View juV;

  public mr(int paramInt)
  {
    super(paramInt);
  }

  public final ck e(View paramView, boolean paramBoolean)
  {
    super.ay(paramView);
    this.eTC = ((TextView)paramView.findViewById(i.amj));
    this.jlS = ((ImageView)paramView.findViewById(i.alq));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    this.juV = paramView.findViewById(i.aUl);
    if (paramBoolean)
    {
      this.joA = ((TextView)paramView.findViewById(i.amp));
      this.fIh = ((ProgressBar)paramView.findViewById(i.aqr));
      this.type = 1;
    }
    while (true)
    {
      this.jlV = ((TextView)paramView.findViewById(i.akP));
      this.juU = ((ImageView)paramView.findViewById(i.als));
      return this;
      this.fIh = ((ProgressBar)paramView.findViewById(i.aUi));
      this.juT = ((TextView)paramView.findViewById(i.aUk));
      this.joA = ((TextView)paramView.findViewById(i.amp));
      this.type = 3;
      this.jms = ((ImageView)paramView.findViewById(i.amh));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.mr
 * JD-Core Version:    0.6.2
 */