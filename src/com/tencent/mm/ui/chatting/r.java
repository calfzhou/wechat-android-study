package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;

final class r extends ck
{
  ImageView jlY = null;
  TextView jlZ = null;
  TextView jma = null;
  TextView jmb = null;
  TextView jmc = null;
  TextView jmd = null;
  TextView jme = null;
  TextView jmf = null;
  TextView jmg = null;

  public r(int paramInt)
  {
    super(paramInt);
  }

  public final r av(View paramView)
  {
    super.ay(paramView);
    this.eTC = ((TextView)this.gAm.findViewById(i.amj));
    this.eWo = ((CheckBox)this.gAm.findViewById(i.alk));
    this.gzU = this.gAm.findViewById(i.alP);
    this.joA = ((TextView)this.gAm.findViewById(i.amp));
    this.jlY = ((ImageView)paramView.findViewById(i.agw));
    this.jlZ = ((TextView)paramView.findViewById(i.agv));
    this.jma = ((TextView)paramView.findViewById(i.agu));
    this.jmb = ((TextView)paramView.findViewById(i.agt));
    this.jmc = ((TextView)paramView.findViewById(i.ags));
    this.jmd = ((TextView)paramView.findViewById(i.agr));
    this.jmf = ((TextView)paramView.findViewById(i.agy));
    this.jme = ((TextView)paramView.findViewById(i.agx));
    this.jmg = ((TextView)paramView.findViewById(i.agq));
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.r
 * JD-Core Version:    0.6.2
 */