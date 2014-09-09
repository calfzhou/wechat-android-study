package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;

final class p extends ck
{
  protected View eSF;
  protected TextView eTF;
  protected ImageView eWm;
  protected ImageView eWq;
  protected TextView jlU;
  protected TextView jlV;
  protected ImageView jlW;

  public p(int paramInt)
  {
    super(paramInt);
  }

  public final p at(View paramView)
  {
    super.ay(paramView);
    this.eWm = ((ImageView)paramView.findViewById(i.akY));
    this.eTF = ((TextView)paramView.findViewById(i.akW));
    this.jlU = ((TextView)paramView.findViewById(i.akT));
    this.eSF = paramView.findViewById(i.akU);
    this.jlV = ((TextView)paramView.findViewById(i.akP));
    this.joA = ((TextView)paramView.findViewById(i.amp));
    this.jlW = ((ImageView)paramView.findViewById(i.akV));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    this.eWq = ((ImageView)paramView.findViewById(i.als));
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.p
 * JD-Core Version:    0.6.2
 */