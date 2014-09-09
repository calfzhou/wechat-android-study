package com.tencent.mm.ui.account;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.plugin.f.c.j;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.y;
import java.util.Locale;

public class WelcomeSelectView extends WelcomeView
{
  private Context context;
  private View iPQ;
  private View iSP;
  private ImageView iSQ;
  private int iSR = 130;
  private Button iSS;
  private Button iST;
  private TextView iSU;
  private int uj = 800;

  public WelcomeSelectView(Context paramContext)
  {
    super(paramContext);
    ai(paramContext);
  }

  @TargetApi(11)
  public WelcomeSelectView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    ai(paramContext);
  }

  private void ai(Context paramContext)
  {
    this.context = paramContext;
    View localView = LayoutInflater.from(paramContext).inflate(k.bqt, this);
    this.iPQ = localView.findViewById(i.aOa);
    this.iSP = localView.findViewById(i.aZK);
    this.iSQ = ((ImageView)localView.findViewById(i.aZO));
    this.iSR = com.tencent.mm.aq.a.fromDPToPix(paramContext, 87);
    this.iSS = ((Button)localView.findViewById(i.aNZ));
    this.iST = ((Button)localView.findViewById(i.aOb));
    this.iSU = ((TextView)localView.findViewById(i.aZL));
    this.iSQ.setVisibility(8);
    this.iPQ.setVisibility(8);
    this.iSU.setVisibility(8);
    this.iSU.setText(com.tencent.mm.plugin.a.a.dWp.h(paramContext));
    this.uj = paramContext.getResources().getDisplayMetrics().heightPixels;
    this.iSU.setOnClickListener(new kk(this));
    this.iSS.setOnClickListener(new kl(this, paramContext));
    this.iST.setOnClickListener(new km(this, paramContext));
    init();
  }

  private void init()
  {
    SharedPreferences localSharedPreferences = this.context.getSharedPreferences(ak.aHi(), 0);
    String str = y.e(localSharedPreferences);
    this.iSU.setText(com.tencent.mm.plugin.a.a.dWp.h(this.context));
    if ((str != null) && (!str.equals("language_default")))
      if (str.equals("zh_CN"))
        this.iSQ.setImageResource(h.adP);
    while (true)
    {
      if ((str != null) && (str.equals("language_default")))
        this.iSU.setText(this.context.getString(n.bQl));
      this.iSS.setText(n.bOW);
      this.iST.setText(n.bOV);
      return;
      this.iSQ.setImageResource(h.adQ);
      continue;
      if (Locale.getDefault().equals(Locale.CHINA))
        this.iSQ.setImageResource(h.adP);
      else
        this.iSQ.setImageResource(h.adQ);
    }
  }

  public final void aQX()
  {
    int i = (-150 + this.uj) / 5;
    if (this.iSR > i);
    while (true)
    {
      this.iSR = i;
      View localView = this.iSP;
      float f = -this.iSR;
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, f);
      localTranslateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
      localTranslateAnimation.setDuration(1700L);
      localTranslateAnimation.setStartOffset(0L);
      localTranslateAnimation.setAnimationListener(new kn(this, localView, 0.0F, f));
      localView.startAnimation(localTranslateAnimation);
      return;
      i = this.iSR;
    }
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    j.jt(15);
  }

  public final void onPause()
  {
  }

  public final void onResume()
  {
    init();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.WelcomeSelectView
 * JD-Core Version:    0.6.2
 */