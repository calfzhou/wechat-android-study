package com.tencent.mm.ui.qrcode;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.ef;
import com.tencent.mm.ui.dy;
import com.tencent.mm.ui.widget.d;

public class ShareToQQUI extends MMActivity
  implements m
{
  private ProgressDialog dWT = null;
  private EditText fGo;
  private TextView hqI;
  private int jLb;
  private boolean jLc = false;

  protected final void DP()
  {
    oP(n.cel);
    this.fGo = ((EditText)findViewById(i.content));
    this.hqI = ((TextView)findViewById(i.baa));
    this.fGo.addTextChangedListener(new d(this.fGo, this.hqI, 280));
    this.jLb = getIntent().getIntExtra("show_to", 2);
    if (this.jLb == 4)
      this.fGo.setText(n.cdT);
    while (true)
    {
      a(new f(this));
      a(0, getString(n.buk), new g(this));
      return;
      this.fGo.setText(n.cdV);
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!32@/B4Tb64lLpJVtS9qfp1qlbhe0MQAmHQc", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramx.getType() != 26);
    do
    {
      return;
      if (this.dWT != null)
      {
        this.dWT.dismiss();
        this.dWT = null;
      }
      if ((paramInt1 == 4) && (paramInt2 == -68))
      {
        if (ap.jb(paramString))
          paramString = "error";
        com.tencent.mm.ui.base.e.a(this, paramString, getString(n.buo), new j(this), null);
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        XF();
        String str = getString(n.ciH);
        new k(this);
        com.tencent.mm.ui.base.e.aw(this, str);
        return;
      }
      this.jLc = false;
    }
    while (dy.a(aPI(), paramInt1, paramInt2, paramString, 4));
    int i = n.ciG;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    Toast.makeText(this, getString(i, arrayOfObject), 0).show();
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bej;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bg.qX().a(26, this);
    DP();
    if (com.tencent.mm.model.x.qc())
    {
      com.tencent.mm.ui.c.a.e locale = new com.tencent.mm.ui.c.a.e("290293790992170");
      locale.CW(ap.ja((String)bg.qW().oQ().get(65830)));
      new ef(locale, new l(this)).aQF();
    }
  }

  public void onDestroy()
  {
    bg.qX().b(26, this);
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.ShareToQQUI
 * JD-Core Version:    0.6.2
 */