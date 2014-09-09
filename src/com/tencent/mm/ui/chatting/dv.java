package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.i;

final class dv extends ck
{
  protected TextView jpg;
  protected TextView jph;
  protected TextView jpi;
  protected TextView jpj;
  protected TextView jpk;
  protected TextView jpl;

  public dv(du paramdu, int paramInt)
  {
    super(paramInt);
  }

  public final dv az(View paramView)
  {
    super.ay(paramView);
    this.jpg = ((TextView)paramView.findViewById(i.aRY));
    this.jpi = ((TextView)paramView.findViewById(i.aKj));
    this.jph = ((TextView)paramView.findViewById(i.aRZ));
    this.jpj = ((TextView)paramView.findViewById(i.aKk));
    this.jpk = ((TextView)paramView.findViewById(i.aVz));
    this.jpl = ((TextView)paramView.findViewById(i.axf));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dv
 * JD-Core Version:    0.6.2
 */