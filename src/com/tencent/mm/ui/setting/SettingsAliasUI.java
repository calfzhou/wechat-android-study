package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.modelsimple.w;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.cu;
import com.tencent.mm.ui.dy;

public class SettingsAliasUI extends MMActivity
  implements m
{
  private ProgressDialog dWT = null;
  private TextView eTV;
  private ImageView egy;
  private TextView ekE;
  private m iJL = null;
  private TextView iRd;
  private EditText jNa;
  private w jNb;
  private boolean jNc = false;
  private String wP;

  protected final void DP()
  {
    oP(com.tencent.mm.n.bSX);
    this.egy = ((ImageView)findViewById(com.tencent.mm.i.ahd));
    this.ekE = ((TextView)findViewById(com.tencent.mm.i.aGn));
    this.iRd = ((TextView)findViewById(com.tencent.mm.i.aUt));
    this.eTV = ((TextView)findViewById(com.tencent.mm.i.aEV));
    this.jNa = ((EditText)findViewById(com.tencent.mm.i.aLI));
    String str = com.tencent.mm.model.x.pG();
    if (!com.tencent.mm.storage.i.yd(str))
    {
      this.jNa.setText(com.tencent.mm.model.x.pG());
      this.iRd.setText(getString(com.tencent.mm.n.bsF, new Object[] { str }));
    }
    this.jNa.setSelection(this.jNa.getText().length());
    this.jNa.setFocusable(true);
    this.jNa.setFocusableInTouchMode(true);
    this.jNa.addTextChangedListener(new bx(this));
    this.ekE.setText(com.tencent.mm.ar.b.f(this, ap.ja(com.tencent.mm.model.x.pI()), (int)this.ekE.getTextSize()));
    c.a(this.egy, str);
    a(new by(this));
    a(0, getString(com.tencent.mm.n.bud), new bz(this), cu.iMA);
    eB(false);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    int i = 1;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.jNc)
        com.tencent.mm.plugin.f.c.n.fTF.q(10358, "1");
      XF();
      bg.qW().oQ().set(42, this.wP);
      ac localac = bg.qX();
      cc localcc = new cc(this);
      this.iJL = localcc;
      localac.a(255, localcc);
      ad localad = new ad(i);
      bg.qX().d(localad);
    }
    while (true)
    {
      return;
      if (this.dWT != null)
      {
        this.dWT.dismiss();
        this.dWT = null;
      }
      if (dy.a(aPI(), paramInt1, paramInt2, paramString, 4));
      while (i != 0)
      {
        return;
        switch (paramInt1)
        {
        default:
        case 4:
        }
        do
        {
          i = 0;
          break;
        }
        while ((paramInt2 != -7) && (paramInt2 != -10));
        com.tencent.mm.ui.base.e.b(aPI(), com.tencent.mm.n.bXU, com.tencent.mm.n.bTb);
      }
    }
  }

  protected final int getLayoutId()
  {
    return k.bmT;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jNc = getIntent().getBooleanExtra("KFromSetAliasTips", false);
    DP();
    bg.qX().a(177, this);
  }

  public void onDestroy()
  {
    if (this.jNb != null)
      bg.qX().c(this.jNb);
    bg.qX().b(177, this);
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsAliasUI
 * JD-Core Version:    0.6.2
 */