package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;

final class my extends ck
{
  protected TextView eTE;
  protected ImageView jvn;

  public my(int paramInt)
  {
    super(paramInt);
  }

  public final my aC(View paramView)
  {
    super.ay(paramView);
    this.eTE = ((TextView)paramView.findViewById(i.akR));
    this.jvn = ((ImageView)paramView.findViewById(i.akY));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.my
 * JD-Core Version:    0.6.2
 */