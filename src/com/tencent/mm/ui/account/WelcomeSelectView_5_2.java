package com.tencent.mm.ui.account;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.y;
import java.util.Locale;

public class WelcomeSelectView_5_2 extends WelcomeView
{
  private Context context;
  private Button iST;
  private TextView iSU;
  private TextView iTa;
  private TextView iTb;
  private ImageView iTc;
  private ImageView iTd;
  private LinearLayout iTe;
  private LinearLayout iTf;
  private TextView iTg;
  private TextView iTh;
  private ImageView iTi;

  public WelcomeSelectView_5_2(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    View localView = LayoutInflater.from(paramContext).inflate(k.bqu, this);
    this.iTa = ((TextView)localView.findViewById(i.aZN));
    this.iTb = ((TextView)localView.findViewById(i.aZM));
    this.iST = ((Button)localView.findViewById(i.aOb));
    this.iTi = ((ImageView)localView.findViewById(i.aZF));
    this.iTc = ((ImageView)localView.findViewById(i.aZQ));
    this.iTd = ((ImageView)localView.findViewById(i.aZP));
    this.iTf = ((LinearLayout)localView.findViewById(i.aZI));
    this.iTe = ((LinearLayout)localView.findViewById(i.aZJ));
    this.iTg = ((TextView)localView.findViewById(i.aZG));
    this.iTh = ((TextView)localView.findViewById(i.aZH));
    this.iSU = ((TextView)localView.findViewById(i.aZL));
    this.iSU.setText(a.dWp.h(paramContext));
    this.iSU.setOnClickListener(new kq(this));
    kr localkr = new kr(this, paramContext);
    this.iTa.setOnClickListener(localkr);
    this.iTb.setOnClickListener(localkr);
    this.iST.setOnClickListener(new ks(this, paramContext));
    init();
  }

  private void init()
  {
    SharedPreferences localSharedPreferences = this.context.getSharedPreferences(ak.aHi(), 0);
    String str = y.e(localSharedPreferences);
    this.iSU.setText(a.dWp.h(this.context));
    if ((str != null) && (str.equals("language_default")))
      this.iSU.setText(this.context.getString(n.bQl));
    if ((str != null) && (!str.equals("language_default")))
      if (str.equals("zh_CN"))
      {
        this.iTg.setVisibility(4);
        this.iTh.setVisibility(4);
        this.iTi.setImageResource(h.adN);
      }
    while (true)
    {
      this.iTa.setText(n.bOW);
      this.iTb.setText(n.ctN);
      this.iST.setText(n.bOV);
      return;
      this.iTg.setVisibility(0);
      this.iTh.setVisibility(0);
      this.iTg.setText("voice, text, photos");
      this.iTh.setText("free forever");
      this.iTi.setImageResource(h.adO);
      continue;
      if (Locale.getDefault().equals(Locale.CHINA))
      {
        this.iTg.setVisibility(4);
        this.iTh.setVisibility(4);
        this.iTi.setImageResource(h.adN);
      }
      else
      {
        this.iTg.setVisibility(0);
        this.iTh.setVisibility(0);
        this.iTg.setText("voice, text, photos");
        this.iTh.setText("free forever");
        this.iTi.setImageResource(h.adO);
      }
    }
  }

  public final void aQX()
  {
    this.iTf.post(new kt(this));
  }

  public final void onPause()
  {
    b.jD("RE100_100_new");
  }

  public final void onResume()
  {
    init();
    b.jD("RE100_100_new");
    b.b(true, bg.qS() + "," + getClass().getName() + ",RE100_100_new," + bg.eg("RE100_100_new") + ",1");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.WelcomeSelectView_5_2
 * JD-Core Version:    0.6.2
 */