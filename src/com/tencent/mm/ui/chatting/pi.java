package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.storage.ar;

final class pi extends ck
{
  TextView jpB;

  public pi(int paramInt)
  {
    super(paramInt);
  }

  public static void a(pi parampi, ar paramar, int paramInt, hd paramhd)
  {
    if (parampi == null)
      return;
    parampi.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
    parampi.joC.setOnClickListener(paramhd.joh.jqc);
    parampi.joC.setOnLongClickListener(paramhd.joh.jqe);
  }

  public final ck aB(View paramView)
  {
    super.ay(paramView);
    if (this.type == 39)
    {
      this.eTC = ((TextView)paramView.findViewById(i.amj));
      this.jpB = ((TextView)paramView.findViewById(i.amC));
      this.joC = paramView.findViewById(i.all);
    }
    while (true)
    {
      if (this.type == 39)
        this.jmh = ((ImageView)paramView.findViewById(i.amf));
      this.eWo = ((CheckBox)paramView.findViewById(i.alk));
      this.gzU = paramView.findViewById(i.alP);
      return this;
      this.eTC = ((TextView)paramView.findViewById(i.amj));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.pi
 * JD-Core Version:    0.6.2
 */