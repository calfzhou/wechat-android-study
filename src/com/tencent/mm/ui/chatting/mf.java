package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;

final class mf extends ck
{
  protected TextView eTE;
  protected TextView juA;
  protected Button juB;
  protected Button juC;
  protected ImageView juD;
  protected TextView juz;

  public mf(int paramInt)
  {
    super(paramInt);
  }

  public final mf aA(View paramView)
  {
    super.ay(paramView);
    this.eTE = ((TextView)paramView.findViewById(i.akR));
    this.juz = ((TextView)paramView.findViewById(i.akQ));
    this.juA = ((TextView)paramView.findViewById(i.akZ));
    this.juB = ((Button)paramView.findViewById(i.alG));
    this.juC = ((Button)paramView.findViewById(i.alF));
    this.juD = ((ImageView)paramView.findViewById(i.amk));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.mf
 * JD-Core Version:    0.6.2
 */