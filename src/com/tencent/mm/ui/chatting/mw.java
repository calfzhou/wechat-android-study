package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.i;

final class mw extends ck
{
  TextView eTF;
  TextView jpB;

  public mw(int paramInt)
  {
    super(paramInt);
  }

  public final ck aB(View paramView)
  {
    super.ay(paramView);
    this.eTC = ((TextView)paramView.findViewById(i.amj));
    this.joA = ((TextView)paramView.findViewById(i.amp));
    this.jpB = ((TextView)paramView.findViewById(i.alp));
    this.eTF = ((TextView)paramView.findViewById(i.alV));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    this.type = 2;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.mw
 * JD-Core Version:    0.6.2
 */