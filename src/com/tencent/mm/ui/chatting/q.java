package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.i;

final class q extends ck
{
  protected TextView jlX;

  public q(int paramInt)
  {
    super(paramInt);
  }

  public final q au(View paramView)
  {
    super.ay(paramView);
    this.jlX = ((TextView)paramView.findViewById(i.aAM));
    this.joA = ((TextView)paramView.findViewById(i.amp));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.q
 * JD-Core Version:    0.6.2
 */