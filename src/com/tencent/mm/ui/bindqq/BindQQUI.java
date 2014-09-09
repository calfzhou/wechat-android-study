package com.tencent.mm.ui.bindqq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.cr;

public class BindQQUI extends MMWizardActivity
  implements m
{
  private cr dWq;
  private String jjX = null;
  private View jkR;
  private int type = 0;

  protected final void DP()
  {
    this.jkR = findViewById(i.aTS);
    long l = new com.tencent.mm.a.k(ch.a((Integer)bg.qW().oQ().get(9))).longValue();
    if (l == 0L)
    {
      oP(n.bxg);
      TextView localTextView3 = (TextView)findViewById(i.aOZ);
      localTextView3.setVisibility(0);
      this.jkR.setVisibility(8);
      localTextView3.setText(n.bxf);
      ((TextView)findViewById(i.aPa)).setVisibility(8);
      Button localButton = (Button)findViewById(i.aji);
      localButton.setVisibility(0);
      localButton.setOnClickListener(new c(this));
    }
    while (this.type == 1)
    {
      a(0, getString(n.btE), new a(this));
      return;
      oP(n.bxe);
      TextView localTextView1 = (TextView)findViewById(i.aOZ);
      localTextView1.setVisibility(0);
      localTextView1.setText(n.bxc);
      TextView localTextView2 = (TextView)findViewById(i.aPa);
      localTextView2.setVisibility(0);
      localTextView2.setText(getString(n.bxd) + l);
      this.jkR.setVisibility(0);
      this.jkR.setOnClickListener(new d(this));
    }
    a(new b(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!32@/B4Tb64lLpL8sJQBeucymOcdMbmQQOmV", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramx.getType());
    if (this.dWq != null)
    {
      this.dWq.dismiss();
      this.dWq = null;
    }
    if (paramx.getType() == 254)
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.jjX = ((s)paramx).zi();
        if ((this.jjX != null) && (this.jjX.length() > 0))
          bg.qW().oQ().set(102407, this.jjX);
        localad = new ad(2);
        bg.qX().d(localad);
      }
    while (paramx.getType() != 255)
    {
      do
      {
        ad localad;
        return;
        if (this.dWq != null)
        {
          this.dWq.dismiss();
          this.dWq = null;
        }
        if (paramInt2 == -81)
        {
          com.tencent.mm.ui.base.e.a(this, n.ceR, n.buo, null);
          return;
        }
        if (paramInt2 == -82)
        {
          com.tencent.mm.ui.base.e.a(this, n.ceS, n.buo, null);
          return;
        }
        if (paramInt2 == -83)
        {
          com.tencent.mm.ui.base.e.a(this, n.ceP, n.buo, null);
          return;
        }
        if (paramInt2 == -84)
        {
          com.tencent.mm.ui.base.e.a(this, n.ceQ, n.buo, null);
          return;
        }
        if (paramInt2 == -85)
        {
          com.tencent.mm.ui.base.e.a(this, n.ceO, n.buo, null);
          return;
        }
      }
      while (paramInt2 != -86);
      com.tencent.mm.ui.base.e.a(this, n.ceU, n.buo, null);
      return;
    }
    if (paramInt2 == 0)
    {
      j(this, new Intent(this, StartUnbindQQ.class));
      return;
    }
    com.tencent.mm.ui.base.e.a(this, n.ceT, n.buo, null);
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bbM;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.type = getIntent().getIntExtra("bindqq_regbymobile", 0);
    bg.qX().a(254, this);
    bg.qX().a(255, this);
  }

  public void onDestroy()
  {
    bg.qX().b(254, this);
    bg.qX().b(255, this);
    super.onDestroy();
  }

  protected void onResume()
  {
    super.onResume();
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.BindQQUI
 * JD-Core Version:    0.6.2
 */