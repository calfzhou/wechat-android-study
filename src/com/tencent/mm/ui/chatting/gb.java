package com.tencent.mm.ui.chatting;

import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.o;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.base.em;

final class gb
  implements em
{
  private long fNH = 0L;
  private cm gQj = new gc(this);
  private cn hil = null;
  private View.OnTouchListener iNI = null;
  private hd joF = null;
  private TextView jqU = null;
  private ScrollView jqV = null;
  private final int jqW = 3;
  private int jqX = 0;
  private int jqY = 0;
  private int jqZ = 0;
  private boolean jra = false;
  private boolean jrb = false;
  private TextView qd = null;

  public gb(hd paramhd)
  {
    this.joF = paramhd;
  }

  public final boolean ar(View paramView)
  {
    if ((paramView.getTag() instanceof ms))
    {
      ms localms = (ms)paramView.getTag();
      if ((localms.fjl == 0) && ((paramView instanceof TextView)) && (localms.cMM != null) && (this.joF != null))
      {
        hd localhd = this.joF;
        if (this.hil == null)
        {
          View localView = View.inflate(localhd.agh(), k.bcH, null);
          this.jqV = ((ScrollView)localView.findViewById(i.auD));
          this.qd = ((TextView)localView.findViewById(i.auE));
          this.jqU = ((TextView)localView.findViewById(i.auF));
          this.iNI = new gd(this);
          this.jqV.setOnTouchListener(this.iNI);
          localView.setOnClickListener(new ge(this));
          this.hil = new cn(localView, -1, -1, (byte)0);
          this.hil.setAnimationStyle(o.cuC);
          this.hil.update();
          this.hil.setBackgroundDrawable(new ColorDrawable(16777215));
          this.hil.setOnDismissListener(new gf(this));
        }
        if ((this.hil != null) && (!this.hil.isShowing()))
        {
          this.jqV.scrollTo(0, 0);
          CharSequence localCharSequence = ((TextView)paramView).getText();
          if ((localCharSequence instanceof SpannableString))
          {
            String str = ((SpannableString)localCharSequence).toString();
            this.jqU.setText(str);
            this.joF.joh.jpY.c(this.jqU);
            localCharSequence = this.jqU.getText();
          }
          this.joF.XF();
          this.qd.setText(localCharSequence);
          this.hil.showAtLocation(paramView.getRootView(), 17, 0, 0);
          this.hil.setFocusable(true);
          this.hil.setTouchable(true);
          this.hil.setBackgroundDrawable(new ColorDrawable(16777215));
          this.hil.setOutsideTouchable(true);
          gi localgi = gi.aVd();
          localgi.a(new gg(this));
          this.qd.setMovementMethod(localgi);
          this.qd.setFocusable(false);
          this.qd.setOnClickListener(new gh(this));
          this.hil.update();
        }
        return true;
      }
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gb
 * JD-Core Version:    0.6.2
 */