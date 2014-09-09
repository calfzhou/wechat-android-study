package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.c.a.e;

public class BindFacebookUI extends MMWizardActivity
  implements m
{
  private e iNN;
  private ProgressDialog iNO;
  private DialogInterface.OnCancelListener iNP;
  private r iNQ;

  protected final void DP()
  {
    this.iNN = new e("290293790992170");
    this.iNP = new f(this);
    a(0, getString(n.btE), new g(this));
    oP(n.bvW);
    TextView localTextView = (TextView)findViewById(i.aOI);
    localTextView.setVisibility(4);
    localTextView.setText(n.bvV);
    Button localButton = (Button)findViewById(i.aiG);
    localButton.setVisibility(0);
    localButton.setOnClickListener(new h(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() != 183);
    do
    {
      return;
      if (this.iNO != null)
        this.iNO.dismiss();
    }
    while (a.dWp.a(aPI(), paramInt1, paramInt2, paramString));
    int i = ((r)paramx).wy();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (i == 1)
      {
        bg.qW().oW().yC("facebookapp");
        bg.qW().oV().zw("facebookapp");
      }
      aQl();
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -67))
    {
      Toast.makeText(this, n.bGI, 1).show();
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -5))
    {
      if (i == 1);
      for (int k = n.bGE; ; k = n.bGJ)
      {
        Toast.makeText(this, k, 1).show();
        return;
      }
    }
    if (i == 0);
    for (int j = n.bBy; ; j = n.bBv)
    {
      Toast.makeText(this, j, 1).show();
      return;
    }
  }

  protected final int getLayoutId()
  {
    return k.bbC;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
    bg.qX().b(183, this);
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(183, this);
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.BindFacebookUI
 * JD-Core Version:    0.6.2
 */