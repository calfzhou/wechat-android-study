package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.o;

final class ao extends ck
{
  TextView eTF;
  TextView ekE;
  ImageView jlS;
  ImageView jmU;
  TextView jmV;
  TextView jmW;
  TextView jmX;
  ImageView jms;

  public ao(int paramInt)
  {
    super(paramInt);
  }

  public static String a(as paramas)
  {
    int i = 1;
    String str = paramas.iS();
    boolean bool1 = ap.jb(str);
    int j = 0;
    if (bool1)
    {
      str = paramas.aJQ();
      if (!com.tencent.mm.storage.i.yd(str))
      {
        boolean bool3 = y.df(str);
        j = 0;
        if (!bool3);
      }
      else
      {
        j = i;
      }
    }
    if ((j == 0) && (!bg.qW().oT().yo(str)));
    while (true)
    {
      boolean bool2 = y.cF(paramas.jd());
      if ((i != 0) || (bool2))
        return "";
      return str;
      i = j;
    }
  }

  public final ck e(View paramView, boolean paramBoolean)
  {
    super.ay(paramView);
    this.jlS = ((ImageView)paramView.findViewById(com.tencent.mm.i.akJ));
    this.jmU = ((ImageView)paramView.findViewById(com.tencent.mm.i.alf));
    this.eTC = ((TextView)paramView.findViewById(com.tencent.mm.i.amj));
    this.jmV = ((TextView)paramView.findViewById(com.tencent.mm.i.amn));
    this.jmW = ((TextView)paramView.findViewById(com.tencent.mm.i.amq));
    this.ekE = ((TextView)paramView.findViewById(com.tencent.mm.i.alT));
    this.eTF = ((TextView)paramView.findViewById(com.tencent.mm.i.ame));
    this.jmX = ((TextView)paramView.findViewById(com.tencent.mm.i.amb));
    this.joA = ((TextView)paramView.findViewById(com.tencent.mm.i.amp));
    this.joC = paramView.findViewById(com.tencent.mm.i.all);
    this.eWo = ((CheckBox)paramView.findViewById(com.tencent.mm.i.alk));
    this.gzU = paramView.findViewById(com.tencent.mm.i.alP);
    if (paramBoolean);
    for (int i = 12; ; i = 13)
    {
      this.type = i;
      if (!paramBoolean)
      {
        this.jmh = ((ImageView)paramView.findViewById(com.tencent.mm.i.amf));
        this.jms = ((ImageView)paramView.findViewById(com.tencent.mm.i.amh));
      }
      return this;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ao
 * JD-Core Version:    0.6.2
 */