package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.i;

final class s extends ck
{
  protected TextView eTF;
  protected TextView eTU;
  protected ProgressBar fIh;
  protected TextView jlV;
  protected ImageView jmh;

  public s(int paramInt)
  {
    super(paramInt);
  }

  public final s aw(View paramView)
  {
    super.ay(paramView);
    this.eTU = ((TextView)paramView.findViewById(i.alp));
    this.fIh = ((ProgressBar)paramView.findViewById(i.aUi));
    this.jmh = ((ImageView)paramView.findViewById(i.amf));
    this.eTF = ((TextView)paramView.findViewById(i.akW));
    this.jlV = ((TextView)paramView.findViewById(i.akP));
    this.joA = ((TextView)paramView.findViewById(i.amp));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s
 * JD-Core Version:    0.6.2
 */