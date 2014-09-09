package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;

final class mo extends ck
{
  TextView iRd;
  TextView jmV;
  TextView jpB;
  View juM;
  ImageView juN;
  ImageView juO;
  TextView juP;
  TextView juQ;

  public mo(int paramInt)
  {
    super(paramInt);
  }

  public final ck aB(View paramView)
  {
    super.ay(paramView);
    this.eTC = ((TextView)paramView.findViewById(i.amj));
    this.jmV = ((TextView)paramView.findViewById(i.amn));
    this.iRd = ((TextView)paramView.findViewById(i.amq));
    this.jpB = ((TextView)paramView.findViewById(i.alp));
    this.joC = paramView.findViewById(i.all);
    this.juQ = ((TextView)paramView.findViewById(i.alQ));
    this.juM = paramView.findViewById(i.alB);
    this.juN = ((ImageView)paramView.findViewById(i.akH));
    this.juO = ((ImageView)paramView.findViewById(i.alC));
    this.juP = ((TextView)paramView.findViewById(i.akI));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    this.type = 9;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.mo
 * JD-Core Version:    0.6.2
 */