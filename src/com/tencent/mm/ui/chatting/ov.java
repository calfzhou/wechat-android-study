package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.ui.base.MMTextView;

final class ov extends ck
{
  View erf;
  ImageView jms;
  MMTextView jws;
  ChattingTranslateView jwt;

  public ov(int paramInt)
  {
    super(paramInt);
  }

  public final ck e(View paramView, boolean paramBoolean)
  {
    super.ay(paramView);
    this.eTC = ((TextView)paramView.findViewById(i.amj));
    this.joA = ((TextView)paramView.findViewById(i.amp));
    this.jws = ((MMTextView)paramView.findViewById(i.alp));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    this.erf = paramView.findViewById(i.aln);
    this.jwt = ((ChattingTranslateView)paramView.findViewById(i.amm));
    if (paramBoolean)
    {
      this.type = 2;
      return this;
    }
    this.jms = ((ImageView)paramView.findViewById(i.amh));
    this.jmh = ((ImageView)paramView.findViewById(i.amf));
    this.fIh = ((ProgressBar)paramView.findViewById(i.aUi));
    this.type = 4;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ov
 * JD-Core Version:    0.6.2
 */