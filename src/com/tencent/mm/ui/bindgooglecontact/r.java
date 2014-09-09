package com.tencent.mm.ui.bindgooglecontact;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.i;

final class r
{
  ImageView dXf;
  TextView dYV;
  TextView fFM;
  String hlo;
  TextView jiA;
  View jiB;
  ProgressBar jiC;
  int position;
  int status;

  public r(p paramp, View paramView)
  {
    this.dXf = ((ImageView)paramView.findViewById(i.awC));
    this.dYV = ((TextView)paramView.findViewById(i.awG));
    this.jiB = paramView.findViewById(i.awH);
    this.fFM = ((TextView)paramView.findViewById(i.awI));
    this.jiC = ((ProgressBar)paramView.findViewById(i.awF));
    this.jiA = ((TextView)paramView.findViewById(i.awD));
    this.jiB.setOnClickListener(new s(this, paramp));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.r
 * JD-Core Version:    0.6.2
 */