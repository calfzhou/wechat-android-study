package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.i;
import java.util.ArrayList;
import java.util.List;

final class am extends ck
{
  LinearLayout fKm;
  List fPF = new ArrayList();
  TextView jlV;
  an jmR = new an();
  ChattingItemFooter jmm;

  public am(int paramInt)
  {
    super(paramInt);
  }

  public final ck ax(View paramView)
  {
    ViewGroup localViewGroup = (ViewGroup)this.jmR.fPs.getParent();
    al localal = new al();
    localal.fPs = paramView;
    localal.fpj = ((TextView)paramView.findViewById(i.title));
    localal.jmQ = ((TextView)paramView.findViewById(i.summary));
    localal.fPt = paramView.findViewById(i.apa);
    localal.fPu = ((ImageView)paramView.findViewById(i.aoZ));
    localal.fPw = ((ProgressBar)paramView.findViewById(i.aAy));
    localal.fPx = paramView.findViewById(i.aAs);
    localViewGroup.addView(paramView, -1 + localViewGroup.getChildCount());
    this.fPF.add(localal);
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.am
 * JD-Core Version:    0.6.2
 */