package com.tencent.mm.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cq;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.mobile.MobileInputUI;

@Deprecated
public class LoginSelectorUI extends MMActivity
  implements View.OnClickListener
{
  private TextView iPP;
  private View iPQ;

  protected final void DP()
  {
    Button localButton1 = (Button)findViewById(i.aNZ);
    Button localButton2 = (Button)findViewById(i.aOb);
    this.iPP = ((TextView)findViewById(i.aNW));
    this.iPQ = findViewById(i.aNX);
    localButton1.setOnClickListener(this);
    localButton2.setOnClickListener(this);
    this.iPP.setText(com.tencent.mm.plugin.a.a.dWp.h(this));
    this.iPQ.setOnClickListener(new dj(this));
    if (l.iDu)
    {
      com.tencent.mm.plugin.a.a.dWp.f(this);
      return;
    }
    com.tencent.mm.plugin.a.a.dWp.i(this);
  }

  protected final int getLayoutId()
  {
    return k.bmF;
  }

  public void onClick(View paramView)
  {
    if (i.aNZ == paramView.getId())
    {
      localIntent1 = new Intent(this, MobileInputUI.class);
      localIntent1.putExtra("mobile_input_purpose", 5);
      startActivity(localIntent1);
    }
    while (i.aOb != paramView.getId())
    {
      Intent localIntent1;
      return;
    }
    if (com.tencent.mm.protocal.a.hrq)
    {
      int i = n.bDL;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = ("0x" + Integer.toHexString(com.tencent.mm.protocal.a.hrn));
      arrayOfObject[1] = y.aGW();
      String str = getString(i, arrayOfObject);
      Intent localIntent3 = new Intent();
      localIntent3.putExtra("rawUrl", str);
      localIntent3.putExtra("showShare", false);
      localIntent3.putExtra("show_bottom", false);
      localIntent3.putExtra("needRedirect", false);
      localIntent3.putExtra("neverGetA8Key", true);
      localIntent3.putExtra("hardcode_jspermission", JsapiPermissionWrapper.hNg);
      localIntent3.putExtra("hardcode_general_ctrl", GeneralControlWrapper.hNd);
      com.tencent.mm.plugin.a.a.dWo.h(localIntent3, this);
      return;
    }
    cq.rO();
    Intent localIntent2 = new Intent(this, RegByMobileRegAIOUI.class);
    localIntent2.putExtra("login_type", 0);
    startActivity(localIntent2);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oO(8);
    com.tencent.mm.plugin.a.a.dWp.hY();
    bg.qT();
    DP();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      Intent localIntent = com.tencent.mm.plugin.a.a.dWo.k(this);
      localIntent.addFlags(67108864);
      localIntent.putExtra("can_finish", true);
      startActivity(localIntent);
      finish();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onResume()
  {
    super.onResume();
    bg.qT();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.LoginSelectorUI
 * JD-Core Version:    0.6.2
 */