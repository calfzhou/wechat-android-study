package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.i;

public class ck
{
  public TextView eTC;
  public CheckBox eWo;
  public ImageView egy;
  public ProgressBar fIh;
  public View gAm;
  public View gzU;
  public ImageView jmh;
  public TextView joA;
  public View joB;
  public View joC;
  public int joD;
  public long joE;
  public int type;

  public ck(int paramInt)
  {
    this(paramInt, (byte)0);
  }

  private ck(int paramInt, byte paramByte)
  {
    this.type = paramInt;
    this.joE = 0L;
  }

  public final void ay(View paramView)
  {
    this.gAm = paramView;
    this.eTC = ((TextView)paramView.findViewById(i.amj));
    this.egy = ((ImageView)paramView.findViewById(i.ale));
    this.joB = paramView.findViewById(i.brX);
    this.joC = paramView.findViewById(i.all);
    this.jmh = ((ImageView)paramView.findViewById(i.amf));
  }

  public final void fj(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      if ((this.eWo != null) && (this.eWo.getVisibility() != i))
        this.eWo.setVisibility(i);
      if ((this.gzU != null) && (this.gzU.getVisibility() != i))
        this.gzU.setVisibility(i);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ck
 * JD-Core Version:    0.6.2
 */