package com.tencent.mm.ui.pluginapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.al;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.protocal.a.xb;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import com.tencent.mm.ui.dy;
import java.io.IOException;

public class ContactSearchUI extends MMActivity
  implements m
{
  private ProgressDialog dWT = null;
  private EditText jKJ;

  private static int De(String paramString)
  {
    int i = 3;
    if (ap.iW(paramString))
      i = 1;
    do
    {
      return i;
      if (ap.iX(paramString))
        return 2;
    }
    while (!ap.iY(paramString));
    return i;
  }

  private void aYM()
  {
    String str = this.jKJ.getText().toString().trim();
    if ((str == null) || (str.length() <= 0))
    {
      e.b(aPI(), com.tencent.mm.n.cnI, com.tencent.mm.n.buo);
      return;
    }
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXT/qx46QQSxwcrBTMHm/18Y=", "always search contact from internet!!!");
    al localal = new al(str);
    bg.qX().d(localal);
    ActionBarActivity localActionBarActivity = aPI();
    getString(com.tencent.mm.n.buo);
    this.dWT = e.a(localActionBarActivity, getString(com.tencent.mm.n.bsp), true, new s(this, localal));
  }

  protected final void DP()
  {
    oP(com.tencent.mm.n.bDz);
    this.jKJ = ((EditText)findViewById(i.aov));
    this.jKJ.addTextChangedListener(new o(this));
    this.jKJ.setImeOptions(3);
    this.jKJ.setOnEditorActionListener(new p(this));
    a(0, getString(com.tencent.mm.n.btA), new q(this));
    a(new r(this));
    if (getIntent().getBooleanExtra("from_webview", false))
    {
      String str = getIntent().getStringExtra("userName");
      this.jKJ.setText(str);
      aYM();
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpLSOpQlr7qYXT/qx46QQSxwcrBTMHm/18Y=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (dy.a(aPI(), paramInt1, paramInt2, paramString, 7));
    xb localxb;
    String str;
    Intent localIntent2;
    do
    {
      return;
      if ((paramInt1 == 4) && (paramInt2 == -4))
      {
        e.b(aPI(), com.tencent.mm.n.bsm, com.tencent.mm.n.buo);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Toast.makeText(this, getString(com.tencent.mm.n.bLc), 0).show();
        int i = com.tencent.mm.n.bLb;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(paramInt1);
        arrayOfObject[1] = Integer.valueOf(paramInt2);
        z.w("!44@/B4Tb64lLpLSOpQlr7qYXT/qx46QQSxwcrBTMHm/18Y=", getString(i, arrayOfObject));
        return;
      }
      localxb = ((al)paramx).zG();
      if (localxb.ibK > 0)
      {
        Intent localIntent1 = new Intent();
        localIntent1.setClass(this, ContactSearchResultUI.class);
        try
        {
          localIntent1.putExtra("result", localxb.toByteArray());
          startActivity(localIntent1);
          return;
        }
        catch (IOException localIOException)
        {
          return;
        }
      }
      str = ai.a(localxb.hVf);
      localIntent2 = new Intent();
      com.tencent.mm.pluginsdk.ui.tools.s.a(localIntent2, localxb, De(this.jKJ.getText().toString().trim()));
      localIntent2.setClass(this, ContactInfoUI.class);
    }
    while (ap.ja(str).length() <= 0);
    if ((0x8 & localxb.ifO) > 0)
      com.tencent.mm.plugin.f.c.n.fTF.q(10298, str + "," + De(this.jKJ.getText().toString().trim()));
    startActivity(localIntent2);
  }

  protected final int getLayoutId()
  {
    return k.bdN;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  protected void onPause()
  {
    bg.qX().b(106, this);
    super.onPause();
  }

  protected void onResume()
  {
    bg.qX().a(106, this);
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.ContactSearchUI
 * JD-Core Version:    0.6.2
 */