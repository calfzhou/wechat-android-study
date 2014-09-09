package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.pluginsdk.ui.EmojiView;

final class mm extends ck
{
  EmojiView eBA;
  ProgressBar fIh;
  ImageView jlS;

  public mm(int paramInt)
  {
    super(paramInt);
  }

  public final ck e(View paramView, boolean paramBoolean)
  {
    super.ay(paramView);
    this.eTC = ((TextView)paramView.findViewById(i.amj));
    this.eBA = ((EmojiView)paramView.findViewById(i.alq));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    if (paramBoolean)
      this.joA = ((TextView)paramView.findViewById(i.amp));
    for (this.type = 14; ; this.type = 15)
    {
      if (this.jlS != null)
        ((ViewGroup)this.jlS.getParent()).setBackgroundDrawable(null);
      return this;
      this.fIh = ((ProgressBar)paramView.findViewById(i.aUi));
      this.joA = ((TextView)paramView.findViewById(i.amp));
      this.jmh = ((ImageView)paramView.findViewById(i.amf));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.mm
 * JD-Core Version:    0.6.2
 */